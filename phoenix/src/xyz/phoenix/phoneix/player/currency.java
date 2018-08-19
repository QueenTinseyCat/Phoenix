package xyz.phoenix.phoneix.player;

import org.bukkit.ChatColor;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import xyz.phoenix.phoneix.items.wands.Items;

public class currency {

    public boolean charge(double cost, Player player) {

        Inventory inv = player.getInventory();

        int dragots = 0;
        int halfDragot = 0;
        int quarterDragots = 0;
        double quarterDragotsValue = 0;
        double halfDragotsValue = 0;
        int total = 0;
        double totalValue = 0;



            for (ItemStack item : inv.getContents()) {
                if (item == null) continue;
                if (!item.hasItemMeta()) continue;
                if (item.getItemMeta().getDisplayName() == null) continue;

                if (item.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Dragot")) {
                    dragots += item.getAmount();
                    total += item.getAmount();
                    totalValue += item.getAmount();
                    continue;
                }

                if (item.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Half Dragot")) {
                    halfDragot += item.getAmount();
                    halfDragotsValue += 0.5 * item.getAmount();
                    total += item.getAmount();
                    totalValue += 0.5 * item.getAmount();
                    continue;

                }
                if (item.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Quarter Dragot")) {
                    quarterDragots += item.getAmount();
                    quarterDragotsValue += 0.25 * item.getAmount();
                    total += item.getAmount();
                    totalValue += 0.25 * item.getAmount();
                    continue;

                }


            }





        if (total < cost) {
            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "You cannot afford this.");
            return false;
        }
        if (quarterDragotsValue >= cost && cost == 0.25) {
            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GREEN + "1 Quarter Dragot has been taken from your inventory.");
            for(ItemStack item : player.getInventory().getContents()) {
                if (item == null) continue;
                if (!item.hasItemMeta()) continue;
                if (item.getItemMeta().getDisplayName() == null) continue;

                if(!item.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Quarter Dragot")) continue;
                if(item.getAmount() > 1) {
                    item.setAmount(item.getAmount() -1);
                    break;
                }
                player.getInventory().remove(item);
                break;
            }

            return true;
        }
        if (halfDragotsValue >= cost && cost == 0.5) {
            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GREEN + "1 Half Dragot has been taken from your inventory.");
            for(ItemStack item : player.getInventory().getContents()) {
                if (item == null) continue;
                if (!item.hasItemMeta()) continue;
                if (item.getItemMeta().getDisplayName() == null) continue;

                if(!item.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Half Dragot")) continue;
                if(item.getAmount() > 1) {
                    item.setAmount(item.getAmount() -1);
                    break;
                }
                player.getInventory().remove(item);
                break;
            }
            return true;
        }
        player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "Transaction failed, you have " + ChatColor.DARK_AQUA + "" + ChatColor.BOLD + totalValue + " DA " + ChatColor.RESET + ChatColor.RED + "in your inventory");
        return false;
    }


}
