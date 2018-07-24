package com.glorial.phoneix.items.msc;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class obsSharder {
    public ItemStack obsSharder() {
        ItemStack obsSharder = new ItemStack(Material.SHEARS, 1);
        ItemMeta wobsSharder = obsSharder.getItemMeta();
        wobsSharder.setDisplayName(ChatColor.DARK_PURPLE + "Obsidian Sharder");
        ArrayList<String> obsSharderLore = new ArrayList<>();
        obsSharderLore.add(ChatColor.BLACK + "Forged by Goblins to obtain Wand Stone.");
        wobsSharder.setLore(obsSharderLore);
        wobsSharder.addEnchant(Enchantment.LUCK, 1, true);
        wobsSharder.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        obsSharder.setItemMeta(wobsSharder);
        return obsSharder;
    }
}
