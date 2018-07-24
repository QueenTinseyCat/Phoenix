package com.glorial.phoneix.items.wands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class wandCarver {

    public ItemStack carver() {
        ItemStack wandCarver = new ItemStack(Material.GOLD_AXE, 1);
        ItemMeta wWandCarver = wandCarver.getItemMeta();
        wWandCarver.setDisplayName(ChatColor.WHITE + "Carving Knife");
        ArrayList<String> wandCarverLore = new ArrayList<>();
        wandCarverLore.add(ChatColor.WHITE + "Used to carve wand wood into wands!");
        wWandCarver.setLore(wandCarverLore);
        wWandCarver.setUnbreakable(true);
        wWandCarver.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
        wandCarver.setItemMeta(wWandCarver);
        return wandCarver;
    }
}
