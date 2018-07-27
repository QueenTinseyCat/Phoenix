package com.glorial.phoneix.spells;

import com.glorial.phoneix.items.wands.WandSlots;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;

import static com.glorial.phoneix.Main.raisedInv;

public class RaiseWand {
    WandSlots wandslots = new WandSlots();
    public void raiseWand(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        Inventory inv = player.getInventory();
        raisedInv.put(player.getUniqueId(), inv);
        inv.clear();
        inv.addItem(wandslots.pane1());
        inv.addItem(wandslots.pane2());
        inv.addItem(wandslots.pane3());
        inv.addItem(wandslots.pane4());
        inv.addItem(wandslots.pane5());
        inv.addItem(wandslots.pane6());
        inv.addItem(wandslots.pane7());
        inv.addItem(wandslots.pane8());
        inv.addItem(wandslots.pane9());


    }

}
