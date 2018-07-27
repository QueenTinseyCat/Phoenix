package xyz.phoenix.phoneix.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinEvents implements Listener {

    @EventHandler
    public void playerJoinEvent(PlayerJoinEvent event) {

        Player player = event.getPlayer();

        player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GREEN +"Please keep in mind, that this is not the official server. " +
        "This is just the public testing server. All of our updates get pushed here first for testing, then to the main server. As of right now, " +
        "the official server is still in development, as well as many of our plugins. To get a better feeling for what is going on, join our discord, " +
        "discord.gg/QxDE4ES.");


    }


}
