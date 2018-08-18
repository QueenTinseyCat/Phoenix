package xyz.phoenix.phoneix.items.wands;

import me.confuser.barapi.BarAPI;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import xyz.phoenix.phoneix.player.Wizard;
import xyz.phoenix.phoneix.spells.Lumos;
import xyz.phoenix.phoneix.spells.Nox;
import xyz.phoenix.phoneix.spells.Periculum;
import xyz.phoenix.phoneix.spells.Spell;

public class WandMechanics implements Listener {


   public void cast(Spell spell, Wizard wizard) {
        BarAPI.removeBar(wizard.getPlayer());
        wizard.setWandRaised(false);
        wizard.restoreInventory();
        switch (spell) {
            case LUMOS: new Lumos().cast(wizard);
            case NOX: new Nox().cast(wizard);
            case PERICULUM: new Periculum().cast(wizard);
            default: return;
        }
    }
    public void castNV(Wizard wizard) {
        BarAPI.removeBar(wizard.getPlayer());
        wizard.setWandRaised(false);
        wizard.restoreInventory();
        String spellID = wizard.getSpellID();

        switch (spellID) {

            case "01" : new NVSpellCasting().Lumos(wizard);
            case "011" : new NVSpellCasting().Nox(wizard);
            case "021" : new NVSpellCasting().Periculum(wizard);



        }
    }

    @EventHandler
    public void lCast(PlayerInteractEvent event) {
        Action action = event.getAction();
        if (action != Action.LEFT_CLICK_BLOCK && action != Action.LEFT_CLICK_AIR) return;
        Player player = event.getPlayer();
        PlayerInventory inv = player.getInventory();
        if (event.getHand() == null) return;
        if (event.getHand() != EquipmentSlot.HAND) return;
        ItemStack item = inv.getItemInMainHand();
        if (item == null) return;
        if (!item.hasItemMeta()) return;
        ItemMeta meta = item.getItemMeta();
        if (meta.getDisplayName() == null) return;
        if (!meta.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "Wand")) return;
        Wizard wizard = Wizard.getWizardByPlayer(player);
        if (wizard == null) {
            player.sendMessage(ChatColor.RED + "ERROR, you are not registered as a wizard, WandMechanics.java, line 35;");
            Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "ERROR, you are not registered as a wizard, WandMechanics.java, line 35;" + player.getDisplayName());
            return;
        }
        if(!wizard.isWandRaised()) {return;}
        if(wizard.getSpokenSpell().equals(Spell.NONE)) {
            if(!wizard.getSpellID().equals("0")) {

                castNV(wizard);
            }

            return;}
        cast(wizard.getSpokenSpell(), wizard);
    }

    @EventHandler
    public void onWandStateEvent(PlayerInteractEvent event) {
        Action action = event.getAction();
        //makes sure player right clicked
        if (action != Action.RIGHT_CLICK_AIR && action != Action.RIGHT_CLICK_BLOCK) return;
        Player player = event.getPlayer();
        PlayerInventory inv = player.getInventory();
        //bunch of checks to make sure your holding a wand
        if (event.getHand() == null) return;
        if (event.getHand() != EquipmentSlot.HAND) return;
        ItemStack item = inv.getItemInMainHand();
        if (item == null) return;
        if (!item.hasItemMeta()) return;
        ItemMeta meta = item.getItemMeta();
        if (meta.getDisplayName() == null) return;
        Wizard wizard = Wizard.getWizardByPlayer(player);
        if (wizard == null) {
            player.sendMessage(ChatColor.RED + "ERROR, you are not registered as a wizard, WandMechanics.java, line 35;");
            Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "ERROR, you are not registered as a wizard, WandMechanics.java, line 35;" + player.getDisplayName());
            return;
        }
        if (item.getType() == Material.STAINED_GLASS_PANE) {
            if (wizard.isWandRaised()) {
                if (player.isSneaking()) {
                    player.sendMessage(ChatColor.LIGHT_PURPLE + "[Wand] " + ChatColor.GRAY + "" + ChatColor.ITALIC + "lowered wand");
                    event.setCancelled(true);
                    wizard.restoreInventory();
                    wizard.setWandRaised(false);
                    return;
                }
            }
        }
        if (!meta.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "Wand")) return;
        if (!wizard.isWandRaised()) {
            player.sendMessage(ChatColor.LIGHT_PURPLE + "[Wand] " + ChatColor.GRAY + "" + ChatColor.ITALIC + "raised wand");
            wizard.loadPanes();
            wizard.setWandRaised(true);
            BarAPI.setMessage(player, "", 0F);






            return;
        }
            player.sendMessage(ChatColor.LIGHT_PURPLE + "[Wand] " + ChatColor.GRAY + "" + ChatColor.ITALIC + "lowered wand");
            event.setCancelled(true);
            wizard.restoreInventory();
            wizard.setWandRaised(false);
            BarAPI.removeBar(player);
    }



