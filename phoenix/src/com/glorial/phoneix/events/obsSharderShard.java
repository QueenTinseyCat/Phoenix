package com.glorial.phoneix.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class obsSharderShard implements Listener {

    @EventHandler
    public void playerInteractBedrock(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        Inventory inv = player.getInventory();
        if (event.getAction().equals(Action.LEFT_CLICK_BLOCK)) {
            if(player.getInventory().getItemInMainHand() != null && player.getInventory().getItemInMainHand().hasItemMeta() && player.getInventory().getItemInMainHand().getItemMeta().getDisplayName() != null) {
                if (((PlayerInventory) inv).getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "Obsidian Sharder")) {

                    if (event.getClickedBlock().getType().equals(Material.OBSIDIAN)) {

                        event.getClickedBlock().setType(Material.AIR);
                        inv.addItem(new ItemStack(Material.OBSIDIAN, 1));

                        player.getWorld().playSound(event.getPlayer().getLocation(), Sound.BLOCK_METAL_BREAK, 100, 50);

                    }

                }
            }

        }
    }

}
