package xyz.phoenix.phoneix.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xyz.phoenix.phoneix.player.Wizard;
import xyz.phoenix.phoneix.spells.Spell;

public class CMDcasts implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if(!s.equals("casts")) {return true;}


        if(args.length == 3) {
            if(sender instanceof Player) {
                if (!(Wizard.getWizardByPlayer((Player) sender).getPerms().contains("admin"))) {
                    sender.sendMessage(ChatColor.GOLD + "[Phoneix] " + ChatColor.RED + "You don't have permission to use this command. You can only do \"/casts <player> <spell>\"");
                    return true;
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
            switch (args[1]) {

                case "lumos":try {wizard.getSpells().put(Spell.LUMOS, Integer.parseInt(args[2]));sender.sendMessage(ChatColor.GOLD + "[Phoenix] "+ ChatColor.WHITE + "Set Lumos to: " + wizard.getSpells().get(Spell.LUMOS));}
                catch(NumberFormatException e) {player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + args[2] + ChatColor.RED + " is not a valid number.");}return true;

                case "periculum" : try {wizard.getSpells().put(Spell.PERICULUM, Integer.parseInt(args[2]));sender.sendMessage(ChatColor.GOLD + "[Phoenix] "+ ChatColor.WHITE + "Set Periculum to: " + wizard.getSpells().get(Spell.PERICULUM));}
                catch(NumberFormatException e) {player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + args[2] + ChatColor.RED + " is not a valid number.");}
                return true;

                case "nox" :try {wizard.getSpells().put(Spell.NOX, Integer.parseInt(args[2]));sender.sendMessage(ChatColor.GOLD + "[Phoenix] "+ ChatColor.WHITE + "Set Nox to: " + wizard.getSpells().get(Spell.NOX));}
                catch(NumberFormatException e) {player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + args[2] + ChatColor.RED + " is not a valid number.");}return true;

                default : sender.sendMessage(ChatColor.GOLD + "[Phoenix] "+ ChatColor.DARK_AQUA + args[1] + ChatColor.RED + " is not a valid spell.");return true;
            }
        }

        if(args.length == 2) {

            Player player = null;
            for (Player p : Bukkit.getOnlinePlayers()) {

                if (p.getDisplayName().equals(args[0])) {
                    player = Bukkit.getPlayer(args[0]);
                    break;
                }

            }
            if(player == null) {sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "Could not find player, " + args[0]);return true;}
            Wizard wizard = Wizard.getWizardByPlayer(player);
            switch (args[1]) {

                case "lumos":sender.sendMessage(ChatColor.GOLD + "[Phoenix] "+ ChatColor.WHITE + "Lumos: " + wizard.getSpells().get(Spell.LUMOS));return true;

                case "periculum" : sender.sendMessage(ChatColor.GOLD + "[Phoenix] "+ ChatColor.WHITE + "Periculum: " + wizard.getSpells().get(Spell.PERICULUM));return true;

                case "nox" : sender.sendMessage(ChatColor.GOLD + "[Phoenix] "+ ChatColor.WHITE + "Nox: " + wizard.getSpells().get(Spell.NOX));return true;

                default : sender.sendMessage(ChatColor.GOLD + "[Phoenix] "+ ChatColor.DARK_AQUA + args[1] + ChatColor.RED + " is not a valid spell.");return true;
            }
        }




        sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "The correct usage is \"/casts <player> <spell>\"");

        return true;
    }
}
