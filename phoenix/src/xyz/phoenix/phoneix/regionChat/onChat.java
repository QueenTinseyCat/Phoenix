package xyz.phoenix.phoneix.regionChat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import xyz.phoenix.phoneix.player.Wizard;

public class onChat implements Listener {


    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        event.setCancelled(true);
        Player player = event.getPlayer();

        //global
        if (event.getMessage().startsWith("%")) {

            String realMessage = event.getMessage().toLowerCase().replaceFirst("%", "");
            Bukkit.getServer().broadcastMessage(ChatColor.DARK_AQUA + "[Global] " + ChatColor.WHITE + "<" + player.getDisplayName() + "> " + realMessage);
            return;
        }
        //end global


        if(event.getMessage().startsWith("$")) {

            if (Wizard.getWizardByPlayer(player).getPerms().contains("admin")) {

                Bukkit.getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "[Admin] " + ChatColor.WHITE + "<" + event.getPlayer().getDisplayName() + "> " + event.getMessage().replaceFirst("\\$", ""));

                for (Player p : Bukkit.getServer().getOnlinePlayers()) {

                    if (Wizard.getWizardByPlayer(p).getPerms().contains("admin")) {

                        p.sendMessage(ChatColor.LIGHT_PURPLE + "[Admin] " + ChatColor.WHITE + "<" + event.getPlayer().getDisplayName() + "> " + event.getMessage().replaceFirst("\\$", ""));
                       }


                }
                return;


            }
        }

        if(event.getMessage().startsWith("&")) {


            if (Wizard.getWizardByPlayer(player).getPerms().contains("staff")) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "[Staff] " + ChatColor.WHITE + "<" + event.getPlayer().getDisplayName() + "> " + event.getMessage().replaceFirst("&", ""));
                for (Player p : Bukkit.getServer().getOnlinePlayers()) {

                    if (Wizard.getWizardByPlayer(p).getPerms().contains("staff")) {

                        p.sendMessage(ChatColor.RED + "[Staff] " + ChatColor.WHITE + "<" + event.getPlayer().getDisplayName() + "> " + event.getMessage().replaceFirst("&", ""));

                    }


                }
                return;


            }








        }




        //whisper
        if (event.getMessage().startsWith("~")) {

            String realMessage = event.getMessage().replaceFirst("~", "");
            for (Entity entity : player.getNearbyEntities(4, 4, 4)) {

                if (entity instanceof Player) {

                    entity.sendMessage(ChatColor.DARK_GRAY + "[Whisper] " + ChatColor.GRAY + "<" + player.getDisplayName() + "> " + ChatColor.ITALIC + realMessage);

                }

            }
            player.sendMessage(ChatColor.DARK_GRAY + "[Whisper] " + ChatColor.GRAY + "<" + player.getDisplayName() + "> " + ChatColor.ITALIC + realMessage);
            Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_GRAY + "[Whisper] " + ChatColor.GRAY + "<" + player.getDisplayName() + "> " + ChatColor.ITALIC + realMessage);

            return;
        }
        //end whisper


        if(event.getMessage().startsWith("#")) {


            if (Wizard.getWizardByPlayer(player).getType().equals(Wizard.Type.HORNED_SERPENT)) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.BLUE + "[Horned Serpent] " + ChatColor.WHITE + "<" + event.getPlayer().getDisplayName() + "> " + event.getMessage().replaceFirst("#", ""));
                for (Player p : Bukkit.getServer().getOnlinePlayers()) {

                    if (Wizard.getWizardByPlayer(p).getType().equals(Wizard.Type.HORNED_SERPENT)) {

                        p.sendMessage(ChatColor.BLUE + "[Horned Serpent] " + ChatColor.WHITE + "<" + event.getPlayer().getDisplayName() + "> " + event.getMessage().replaceFirst("#", ""));

                    }


                }
                return;


            }
            if (Wizard.getWizardByPlayer(player).getType().equals(Wizard.Type.THUNDERBIRD)) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_PURPLE + "[Thunderbird] " + ChatColor.WHITE + "<" + event.getPlayer().getDisplayName() + "> " + event.getMessage().replaceFirst("#", ""));
                for (Player p : Bukkit.getServer().getOnlinePlayers()) {

                    if (Wizard.getWizardByPlayer(p).getType().equals(Wizard.Type.THUNDERBIRD)) {

                        p.sendMessage(ChatColor.DARK_PURPLE + "[Thunderbird] " + ChatColor.WHITE + "<" + event.getPlayer().getDisplayName() + "> " + event.getMessage().replaceFirst("#", ""));

                    }


                }
                return;


            }

            if (Wizard.getWizardByPlayer(player).getType().equals(Wizard.Type.WAMPUS)) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "[Wampus] " + ChatColor.WHITE + "<" + event.getPlayer().getDisplayName() + "> " + event.getMessage().replaceFirst("#", ""));
                for (Player p : Bukkit.getServer().getOnlinePlayers()) {

                    if (Wizard.getWizardByPlayer(p).getType().equals(Wizard.Type.WAMPUS)) {

                        p.sendMessage(ChatColor.DARK_GREEN + "[Wampus] " + ChatColor.WHITE + "<" + event.getPlayer().getDisplayName() + "> " + event.getMessage().replaceFirst("#", ""));

                    }


                }
                return;


            }
            if (Wizard.getWizardByPlayer(player).getType().equals(Wizard.Type.PUKWUDGIE)) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_RED + "[Pukwudgie] " + ChatColor.WHITE + "<" + event.getPlayer().getDisplayName() + "> " + event.getMessage().replaceFirst("#", ""));
                for (Player p : Bukkit.getServer().getOnlinePlayers()) {

                    if (Wizard.getWizardByPlayer(p).getType().equals(Wizard.Type.PUKWUDGIE)) {

                        p.sendMessage(ChatColor.DARK_RED + "[Pukwudgie] " + ChatColor.WHITE + "<" + event.getPlayer().getDisplayName() + "> " + event.getMessage().replaceFirst("#", ""));

                    }


                }
                return;


            }
            if (Wizard.getWizardByPlayer(player).getType().equals(Wizard.Type.UNSORTED)) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.BLACK + "[Unsorted] " + ChatColor.WHITE + "<" + event.getPlayer().getDisplayName() + "> " + event.getMessage().replaceFirst("#", ""));
                for (Player p : Bukkit.getServer().getOnlinePlayers()) {

                    if (Wizard.getWizardByPlayer(p).getPerms().contains("staff")) {

                        p.sendMessage(ChatColor.BLACK + "[Unsorted] " + ChatColor.WHITE + "<" + event.getPlayer().getDisplayName() + "> " + event.getMessage().replaceFirst("#", ""));

                    }


                }
                return;


            }



        }




        //region chat
        else {
            for (Entity entity : player.getNearbyEntities(50, 50, 50)) {


                if (entity instanceof Player) {
                    if (!((Player) entity).getDisplayName().equals(player.getDisplayName())) {
                        entity.sendMessage(ChatColor.GRAY + "[Region] " + ChatColor.WHITE + "<" + player.getDisplayName() + "> " + event.getMessage());

                    }
                }
            }
            player.sendMessage(ChatColor.GRAY + "[Region] " + ChatColor.WHITE + "<" + player.getDisplayName() + "> " + event.getMessage());
            Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "[Region] " + ChatColor.WHITE + "<" + player.getDisplayName() + "> " + event.getMessage());


        }
        //end region
    }



}
