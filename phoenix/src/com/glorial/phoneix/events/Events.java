package com.glorial.phoneix.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class Events implements Listener {

    @EventHandler
    public void handleKicks(PlayerLoginEvent e) {
        if(e.getResult() == PlayerLoginEvent.Result.KICK_WHITELIST) e.setKickMessage("It seems like you aren't whitelisted. Let's fix that. Go to this \n"
                +" link, discord.gg/QxDE4ES to join our discord and apply for whitelist. It is really easy, almost everyone gets it :)");
        else if(e.getResult() == PlayerLoginEvent.Result.KICK_FULL) e.setKickMessage("The server is currently full. Not sure how that happened. This isn't supposed to happen, so contact @Glorial \n"
        + "in discord, discord.gg/QxDE4ES. Ping them and demand an explanation (be nice about it please)");
    }
}
