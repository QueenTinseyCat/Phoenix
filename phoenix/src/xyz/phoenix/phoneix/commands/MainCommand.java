package xyz.phoenix.phoneix.commands;

import net.minecraft.server.v1_12_R1.CommandExecute;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import xyz.phoenix.phoneix.items.wands.Items;

public class MainCommand extends CommandExecute implements CommandExecutor, Listener  {



    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;

        if (!(sender instanceof Player)) {
            sender.sendMessage("You are sending this command via console, therefore you cannot continue.");
            return true;
        }

        if (player.isWhitelisted()) {
            if (args.length > 1) {
                if (args[0].equalsIgnoreCase("unicorn") && args[1].equalsIgnoreCase("hair")) {
                    ((Player) sender).getInventory().addItem(Items.UNICORN_HAIR.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselve a strand of unicorn hair.");
                    return true;
                }

                if (args[0].equalsIgnoreCase("dragon") && args[1].equalsIgnoreCase("heartstring")) {
                    ((Player) sender).getInventory().addItem(Items.DRAGON_HEARTSTRING.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselve a dragon's heartstring.");
                    return true;

                }

                if (args[0].equalsIgnoreCase("phoenix") && args[1].equalsIgnoreCase("feather")) {

                    ((Player) sender).getInventory().addItem(Items.PHOENIX_FEATHER.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselve a feather from a Phoenix.");
                    return true;

                }

                if (args[0].equalsIgnoreCase("serpent") && args[1].equalsIgnoreCase("horn")) {

                    ((Player) sender).getInventory().addItem(Items.HORNED_SERPENT_HORN.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselve a horn from a river serpent.");
                    return true;

                }

                if (args[0].equalsIgnoreCase("wampus") && args[1].equalsIgnoreCase("hair")) {

                    ((Player) sender).getInventory().addItem(Items.WAMPUS_HAIR.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselve hair from the Wampus cat.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("snallygaster") && args[1].equalsIgnoreCase("heartstring")) {

                    ((Player) sender).getInventory().addItem(Items.SNALLYGASTER_HEARTSTRING.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselve a heartstring from a snallygaster.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("jackalope") && args[1].equalsIgnoreCase("antlers")) {

                    ((Player) sender).getInventory().addItem(Items.JACKALOPE_ANTLERS.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselve the antlers of a jackalope.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("alder") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.ALDER_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of alder wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("apple") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.APPLE_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of apple wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("ash") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.ASH_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of ash wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("aspen") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.ASPEN_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of aspen wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("beech") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.BEECH_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of beech wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("blackthorn") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.BLACKTHORN_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of blackthorn wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("cedar") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.CEDAR_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of cedar wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("cherry") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.CHERRY_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of cherry wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("chestnut") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.CHESTNUT_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of chestnut wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("cypress") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.CYPRESS_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of cypress wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("dogwood") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.DOGWOOD_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of dogwood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("ebony") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.EBONY_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of ebony wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("elder") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.ELDER_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of elder wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("elm") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.ELM_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of elm wood.");
                    return true;

                }

                if (args[0].equalsIgnoreCase("fir") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.FIR_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of fir wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("hawthorn") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.HAWTHORN_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of hawthorn wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("hazel") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.HAZEL_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of hazel wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("holly") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.HOLLY_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of holly wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("hornbeam") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.HORNBEAM_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of hornbeam wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("larch") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.LARCH_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of larch wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("laurel") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.LAUREL_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of laurel wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("maple") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.MAPLE_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of maple wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("pear") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.PEAR_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of pear wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("pine") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.PINE_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of pine wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("poplar") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.POPLAR_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of poplar wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("redwood") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.REDWOOD_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of redwood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("rowan") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.ROWAN_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of rowan wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("spruce") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.SPRUCE_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of spruce wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("sycamore") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.SYCAMORE_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of sycamore wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("vine") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.VINE_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of vine wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("walnut") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.WALNUT_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of walnut wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("willow") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.WILLOW_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of willow wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("yew") && args[1].equalsIgnoreCase("wood")) {

                    ((Player) sender).getInventory().addItem(Items.YEW_WOOD.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of yew wood.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("obsidian") && args[1].equalsIgnoreCase("sharder")) {

                    ((Player) sender).getInventory().addItem(Items.OBSIDIAN_SHARDER.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves an obsidian sharder.");
                    return true;

                }
                if (args[0].equalsIgnoreCase("carving") && args[1].equalsIgnoreCase("knife")) {

                    ((Player) sender).getInventory().addItem(Items.CARVING_KNIFE.getItem());
                    Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a carving knife.");
                    return true;

                }

                if (args.length >= 2) {

                    if (args[0].equalsIgnoreCase("black") && args[1].equalsIgnoreCase("walnut") && args[2].equalsIgnoreCase("wood")) {

                        ((Player) sender).getInventory().addItem(Items.BLACK_WALNUT_WOOD.getItem());
                        Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of black walnut wood.");
                        return true;

                    }
                    if (args[0].equalsIgnoreCase("english") && args[1].equalsIgnoreCase("oak") && args[2].equalsIgnoreCase("wood")) {

                        ((Player) sender).getInventory().addItem(Items.ENGLISH_OAK_WOOD.getItem());
                        Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of English oak wood.");
                        return true;

                    }
                    if (args[0].equalsIgnoreCase("red") && args[1].equalsIgnoreCase("oak") && args[2].equalsIgnoreCase("wood")) {

                        ((Player) sender).getInventory().addItem(Items.RED_OAK_WOOD.getItem());
                        Bukkit.broadcastMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.DARK_AQUA + ((Player) sender).getDisplayName() + ChatColor.DARK_GREEN + " has given themselves a bowtruckle infested piece of red oak wood.");
                        return true;

                    }
                    if (args[0].equalsIgnoreCase("silver") && args[1].equalsIgnoreCase("lime") && args[2].equalsIgnoreCase("wood")) {

                        ((Player) sender).getInventory().addItem(Items.SILVER_LIME_WOOD.getItem());
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
                    player.getInventory().addItem(Items.WAND.getItem());
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

        } else {
            sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "Sorry, you can't do that! You must be an op to use Grant.");
            return true;
        }
    }
}

