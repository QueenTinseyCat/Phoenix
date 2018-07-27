package com.glorial.phoneix.commands;

import com.glorial.phoneix.items.msc.OBSSharder;
import com.glorial.phoneix.items.wands.Wand;
import com.glorial.phoneix.items.wands.WandCarver;
import com.glorial.phoneix.items.wands.WandCores;
import com.glorial.phoneix.items.wands.WandWoods;
import net.minecraft.server.v1_12_R1.CommandExecute;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class MainCommand extends CommandExecute implements Listener, CommandExecutor {

    public String grant = "grant";

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof Player) {


            if (cmd.getName().equalsIgnoreCase(grant)) {


                if (((Player) sender).isWhitelisted()) {
                    Wand Wand = new Wand();
                    if (args.length > 1) {
                        WandCores WandCores = new WandCores();
                        WandWoods WandWoods = new WandWoods();
                        if (args[0].equalsIgnoreCase("unicorn") && args[1].equalsIgnoreCase("hair")) {


                            ((Player)sender).getInventory().addItem(WandCores.unicornHair());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselve a strand of unicorn hair.");
                            return true;
                        }

                        if (args[0].equalsIgnoreCase("dragon") && args[1].equalsIgnoreCase("heartstring")) {
                            ((Player)sender).getInventory().addItem(WandCores.dragonHeartstring());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselve a dragon's heartstring.");
                            return true;

                        }

                        if(args[0].equalsIgnoreCase("phoenix") && args[1].equalsIgnoreCase("feather")) {

                            ((Player)sender).getInventory().addItem(WandCores.phoenixFeather());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselve a feather from a Phoenix.");
                            return true;

                        }

                        if(args[0].equalsIgnoreCase("serpent") && args[1].equalsIgnoreCase("horn")) {

                            ((Player)sender).getInventory().addItem(WandCores.hornedSerpentsHorn());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselve a horn from a river serpent.");
                            return true;

                        }

                        if(args[0].equalsIgnoreCase("wampus") && args[1].equalsIgnoreCase("hair")) {

                            ((Player)sender).getInventory().addItem(WandCores.wampusHair());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselve hair from the Wampus cat.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("snallygaster") && args[1].equalsIgnoreCase("heartstring")) {

                            ((Player)sender).getInventory().addItem(WandCores.snallygasterHeartstring());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselve a heartstring from a snallygaster.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("jackalope") && args[1].equalsIgnoreCase("antlers")) {

                            ((Player)sender).getInventory().addItem(WandCores.jackalopeAntlers());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselve the antlers of a jackalope.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("acacia") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.acacia());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of acacia wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("alder") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.alder());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of alder wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("apple") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.apple());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of apple wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("ash") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.ash());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of ash wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("aspen") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.aspen());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of aspen wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("beech") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.beech());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of beech wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("blackthorn") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.blackthorn());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of blackthorn wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("cedar") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.cedar());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of cedar wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("cherry") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.cherry());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of cherry wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("chestnut") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.chestnut());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of chestnut wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("cypress") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.cypress());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of cypress wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("dogwood") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.dogwood());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of dogwood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("ebony") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.ebony());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of ebony wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("elder") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.elder());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of elder wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("elm") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.elm());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of elm wood.");
                            return true;

                        }

                        if(args[0].equalsIgnoreCase("fir") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.fir());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of fir wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("hawthorn") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.hawthorn());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of hawthorn wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("hazel") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.hazel());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of hazel wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("holly") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.holly());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of holly wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("hornbeam") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.hornbeam());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of hornbeam wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("larch") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.larch());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of larch wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("laurel") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.laurel());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of laurel wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("maple") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.maple());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of maple wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("pear") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.pear());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of pear wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("pine") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.pine());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of pine wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("poplar") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.poplar());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of poplar wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("redwood") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.redwood());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of redwood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("rowan") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.rowan());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of rowan wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("spruce") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.spruce());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of spruce wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("sycamore") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.sycamore());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of sycamore wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("vine") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.vine());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of vine wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("walnut") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.walnut());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of walnut wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("willow") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.willow());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of willow wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("yew") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(WandWoods.yew());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of yew wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("obsidian") && args[1].equalsIgnoreCase("sharder")) {

                            ((Player)sender).getInventory().addItem(new OBSSharder().obsSharder());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves an obsidian sharder.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("carving") && args[1].equalsIgnoreCase("knife")) {

                            ((Player)sender).getInventory().addItem(new WandCarver().carver());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a carving knife.");
                            return true;

                        }

                        if(args.length >=2) {

                            if(args[0].equalsIgnoreCase("black") && args[1].equalsIgnoreCase("walnut") && args[2].equalsIgnoreCase("wood")) {

                                ((Player)sender).getInventory().addItem(WandWoods.blackWalnut());
                                Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of black walnut wood.");
                                return true;

                            }
                            if(args[0].equalsIgnoreCase("english") && args[1].equalsIgnoreCase("oak") && args[2].equalsIgnoreCase("wood")) {

                                ((Player)sender).getInventory().addItem(WandWoods.englishOak());
                                Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of English oak wood.");
                                return true;

                            }
                            if(args[0].equalsIgnoreCase("red") && args[1].equalsIgnoreCase("oak") && args[2].equalsIgnoreCase("wood")) {

                                ((Player)sender).getInventory().addItem(WandWoods.redOak());
                                Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of red oak wood.");
                                return true;

                            }
                            if(args[0].equalsIgnoreCase("silver") && args[1].equalsIgnoreCase("lime") && args[2].equalsIgnoreCase("wood")) {

                                ((Player)sender).getInventory().addItem(WandWoods.silverLime());
                                Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of silver lime wood.");
                                return true;

                            }
                        }

                    }

                    if (args.length == 1) {
                        if (args[0].equalsIgnoreCase("list")) {
                            sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.BLUE + "Unicorn Hair, Dragon Heartstring, Phoenix Feather, Serpent Horn, Wampus Hair, Snallygaster Heartstring, Jackalope Antlers, Acacia Wood, Alder Wood, Apple Wood, Ash Wood, Aspen Wood, Beech Wood, Blackthorn Wood, Black Walnut Wood, Cedar Wood, Cherry Wood, Chestnut Wood, Cypress Wood, Dogwood Wood, Ebony Wood, Elder Wood, Elm Wood, English Oak Wood, Fir Wood, Hawthorn Wood, Hazel Wood, Holly Wood, Larch wood, Laurel Wood, Maple Wood, Pear Wood, Pine Wood, Poplar Wood, Red Oak Wood, Redwood Wood, Rowan Wood, Silver Lime Wood, Spruce Wood, Sycamore Wood, Vine Wood, Walnut Wood, Willow Wood, Yew Wood, Obsidian Sharder, Carving Knife");
                            return true;
                        }
                        if (args[0].equalsIgnoreCase("help")) {

                            sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.GREEN + "Grant is a command used by server ops to give server items. Do \"/grant list\" to see all grantable items!");
                            return true;

                        }
                        if (args[0].equalsIgnoreCase("Wand")) {
                            ((Player)sender).getInventory().addItem(Wand.wand());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a Wand.");
                            return true;

                        }
                    }


                    if (args.length <= 0) {
                        sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.BLUE + "Do \"/grant list\" to see all grantable items!");
                        return true;
                    } else {

                        sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.BLUE + "Do \"/grant list\" to see all grantable items!");
                        return true;

                    }

                }
                else {
                    sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "Sorry, you can't do that! You must be an op to use Grant.");
                    return true;
                }

            }
        }

            return true;


    }
    }

