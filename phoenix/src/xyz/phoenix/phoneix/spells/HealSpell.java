package xyz.phoenix.phoneix.spells;

public class HealSpell extends Spell {

    public HealSpell(String name, int id, boolean self) {
        super(name, id, self);
    }

    @Override
    public void execute() {
        if(!this.isSelf()) return;

        //Create SpellMotionObject handler for inbound spells.
    }
}
