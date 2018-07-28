package xyz.phoenix.phoneix.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import xyz.phoenix.phoneix.Wizard;

public class EventChat implements Listener {

    @EventHandler
    public void LumosChatListener(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();

        if(event.getMessage().equalsIgnoreCase("Lumos")) {

            Wizard wizard = Wizard.getWizardByPlayer(player);
            if(wizard == null) {
                player.kickPlayer("You are not a wizard!");
                return;
            }

            //Handle spell stuff here.
        }

    }

}
