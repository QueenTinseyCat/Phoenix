package com.glorial.phoneix.spells;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.PlayerInventory;

import static com.glorial.phoneix.main.spellId;
import static com.glorial.phoneix.main.wandStatus;

public class wandMechanics implements Listener {
    @EventHandler
    public void wandStateListener(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        Inventory inv = player.getInventory();
        if (event.getHand() != null && event.getHand().equals(EquipmentSlot.HAND)) {
        if (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {

                if (((PlayerInventory) inv).getItemInMainHand() != null && ((PlayerInventory) inv).getItemInMainHand().hasItemMeta() && ((PlayerInventory) inv).getItemInMainHand().getItemMeta().getDisplayName() != null) {


                    if(((PlayerInventory) inv).getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "Wand")) {


                    if(wandStatus.containsKey(player.getUniqueId())) {





                        if (wandStatus.get(player.getUniqueId()).equals("lowered")) {
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GRAY + "" + ChatColor.ITALIC + "raised wand");
                            wandStatus.remove(player.getUniqueId());
                            wandStatus.put(player.getUniqueId(), "raised");
                            new raiseWand().raiseWand(event);
                            return;

                        }


                    }
                    if(!wandStatus.containsKey(player.getUniqueId())) {
                        player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GRAY + "" + ChatColor.ITALIC + "raised wand");
                        wandStatus.put(player.getUniqueId(), "raised");
                        new raiseWand().raiseWand(event);
                        return;
                    }
                    }

                    //here
                    if(((PlayerInventory) inv).getItemInMainHand().getType().equals(Material.STAINED_GLASS_PANE)) {

                        if(wandStatus.get(player.getUniqueId()).equals("raised")) {

                            if(player.isSneaking()) {
                                if(spellId.containsKey(player.getUniqueId())) {
                                    spellId.remove(player.getUniqueId());
                                }
                                player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GRAY + "" + ChatColor.ITALIC + "lowered wand");
                                wandStatus.remove(player.getUniqueId());
                                wandStatus.put(player.getUniqueId(), "lowered");
                                new lowerWand().lowerWand(event);
                                return;
                            }

                        }

                    }

                }
            }

            //event.getPlayer().getInventory().getHeldItemSlot();




        }
    }
}
