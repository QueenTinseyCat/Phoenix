package xyz.phoenix.phoneix;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.phoenix.phoneix.commands.CMDHouse;
import xyz.phoenix.phoneix.commands.CMDStaff;
import xyz.phoenix.phoneix.commands.CommandBlocker;
import xyz.phoenix.phoneix.commands.CMDGrant;
import xyz.phoenix.phoneix.events.*;
import xyz.phoenix.phoneix.items.wands.Items;
import xyz.phoenix.phoneix.player.Wizard;
import xyz.phoenix.phoneix.regionChat.onChat;

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
        detectOnlineWizards();
    }

    private void setupEventsAndCommands() {
        //Commands

        getCommand("grant").setExecutor(new CMDGrant());
        getCommand("perm").setExecutor(new CMDStaff());
        getCommand("house").setExecutor(new CMDHouse());
        //Events
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new CommandBlocker(), this);
        pm.registerEvents(new EventBlockPlace(), this);
        pm.registerEvents(new EventDropItemPlayer(), this);
        pm.registerEvents(new EventJoin(), this);
        pm.registerEvents(new EventKick(), this);
        pm.registerEvents(new EventPlayerInteract(), this);
        pm.registerEvents(new EventWandMechanics(), this);
        pm.registerEvents(new EventQuit(), this);
        pm.registerEvents(new EventWeatherChange(), this);
        pm.registerEvents(new onChat(), this);
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

    /**
     * Detects wizards that are already on because your dumbass used the /reload command
     */
    private void detectOnlineWizards() {
        for (Player player : Bukkit.getOnlinePlayers()) {
            Wizard wizard = new Wizard(player);
        }
    }

    private void generateWizardsYaml() {


        File file = new File( getDataFolder(), "wizards.yml");
        if(!file.exists()) {

                    Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "[Phoenix] - Attempting to create wizards.yml...");



                try {
                    file.getParentFile().mkdirs();
                    file.createNewFile();
                    wizardsConfig.save(getDataFolder() + "/wizards.yml");
                }catch (Exception a) {
                    System.out.println("couldnt save file");
                }
                Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "[Phoenix] - wizards.yml created");


        }
        this.wizardsConfig = YamlConfiguration.loadConfiguration(file);
    }

    public YamlConfiguration getWizardConfig() {
        return wizardsConfig;
    }


    public void onDisable() {

    }
}