@EventHandler
    public void lGetSlot(PlayerInteractEvent event) {
    Action action = event.getAction();
    if (action != Action.LEFT_CLICK_AIR && action != Action.LEFT_CLICK_BLOCK) return;
    Player player = event.getPlayer();
    PlayerInventory inv = player.getInventory();
    if (event.getHand() == null) return;
    if (event.getHand() != EquipmentSlot.HAND) return;
    ItemStack item = inv.getItemInMainHand();
    if (item == null) return;
    if (!item.hasItemMeta()) return;
    ItemMeta meta = item.getItemMeta();
    if (meta.getDisplayName() == null) return;
    Wizard wizard = Wizard.getWizardByPlayer(player);
    if (wizard == null) {
        player.sendMessage(ChatColor.RED + "ERROR, you are not registered as a wizard, WandMechanics.java, line 35;");
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "ERROR, you are not registered as a wizard, WandMechanics.java, line 35;" + player.getDisplayName());
        return;
    }
    if(!item.getType().equals(Material.STAINED_GLASS_PANE)) {return;}
    String slot = meta.getDisplayName();
    if(wizard.getSpellID().length() >= 11) {return;}
        if(slot.equals(ChatColor.GOLD + "1")) {
            wizard.appendToSpellID("1");
            BarAPI.setMessage(player, wizard.getSpellID().substring(1), (float)(wizard.getSpellID().length() - 1) * 10);
            return;
        }
        if(slot.equals(ChatColor.GOLD + "2")) {
            wizard.appendToSpellID("2");
            BarAPI.setMessage(player, wizard.getSpellID().substring(1), (float)(wizard.getSpellID().length() - 1) * 10);
            return;
        }
        if(slot.equals(ChatColor.GOLD + "3")) {
            wizard.appendToSpellID("3");
            BarAPI.setMessage(player, wizard.getSpellID().substring(1), (float)(wizard.getSpellID().length() - 1) * 10);
            return;
        }
        if(slot.equals(ChatColor.GOLD + "4")) {
            wizard.appendToSpellID("4");
            BarAPI.setMessage(player, wizard.getSpellID().substring(1), (float)(wizard.getSpellID().length() - 1) * 10);
            return;
        }
        if(slot.equals(ChatColor.GOLD + "5")) {
            wizard.appendToSpellID("5");
            BarAPI.setMessage(player, wizard.getSpellID().substring(1), (float)(wizard.getSpellID().length() - 1) * 10);
            return;
        }
        if(slot.equals(ChatColor.GOLD + "6")) {
            wizard.appendToSpellID("6");
            BarAPI.setMessage(player, wizard.getSpellID().substring(1), (float)(wizard.getSpellID().length() - 1) * 10);
            return;
        }
        if(slot.equals(ChatColor.GOLD + "7")) {
            wizard.appendToSpellID("7");
            BarAPI.setMessage(player, wizard.getSpellID().substring(1), (float)(wizard.getSpellID().length() - 1) * 10);
            return;
        }
        if(slot.equals(ChatColor.GOLD + "8")) {
            wizard.appendToSpellID("8");
            BarAPI.setMessage(player, wizard.getSpellID().substring(1), (float)(wizard.getSpellID().length() - 1) * 10);
            return;
        }



    }

}
