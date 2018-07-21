package com.glorial.items.wands;

import com.glorial.main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;

public class wandCores {
    private Plugin plugin = main.getPlugin(main.class);
    public void unicornHair(Player player) {
        ItemStack unicornHair = new ItemStack(Material.STRING, 1);
        ItemMeta wunicornHair = unicornHair.getItemMeta();
        wunicornHair.setDisplayName(ChatColor.GOLD + "Unicorn Hair");
        ArrayList<String> unicornHairLore = new ArrayList<String>();
        unicornHairLore.add(ChatColor.WHITE + "A hair from the mane of ");
        unicornHairLore.add(ChatColor.WHITE + "the purest unicorn.");
        wunicornHair.setLore(unicornHairLore);
        wunicornHair.addEnchant(Enchantment.LUCK, 1, true);
        wunicornHair.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wunicornHair.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        unicornHair.setItemMeta(wunicornHair);
        player.getInventory().addItem(unicornHair);
    }

    public void dragonHeartstring(Player player) {
        ItemStack dragonHeartstring = new ItemStack(Material.SPIDER_EYE, 1);
        ItemMeta wdragonHeartstring = dragonHeartstring.getItemMeta();
        wdragonHeartstring.setDisplayName(ChatColor.DARK_RED + "Dragon Heartstring");
        ArrayList<String> dragonHeartstringLore = new ArrayList<>();
        dragonHeartstringLore.add(ChatColor.WHITE + "The heartstring of a dragon.");
        wdragonHeartstring.setLore(dragonHeartstringLore);
        wdragonHeartstring.addEnchant(Enchantment.LUCK, 1, true);
        wdragonHeartstring.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        dragonHeartstring.setItemMeta(wdragonHeartstring);
        player.getInventory().addItem(dragonHeartstring);
    }
    public void phoenixFeather(Player player) {

        ItemStack phoenixFeather = new ItemStack(Material.FEATHER, 1);
        ItemMeta wphoenixFeather = phoenixFeather.getItemMeta();
        wphoenixFeather.setDisplayName(ChatColor.RED + "Phoenix Feather");
        ArrayList<String> phoenixFeatherLore = new ArrayList<>();
        phoenixFeatherLore.add(ChatColor.WHITE + "Feather from a Phoenix.");
        wphoenixFeather.setLore(phoenixFeatherLore);
        wphoenixFeather.addEnchant(Enchantment.LUCK, 1, true);
        wphoenixFeather.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES);
        phoenixFeather.setItemMeta(wphoenixFeather);
        player.getInventory().addItem(phoenixFeather);
    }

    public void hornedSerpentsHorn(Player player) {
        ItemStack SerpentsHorn = new ItemStack(Material.END_ROD, 1);
        ItemMeta wSerpentsHorn = SerpentsHorn.getItemMeta();
        wSerpentsHorn.setDisplayName(ChatColor.GREEN + "River Serpent's Horn");
        ArrayList<String> SerpentsHornLore = new ArrayList<>();
        SerpentsHornLore.add("Horn from a River Serpent.");
        wSerpentsHorn.setLore(SerpentsHornLore);
        wSerpentsHorn.addEnchant(Enchantment.LUCK, 1, true);
        wSerpentsHorn.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        SerpentsHorn.setItemMeta(wSerpentsHorn);
        player.getInventory().addItem(SerpentsHorn);



    }



}
