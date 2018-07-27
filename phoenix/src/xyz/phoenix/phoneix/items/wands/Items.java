package xyz.phoenix.phoneix.items.wands;

import xyz.phoenix.phoneix.ItemBuilder;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;

import java.util.Collections;

public enum Items {

    WAND(new ItemBuilder()
            .withMaterial(Material.GOLD_AXE)
            .withName(ChatColor.LIGHT_PURPLE + "Wand")
            .withLore(Collections.singletonList(ChatColor.WHITE + "Your wand, mostly used for casting spells."))
            .withEnchantment(Enchantment.LUCK)
            .withFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            .build()),
    OTHER_ITEM(new ItemBuilder().withMaterial(Material.LOG).withName("Some item").build());

    private ItemStack item;

    Items(ItemStack item) {
        this.item = item;
    }

    public ItemStack getItem() {
        return item;
    }
}
