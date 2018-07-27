package xyz.phoenix.phoneix.events;

import com.glorial.phoneix.items.wands.*;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import xyz.phoenix.phoneix.items.wands.Wand;
import xyz.phoenix.phoneix.items.wands.WandCores;
import xyz.phoenix.phoneix.items.wands.WandWoods;

public class WandCrafter implements Listener {
Wand wand = new Wand();
WandCores wandCores= new WandCores();
WandWoods wandWoods = new WandWoods();

@EventHandler
    public void playerInteractBedrock(PlayerInteractEvent event) {
        Player player = event.getPlayer();
    Inventory inv = player.getInventory();
        if(event.getAction().equals(Action.LEFT_CLICK_BLOCK) || event.getAction().equals(Action.LEFT_CLICK_AIR)) {



                if(player.getInventory().getItemInMainHand() != null && player.getInventory().getItemInMainHand().hasItemMeta() && player.getInventory().getItemInMainHand().getItemMeta().getDisplayName() != null) {

                    if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Carving Knife")) {
                        if(inv.contains(wandWoods.elder())) {


                            inv.remove(wandWoods.elder());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.acacia())) {


                            inv.remove(wandWoods.acacia());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.alder())) {


                            inv.remove(wandWoods.alder());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.apple())) {


                            inv.remove(wandWoods.apple());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.ash())) {


                            inv.remove(wandWoods.ash());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.aspen())) {


                            inv.remove(wandWoods.aspen());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.beech())) {


                            inv.remove(wandWoods.beech());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.blackthorn())) {


                            inv.remove(wandWoods.blackthorn());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.blackWalnut())) {


                            inv.remove(wandWoods.blackWalnut());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.cedar())) {


                            inv.remove(wandWoods.cedar());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.cherry())) {


                            inv.remove(wandWoods.cherry());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.chestnut())) {


                            inv.remove(wandWoods.chestnut());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.cedar())) {


                            inv.remove(wandWoods.cedar());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.cypress())) {


                            inv.remove(wandWoods.cypress());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.dogwood())) {


                            inv.remove(wandWoods.dogwood());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.ebony())) {


                            inv.remove(wandWoods.ebony());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.elm())) {


                            inv.remove(wandWoods.elm());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.englishOak())) {


                            inv.remove(wandWoods.englishOak());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.fir())) {


                            inv.remove(wandWoods.fir());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.hawthorn())) {


                            inv.remove(wandWoods.hawthorn());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.hazel())) {


                            inv.remove(wandWoods.hazel());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.holly())) {


                            inv.remove(wandWoods.holly());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.hornbeam())) {


                            inv.remove(wandWoods.hornbeam());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.larch())) {


                            inv.remove(wandWoods.larch());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand wood");

                        }
                        else if(inv.contains(wandWoods.laurel())) {


                            inv.remove(wandWoods.laurel());
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
                            inv.addItem(wand.wand());
                            return;

                        }
                        if(inv.contains(wandCores.dragonHeartstring())) {

                            inv.remove(wandCores.dragonHeartstring());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand core");
                            inv.addItem(wand.wand());
                            return;

                        }
                        if(inv.contains(wandCores.phoenixFeather())) {

                            inv.remove(wandCores.phoenixFeather());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand core");
                            inv.addItem(wand.wand());
                            return;
                        }
                        if(inv.contains(wandCores.hornedSerpentsHorn())) {

                            inv.remove(wandCores.hornedSerpentsHorn());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand core");
                            inv.addItem(wand.wand());
                            return;
                        }
                        if(inv.contains(wandCores.wampusHair())) {

                            inv.remove(wandCores.wampusHair());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand core");
                            inv.addItem(wand.wand());
                            return;
                        }
                        if(inv.contains(wandCores.snallygasterHeartstring())) {

                            inv.remove(wandCores.snallygasterHeartstring());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand core");
                            inv.addItem(wand.wand());
                            return;
                        }
                        if(inv.contains(wandCores.jackalopeAntlers())) {

                            inv.remove(wandCores.jackalopeAntlers());
                            player.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "removed wand core");
                            inv.addItem(wand.wand());
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
