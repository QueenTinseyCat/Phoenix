package xyz.phoenix.phoneix.events;


import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import xyz.phoenix.phoneix.items.wands.Items;


public class WandCrafter implements Listener {


@EventHandler
    public void playerInteractBedrock(PlayerInteractEvent event) {
        Player player = event.getPlayer();
    Inventory inv = player.getInventory();
        if(event.getAction().equals(Action.LEFT_CLICK_BLOCK) || event.getAction().equals(Action.LEFT_CLICK_AIR)) {



                if(player.getInventory().getItemInMainHand() != null && player.getInventory().getItemInMainHand().hasItemMeta() && player.getInventory().getItemInMainHand().getItemMeta().getDisplayName() != null) {

                    if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Carving Knife")) {
                        if(inv.contains(Items.ELDER_WOOD.getItem())) {


                            inv.remove(Items.ELDER_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.ALDER_WOOD.getItem())) {


                            inv.remove(Items.ALDER_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.APPLE_WOOD.getItem())) {


                            inv.remove(Items.APPLE_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.ASH_WOOD.getItem())) {


                            inv.remove(Items.ASH_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.ASPEN_WOOD.getItem())) {


                            inv.remove(Items.ASPEN_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.BEECH_WOOD.getItem())) {


                            inv.remove(Items.BEECH_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.BLACKTHORN_WOOD.getItem())) {


                            inv.remove(Items.BLACKTHORN_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.BLACK_WALNUT_WOOD.getItem())) {


                            inv.remove(Items.BLACK_WALNUT_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.CEDAR_WOOD.getItem())) {


                            inv.remove(Items.CEDAR_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.CHERRY_WOOD.getItem())) {


                            inv.remove(Items.CHERRY_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.CHESTNUT_WOOD.getItem())) {


                            inv.remove(Items.CHESTNUT_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }

                        else if(inv.contains(Items.CYPRESS_WOOD.getItem())) {


                            inv.remove(Items.CYPRESS_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.DOGWOOD_WOOD.getItem())) {


                            inv.remove(Items.DOGWOOD_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.EBONY_WOOD.getItem())) {


                            inv.remove(Items.EBONY_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.ELM_WOOD.getItem())) {


                            inv.remove(Items.ELM_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.ENGLISH_OAK_WOOD.getItem())) {


                            inv.remove(Items.ENGLISH_OAK_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.FIR_WOOD.getItem())) {


                            inv.remove(Items.FIR_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.HAWTHORN_WOOD.getItem())) {


                            inv.remove(Items.HAWTHORN_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.HAZEL_WOOD.getItem())) {


                            inv.remove(Items.HAZEL_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.HOLLY_WOOD.getItem())) {


                            inv.remove(Items.HOLLY_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.HORNBEAM_WOOD.getItem())) {


                            inv.remove(Items.HORNBEAM_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.LARCH_WOOD.getItem())) {


                            inv.remove(Items.LARCH_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.LAUREL_WOOD.getItem())) {


                            inv.remove(Items.LAUREL_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.maple())) {


                            inv.remove(wandWoods.maple());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.pear())) {


                            inv.remove(wandWoods.pear());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.pine())) {


                            inv.remove(wandWoods.pine());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.poplar())) {


                            inv.remove(wandWoods.poplar());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.redOak())) {


                            inv.remove(wandWoods.redOak());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.redwood())) {


                            inv.remove(wandWoods.redwood());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.rowan())) {


                            inv.remove(wandWoods.rowan());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.silverLime())) {


                            inv.remove(wandWoods.silverLime());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.spruce())) {


                            inv.remove(wandWoods.spruce());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.sycamore())) {


                            inv.remove(wandWoods.sycamore());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.vine())) {


                            inv.remove(wandWoods.vine());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.walnut())) {


                            inv.remove(wandWoods.walnut());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.willow())) {


                            inv.remove(wandWoods.willow());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.yew())) {


                            inv.remove(wandWoods.yew());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else {
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "found no wand wood");
                            return;
                        }

                        if(inv.contains(wandCores.unicornHair())) {

                            inv.remove(wandCores.unicornHair());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand core");
                            inv.addItem(Items.WAND.getItem());
                            return;

                        }
                        if(inv.contains(wandCores.dragonHeartstring())) {

                            inv.remove(wandCores.dragonHeartstring());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand core");
                            inv.addItem(Items.WAND.getItem());
                            return;

                        }
                        if(inv.contains(wandCores.phoenixFeather())) {

                            inv.remove(wandCores.phoenixFeather());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand core");
                            inv.addItem(Items.WAND.getItem());
                            return;
                        }
                        if(inv.contains(wandCores.hornedSerpentsHorn())) {

                            inv.remove(wandCores.hornedSerpentsHorn());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand core");
                            inv.addItem(Items.WAND.getItem());
                            return;
                        }
                        if(inv.contains(wandCores.wampusHair())) {

                            inv.remove(wandCores.wampusHair());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand core");
                            inv.addItem(Items.WAND.getItem());
                            return;
                        }
                        if(inv.contains(wandCores.snallygasterHeartstring())) {

                            inv.remove(wandCores.snallygasterHeartstring());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand core");
                            inv.addItem(Items.WAND.getItem());
                            return;
                        }
                        if(inv.contains(wandCores.jackalopeAntlers())) {

                            inv.remove(wandCores.jackalopeAntlers());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand core");
                            inv.addItem(Items.WAND.getItem());
                            return;
                        }
                        else {
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "found no wand core in inventory");
                            return;
                        }



                    }



                }
            }

    }



}
