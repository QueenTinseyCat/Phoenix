package xyz.phoenix.phoneix.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class CommandBlocker implements Listener {

    private String[] blockedCommands = {"fill", "clone", "kill", "kick"};
    private String[] ownerOnly = {"ban", "pardon"};

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onCommand(PlayerCommandPreprocessEvent e){
        Player p = e.getPlayer();
        String dont = ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "" + ChatColor.BOLD + "You don't have permission to use this command.";
        String command = e.getMessage().toLowerCase();

        if(p.isOp()) return;

        for(String s : blockedCommands) {
            if(command.equalsIgnoreCase(s)) {
                p.sendMessage(dont);
                e.setCancelled(true);
                return;
            }
        }


    }
}
