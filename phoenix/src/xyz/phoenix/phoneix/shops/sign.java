package xyz.phoenix.phoneix.shops;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Chest;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import xyz.phoenix.phoneix.player.Wizard;
import xyz.phoenix.phoneix.player.currency;

import java.util.ArrayList;
import java.util.List;

public class sign implements Listener {

    @EventHandler
    public void lClickSign(PlayerInteractEvent event) {

        if (event.getHand() == null) return;
        if (event.getHand() != EquipmentSlot.HAND) return;
        if (event.getClickedBlock() == null) return;
        Player player = event.getPlayer();
        PlayerInventory inv = player.getInventory();

        if (!(event.getClickedBlock().getState() instanceof Sign)) return;
        Sign sign = (Sign) event.getClickedBlock().getState();

        if (!sign.getLine(0).contains("[Shop]"))
            return;


        Block chest = null;
        for(BlockFace blockFace : BlockFace.values()) {
            if(sign.getBlock().getRelative(blockFace).getType().equals(Material.CHEST)) {
                chest = sign.getBlock().getRelative(blockFace);
                break;
            }
        }
        if(chest == null) {
            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "The sign is not attached to any chest.");
            sign.setLine(0, ChatColor.RED + "" + ChatColor.BOLD + "[Shop]");
            sign.update();
            return;
        }

        Chest realChest = (Chest)chest.getState();
        if(realChest.getInventory().getSize() == 54) {
            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "You cannot use double chests as shops!");
            sign.setLine(0, ChatColor.RED + "" + ChatColor.BOLD + "[Shop]");
            sign.update();
            return;
        }

        Inventory inventory = Bukkit.createInventory(null, 54, ChatColor.GOLD + "[Shop] " + ChatColor.RESET + sign.getLine(3));
        inventory.setContents(realChest.getInventory().getContents());
        player.openInventory(inventory);
        sign.setLine(0, ChatColor.GOLD + "" + ChatColor.BOLD + "[Shop]");
        sign.update();


    }


    @EventHandler
    public void lInvClick(InventoryClickEvent event) {
        if(!event.getClickedInventory().getName().contains(ChatColor.GOLD + "[Shop] ")) return;
        event.setCancelled(true);
        Inventory inv = event.getClickedInventory();
        boolean isOwner = false;
        for(ItemStack item: inv.getContents()) {

            if(item == null) continue;
            if(!item.hasItemMeta()) continue;
            if(!item.getItemMeta().getDisplayName().equals(ChatColor.GRAY + "Id"))  {continue;}

                for(String string : item.getItemMeta().getLore()) {
                    if(string.contains(event.getWhoClicked().getUniqueId() + "")) {
                        isOwner = true;
                    }
                }




        }

        if(event.isLeftClick() || event.isRightClick()) {
           // new currency().charge(0.5, (Player)event.getWhoClicked());
        }
        Player player = (Player) event.getWhoClicked();
        if(!isOwner) {return;}
        Wizard wizard = Wizard.getWizardByPlayer(player);
        if(event.isShiftClick()) {
                wizard.setListenForPrice(true);
                wizard.setItemForPrice(event.getCurrentItem());
                player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + "Please state the price in chat.");
        }

    }
    @EventHandler
    public void lPrice(AsyncPlayerChatEvent event) {

    }
}
