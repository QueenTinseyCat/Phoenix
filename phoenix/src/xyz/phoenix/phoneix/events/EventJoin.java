package xyz.phoenix.phoneix.events;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import xyz.phoenix.phoneix.player.Wizard;

public class EventJoin implements Listener {

    @EventHandler
    public void onJoinEvent(PlayerJoinEvent e) {
        Player player = e.getPlayer();

        player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED +"HEY SOOOO SOMEONE HACKED THE DISCORD, WE HAVE A NEW ONE, HOPEFULLY YOU CAN SEE THIS EVERYONE!!!");
        player.sendMessage(ChatColor.RED + "Here is our new discord, https://discord.gg/rtQEtJq");
        //Create Wizard class for player. This is the object we'll address all their stats when looking for.

        //We'll assign the type from config

        Wizard wizard = new Wizard(player);


    }

}
