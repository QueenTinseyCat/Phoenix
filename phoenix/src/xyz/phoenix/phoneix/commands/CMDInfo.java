package xyz.phoenix.phoneix.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;
import xyz.phoenix.phoneix.player.Wizard;

import java.util.ArrayList;
import java.util.List;

public class CMDInfo implements CommandExecutor {
    List<String> alias = new ArrayList<>();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        alias.add("info");
        cmd.setAliases(alias);
        if(!s.equals("info")) {return true;}



        if(args.length == 1) {
            if(args[0].equals("list")) {
                for (Player p : Bukkit.getOnlinePlayers()) {
                    Wizard wizard = Wizard.getWizardByPlayer(p);
                    sender.sendMessage(wizard.getTypeColor() + p.getDisplayName() + ChatColor.WHITE + " Year " + wizard.getYear());
                }
            }
            Player player = null;
            for (Player p : Bukkit.getOnlinePlayers()) {

                if (p.getDisplayName().equals(args[0])) {
                    player = Bukkit.getPlayer(args[0]);
                    break;
                }

            }
            if(player == null) {sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "Could not find player, " + args[0]);return true;}
            Wizard wizard = Wizard.getWizardByPlayer(player);
            sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.WHITE + "All information on the player, " + ChatColor.LIGHT_PURPLE + player.getDisplayName() + ChatColor.RESET);
            sender.sendMessage("Name: " + wizard.getTypeColor() + wizard.getName());
            sender.sendMessage("House: " + wizard.getColoredStringType());
            sender.sendMessage("Year: " +wizard.getTypeColor()+ wizard.getYear());
            sender.sendMessage("Level: " +wizard.getTypeColor() + wizard.getLevel());
            return true;
        }

        if(args.length == 2) {
            if(sender instanceof Player) {
                if(!Wizard.getWizardByPlayer((Player) sender).getPerms().contains("staff")) {sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "You don't have permission to do that, you can only do /info <player>");return true;}
            }
            if(!args[1].equals("-a")){sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "Invalid arguments."); return true;}

            Player player = null;
            for (Player p : Bukkit.getOnlinePlayers()) {

                if (p.getDisplayName().equals(args[0])) {
                    player = Bukkit.getPlayer(args[0]);
                    break;
                }

            }
            if(player == null) {return true;}
            Wizard wizard = Wizard.getWizardByPlayer(player);
            sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.WHITE + "All information on the player, " + ChatColor.LIGHT_PURPLE + player.getDisplayName() + ChatColor.RESET);
            sender.sendMessage("Name: " + wizard.getTypeColor() + wizard.getName());
            sender.sendMessage("House: " + wizard.getColoredStringType());
            sender.sendMessage("Permissions: " + wizard.getTypeColor() + wizard.getPerms());
            sender.sendMessage("Year: " +wizard.getTypeColor()+ wizard.getYear());
            sender.sendMessage("Level: " +wizard.getTypeColor() + (int)wizard.getLevel());
            sender.sendMessage("IP: " +wizard.getTypeColor() + player.getAddress());
            sender.sendMessage("Health: " + wizard.getTypeColor() + player.getHealth());
            sender.sendMessage("Gamemode: " + wizard.getTypeColor() + wizard.getGamemode());
            sender.sendMessage("Exact Level: " + wizard.getTypeColor() + wizard.getLevel());
            sender.sendMessage("Location: " + wizard.getTypeColor() + (int)player.getLocation().getX() + ", " + (int)player.getLocation().getY() + ", " + (int)player.getLocation().getZ());
            sender.sendMessage("Potion Effects: " + wizard.getTypeColor() + player.getActivePotionEffects());
            sender.sendMessage("UUID: " + wizard.getTypeColor() + player.getUniqueId());
            sender.sendMessage("Has Played Before: " + wizard.getTypeColor() + player.hasPlayedBefore());
            sender.sendMessage("Hunger: " + wizard.getTypeColor() + player.getFoodLevel());
            sender.sendMessage("Ping: " + wizard.getTypeColor() + ((CraftPlayer)player).getHandle().ping);
            return true;
        }
        sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "Please use proper arguments.");

        return true;
    }
}
