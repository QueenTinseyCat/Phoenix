package xyz.phoenix.phoneix.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class EventKick implements Listener {

    @EventHandler
    public void handleKicks(PlayerLoginEvent e) {
        if (e.getResult() == PlayerLoginEvent.Result.KICK_WHITELIST)
            e.setKickMessage("It seems like you aren't whitelisted. Let's fix that. Go to this \n"
                    + " link, https://discord.gg/rtQEtJq to join our discord and apply for whitelist. It is really easy, almost everyone gets it :)");
    }
}
