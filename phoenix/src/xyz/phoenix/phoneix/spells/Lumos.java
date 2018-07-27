package xyz.phoenix.phoneix.spells;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import xyz.phoenix.phoneix.Main;

public class Lumos implements Listener {

    @EventHandler
    public void LumosChatListener(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();

        if(event.getMessage().equalsIgnoreCase("Lumos")) {

            if (Main.spellsSpoken.containsKey(player.getUniqueId())) {
                Main.spellsSpoken.remove(player.getUniqueId());
                Main.spellsSpoken.put(player.getUniqueId(), "Lumos");

                return;

            }
            Main.spellsSpoken.put(player.getUniqueId(), "Lumos");


        }

    }

    /*
    @EventHandler
    public void LumosRaiseListener(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        Inventory inv = player.getInventory();

        if (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK) && wandStatus.get(player.getUniqueId()).equals("lowered")) {
            if (event.getHand().equals(EquipmentSlot.HAND)) {
                if (((PlayerInventory) inv).getItemInMainHand() != null && ((PlayerInventory) inv).getItemInMainHand().hasItemMeta() && ((PlayerInventory) inv).getItemInMainHand().getItemMeta().getDisplayName() != null) {

                    if(((PlayerInventory) inv).getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "Wand")) {

                        player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GRAY + "" + ChatColor.ITALIC + "raised wand");
                        wandStatus.remove(player.getUniqueId());
                        wandStatus.put(player.getUniqueId(), "raised")


                    }


                }
            }

            event.getPlayer().getInventory().getHeldItemSlot();
        }
    }
    */
}
