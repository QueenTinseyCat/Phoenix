package xyz.phoenix.phoneix.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class CommandBlocker implements Listener {

    private String[] blockedCommands = {"fill", "clone"};

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onCommand(PlayerCommandPreprocessEvent e){
        Player p = e.getPlayer();
        String dont = ChatColor.RED + "\"Please don't do that\" - " + ChatColor.BLUE + "Glorial";
        String command = e.getMessage().toLowerCase();

        for(String s : blockedCommands) {
            if(command.equalsIgnoreCase(s)) {
                p.sendMessage(dont);
                e.setCancelled(true);
                return;
            }
        }

        if(e.getMessage().toLowerCase().startsWith("/kill")) {
            if(!e.getPlayer().isOp()) {
                e.setCancelled(true);
                p.sendMessage(ChatColor.RED + "\"Please don't do that\" - " + ChatColor.BLUE + "Glorial");
            }
        }
    }
}
