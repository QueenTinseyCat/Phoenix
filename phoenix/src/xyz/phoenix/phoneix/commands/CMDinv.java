package xyz.phoenix.phoneix.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import xyz.phoenix.phoneix.player.Wizard;

public class CMDinv implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

        if(!(sender instanceof Player)) {sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "\"It dont look like you can opens an inventory\"  said the sassy black lady"); return true;}

        Player player = (Player) sender;
        Wizard wizard = Wizard.getWizardByPlayer(player);
        if(!wizard.getPerms().contains("staff")){
            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "You don't have permission to use this command.");
            return true;
        }
        if(args.length == 1) {
            Player toOpen = null;
            for(Player player1 : Bukkit.getOnlinePlayers()) {
                if(player1.getDisplayName().equalsIgnoreCase(args[0])) {
                    toOpen = player1;
                    break;
                }
            }
            if(toOpen == null) {
                player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "Could not find the player " + ChatColor.DARK_AQUA + args[0]);
                return true;
            }
            player.openInventory(toOpen.getInventory());
            for(HumanEntity e : toOpen.getInventory().getViewers()) {
                player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + "Viewer: " + ChatColor.WHITE + e.getName());
            }

        }
        return true;
    }
}
