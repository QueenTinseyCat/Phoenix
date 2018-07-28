package xyz.phoenix.phoneix;

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
    private Map<Spell, Integer> spellSlot = new HashMap<>();
    private boolean wandRaised = false;

    public Wizard(Player player, Inventory inv, Map<Spell, Integer> spellSlot) {
        this.player = player;
        this.inv = inv;
        this.spellSlot = spellSlot;
        this.inv = player.getInventory();

        wizards.add(this);
    }
    public Player getPlayer() {
        return player;
    }
    public Inventory getInv() {
        return inv;
    }
    public boolean isWandRaised() {
        return wandRaised;
    }
    private void loadPanes() {
        wandRaised = true;

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
    private void restoreInventory() {
        this.wandRaised = false;
        player.getInventory().clear();

        for(int i = 0; i < inv.getSize() -1; i++) {
            ItemStack item = inv.getItem(i);
            if(item == null) continue;
            inv.setItem(i, item);
        }
    }

    public Map<Spell, Integer> getSpellSlot() {
        return spellSlot;
    }
    public static Wizard getWizardByPlayer(Player p) {
        for (Wizard wizard : wizards) {
            if(wizard.getPlayer().equals(p)) return wizard;
        }
        return null;
    }
}
