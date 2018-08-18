package xyz.phoenix.phoneix.events;

import me.confuser.barapi.BarAPI;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import xyz.phoenix.phoneix.player.Wizard;

public class EventQuit implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Wizard wizard = Wizard.getWizardByPlayer(e.getPlayer());
        if(wizard == null) {return;}
        if(wizard.isWandRaised()) {
            wizard.setWandRaised(false);
            wizard.restoreInventory();
            wizard.removeBar();
        }
        wizard.save();
        wizard.saveSpells();
    }
}
