package xyz.phoenix.phoneix.items.wands;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import xyz.phoenix.phoneix.player.Wizard;

import java.util.ArrayList;
import java.util.List;

public class id {
    public void give(Player player) {
        Wizard wizard = Wizard.getWizardByPlayer(player);
        ItemStack item = new ItemStack(Material.PAPER, 1);
        ItemMeta mItem = item.getItemMeta();
        mItem.setDisplayName(org.bukkit.ChatColor.GRAY + "Id");
        mItem.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES);
        mItem.addEnchant(Enchantment.LUCK, 1, false);
        List<String> lore = new ArrayList<>();
        lore.add("Name: " + player.getDisplayName());
        lore.add("UUID: " + player.getUniqueId());
        lore.add("House: " + wizard.getColoredStringType());
        lore.add("Year: " + wizard.getYear());
        if(wizard.getPerms().contains("staff")) {
            lore.add("Staff");
        }
        if(wizard.getPerms().contains("admin")) {
            lore.add("Admin");
        }
        if(wizard.getPerms().contains("builder")) {
            lore.add("Builder");
        }
        mItem.setLore(lore);
        item.setItemMeta(mItem);
        player.getInventory().addItem(item);
    }
}
