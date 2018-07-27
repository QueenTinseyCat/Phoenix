package xyz.phoenix.phoneix.items.wands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import xyz.phoenix.phoneix.Main;

import java.util.ArrayList;

public class WandCores {

    private Plugin plugin = Main.getPlugin(Main.class);

    public ItemStack unicornHair() {
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

        return unicornHair;
    }

    public ItemStack dragonHeartstring() {
        ItemStack dragonHeartstring = new ItemStack(Material.SPIDER_EYE, 1);
        ItemMeta wdragonHeartstring = dragonHeartstring.getItemMeta();
        wdragonHeartstring.setDisplayName(ChatColor.DARK_RED + "Dragon Heartstring");
        ArrayList<String> dragonHeartstringLore = new ArrayList<>();
        dragonHeartstringLore.add(ChatColor.WHITE + "The heartstring of a dragon.");
        wdragonHeartstring.setLore(dragonHeartstringLore);
        wdragonHeartstring.addEnchant(Enchantment.LUCK, 1, true);
        wdragonHeartstring.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        dragonHeartstring.setItemMeta(wdragonHeartstring);
        return dragonHeartstring;
    }
    public ItemStack phoenixFeather() {

        ItemStack phoenixFeather = new ItemStack(Material.FEATHER, 1);
        ItemMeta wphoenixFeather = phoenixFeather.getItemMeta();
        wphoenixFeather.setDisplayName(ChatColor.RED + "Phoenix Feather");
        ArrayList<String> phoenixFeatherLore = new ArrayList<>();
        phoenixFeatherLore.add(ChatColor.WHITE + "Feather from a Phoenix.");
        wphoenixFeather.setLore(phoenixFeatherLore);
        wphoenixFeather.addEnchant(Enchantment.LUCK, 1, true);
        wphoenixFeather.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES);
        phoenixFeather.setItemMeta(wphoenixFeather);
        return phoenixFeather;
    }

    public ItemStack hornedSerpentsHorn() {
        ItemStack SerpentsHorn = new ItemStack(Material.END_ROD, 1);
        ItemMeta wSerpentsHorn = SerpentsHorn.getItemMeta();
        wSerpentsHorn.setDisplayName(ChatColor.GREEN + "River Serpent's Horn");
        ArrayList<String> SerpentsHornLore = new ArrayList<>();
        SerpentsHornLore.add(ChatColor.WHITE +"Horn from a River Serpent.");
        wSerpentsHorn.setLore(SerpentsHornLore);
        wSerpentsHorn.addEnchant(Enchantment.LUCK, 1, true);
        wSerpentsHorn.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        SerpentsHorn.setItemMeta(wSerpentsHorn);
        return SerpentsHorn;



    }
    public ItemStack wampusHair() {
        ItemStack wampusHair = new ItemStack(Material.STRING, 1);
        ItemMeta wwampusHair = wampusHair.getItemMeta();
        wwampusHair.setDisplayName(ChatColor.BLUE + "Wampus Hair");
        ArrayList<String> wampusHairLore = new ArrayList<>();
        wampusHairLore.add(ChatColor.WHITE +"Hair from a Wampus cat.");
        wwampusHair.setLore(wampusHairLore);
        wwampusHair.addEnchant(Enchantment.LUCK, 1, true);
        wwampusHair.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        wampusHair.setItemMeta(wwampusHair);
        return wampusHair;
    }

    public ItemStack snallygasterHeartstring() {
        ItemStack snallygasterHeartstring = new ItemStack(Material.SPIDER_EYE, 1);
        ItemMeta wsnallygasterHeartstring = snallygasterHeartstring.getItemMeta();
        wsnallygasterHeartstring.setDisplayName(ChatColor.GREEN + "Snallygaster Heartstring");
        ArrayList<String> snallygasterHeartstringLore = new ArrayList<>();
        snallygasterHeartstringLore.add(ChatColor.WHITE + "The heartstring of a snallygaster.");
        wsnallygasterHeartstring.setLore(snallygasterHeartstringLore);
        wsnallygasterHeartstring.addEnchant(Enchantment.LUCK, 1, true);
        wsnallygasterHeartstring.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        snallygasterHeartstring.setItemMeta(wsnallygasterHeartstring);
        return snallygasterHeartstring;
    }
    public ItemStack jackalopeAntlers() {
        ItemStack jackalopeAntlers = new ItemStack(Material.RABBIT_HIDE, 1);
        ItemMeta wjackalopeAntlers = jackalopeAntlers.getItemMeta();
        wjackalopeAntlers.setDisplayName(ChatColor.YELLOW + "Jackalope Antlers");
        ArrayList<String> jackalopeAntlerLore = new ArrayList<>();
        jackalopeAntlerLore.add(ChatColor.WHITE + "The antlers of a jackalope.");
        wjackalopeAntlers.setLore(jackalopeAntlerLore);
        wjackalopeAntlers.addEnchant(Enchantment.LUCK, 1, true);
        wjackalopeAntlers.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        jackalopeAntlers.setItemMeta(wjackalopeAntlers);
        return jackalopeAntlers;
    }

}
