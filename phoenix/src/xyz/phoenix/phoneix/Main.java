package xyz.phoenix.phoneix;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.phoenix.phoneix.commands.MainCommand;
import xyz.phoenix.phoneix.events.*;
import xyz.phoenix.phoneix.items.wands.Items;

import java.io.File;
import java.io.IOException;

public class Main extends JavaPlugin {

    public static Main INSTANCE;

    public static Main getInstance() {
        return INSTANCE;
    }

    private YamlConfiguration wizardsConfig;

    public void onEnable() {
        setup();
    }

    private void setup() {
        INSTANCE = this;

        setupCraftables();
        setupEventsAndCommands();
        generateWizardsYaml();
    }

    private void setupEventsAndCommands() {
        //Commands
        getCommand("grant").setExecutor(new MainCommand());

        //Events
        PluginManager pm = Bukkit.getPluginManager();

        pm.registerEvents(new EventBlockPlace(), this);
        pm.registerEvents(new EventDropItemPlayer(), this);
        pm.registerEvents(new EventJoin(), this);
        pm.registerEvents(new EventKick(), this);
        pm.registerEvents(new EventPlayerInteract(), this);
        pm.registerEvents(new EventWandMechanics(), this);
        pm.registerEvents(new EventQuit(), this);
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
    private void generateWizardsYaml() {
        File file = new File(getDataFolder(), "wizards.yml");
        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                Bukkit.getLogger().info(String.format("[%s] - Could not create wizards.yml.", getName()));
                Bukkit.getPluginManager().disablePlugin(this);
            }
        }
        this.wizardsConfig = YamlConfiguration.loadConfiguration(file);
    }

    public YamlConfiguration getWizardConfig() {
        return wizardsConfig;
    }

    public void onDisable() {

    }
}