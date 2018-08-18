package xyz.phoenix.phoneix.events;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class BuildBlocking implements Listener {

    @EventHandler
    public void blockPlacing(BlockPlaceEvent event) {
        Block block = event.getBlock();
        if (event.getPlayer().getGameMode() == GameMode.CREATIVE) return;



        event.setCancelled(true);
        event.getPlayer().sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "You cannot place that item.");



    }

    @EventHandler
    public void blockBreaking(BlockBreakEvent event) {

        if(event.getPlayer().getGameMode().equals(GameMode.CREATIVE)) {return; }

        event.setCancelled(true);
        event.getPlayer().sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "You cannot break that block.");

    }




}
