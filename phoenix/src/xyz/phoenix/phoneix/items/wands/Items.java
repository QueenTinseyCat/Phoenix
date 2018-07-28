package xyz.phoenix.phoneix.items.wands;

import org.bukkit.ChatColor;
import xyz.phoenix.phoneix.ItemBuilder;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.Collections;

public enum Items {

    WAND(new ItemBuilder()
            .withMaterial(Material.GOLD_AXE)
            .withName(ChatColor.LIGHT_PURPLE + "Wand")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Your wand, mostly used for casting spells."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .build()),
    UNICORN_HAIR(new ItemBuilder()
            .withMaterial(Material.STRING)
            .withName(ChatColor.GOLD + "Unicorn Hair")
            .withLore(Arrays.asList(ChatColor.WHITE + "A hair from the mane of", ChatColor.WHITE + "the purest unicorn."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .build()),
    DRAGON_HEARTSTRING(new ItemBuilder()
            .withMaterial(Material.SPIDER_EYE)
            .withName(ChatColor.DARK_RED + "Dragon Heartstring")
            .withLore(Collections.singletonList(ChatColor.WHITE + "The hearstring of a dragon."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .build()),
    PHOENIX_FEATHER(new ItemBuilder()
            .withMaterial(Material.FEATHER)
            .withName(ChatColor.RED + "Phoenix Feather")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Feather from a Phoenix."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .build()),
    HORNED_SERPENT_HORN(new ItemBuilder()
            .withMaterial(Material.END_ROD)
            .withName(ChatColor.GREEN + "Horned Serpent's Horn")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Horn from a Horned Serpent."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .build()),
    WAMPUS_HAIR(new ItemBuilder()
            .withMaterial(Material.STRING)
            .withName(ChatColor.BLUE + "Wampus Hair")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Hair from a Wampus Cat."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .build()),
    SNALLYGASTER_HEARTSTRING(new ItemBuilder()
            .withMaterial(Material.SPIDER_EYE)
            .withName(ChatColor.GREEN + "Snallygaster Hearstring")
            .withLore(Collections.singletonList(ChatColor.WHITE + "The heartstring of a Snallygaster."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .build()),
    JACKALOPE_ANTLERS(new ItemBuilder()
            .withMaterial(Material.RABBIT_HIDE)
            .withName(ChatColor.YELLOW + "Jackalope Antlers")
            .withLore(Collections.singletonList(ChatColor.WHITE + "The antlers of a Jackalope."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .build()),
    ALDER_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Alder Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    APPLE_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Apple Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    ASH_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Ash Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    ASPEN_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Aspen Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    BEECH_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Beech Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    BLACKTHORN_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Blackthorn Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    BLACK_WALNUT_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Black Walnut Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    CEDAR_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Cedar Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    CHERRY_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Cherry Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    CHESTNUT_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Chestnut Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    CYPRESS_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Cypress Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    DOGWOOD_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Dogwood Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    EBONY_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Ebony Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    ELDER_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Elder Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    ELM_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Elm Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    ENGLISH_OAK_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "English Oak Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    FIR_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Fir Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    HAWTHORN_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Hawthorn Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    HAZEL_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Hazel Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    HOLLY_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Holly Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    HORNBEAM_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Hornbeam Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    LARCH_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Larch Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    LAUREL_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Laurel Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    MAPLE_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Maple Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    PEAR_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Pear Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    PINE_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Pine Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    POPLAR_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Poplar Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    RED_OAK_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Red Oak Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    REDWOOD_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Redwood Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    ROWAN_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Rowan Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    SILVER_LIME_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Silver Lime Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    SPRUCE_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Spruce Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    SYCAMORE_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Sycamore Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    VINE_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Vine Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    WALNUT_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Walnut Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    WILLOW_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Willow Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),
    YEW_WOOD(new ItemBuilder()
            .withMaterial(Material.LOG)
            .withName(ChatColor.DARK_PURPLE + "Yew Wood")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Chunk of wood from a tree."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .withData((short)1)
            .build()),



    ;



    private ItemStack item;

    Items(ItemStack item) {
        this.item = item;
    }

    public ItemStack getItem() {
        return item;
    }
}
