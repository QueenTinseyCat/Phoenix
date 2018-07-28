package xyz.phoenix.phoneix;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.phoenix.phoneix.commands.MainCommand;
import xyz.phoenix.phoneix.events.*;
import xyz.phoenix.phoneix.items.wands.Items;

import java.util.HashMap;
import java.util.UUID;

public class Main extends JavaPlugin {

    public static HashMap<UUID, String> spellsSpoken = new HashMap<>();
    public static HashMap<UUID, String> wandStatus = new HashMap<>();
    public static HashMap<UUID, String> spellId = new HashMap<>();
    public static HashMap<UUID, Inventory> raisedInv = new HashMap<>();

    public void onEnable() {
        getCommand("grant").setExecutor(new MainCommand());

        setup();
    }

    private void setup() {
        setupCraftables();
        setupEvents();
    }

    private void setupEvents() {
        PluginManager pm = Bukkit.getPluginManager();

        pm.registerEvents(new EventBlockPlace(), this);
        pm.registerEvents(new EventDropItemPlayer(), this);
        pm.registerEvents(new EventJoin(), this);
        pm.registerEvents(new EventKick(), this);
        pm.registerEvents(new EventPlayerInteract(), this);
        pm.registerEvents(new EventWandMechanics(), this);
    }

    private void setupCraftables() {
        Bukkit.addRecipe(new ShapelessRecipe(new NamespacedKey(this, "wandCarver"),
                Items.CARVING_KNIFE.getItem())
                .addIngredient(Material.STICK)
                .addIngredient(Material.OBSIDIAN));
        Bukkit.addRecipe(new ShapelessRecipe(new NamespacedKey(this, "obsSharder"),
                Items.OBSIDIAN_SHARDER.getItem())
                .addIngredient(Material.SHEARS)
                .addIngredient(Material.DIAMOND));
    }
    public void onDisable() {
        for(Player player : getServer().getOnlinePlayers()) {
            if(wandStatus.containsKey(player.getUniqueId())) {

                if(wandStatus.get(player.getUniqueId()).equals("raised")) {

                    //lower wand

                }

            }

        }

    }
}