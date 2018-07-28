package xyz.phoenix.phoneix.events;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class EventDropItemPlayer implements Listener {

    @EventHandler
    public void PaneDropLS(PlayerDropItemEvent event) {
        Item item = event.getItemDrop();
        if(item.getItemStack().getType() != Material.STAINED_GLASS_PANE) return;
        Player player = event.getPlayer();
        if(player.getGameMode() == GameMode.CREATIVE) return;

        event.setCancelled(true);
        player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "You cannot drop that item.");
    }
}
