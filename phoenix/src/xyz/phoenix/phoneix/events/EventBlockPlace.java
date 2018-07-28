package xyz.phoenix.phoneix.events;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class EventBlockPlace implements Listener {

    @EventHandler
    public void onPanePlaceLS(BlockPlaceEvent event) {
        Block block = event.getBlock();
        if (block.getType() == Material.STAINED_GLASS_PANE) return;
        if (event.getPlayer().getGameMode() == GameMode.CREATIVE) return;

        event.setCancelled(true);
        event.getPlayer().sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "You cannot place that item.");
    }
}
