package com.glorial.phoneix.spells;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.PlayerInventory;

import static com.glorial.phoneix.Main.spellsSpoken;

public class Lumos implements Listener {

    @EventHandler
    public void LumosChatListener(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();

        if(event.getMessage().equalsIgnoreCase("Lumos")) {

            if (spellsSpoken.containsKey(player.getUniqueId())) {
                spellsSpoken.remove(player.getUniqueId());
                spellsSpoken.put(player.getUniqueId(), "Lumos");

                return;

            }
            spellsSpoken.put(player.getUniqueId(), "Lumos");


        }

    }

    /*
    @EventHandler
    public void LumosRaiseListener(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        Inventory inv = player.getInventory();

        if (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK) && wandStatus.get(player.getUniqueId()).equals("lowered")) {
            if (event.getHand().equals(EquipmentSlot.HAND)) {
                if (((PlayerInventory) inv).getItemInMainHand() != null && ((PlayerInventory) inv).getItemInMainHand().hasItemMeta() && ((PlayerInventory) inv).getItemInMainHand().getItemMeta().getDisplayName() != null) {

                    if(((PlayerInventory) inv).getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "Wand")) {

                        player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GRAY + "" + ChatColor.ITALIC + "raised wand");
                        wandStatus.remove(player.getUniqueId());
                        wandStatus.put(player.getUniqueId(), "raised")


                    }


                }
            }

            event.getPlayer().getInventory().getHeldItemSlot();
        }
    }
    */
}
