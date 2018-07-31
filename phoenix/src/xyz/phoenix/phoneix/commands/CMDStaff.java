package xyz.phoenix.phoneix.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import xyz.phoenix.phoneix.Main;
import xyz.phoenix.phoneix.player.Wizard;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CMDStaff implements CommandExecutor {

   public YamlConfiguration wizardConfig = new YamlConfiguration();



    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){



        if(args.length == 3) {

            if(!(sender.isOp()) || !(Wizard.getWizardByPlayer((Player)sender).getPerms().contains("admin"))) {sender.sendMessage(ChatColor.GOLD + "[Phoneix] " + ChatColor.RED + "You don't have permission to use this command.");return true;}


            if(args[0].equalsIgnoreCase("add")) {



                Player player = null;
                for(Player p : Bukkit.getOnlinePlayers()) {

                    if(p.getDisplayName().equals(args[1])){ player = Bukkit.getPlayer(args[1]); break;}

                }



                if(player == null) { sender.sendMessage(ChatColor.GOLD + "[Phoenix] " +ChatColor.RED + "Could not find player, " + args[1]); return true; }


                if(args[2].equalsIgnoreCase("admin")) {
                    if(Wizard.getWizardByPlayer(player).getPerms().contains("admin")) {
                        sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "The player " + ChatColor.BLUE + player.getDisplayName() + ChatColor.RED + " already has the permission " + ChatColor.BLUE + args[2]);
                        return true;
                    }
                    Wizard.getWizardByPlayer(player).addPerm("admin");

                    sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GREEN + "Added the permission " + ChatColor.BLUE +args[2]+ChatColor.GREEN+ " to the player " +ChatColor.BLUE + player.getDisplayName());

                    return true;
                }

                if(args[2].equalsIgnoreCase("builder")) {
                    if(Wizard.getWizardByPlayer(player).getPerms().contains("builder")) {
                        sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "The player " + ChatColor.BLUE + player.getDisplayName() + ChatColor.RED + " already has the permission " + ChatColor.BLUE + args[2]);
                        return true;
                    }
                    Wizard.getWizardByPlayer(player).addPerm("builder");

                    sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GREEN + "Added the permission " + ChatColor.BLUE +args[2]+ChatColor.GREEN+ " to the player " +ChatColor.BLUE + player.getDisplayName());

                    return true;



                }
                if(args[2].equalsIgnoreCase("staff")) {
                    if(Wizard.getWizardByPlayer(player).getPerms().contains("staff")) {
                        sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "The player " + ChatColor.BLUE + player.getDisplayName() + ChatColor.RED + " already has the permission " + ChatColor.BLUE + args[2]);
                        return true;
                    }
                    Wizard.getWizardByPlayer(player).addPerm("staff");

                    sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GREEN + "Added the permission " + ChatColor.BLUE +args[2]+ChatColor.GREEN+ " to the player " +ChatColor.BLUE + player.getDisplayName());

                    return true;



                }

                else{
                    sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "Could not add the permission " + ChatColor.BLUE + args[2] + ChatColor.RED + " because it doesn't exist.");
                    return true;
                }










            }
            //^^ end of arg 0 condition
            if(args[0].equalsIgnoreCase("remove")) {



                Player player = null;
                for(Player p : Bukkit.getOnlinePlayers()) {

                    if(p.getDisplayName().equals(args[1])){ player = Bukkit.getPlayer(args[1]); break;}

                }



                if(player == null) { sender.sendMessage(ChatColor.GOLD + "[Phoenix] " +ChatColor.RED + "Could not find player, " + args[1]); return true; }


                if(args[2].equalsIgnoreCase("admin")) {
                    if(!Wizard.getWizardByPlayer(player).getPerms().contains("admin")) {
                        sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "The player " + ChatColor.BLUE + player.getDisplayName() + ChatColor.RED + " doesn't have the permission " + ChatColor.BLUE + args[2]);
                        return true;
                    }
                    Wizard.getWizardByPlayer(player).removePerm("admin");

                    sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GREEN + "Removed the permission " + ChatColor.BLUE +args[2]+ChatColor.GREEN+ " from the player " +ChatColor.BLUE + player.getDisplayName());

                    return true;
                }

                if(args[2].equalsIgnoreCase("builder")) {
                    if(!Wizard.getWizardByPlayer(player).getPerms().contains("builder")) {
                        sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "The player " + ChatColor.BLUE + player.getDisplayName() + ChatColor.RED + " doesn't have the permission " + ChatColor.BLUE + args[2]);
                        return true;
                    }
                    Wizard.getWizardByPlayer(player).removePerm("builder");

                    sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GREEN + "Removed the permission " + ChatColor.BLUE +args[2]+ChatColor.GREEN+ " from the player " +ChatColor.BLUE + player.getDisplayName());

                    return true;



                }
                if(args[2].equalsIgnoreCase("staff")) {
                    if(!Wizard.getWizardByPlayer(player).getPerms().contains("staff")) {
                        sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "The player " + ChatColor.BLUE + player.getDisplayName() + ChatColor.RED + " doesn't have the permission " + ChatColor.BLUE + args[2]);
                        return true;
                    }
                    Wizard.getWizardByPlayer(player).removePerm("staff");

                    sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GREEN + "Removed the permission " + ChatColor.BLUE +args[2]+ChatColor.GREEN+ " from the player " +ChatColor.BLUE + player.getDisplayName());

                    return true;



                }

                else{
                    sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "Could not remove the permission " + ChatColor.BLUE + args[2] + ChatColor.RED + " because it doesn't exist.");
                    return true;
                }











            }

        }

        if(args.length == 1) {

            if(args[0].equalsIgnoreCase("list")) {

                sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + "Staff, Builder, Admin");


                return true;
            }
            else {
                sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.BLUE + "Do \"/perm list\" to see all permissions.");
            }
            return true;
        }

        else {
            sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_BLUE + "/perm is a  command used by admins to give permissions.");

        }


        return true;
        }

    }
