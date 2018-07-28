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
                        else if(inv.contains(Items.MAPLE_WOOD.getItem())) {


                            inv.remove(Items.MAPLE_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.PEAR_WOOD.getItem())) {


                            inv.remove(Items.PEAR_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.PINE_WOOD.getItem())) {


                            inv.remove(Items.PINE_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.POPLAR_WOOD.getItem())) {


                            inv.remove(Items.POPLAR_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.RED_OAK_WOOD.getItem())) {


                            inv.remove(Items.RED_OAK_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.REDWOOD_WOOD.getItem())) {


                            inv.remove(Items.REDWOOD_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.ROWAN_WOOD.getItem())) {


                            inv.remove(Items.ROWAN_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.SILVER_LIME_WOOD.getItem())) {


                            inv.remove(Items.SILVER_LIME_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.SPRUCE_WOOD.getItem())) {


                            inv.remove(Items.SPRUCE_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.SYCAMORE_WOOD.getItem())) {


                            inv.remove(Items.SYCAMORE_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.VINE_WOOD.getItem())) {


                            inv.remove(Items.VINE_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.WALNUT_WOOD.getItem())) {


                            inv.remove(Items.WALNUT_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.WILLOW_WOOD.getItem())) {


                            inv.remove(Items.WILLOW_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(Items.YEW_WOOD.getItem())) {


                            inv.remove(Items.YEW_WOOD.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else {
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "found no wand wood");
                            return;
                        }

                        if(inv.contains(Items.UNICORN_HAIR.getItem())) {

                            inv.remove(Items.UNICORN_HAIR.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand core");
                            inv.addItem(Items.WAND.getItem());
                            return;

                        }
                        if(inv.contains(Items.DRAGON_HEARTSTRING.getItem())) {

                            inv.remove(Items.DRAGON_HEARTSTRING.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand core");
                            inv.addItem(Items.WAND.getItem());
                            return;

                        }
                        if(inv.contains(Items.PHOENIX_FEATHER.getItem())) {

                            inv.remove(Items.PHOENIX_FEATHER.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand core");
                            inv.addItem(Items.WAND.getItem());
                            return;
                        }
                        if(inv.contains(Items.HORNED_SERPENT_HORN.getItem())) {

                            inv.remove(Items.HORNED_SERPENT_HORN.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand core");
                            inv.addItem(Items.WAND.getItem());
                            return;
                        }
                        if(inv.contains(Items.WAMPUS_HAIR.getItem())) {

                            inv.remove(Items.WAMPUS_HAIR.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand core");
                            inv.addItem(Items.WAND.getItem());
                            return;
                        }
                        if(inv.contains(Items.SNALLYGASTER_HEARTSTRING.getItem())) {

                            inv.remove(Items.SNALLYGASTER_HEARTSTRING.getItem());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand core");
                            inv.addItem(Items.WAND.getItem());
                            return;
                        }
                        if(inv.contains(Items.JACKALOPE_ANTLERS.getItem())) {

                            inv.remove(Items.JACKALOPE_ANTLERS.getItem());
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
