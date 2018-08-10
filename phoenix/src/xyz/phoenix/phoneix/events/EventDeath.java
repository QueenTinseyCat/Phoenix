package xyz.phoenix.phoneix.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import xyz.phoenix.phoneix.player.Wizard;

public class EventDeath implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        Wizard wizard = Wizard.getWizardByPlayer(event.getEntity());
        if(wizard.isWandRaised()) {
            wizard.restoreInventory();
            wizard.save();
            wizard.saveSpells();
        }

    }

}
