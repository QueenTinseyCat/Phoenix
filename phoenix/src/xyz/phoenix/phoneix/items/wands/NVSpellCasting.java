package xyz.phoenix.phoneix.items.wands;

import xyz.phoenix.phoneix.player.Wizard;
import xyz.phoenix.phoneix.spells.Lumos;
import xyz.phoenix.phoneix.spells.Nox;
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

}
