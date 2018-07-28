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

        player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GREEN +"Please keep in mind, that this is not the official server. " +
                "This is just the public testing server. All of our updates get pushed here first for testing, then to the main server. As of right now, " +
                "the official server is still in development, as well as many of our plugins. To get a better feeling for what is going on, join our discord, " +
                "discord.gg/QxDE4ES.");

        //Create Wizard class for player. This is the object we'll address all their stats when looking for.

        //We'll assign the type from config
        Wizard wizard = new Wizard(player, Wizard.Type.HORNED_SERPENT);
    }

}
