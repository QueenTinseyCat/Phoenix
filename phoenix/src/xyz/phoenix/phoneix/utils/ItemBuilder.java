package xyz.phoenix.phoneix.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemBuilder {

    protected static final String VERSION;
    protected static Class clazz;
    protected static Method asBukkitCopy;
    protected static Method setString;
    protected static Method getOrCreateTag;
    protected static Method asNMSCopy;
    protected static Method getString;

    static {
        String packageName = Bukkit.getServer().getClass().getPackage().getName();
        VERSION = packageName.substring(packageName.lastIndexOf(".") + 1);

        try {
            Class class2 = Class.forName("net.minecraft.server." + VERSION + ".NBTTagCompound");
            Class nmsItemStackClass = Class.forName("net.minecraft.server." + VERSION + ".ItemStack");
            clazz = getClass("org.bukkit.craftbukkit", "inventory.CraftItemStack");
            asBukkitCopy = clazz.getDeclaredMethod("asBukkitCopy", nmsItemStackClass);
            asNMSCopy = clazz.getDeclaredMethod("asNMSCopy", ItemStack.class);
            setString = class2.getDeclaredMethod("setString", String.class, String.class);
            getString = class2.getDeclaredMethod("getString", String.class);
            getOrCreateTag = nmsItemStackClass.getDeclaredMethod("getTag"); //getOrCreateTag
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    private Material material;
    private int amount = 1;
    private short data;
    private String name = null;
    private List<String> lore = new ArrayList<>();
    private Map<String, String> nbtMap = new HashMap<>();
    private List<Enchantment> enchantments = new ArrayList<>();
    private ItemFlag[] itemFlags = {};

    public ItemBuilder withMaterial(Material material) {
        this.material = material;
        return this;
    }
    public ItemBuilder withAmount(int amount) {
        this.amount = amount;
        return this;
    }
    public ItemBuilder withData(short data) {
        this.data = data;
        return this;
    }
    public ItemBuilder withEnchantment(Enchantment e) {
        enchantments.add(e);
        return this;
    }
    public ItemBuilder withFlags(ItemFlag... flags) {
        itemFlags = flags;
        return this;
    }
    public ItemBuilder withNBT(String key, String val) {
        nbtMap.put(key, val);
        return this;
    }
    public ItemBuilder withName(String name) {
        this.name = name;
        return this;
    }
    public ItemBuilder withLore(List<String> lore) {
        this.lore = lore;
        return this;
    }
    public ItemStack build() {
        ItemStack item = new ItemStack(material, 1, (short) data);
        ItemMeta itemmeta = item.getItemMeta();
        if(name != null) itemmeta.setDisplayName(name);
        if(!lore.isEmpty()) itemmeta.setLore(lore);
        Object itemstack = null;
        for(Map.Entry<String, String> e : nbtMap.entrySet()) {
            try {
                itemstack = asNMSCopy.invoke(null, item);
                Object compound = getOrCreateTag.invoke(itemstack);

                setString.invoke(compound, e.getKey(), e.getValue());
            } catch (IllegalAccessException | InvocationTargetException ex) {
                ex.printStackTrace();
            }
        }
        if(itemFlags.length != 0) {
            itemmeta.addItemFlags(itemFlags);
        }
        if(enchantments.size() != 0) {
            enchantments.forEach(e -> itemmeta.addEnchant(e, 1, true));
        }
        item.setItemMeta(itemmeta);
        if(!nbtMap.isEmpty()) {
            try {
                return (ItemStack) asBukkitCopy.invoke(null, itemstack);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return item;
    }
    private static Class getClass(String path, String clazz) throws ClassNotFoundException {
        return Class.forName(path + "." + VERSION + "." + clazz);
    }

    /**
     * Example: ItemBuilder.get("wand");
     *
     * @param key <K> in <K, V>
     * @return<K, V> returns key to value generic; null if not found.
     */
    public static String get(ItemStack item, String key) {
        try {
            Object itemstack = asNMSCopy.invoke(null, item);
            Object compound = getOrCreateTag.invoke(itemstack);

            return (String) getString.invoke(compound, key);
        } catch (IllegalAccessException | InvocationTargetException e) {
            //Shouldn't happen, so no worries.
            e.printStackTrace();
        }
        return null;
    }

}