package xyz.phoenix.phoneix.spells;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;

import static xyz.phoenix.phoneix.Main.raisedInv;

public class RaiseWand {


    public void raiseWand(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        Inventory inv = player.getInventory();
        raisedInv.put(player.getUniqueId(), inv);
        inv.clear();


    }

}
