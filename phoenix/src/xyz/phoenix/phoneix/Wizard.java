package xyz.phoenix.phoneix;

import org.bukkit.inventory.Inventory;

import java.util.*;

public class Wizard {

    static List<Wizard> wizards = new ArrayList<>();

    private UUID uuid;
    private Inventory inv;
    private Map<Spell, Integer> spellSlot = new HashMap<>();

    public Wizard(UUID uuid, Inventory inv, Map<Spell, Integer> spellSlot) {
        this.uuid = uuid;
        this.inv = inv;
        this.spellSlot = spellSlot;

        wizards.add(this);
    }

    public UUID getUUID() {
        return uuid;
    }

    public Inventory getInv() {
        return inv;
    }

    public Map<Spell, Integer> getSpellSlot() {
        return spellSlot;
    }
    public static Wizard getWizardByUUID(UUID uuid) {
        for (Wizard wizard : wizards) {
            if(wizard.getUUID().equals(uuid)) return wizard;
        }
        return null;
    }
}
