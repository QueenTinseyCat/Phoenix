package xyz.phoenix.phoneix.player;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import xyz.phoenix.phoneix.items.wands.Items;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Wizard {

    static List<Wizard> wizards = new ArrayList<>();

    private Player player;
    private Inventory inv;
    private Type type;
    private List<String> permissions;
    private double level;
    private Map<Spell, Integer> spellSlot = new HashMap<>();
    private boolean wandRaised = false;
        //Save type, permissions, level, UUID in config
    public Wizard(Player player, Type type) {
        this.player = player;
        this.type = type;
        //We'll load the spells from config later (if we plan on saving them)

        wizards.add(this);
    }

    /**
     * Loads panes into {@link Wizard#getPlayer()}'s cleared inventory. Also sets {@link Wizard#getSavedInventory()}.
     */
    private void loadPanes() {
        wandRaised = true;
        this.inv = player.getInventory();

        player.getInventory().clear();

        inv.addItem(Items.PANE_1.getItem());
        inv.addItem(Items.PANE_2.getItem());
        inv.addItem(Items.PANE_3.getItem());
        inv.addItem(Items.PANE_4.getItem());
        inv.addItem(Items.PANE_5.getItem());
        inv.addItem(Items.PANE_6.getItem());
        inv.addItem(Items.PANE_7.getItem());
        inv.addItem(Items.PANE_8.getItem());
        inv.addItem(Items.PANE_9.getItem());
    }

    /**
     * Restores {@link Wizard#getPlayer()}'s original inventory after modifying panes.
     */
    private void restoreInventory() {
        this.wandRaised = false;
        player.getInventory().clear();

        for(int i = 0; i < inv.getSize() -1; i++) {
            ItemStack item = inv.getItem(i);
            if(item == null) continue;
            inv.setItem(i, item);
        }
    }

    /**
     * @param p Player you're trying to get the wizard class for.
     * @return Player's wizard object; else null.
     */
    public static Wizard getWizardByPlayer(Player p) {
        for (Wizard wizard : wizards) {
            if(wizard.getPlayer().equals(p)) return wizard;
        }
        return null;
    }
    public enum Type {
        HORNED_SERPENT,
        THUNDERBIRD,
        WAMPUS,
        PUKWUDGIE;
    }
    //comment so i can push

    /*
    Everything below is getters and getters only (for organization)
     */

    public boolean isWandRaised() {
        return wandRaised;
    }
    public Player getPlayer() {
        return player;
    }
    public Inventory getSavedInventory() {
        return inv;
    }
    public static List<Wizard> getWizards() {
        return wizards;
    }
    public Map<Spell, Integer> getSpellSlot() {
        return spellSlot;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }
    public void setInv(Inventory inv) {
        this.inv = inv;
    }
    public void setSpellSlot(Map<Spell, Integer> spellSlot) {
        this.spellSlot = spellSlot;
    }
    public void setWandRaised(boolean wandRaised) {
        this.wandRaised = wandRaised;
    }
}
