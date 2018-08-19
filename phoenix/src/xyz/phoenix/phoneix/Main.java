package xyz.phoenix.phoneix;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.phoenix.phoneix.commands.*;
import xyz.phoenix.phoneix.events.*;
import xyz.phoenix.phoneix.items.wands.Items;
import xyz.phoenix.phoneix.items.wands.WandMechanics;
import xyz.phoenix.phoneix.items.wands.id;
import xyz.phoenix.phoneix.player.Wizard;
import xyz.phoenix.phoneix.regionChat.onChat;
import xyz.phoenix.phoneix.shops.sign;
import xyz.phoenix.phoneix.spells.Lumos;
import xyz.phoenix.phoneix.spells.Nox;
import xyz.phoenix.phoneix.spells.Periculum;

import java.io.File;

public class Main extends JavaPlugin {

    public static Main INSTANCE;

    public static Main getInstance() {
        return INSTANCE;
    }

    private YamlConfiguration wizardsConfig;
    private YamlConfiguration spellConfig;

    public void onEnable() {
        setup();

    }

    private void setup() {
        INSTANCE = this;

        setupCraftables();
        setupEventsAndCommands();
        generateWizardsYaml();
        generateSpellsYaml();
        detectOnlineWizards();
    }

    private void setupEventsAndCommands() {
        //Commands

        getCommand("grant").setExecutor(new CMDGrant());
        getCommand("perm").setExecutor(new CMDStaff());
        getCommand("house").setExecutor(new CMDHouse());
        getCommand("info").setExecutor(new CMDInfo());
        getCommand("casts").setExecutor(new CMDcasts());
        getCommand("id").setExecutor(new CMDID());
        getCommand("inv").setExecutor(new CMDinv());
        //Events
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new CommandBlocker(), this);
        pm.registerEvents(new BuildBlocking(), this);
        pm.registerEvents(new EventDropItemPlayer(), this);
        pm.registerEvents(new EventJoin(), this);
        pm.registerEvents(new EventKick(), this);
        pm.registerEvents(new EventPlayerInteract(), this);
        pm.registerEvents(new EventQuit(), this);
        pm.registerEvents(new EventWeatherChange(), this);
        pm.registerEvents(new onChat(), this);
        pm.registerEvents(new WandMechanics(), this);
        pm.registerEvents(new Lumos(), this);
        pm.registerEvents(new Nox(), this);
        pm.registerEvents(new Periculum(), this);
        pm.registerEvents(new sign(), this);
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
    private void generateSpellsYaml() {


        File file = new File( getDataFolder(), "spells.yml");
        if(!file.exists()) {

            Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "[Phoenix] - Attempting to create spells.yml...");



            try {
                file.getParentFile().mkdirs();
                file.createNewFile();
                spellConfig.save(getDataFolder() + "/spells.yml");
            }catch (Exception a) {
                System.out.println("couldnt save file");
            }
            Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "[Phoenix] - spells.yml created");


        }
        this.spellConfig = YamlConfiguration.loadConfiguration(file);
    }
    public YamlConfiguration getWizardConfig() {
        return wizardsConfig;
    }

    public YamlConfiguration getSpellConfig() {
        return spellConfig;
    }
    public void onDisable() {

        for(Wizard wizard : Wizard.getWizards()) {
            if(wizard.isWandRaised()) {
                wizard.restoreInventory();
                wizard.setWandRaised(false);
                wizard.removeBar();
            }

            wizard.save();
            wizard.saveSpells();
        }
    }
}