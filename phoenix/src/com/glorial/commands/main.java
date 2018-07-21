package com.glorial.commands;

import com.glorial.items.wands.wandCores;
import net.minecraft.server.v1_12_R1.CommandExecute;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class main extends CommandExecute implements Listener, CommandExecutor {

    public String grant = "grant";

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof Player) {


            if (cmd.getName().equalsIgnoreCase(grant)) {


                if (sender.isOp()) {
                    if (args.length > 1) {
                        if (args[0].equalsIgnoreCase("unicorn") && args[1].equalsIgnoreCase("hair")) {

                            new wandCores().unicornHair((Player) sender);
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselve a strand of unicorn hair.");
                            return true;
                        }

                        if (args[0].equalsIgnoreCase("dragon") && args[1].equalsIgnoreCase("heartstring")) {
                            new wandCores().dragonHeartstring((Player) sender);
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselve a dragon's heartstring.");
                            return true;

                        }

                        if(args[0].equalsIgnoreCase("phoenix") && args[1].equalsIgnoreCase("feather")) {

                            new wandCores().phoenixFeather((Player) sender);
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselve a feather from a Phoenix.");
                            return true;

                        }

                        if(args[0].equalsIgnoreCase("serpent") && args[1].equalsIgnoreCase("horn")) {


                            
                        }

                    }

                    if (args.length == 1) {
                        if (args[0].equalsIgnoreCase("list")) {
                            sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.BLUE + "Unicorn Hair, Dragon Heartstring, Phoenix Feather");
                            return true;
                        }
                        if (args[0].equalsIgnoreCase("help")) {

                            sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GREEN + "Grant is a command used by server ops to give server items. Do \"/grant list\" to see all grantable items!");
                            return true;

                        }
                    }


                    if (args.length <= 0) {
                        sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.BLUE + "Do \"/grant list\" to see all grantable items!");
                        return true;
                    } else {

                        sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.BLUE + "Do \"/grant list\" to see all grantable items!");
                        return true;

                    }

                }
                else {
                    sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "Sorry, you can't do that! You must be an op to use Grant.");
                    return true;
                }

            }
        }

            return true;


    }
    }

