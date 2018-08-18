package xyz.phoenix.phoneix.items.wands;

import xyz.phoenix.phoneix.player.Wizard;
import xyz.phoenix.phoneix.spells.Lumos;
import xyz.phoenix.phoneix.spells.Nox;
import xyz.phoenix.phoneix.spells.Periculum;
import xyz.phoenix.phoneix.spells.Spell;

public class NVSpellCasting {

    public void Lumos(Wizard wizard) {

        if(wizard.getSpells().get(Spell.LUMOS) > 100) {
            new Lumos().castNV(wizard);
        }
    }

    public void Nox(Wizard wizard) {

        if(wizard.getSpells().get(Spell.NOX) > 100) {
            new Nox().castNV(wizard);
        }
    }

    public void Periculum(Wizard wizard) {

        if(wizard.getSpells().get(Spell.PERICULUM) > 100) {
            new Periculum().castNV(wizard);
        }
    }
}
