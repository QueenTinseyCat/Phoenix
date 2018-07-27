package com.glorial.phoneix.items.wands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Wand {

    WandWoods wandWoods = new WandWoods();
    WandCores wandCores = new WandCores();
    public ItemStack wand() {

        ItemStack wand = new ItemStack(Material.GOLD_AXE, 1);
        ItemMeta wwand = wand.getItemMeta();
        wwand.setDisplayName(ChatColor.LIGHT_PURPLE + "Wand");
        ArrayList<String> wandLore = new ArrayList<>();
        wandLore.add(ChatColor.WHITE + "Your wand, mostly used for casting spells.");
        wwand.setLore(wandLore);
        wwand.addEnchant(Enchantment.LUCK, 1, true);
        wwand.setUnbreakable(true);

        wwand.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        wwand.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwand.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wand.setItemMeta(wwand);
        return wand;
    }
}
