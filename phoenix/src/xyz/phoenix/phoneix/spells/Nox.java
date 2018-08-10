package xyz.phoenix.phoneix.spells;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Color;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import xyz.phoenix.phoneix.player.Wizard;

public class Nox implements Listener {
    @EventHandler
    public void lNoxChat(AsyncPlayerChatEvent event) {
        if(event.getMessage().equalsIgnoreCase("nox")) {
            if (!Wizard.getWizardByPlayer(event.getPlayer()).isWandRaised()) {return;}
            Wizard.getWizardByPlayer(event.getPlayer()).setSpokenSpell(Spell.NOX);
        }
    }

    public void cast(Wizard wizard) {
        Player player = wizard.getPlayer();
        if(!wizard.getSpellID().equals("011")) {return;}
        double lvl = wizard.getLevel();
        wizard.getPlayer().sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.LIGHT_PURPLE + "" + ChatColor.ITALIC + "Nox");
        wizard.restoreInventory();
        wizard.setWandRaised(false);
        int timesCast = wizard.getSpells().get(Spell.NOX);
        player.getWorld().playSound(player.getLocation(), Sound.ENTITY_SPLASH_POTION_THROW, 100, 50000);
        player.removePotionEffect(PotionEffectType.NIGHT_VISION);
        wizard.getSpells().put(Spell.NOX, timesCast + 1);
        wizard.setSpokenSpell(Spell.NONE);
        wizard.saveSpells();
        double rand = Math.random();
        if(rand > 0.9) {
            wizard.setLevel(lvl + 0.08);
            return;
        }
        if(rand > 0.8) {
            wizard.setLevel(lvl + 0.1);
            return;
        }
        if(rand > 0.7) {
            wizard.setLevel(lvl + 0.05);
            return;
        }
        if(rand > 0.1) {
            wizard.setLevel(lvl + 0.01);
            return;
        }
        if(rand < 0.1) {
            return;
        }

    }
    public void castNV(Wizard wizard) {
        Player player = wizard.getPlayer();
        if(!wizard.getSpellID().equals("011")) {return;}
        double lvl = wizard.getLevel();
        wizard.getPlayer().sendMessage(ChatColor.GOLD + "[Phoenix] " + ChatColor.LIGHT_PURPLE + "" + ChatColor.ITALIC + "Nox");
        wizard.restoreInventory();
        wizard.setWandRaised(false);
        int timesCast = wizard.getSpells().get(Spell.NOX);
        player.getWorld().playSound(player.getLocation(), Sound.ENTITY_SPLASH_POTION_THROW, 100, 50000);
        player.removePotionEffect(PotionEffectType.NIGHT_VISION);
        wizard.getSpells().put(Spell.NOX, timesCast + 1);
        wizard.setSpokenSpell(Spell.NONE);
        wizard.saveSpells();
        double rand = Math.random();
        if(rand > 0.9) {
            wizard.setLevel(lvl + 0.08);
            return;
        }
        if(rand > 0.8) {
            wizard.setLevel(lvl + 0.1);
            return;
        }
        if(rand > 0.7) {
            wizard.setLevel(lvl + 0.05);
            return;
        }
        if(rand > 0.1) {
            wizard.setLevel(lvl + 0.01);
            return;
        }
        if(rand < 0.1) {
            return;
        }

    }

}
