package xyz.phoenix.phoneix.events;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

public class EventPlayerInteract implements Listener {

    @EventHandler
    public void playerInteractBedrock(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.getAction() != Action.LEFT_CLICK_BLOCK) return;
        PlayerInventory inv = player.getInventory();
        ItemStack item = inv.getItemInMainHand();
        if (item == null) return;
        if (!item.hasItemMeta()) return;
        ItemMeta meta = item.getItemMeta();
        if (meta.getDisplayName() == null) return;
        //IMPLEMENT NBT DATA
        if (!inv.getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "Obsidian Sharder")) return;
        Block block = event.getClickedBlock();
        //If more interact block events, use nested ifs
        if (block.getType() != Material.OBSIDIAN) return;

        block.setType(Material.AIR);
        inv.addItem(new ItemStack(Material.OBSIDIAN, 1));

        player.getWorld().playSound(player.getLocation(), Sound.BLOCK_METAL_BREAK, 100, 50);
    }

}
