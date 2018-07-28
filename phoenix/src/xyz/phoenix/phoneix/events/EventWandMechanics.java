package xyz.phoenix.phoneix.events;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import xyz.phoenix.phoneix.player.Wizard;

public class EventWandMechanics implements Listener {

    @EventHandler
    public void onWandStateEvent(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        PlayerInventory inv = player.getInventory();
        if (event.getHand() == null) return;
        if (event.getHand() != EquipmentSlot.HAND) return;
        Action action = event.getAction();
        if (action != Action.RIGHT_CLICK_AIR && action != Action.RIGHT_CLICK_BLOCK) return;
        ItemStack item = inv.getItemInMainHand();
        if (item == null) return;
        if (!item.hasItemMeta()) return;
        ItemMeta meta = item.getItemMeta();
        if (meta.getDisplayName() == null) return;
        //ADD NBT SHIT
        if (!meta.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "Wand")) return;
        Wizard wizard = Wizard.getWizardByPlayer(player);
        if (wizard == null) {
            player.kickPlayer("You are not a wizard! \n~Get out muggle!");
            return;
        }

        if (!wizard.isWandRaised()) {
            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GRAY + "" + ChatColor.ITALIC + "raised wand");
//            Main.wandStatus.remove(player.getUniqueId());
//            Main.wandStatus.put(player.getUniqueId(), "raised");
            //Raise wand
            return;
        }
        if (item.getType() == Material.STAINED_GLASS_PANE) {
            if (wizard.isWandRaised()) {
                if (player.isSneaking()) {
                    //I don't know what the fuck this is so... I'm leaving it for now.
//                    if (Main.spellId.containsKey(player.getUniqueId())) {
//                        Main.spellId.remove(player.getUniqueId());
                }
                player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GRAY + "" + ChatColor.ITALIC + "lowered wand");
//                    Main.wandStatus.remove(player.getUniqueId());
//                    Main.wandStatus.put(player.getUniqueId(), "lowered");
                return;
            }
        }
    }
}
