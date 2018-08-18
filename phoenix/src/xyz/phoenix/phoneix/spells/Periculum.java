package xyz.phoenix.phoneix.spells;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.util.Vector;
import xyz.phoenix.phoneix.player.Wizard;

public class Periculum implements Listener {

    @EventHandler
    public void lLumosChat(AsyncPlayerChatEvent event) {
        if(event.getMessage().equalsIgnoreCase("periculum")) {
            if (!Wizard.getWizardByPlayer(event.getPlayer()).isWandRaised()) {return;}
            Wizard.getWizardByPlayer(event.getPlayer()).setSpokenSpell(Spell.PERICULUM);
        }
    }

    public void cast(Wizard wizard) {
        Player player = wizard.getPlayer();
        if(!wizard.getSpellID().equals("021")) {return;}
        double lvl = wizard.getLevel();
        wizard.getPlayer().sendMessage(ChatColor.LIGHT_PURPLE + "[Wand] " + ChatColor.GRAY + "" + ChatColor.ITALIC + "21 " + ChatColor.DARK_AQUA + ChatColor.ITALIC + "Periculum");
        int timesCast = wizard.getSpells().get(Spell.PERICULUM);
        int dur = (int)lvl * timesCast + 1;
        Location start = player.getEyeLocation();
        Vector increase = start.getDirection();
        for (int counter = 0; counter <= dur; counter++) {
            Location point = start.add(increase);
            player.spawnParticle(Particle.REDSTONE, point, 0, 0, 0, 0, 1);
        }
        player.getWorld().playSound(player.getLocation(), Sound.ENTITY_FIREWORK_TWINKLE, 100, 3);
        wizard.getSpells().put(Spell.PERICULUM, timesCast + 1);
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
        if(!wizard.getSpellID().equals("021")) {return;}
        double lvl = wizard.getLevel();
        wizard.getPlayer().sendMessage(ChatColor.LIGHT_PURPLE + "[Wand] " +ChatColor.GRAY + "" + ChatColor.ITALIC + "21 "+ ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "Periculum");
        int timesCast = wizard.getSpells().get(Spell.PERICULUM);
        int dur = (int)lvl * timesCast + 1;
        Location start = player.getEyeLocation();
        Vector increase = start.getDirection();
        for (int counter = 0; counter <= dur; counter++) {
            Location point = start.add(increase);
            player.spawnParticle(Particle.REDSTONE, point, 0, 0, 0, 0, 1);
        }
        player.getWorld().playSound(player.getLocation(), Sound.ENTITY_FIREWORK_TWINKLE, 100, 1);
        wizard.getSpells().put(Spell.PERICULUM, timesCast + 1);
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
