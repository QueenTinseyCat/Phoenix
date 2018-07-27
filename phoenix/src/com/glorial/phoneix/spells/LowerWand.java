package com.glorial.phoneix.spells;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import static com.glorial.phoneix.Main.raisedInv;

public class LowerWand {

    public void lowerWand(PlayerInteractEvent event) {

        Player player = event.getPlayer();
        Inventory newInv = raisedInv.get(player.getUniqueId());
        player.getInventory().clear();
        for(ItemStack item : newInv.getContents()) {

            if( !(item == null) && !item.getType().equals(Material.AIR) && item.hasItemMeta()) {
                player.getInventory().addItem(item);

            }


        }

    }
}
