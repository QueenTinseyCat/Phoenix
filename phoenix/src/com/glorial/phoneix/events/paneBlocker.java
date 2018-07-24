package com.glorial.phoneix.events;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerDropItemEvent;

public class paneBlocker implements Listener {


    @EventHandler
    public void PanePlaceLS(BlockPlaceEvent event) {

        if(event.getBlock().getType().equals(Material.STAINED_GLASS_PANE)) {

           if(event.getPlayer().getGameMode().equals(GameMode.CREATIVE))
               return;

           event.setCancelled(true);
           event.getPlayer().sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "You cannot place that item.");




        }


    }

    @EventHandler
    public void PaneDropLS(PlayerDropItemEvent event) {

        if(event.getItemDrop().getItemStack().getType().equals(Material.STAINED_GLASS_PANE)) {
            System.out.println("ls for pane drop active");
            if(event.getPlayer().getGameMode().equals(GameMode.CREATIVE))
                return;

            event.setCancelled(true);
            event.getPlayer().sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "You cannot drop that item.");




        }




    }




}
