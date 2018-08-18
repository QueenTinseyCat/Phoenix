package xyz.phoenix.phoneix.spells;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import xyz.phoenix.phoneix.player.Wizard;


public class Lumos implements Listener {

    @EventHandler
    public void lLumosChat(AsyncPlayerChatEvent event) {
        if(event.getMessage().equalsIgnoreCase("lumos")) {
            if (!Wizard.getWizardByPlayer(event.getPlayer()).isWandRaised()) {return;}
                Wizard.getWizardByPlayer(event.getPlayer()).setSpokenSpell(Spell.LUMOS);

        }
    }

    public void cast(Wizard wizard) {
        Player player = wizard.getPlayer();
        if(!wizard.getSpellID().equals("01")) {return;}
        double lvl = wizard.getLevel();
        wizard.getPlayer().sendMessage(ChatColor.LIGHT_PURPLE + "[Wand] " + ChatColor.GRAY + "" + ChatColor.ITALIC + "1 " + ChatColor.DARK_AQUA + ChatColor.ITALIC + "Lumos");
        int timesCast = wizard.getSpells().get(Spell.LUMOS);
        int dur = (int)lvl +timesCast * 80 + 1;
        player.getWorld().playSound(player.getLocation(), Sound.ENTITY_SPLASH_POTION_THROW, 100, 50000);
        player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, dur, 2));
        wizard.getSpells().put(Spell.LUMOS, timesCast + 1);
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
        if(!wizard.getSpellID().equals("01")) {return;}
        double lvl = wizard.getLevel();
        wizard.getPlayer().sendMessage(ChatColor.LIGHT_PURPLE + "[Wand] " +ChatColor.GRAY + "1 "+ ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "Lumos");
        int timesCast = wizard.getSpells().get(Spell.LUMOS);
        int dur = (int)lvl +timesCast * 40 + 1;
        player.getWorld().playSound(player.getLocation(), Sound.ENTITY_SPLASH_POTION_THROW, 100, 50000);
        player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, dur, 2));
        wizard.getSpells().put(Spell.LUMOS, timesCast + 1);
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
