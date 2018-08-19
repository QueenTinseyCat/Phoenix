package xyz.phoenix.phoneix.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import xyz.phoenix.phoneix.items.wands.id;
import xyz.phoenix.phoneix.player.Wizard;

import java.util.ArrayList;
import java.util.List;

public class CMDID implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if(!(sender instanceof Player)) {
        sender.sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.RED + "You must be a player to use this command.");
            return true;}
        //if(!s.equalsIgnoreCase("id")) return true;
        Player player = (Player) sender;
        Wizard wizard = Wizard.getWizardByPlayer(player);
        if(args.length == 0) {

            new id().give(player);
            return true;
        }
        sender.sendMessage(args.length + "<< length");
        return true;
    }
}
