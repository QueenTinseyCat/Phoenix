package com.glorial.phoneix.commands;

import com.glorial.phoneix.items.msc.obsSharder;
import com.glorial.phoneix.items.wands.wand;
import com.glorial.phoneix.items.wands.wandCarver;
import com.glorial.phoneix.items.wands.wandCores;
import com.glorial.phoneix.items.wands.wandWoods;
import net.minecraft.server.v1_12_R1.CommandExecute;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class main extends CommandExecute implements Listener, CommandExecutor {

    public String grant = "grant";

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof Player) {


            if (cmd.getName().equalsIgnoreCase(grant)) {


                if (((Player) sender).isWhitelisted()) {
                    wand wand = new wand();
                    if (args.length > 1) {
                        wandCores wandCores = new wandCores();
                        wandWoods wandWoods = new wandWoods();
                        if (args[0].equalsIgnoreCase("unicorn") && args[1].equalsIgnoreCase("hair")) {


                            ((Player)sender).getInventory().addItem(wandCores.unicornHair());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselve a strand of unicorn hair.");
                            return true;
                        }

                        if (args[0].equalsIgnoreCase("dragon") && args[1].equalsIgnoreCase("heartstring")) {
                            ((Player)sender).getInventory().addItem(wandCores.dragonHeartstring());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselve a dragon's heartstring.");
                            return true;

                        }

                        if(args[0].equalsIgnoreCase("phoenix") && args[1].equalsIgnoreCase("feather")) {

                            ((Player)sender).getInventory().addItem(wandCores.phoenixFeather());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselve a feather from a Phoenix.");
                            return true;

                        }

                        if(args[0].equalsIgnoreCase("serpent") && args[1].equalsIgnoreCase("horn")) {

                            ((Player)sender).getInventory().addItem(wandCores.hornedSerpentsHorn());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselve a horn from a river serpent.");
                            return true;

                        }

                        if(args[0].equalsIgnoreCase("wampus") && args[1].equalsIgnoreCase("hair")) {

                            ((Player)sender).getInventory().addItem(wandCores.wampusHair());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselve hair from the Wampus cat.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("snallygaster") && args[1].equalsIgnoreCase("heartstring")) {

                            ((Player)sender).getInventory().addItem(wandCores.snallygasterHeartstring());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselve a heartstring from a snallygaster.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("jackalope") && args[1].equalsIgnoreCase("antlers")) {

                            ((Player)sender).getInventory().addItem(wandCores.jackalopeAntlers());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselve the antlers of a jackalope.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("acacia") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.acacia());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of acacia wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("alder") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.alder());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of alder wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("apple") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.apple());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of apple wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("ash") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.ash());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of ash wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("aspen") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.aspen());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of aspen wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("beech") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.beech());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of beech wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("blackthorn") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.blackthorn());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of blackthorn wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("cedar") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.cedar());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of cedar wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("cherry") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.cherry());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of cherry wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("chestnut") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.chestnut());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of chestnut wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("cypress") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.cypress());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of cypress wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("dogwood") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.dogwood());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of dogwood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("ebony") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.ebony());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of ebony wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("elder") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.elder());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of elder wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("elm") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.elm());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of elm wood.");
                            return true;

                        }

                        if(args[0].equalsIgnoreCase("fir") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.fir());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of fir wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("hawthorn") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.hawthorn());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of hawthorn wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("hazel") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.hazel());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of hazel wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("holly") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.holly());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of holly wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("hornbeam") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.hornbeam());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of hornbeam wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("larch") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.larch());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of larch wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("laurel") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.laurel());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of laurel wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("maple") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.maple());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of maple wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("pear") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.pear());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of pear wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("pine") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.pine());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of pine wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("poplar") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.poplar());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of poplar wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("redwood") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.redwood());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of redwood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("rowan") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.rowan());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of rowan wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("spruce") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.spruce());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of spruce wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("sycamore") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.sycamore());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of sycamore wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("vine") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.vine());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of vine wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("walnut") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.walnut());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of walnut wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("willow") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.willow());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of willow wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("yew") && args[1].equalsIgnoreCase("wood")) {

                            ((Player)sender).getInventory().addItem(wandWoods.yew());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of yew wood.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("obsidian") && args[1].equalsIgnoreCase("sharder")) {

                            ((Player)sender).getInventory().addItem(new obsSharder().obsSharder());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves an obsidian sharder.");
                            return true;

                        }
                        if(args[0].equalsIgnoreCase("carving") && args[1].equalsIgnoreCase("knife")) {

                            ((Player)sender).getInventory().addItem(new wandCarver().carver());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a carving knife.");
                            return true;

                        }

                        if(args.length >=2) {

                            if(args[0].equalsIgnoreCase("black") && args[1].equalsIgnoreCase("walnut") && args[2].equalsIgnoreCase("wood")) {

                                ((Player)sender).getInventory().addItem(wandWoods.blackWalnut());
                                Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of black walnut wood.");
                                return true;

                            }
                            if(args[0].equalsIgnoreCase("english") && args[1].equalsIgnoreCase("oak") && args[2].equalsIgnoreCase("wood")) {

                                ((Player)sender).getInventory().addItem(wandWoods.englishOak());
                                Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of English oak wood.");
                                return true;

                            }
                            if(args[0].equalsIgnoreCase("red") && args[1].equalsIgnoreCase("oak") && args[2].equalsIgnoreCase("wood")) {

                                ((Player)sender).getInventory().addItem(wandWoods.redOak());
                                Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of red oak wood.");
                                return true;

                            }
                            if(args[0].equalsIgnoreCase("silver") && args[1].equalsIgnoreCase("lime") && args[2].equalsIgnoreCase("wood")) {

                                ((Player)sender).getInventory().addItem(wandWoods.silverLime());
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
                        if (args[0].equalsIgnoreCase("wand")) {
                            ((Player)sender).getInventory().addItem(wand.wand());
                            Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a wand.");
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

