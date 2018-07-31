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


        try {
            wizardConfig.load(Main.getInstance().getDataFolder() + "/wizards.yml");
        }catch (InvalidConfigurationException | IOException e) {

        }
        if(args.length == 3) {


            if(args[0].equalsIgnoreCase("add")) {



                Player player = null;
                for(Player p : Bukkit.getOnlinePlayers()) {

                    if(p.getDisplayName().equals(args[1])){ player = Bukkit.getPlayer(args[1]); break;}

                }



                if(player == null) { sender.sendMessage(ChatColor.RED + "Could not find player, " + args[1]); return true; }


                if(args[2].equalsIgnoreCase("admin")) {

                    wizardConfig.set(player.getUniqueId() + ".permissions", "admin");
                    sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GREEN + "Added the permission " + ChatColor.BLUE +args[2]+ChatColor.GREEN+ " to the player " +ChatColor.BLUE + player.getDisplayName());


                }









            }
            //^^ end of arg 1 condition




            try {
                wizardConfig.save(Main.getInstance().getDataFolder().getPath() + "/wizards.yml");

            }catch (IOException e) {
                Bukkit.broadcastMessage(ChatColor.RED + "COULD NOT SAVE WIZARDS.YML");
            }
        }


        else {
            sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_BLUE + "A command used by admins to give permissions");

        }


        return true;
        }

    }
