package xyz.phoenix.phoneix.player;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import xyz.phoenix.phoneix.Main;
import xyz.phoenix.phoneix.items.wands.Items;
import xyz.phoenix.phoneix.spells.Spell;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Wizard {

    static Main main;
    static YamlConfiguration yaml;
    static List<Wizard> wizards = new ArrayList<>();

    static {
        main = Main.getInstance();
        yaml = main.getWizardConfig();
    }
    private HashMap<Spell, Integer> spells = new HashMap<>();
    private Player player;
    private Spell spokenSpell;
    private int year;
    private String name;
    private HashMap<Integer, ItemStack> inv = new HashMap<>();
    private Type type;
    private List<String> permissions;
    private double level;
    private String spellID;

    private boolean wandRaised = false;


    //Save type, permissions, level, UUID in config
    public Wizard(Player player) {
        this.player = player;
        this.spokenSpell = Spell.NONE;
        UUID uuid = player.getUniqueId();
        //Loading info from config into memory
        this.year = yaml.isSet(uuid + ".year") ? yaml.getInt(uuid + ".year") : 0;

        this.name = yaml.getString(uuid + ".name");
        this.permissions = yaml.getStringList(uuid + ".permissions");
        this.type = yaml.isSet(uuid + ".type") ? Type.valueOf(yaml.getString(uuid + ".type")) : Type.UNSORTED;

        this.level = yaml.isSet(uuid  + ".level") ? yaml.getDouble(uuid + ".level") : 0;
        if(permissions == null) {
            permissions.add("wizard");
        }
        spellID = "0";
        loadSpells();
        wizards.add(this);

        save();
    }


    public void loadPanes() {


        PlayerInventory inv = player.getInventory();

        for(int i = 0;i < player.getInventory().getSize(); i++) {

            this.inv.put(i, player.getInventory().getItem(i));

        }

        inv.clear();
        ItemStack wand = Items.WAND.getItem();
        wand.setDurability((short)1);
        inv.addItem(wand);
        inv.addItem(Items.PANE_1.getItem());
        inv.addItem(Items.PANE_2.getItem());
        inv.addItem(Items.PANE_3.getItem());
        inv.addItem(Items.PANE_4.getItem());
        inv.addItem(Items.PANE_5.getItem());
        inv.addItem(Items.PANE_6.getItem());
        inv.addItem(Items.PANE_7.getItem());
        inv.addItem(Items.PANE_8.getItem());
        resetSpellID();


    }
    public void addPerm(String Perm) {
        permissions.add(Perm);
        save();

    }

    public void removePerm(String perm) {
        permissions.remove(perm);
        save();
    }

    public void setType(Type newType) {
        type = newType;
        save();
    }

    /**
     * Restores {@link Wizard#getPlayer()}'s original inventory after modifying panes.
     */
    public void restoreInventory() {

        player.getInventory().clear();
        for(int i = 0; i < player.getInventory().getSize(); i++) {
            if(inv.get(i) == null){ continue;}

           player.getInventory().addItem(inv.get(i));
            inv.remove(i);
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
        UNSORTED,
        PUKWUDGIE;
    }
    public void save() {

        UUID uuid = player.getUniqueId();

        yaml.set(uuid + ".type", this.getType().name());
        yaml.set(uuid + ".year", this.year);
        yaml.set(uuid + ".level", level);
        yaml.set(uuid + ".permissions", permissions);
        yaml.set(uuid + ".name", player.getDisplayName());
        try {
            yaml.save(Main.getInstance().getDataFolder().getPath() + "/wizards.yml");

        }catch (IOException e) {
            Bukkit.broadcastMessage(org.bukkit.ChatColor.RED + "COULD NOT SAVE WIZARDS.YML");
        }

    }

    public void saveSpells() {
        UUID uuid = player.getUniqueId();

        Main.INSTANCE.getSpellConfig().set(uuid + ".spells.lumos", spells.get(Spell.LUMOS));
        try {
            Main.INSTANCE.getSpellConfig().save(Main.INSTANCE.getDataFolder().getPath() + "/spells.yml");
        }catch (IOException ex) {
            player.sendMessage(ChatColor.RED + "ERROR, could not save spells.yml, please contact server staff.");
        }


    }
    public void resetSpellID() {
        spellID = "0";
    }
    public String getSpellID() {
    return spellID;
    }
    public void appendToSpellID(String newID) {
        spellID+=newID;
        player.sendMessage(spellID.substring(1));
    }
    public HashMap<Spell, Integer> getSpells() {
        return spells;
    }
    public void setSpokenSpell(Spell spell) {
        spokenSpell = spell;
    }
    public int getYear() {return year;}
    public Spell getSpokenSpell() {
        return spokenSpell;
    }
    public double getLevel() {
        return level;
    }
    public void setLevel(double newLevel) {
        level = newLevel;
    }
    public List getPerms() {return permissions;}
    public Type getType() {
        return type;
    }
    public boolean isWandRaised() {
        return wandRaised;
    }
    public Player getPlayer() {
        return player;
    }
    public static List<Wizard> getWizards() {
        return wizards;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }
    public String getName() {
       return this.name;
    }
    public void setWandRaised(boolean wandRaised) {
        this.wandRaised = wandRaised;
    }
    public String getStringType() {
        if(type.equals(Type.HORNED_SERPENT)) {
            return "Horned Serpent";
        }
        if(type.equals(Type.THUNDERBIRD)) {
            return "Thunderbird";
        }
        if(type.equals(Type.PUKWUDGIE)) {
            return "Pukwudgie";
        }
        if(type.equals(Type.WAMPUS)) {
            return "Wampus";
        }
        if(type.equals(Type.UNSORTED)) {
            return "Unsorted";
        }
        return "Could not get name of type.";
    }
    public String getColoredStringType() {
        if(type.equals(Type.HORNED_SERPENT)) {
            return ChatColor.BLUE + "Horned Serpent";
        }
        if(type.equals(Type.THUNDERBIRD)) {
            return ChatColor.DARK_PURPLE + "Thunderbird";
        }
        if(type.equals(Type.PUKWUDGIE)) {
            return ChatColor.DARK_RED + "Pukwudgie";
        }
        if(type.equals(Type.WAMPUS)) {
            return ChatColor.DARK_GREEN + "Wampus";
        }
        if(type.equals(Type.UNSORTED)) {
            return ChatColor.BLACK + "Unsorted";
        }
        return "Could not get name of type.";
    }


    public String getTypeColor() {
        if(type.equals(Type.HORNED_SERPENT)) {
            return ChatColor.BLUE + "";
        }
        if(type.equals(Type.THUNDERBIRD)) {
            return ChatColor.DARK_PURPLE + "";
        }
        if(type.equals(Type.PUKWUDGIE)) {
            return ChatColor.DARK_RED + "";
        }
        if(type.equals(Type.WAMPUS)) {
            return ChatColor.DARK_GREEN + "";
        }
        if(type.equals(Type.UNSORTED)) {
            return ChatColor.BLACK + "";
        }
        return ChatColor.WHITE + "";
    }
    public void loadSpells() {
        UUID uuid = player.getUniqueId();
        YamlConfiguration spellConfig = Main.getInstance().getSpellConfig();
        try {
            spellConfig.load(new File(Main.INSTANCE.getDataFolder(), "spells.yml"));
        }catch (IOException | InvalidConfigurationException ex) {

        }


        int lumos = spellConfig.isSet(uuid + ".spells.lumos") ? spellConfig.getInt(uuid+".spells.lumos") : 0;
        spells.put(Spell.LUMOS, lumos);
        int nox = spellConfig.isSet(uuid + ".spells.nox") ? spellConfig.getInt(uuid+".spells.nox") : 0;
        spells.put(Spell.NOX, nox);



    }
}