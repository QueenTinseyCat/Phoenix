package xyz.phoenix.phoneix.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import xyz.phoenix.phoneix.player.Wizard;

public class EventKick implements Listener {

    @EventHandler
    public void handleKicks(PlayerLoginEvent e) {
        if (e.getResult() == PlayerLoginEvent.Result.KICK_WHITELIST)
            e.setKickMessage("It seems like you aren't whitelisted. Let's fix that. Go to this \n"
                    + " link, https://discord.gg/rtQEtJq to join our discord and apply for whitelist. It is really easy, almost everyone gets it :)");
    }

    @EventHandler
    public void onKick(PlayerKickEvent event) {
        Player player = event.getPlayer();
        Wizard wizard = Wizard.getWizardByPlayer(player);
        if(wizard.isWandRaised()) {
            wizard.removeBar();
            wizard.restoreInventory();
            wizard.setWandRaised(false);
            wizard.saveSpells();
            wizard.save();
        }
    }
}
