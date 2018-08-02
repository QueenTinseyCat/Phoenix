package xyz.phoenix.phoneix.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import xyz.phoenix.phoneix.player.Wizard;

public class CMDHouse implements CommandExecutor {

    public YamlConfiguration wizardConfig = new YamlConfiguration();


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender.isOp()) || !(Wizard.getWizardByPlayer((Player) sender).getPerms().contains("admin"))) {
            sender.sendMessage(ChatColor.GOLD + "[Phoneix] " + ChatColor.RED + "You don't have permission to use this command.");
            return true;
        }

        if (args.length == 3) {


            if (args[0].equalsIgnoreCase("change")) {


                Player player = null;
                for (Player p : Bukkit.getOnlinePlayers()) {

                    if (p.getDisplayName().equals(args[1])) {
                        player = Bukkit.getPlayer(args[1]);
                        break;
                    }

                }


                if (player == null) {
                    sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "Could not find player, " + args[1]);
                    return true;
                }


                if (args[2].equalsIgnoreCase("thunderbird")) {

                    Wizard.getWizardByPlayer(player).setType(Wizard.Type.THUNDERBIRD);
                    sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GREEN + "Changed the house of " + ChatColor.BLUE + player.getDisplayName() + ChatColor.GREEN + " to " + ChatColor.LIGHT_PURPLE + "Thunderbird");
                    Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GREEN + "Changed the house of " + ChatColor.BLUE + player.getDisplayName() + ChatColor.GREEN + " to " + ChatColor.DARK_PURPLE + "Thunderbird");
                    return true;
                }
                if (args[2].equalsIgnoreCase("wampus") || args[2].equalsIgnoreCase("wampas")) {

                    Wizard.getWizardByPlayer(player).setType(Wizard.Type.WAMPUS);
                    sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GREEN + "Changed the house of " + ChatColor.BLUE + player.getDisplayName() + ChatColor.GREEN + " to " + ChatColor.DARK_GREEN + "Wampus");
                    Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GREEN + "Changed the house of " + ChatColor.BLUE + player.getDisplayName() + ChatColor.GREEN + " to " + ChatColor.DARK_GREEN + "Wampus");
                    return true;
                }
                if (args[2].equalsIgnoreCase("pukwudgie")) {

                    Wizard.getWizardByPlayer(player).setType(Wizard.Type.PUKWUDGIE);
                    sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GREEN + "Changed the house of " + ChatColor.BLUE + player.getDisplayName() + ChatColor.GREEN + " to " + ChatColor.DARK_RED + "Pukwudgie");
                    Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GREEN + "Changed the house of " + ChatColor.BLUE + player.getDisplayName() + ChatColor.GREEN + " to " + ChatColor.DARK_RED + "Pukwudgie");
                    return true;
                }
                if (args[2].equalsIgnoreCase("unsorted")) {

                    Wizard.getWizardByPlayer(player).setType(Wizard.Type.UNSORTED);
                    sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GREEN + "Changed the house of " + ChatColor.BLUE + player.getDisplayName() + ChatColor.GREEN + " to " + ChatColor.DARK_AQUA + "Unsorted");
                    Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GREEN + "Changed the house of " + ChatColor.BLUE + player.getDisplayName() + ChatColor.GREEN + " to " + ChatColor.DARK_AQUA + "Unsorted");
                    return true;
                } else {
                    sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "The house, " + ChatColor.DARK_AQUA + args[2] + ChatColor.RED + " does not exist.");
                }


            } else {
                sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "Please use valid arguments.");


            }


        }

        if (args.length == 4) {


            if (args[0].equalsIgnoreCase("change")) {


                Player player = null;
                for (Player p : Bukkit.getOnlinePlayers()) {

                    if (p.getDisplayName().equals(args[1])) {
                        player = Bukkit.getPlayer(args[1]);
                        break;
                    }

                }


                if (player == null) {
                    sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "Could not find player, " + args[1]);
                    return true;
                }


                if (args[2].equalsIgnoreCase("horned") && args[3].equalsIgnoreCase("serpent")) {

                    Wizard.getWizardByPlayer(player).setType(Wizard.Type.HORNED_SERPENT);
                    sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GREEN + "Changed the house of " + ChatColor.BLUE + player.getDisplayName() + ChatColor.GREEN + " to " + ChatColor.BLUE + "Horned Serpent");
                    Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GREEN + "Changed the house of " + ChatColor.BLUE + player.getDisplayName() + ChatColor.GREEN + " to " + ChatColor.BLUE + "Horned Serpent");
                    return true;
                }
                if (args[2].equalsIgnoreCase("thunder") && args[3].equalsIgnoreCase("bird")) {

                    Wizard.getWizardByPlayer(player).setType(Wizard.Type.THUNDERBIRD);
                    sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GREEN + "Changed the house of " + ChatColor.BLUE + player.getDisplayName() + ChatColor.GREEN + " to " + ChatColor.DARK_PURPLE + "Thunderbird");
                    Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GREEN + "Changed the house of " + ChatColor.BLUE + player.getDisplayName() + ChatColor.GREEN + " to " + ChatColor.DARK_PURPLE + "Thunderbird");
                    return true;
                }
                if (args[2].equalsIgnoreCase("un") && args[3].equalsIgnoreCase("sorted")) {

                    Wizard.getWizardByPlayer(player).setType(Wizard.Type.UNSORTED);
                    sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GREEN + "Changed the house of " + ChatColor.BLUE + player.getDisplayName() + ChatColor.GREEN + " to " + ChatColor.DARK_AQUA + "Unsorted");
                    Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GREEN + "Changed the house of " + ChatColor.BLUE + player.getDisplayName() + ChatColor.GREEN + " to " + ChatColor.DARK_AQUA + "Unsorted");
                    return true;
                } else {
                    sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "The house, " + ChatColor.DARK_AQUA + args[2] + ChatColor.RED + " does not exist.");
                }


            } else {
                sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "Please use valid arguments.");
            }


            return true;
        }

return true;
    }
}



