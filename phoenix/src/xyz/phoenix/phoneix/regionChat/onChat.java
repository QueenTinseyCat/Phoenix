package xyz.phoenix.phoneix.regionChat;

import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
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
        Wizard wizard = Wizard.getWizardByPlayer(player);

        //global
        if (event.getMessage().startsWith("%")) {

            String realMessage = event.getMessage().toLowerCase().replaceFirst("%", "");
            TextComponent message = new TextComponent(ChatColor.DARK_AQUA + "[Global] " + ChatColor.WHITE + "<" + player.getDisplayName() + "> "+ realMessage);
            String perm = Wizard.getWizardByPlayer(player).getPerms().contains("staff") ? "Staff" : "";
            message.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(wizard.getTypeColor() + "Year " + wizard.getYear() + "\n" + perm).create()));

           for(Player p : Bukkit.getServer().getOnlinePlayers()) {

               p.spigot().sendMessage(message);

           }

            Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_AQUA + "[Global] " + ChatColor.WHITE + "<" + player.getDisplayName() + "> " + realMessage);
            return;
        }
        //end global


        if(event.getMessage().startsWith("$")) {

            if (Wizard.getWizardByPlayer(player).getPerms().contains("admin")) {

                Bukkit.getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "[Admin] " + ChatColor.WHITE + "<" + event.getPlayer().getDisplayName() + "> " + event.getMessage().replaceFirst("\\$", ""));



                String realMessage = event.getMessage().toLowerCase().replaceFirst("\\$", "");
                TextComponent message = new TextComponent(ChatColor.LIGHT_PURPLE + "[Admin] " + ChatColor.WHITE + "<" + player.getDisplayName() + "> "+ realMessage);
                String perm = Wizard.getWizardByPlayer(player).getPerms().contains("staff") ? "Staff" : "";
                message.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(wizard.getTypeColor() + "Year " + wizard.getYear() + "\n" + perm).create()));

                for(Player p : Bukkit.getServer().getOnlinePlayers()) {
                    if(Wizard.getWizardByPlayer(p).getPerms().contains("admin")) {
                        p.spigot().sendMessage(message);
                    }

                }


                return;


            }
        }

        if(event.getMessage().startsWith("&")) {


            if (wizard.getPerms().contains("staff")) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "[Staff] " + ChatColor.WHITE + "<" + event.getPlayer().getDisplayName() + "> " + event.getMessage().replaceFirst("&", ""));
                String realMessage = event.getMessage().toLowerCase().replaceFirst("&", "");
                TextComponent message = new TextComponent(ChatColor.RED + "[Staff] " + ChatColor.WHITE + "<" + player.getDisplayName() + "> "+ realMessage);
                String perm = Wizard.getWizardByPlayer(player).getPerms().contains("staff") ? "Staff" : "";
                message.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(wizard.getTypeColor() + "Year " + wizard.getYear() + "\n" + perm).create()));

                for(Player p : Bukkit.getServer().getOnlinePlayers()) {
                    if(Wizard.getWizardByPlayer(p).getPerms().contains("staff")) {
                        p.spigot().sendMessage(message);
                    }

                }

                return;

            }

        }


        //whisper
        if (event.getMessage().startsWith("~")) {

            String realMessage = event.getMessage().toLowerCase().replaceFirst("~", "");
        TextComponent message = new TextComponent(ChatColor.DARK_GRAY + "[Whisper] " + ChatColor.GRAY + "<" + player.getDisplayName() + "> "+ realMessage);
            String perm = Wizard.getWizardByPlayer(player).getPerms().contains("staff") ? "Staff" : "";
            message.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(wizard.getTypeColor() + "Year " + wizard.getYear() + "\n" + perm).create()));

            for (Entity entity : player.getNearbyEntities(4, 4, 4)) {

                if (entity instanceof Player) {

                    entity.spigot().sendMessage(message);

                }

            }
            player.spigot().sendMessage(message);
            Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_GRAY + "[Whisper] " + ChatColor.GRAY + "<" + player.getDisplayName() + "> " + ChatColor.ITALIC + realMessage);

            return;
        }
        //end whisper


        if(event.getMessage().startsWith("#")) {


            if (Wizard.getWizardByPlayer(player).getType().equals(Wizard.Type.HORNED_SERPENT)) {

                String realMessage = event.getMessage().toLowerCase().replaceFirst("#", "");
                TextComponent message = new TextComponent(ChatColor.BLUE + "[Horned Serpent] " + ChatColor.WHITE + "<" + player.getDisplayName() + "> "+ realMessage);
                String perm = Wizard.getWizardByPlayer(player).getPerms().contains("staff") ? "Staff" : "";
                message.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(wizard.getTypeColor() + "Year " + wizard.getYear() + "\n" + perm).create()));

                for(Player p : Bukkit.getServer().getOnlinePlayers()) {
                    if(Wizard.getWizardByPlayer(p).getType().equals(Wizard.Type.HORNED_SERPENT)) {
                        p.spigot().sendMessage(message);
                    }
                }

                Bukkit.getConsoleSender().sendMessage(ChatColor.BLUE + "[Horned Serpent] " + ChatColor.WHITE + "<" + event.getPlayer().getDisplayName() + "> " + event.getMessage().replaceFirst("#", ""));

                return;


            }
            if (Wizard.getWizardByPlayer(player).getType().equals(Wizard.Type.THUNDERBIRD)) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_PURPLE + "[Thunderbird] " + ChatColor.WHITE + "<" + event.getPlayer().getDisplayName() + "> " + event.getMessage().replaceFirst("#", ""));
                String realMessage = event.getMessage().toLowerCase().replaceFirst("#", "");
                TextComponent message = new TextComponent(ChatColor.DARK_PURPLE + "[Thunderbird] " + ChatColor.WHITE + "<" + player.getDisplayName() + "> "+ realMessage);
                String perm = Wizard.getWizardByPlayer(player).getPerms().contains("staff") ? "Staff" : "";
                message.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(wizard.getTypeColor() + "Year " + wizard.getYear() + "\n" + perm).create()));

                for(Player p : Bukkit.getServer().getOnlinePlayers()) {
                    if(Wizard.getWizardByPlayer(p).getType().equals(Wizard.Type.THUNDERBIRD)) {
                        p.spigot().sendMessage(message);
                    }
                }
                return;


            }

            if (Wizard.getWizardByPlayer(player).getType().equals(Wizard.Type.WAMPUS)) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "[Wampus] " + ChatColor.WHITE + "<" + event.getPlayer().getDisplayName() + "> " + event.getMessage().replaceFirst("#", ""));
                String realMessage = event.getMessage().toLowerCase().replaceFirst("#", "");
                TextComponent message = new TextComponent(ChatColor.DARK_GREEN + "[Wampus] " + ChatColor.WHITE + "<" + player.getDisplayName() + "> "+ realMessage);
                String perm = Wizard.getWizardByPlayer(player).getPerms().contains("staff") ? "Staff" : "";
                message.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(wizard.getTypeColor() + "Year " + wizard.getYear() + "\n" + perm).create()));

                for(Player p : Bukkit.getServer().getOnlinePlayers()) {
                    if(Wizard.getWizardByPlayer(p).getType().equals(Wizard.Type.WAMPUS)) {
                        p.spigot().sendMessage(message);
                    }
                }
                return;


            }
            if (Wizard.getWizardByPlayer(player).getType().equals(Wizard.Type.PUKWUDGIE)) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_RED + "[Pukwudgie] " + ChatColor.WHITE + "<" + event.getPlayer().getDisplayName() + "> " + event.getMessage().replaceFirst("#", ""));
                String realMessage = event.getMessage().toLowerCase().replaceFirst("#", "");
                TextComponent message = new TextComponent(ChatColor.DARK_RED + "[Pukwudgie] " + ChatColor.WHITE + "<" + player.getDisplayName() + "> "+ realMessage);
                String perm = Wizard.getWizardByPlayer(player).getPerms().contains("staff") ? "Staff" : "";
                message.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(wizard.getTypeColor() + "Year " + wizard.getYear() + "\n" + perm).create()));

                for(Player p : Bukkit.getServer().getOnlinePlayers()) {
                    if(Wizard.getWizardByPlayer(p).getType().equals(Wizard.Type.PUKWUDGIE)) {
                        p.spigot().sendMessage(message);
                    }
                }
                return;


            }
            if (Wizard.getWizardByPlayer(player).getType().equals(Wizard.Type.UNSORTED)) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.BLACK + "[Unsorted] " + ChatColor.WHITE + "<" + event.getPlayer().getDisplayName() + "> " + event.getMessage().replaceFirst("#", ""));
                String realMessage = event.getMessage().toLowerCase().replaceFirst("#", "");
                TextComponent message = new TextComponent(ChatColor.BLACK + "[Unsorted] " + ChatColor.WHITE + "<" + player.getDisplayName() + "> "+ realMessage);
                String perm = Wizard.getWizardByPlayer(player).getPerms().contains("staff") ? "Staff" : "";
                message.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(wizard.getTypeColor() + "Year " + wizard.getYear() + "\n" + perm).create()));

                for(Player p : Bukkit.getServer().getOnlinePlayers()) {
                    if(Wizard.getWizardByPlayer(p).getType().equals(Wizard.Type.UNSORTED) || Wizard.getWizardByPlayer(p).getPerms().contains("staff")) {
                        p.spigot().sendMessage(message);
                    }
                }
                return;


            }



        }




        //region chat
        else {
            String realMessage = event.getMessage().toLowerCase().replaceFirst("#", "");
            TextComponent message = new TextComponent(ChatColor.GRAY + "[Region] " + ChatColor.WHITE + "<" + player.getDisplayName() + "> "+ realMessage);
            String perm = Wizard.getWizardByPlayer(player).getPerms().contains("staff") ? "Staff" : "";
            message.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(wizard.getTypeColor() + "Year " + wizard.getYear() + "\n" + perm).create()));

            for (Entity entity : player.getNearbyEntities(50, 50, 50)) {


                if (entity instanceof Player) {
                    if (!((Player) entity).getDisplayName().equals(player.getDisplayName())) {
                        entity.spigot().sendMessage(message);

                    }
                }
            }
            player.spigot().sendMessage(message);
            Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "[Region] " + ChatColor.WHITE + "<" + player.getDisplayName() + "> " + event.getMessage());


        }
        //end region
    }



}
