package com.glorial.phoneix.items.wands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class wandslots {

    public ItemStack pane1() {

        ItemStack pane = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)1);
        ItemMeta wPane = pane.getItemMeta();
        wPane.setDisplayName(ChatColor.GOLD + "1");
        ArrayList<String> paneLore = new ArrayList<>();
        paneLore.add("");
        wPane.setLore(paneLore);
        wPane.addEnchant(Enchantment.LUCK, 1, true);
        wPane.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        pane.setItemMeta(wPane);
        return pane;
    }
    public ItemStack pane2() {

        ItemStack pane = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)2);
        ItemMeta wPane = pane.getItemMeta();
        wPane.setDisplayName(ChatColor.GOLD + "2");
        ArrayList<String> paneLore = new ArrayList<>();
        paneLore.add("");
        wPane.setLore(paneLore);
        wPane.addEnchant(Enchantment.LUCK, 1, true);
        wPane.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        pane.setItemMeta(wPane);
        return pane;
    }
    public ItemStack pane3() {

        ItemStack pane = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)3);
        ItemMeta wPane = pane.getItemMeta();
        wPane.setDisplayName(ChatColor.GOLD + "3");
        ArrayList<String> paneLore = new ArrayList<>();
        paneLore.add("");
        wPane.setLore(paneLore);
        wPane.addEnchant(Enchantment.LUCK, 1, true);
        wPane.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        pane.setItemMeta(wPane);
        return pane;
    }
    public ItemStack pane4() {

        ItemStack pane = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)4);
        ItemMeta wPane = pane.getItemMeta();
        wPane.setDisplayName(ChatColor.GOLD + "4");
        ArrayList<String> paneLore = new ArrayList<>();
        paneLore.add("");
        wPane.setLore(paneLore);
        wPane.addEnchant(Enchantment.LUCK, 1, true);
        wPane.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        pane.setItemMeta(wPane);
        return pane;
    }
    public ItemStack pane5() {

        ItemStack pane = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)5);
        ItemMeta wPane = pane.getItemMeta();
        wPane.setDisplayName(ChatColor.GOLD + "5");
        ArrayList<String> paneLore = new ArrayList<>();
        paneLore.add("");
        wPane.setLore(paneLore);
        wPane.addEnchant(Enchantment.LUCK, 1, true);
        wPane.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        pane.setItemMeta(wPane);
        return pane;
    }
    public ItemStack pane6() {

        ItemStack pane = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)6);
        ItemMeta wPane = pane.getItemMeta();
        wPane.setDisplayName(ChatColor.GOLD + "6");
        ArrayList<String> paneLore = new ArrayList<>();
        paneLore.add("");
        wPane.setLore(paneLore);
        wPane.addEnchant(Enchantment.LUCK, 1, true);
        wPane.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        pane.setItemMeta(wPane);
        return pane;
    }
    public ItemStack pane7() {

        ItemStack pane = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)10);
        ItemMeta wPane = pane.getItemMeta();
        wPane.setDisplayName(ChatColor.GOLD + "7");
        ArrayList<String> paneLore = new ArrayList<>();
        paneLore.add("");
        wPane.setLore(paneLore);
        wPane.addEnchant(Enchantment.LUCK, 1, true);
        wPane.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        pane.setItemMeta(wPane);
        return pane;
    }
    public ItemStack pane8() {

        ItemStack pane = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)14);
        ItemMeta wPane = pane.getItemMeta();
        wPane.setDisplayName(ChatColor.GOLD + "8");
        ArrayList<String> paneLore = new ArrayList<>();
        paneLore.add("");
        wPane.setLore(paneLore);
        wPane.addEnchant(Enchantment.LUCK, 1, true);
        wPane.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        pane.setItemMeta(wPane);
        return pane;
    }
    public ItemStack pane9() {

        ItemStack pane = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)0);
        ItemMeta wPane = pane.getItemMeta();
        wPane.setDisplayName(ChatColor.GOLD + "9");
        ArrayList<String> paneLore = new ArrayList<>();
        paneLore.add("");
        wPane.setLore(paneLore);
        wPane.addEnchant(Enchantment.LUCK, 1, true);
        wPane.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        pane.setItemMeta(wPane);
        return pane;
    }
}
