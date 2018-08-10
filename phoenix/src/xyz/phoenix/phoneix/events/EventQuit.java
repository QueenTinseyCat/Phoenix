package xyz.phoenix.phoneix.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import xyz.phoenix.phoneix.player.Wizard;

public class EventQuit implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Wizard wizard = Wizard.getWizardByPlayer(e.getPlayer());
        if(wizard == null) {return;}
        wizard.setWandRaised(false);
        wizard.restoreInventory();
        wizard.save();
        wizard.saveSpells();
    }
}
