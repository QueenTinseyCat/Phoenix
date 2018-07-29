package xyz.phoenix.phoneix.spells;

import java.util.ArrayList;
import java.util.List;

public abstract class Spell implements IExecutable {

    static List<Spell> spells = new ArrayList<>();

    private String name;
    private int id;
    private boolean self;

    public Spell(String name, int id, boolean self) {
        this.name = name;
        this.id = id;
        this.self = self;

        spells.add(this);
    }

    public boolean isSelf() {
        return self;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public static Spell getSpellById(int id) {
        for (Spell spell : spells) {
            if(spell.getId() == id) return spell;
        }
        return null;
    }
    public static Spell getSpellByName(String name) {
        for (Spell spell : spells) {
            if(spell.getName().equalsIgnoreCase(name)) return spell;
        }
        return null;
    }
}
