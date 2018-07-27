package xyz.phoenix.phoneix.items;

import xyz.phoenix.phoneix.Main;
import xyz.phoenix.phoneix.commands.CommandBlocker;
import xyz.phoenix.phoneix.events.*;
import xyz.phoenix.phoneix.items.msc.OBSSharder;
import xyz.phoenix.phoneix.items.wands.WandCarver;
import xyz.phoenix.phoneix.spells.Lumos;
import xyz.phoenix.phoneix.spells.WandMechanics;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Server;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.Plugin;

public class register {

private Plugin plugin = Main.getPlugin(Main.class);
public Server server = Bukkit.getServer();
    public void recipes() {


        Bukkit.addRecipe(new ShapelessRecipe(new NamespacedKey(plugin, "wandCarver"),new WandCarver().carver()).addIngredient(Material.STICK).addIngredient(Material.OBSIDIAN));
        Bukkit.addRecipe(new ShapelessRecipe(new NamespacedKey(plugin, "obsSharder"),new OBSSharder().obsSharder()).addIngredient(Material.SHEARS).addIngredient(Material.DIAMOND));


    }
    public void events() {

        server.getPluginManager().registerEvents(new Events(), plugin);
        server.getPluginManager().registerEvents(new PlayerJoinEvents(), plugin);
        server.getPluginManager().registerEvents(new CommandBlocker(), plugin);
        server.getPluginManager().registerEvents(new WandCrafter(), plugin);
        server.getPluginManager().registerEvents(new obsSharderShard(), plugin);
        server.getPluginManager().registerEvents(new WandMechanics(), plugin);
        server.getPluginManager().registerEvents(new PaneBlocker(), plugin);

    }
    public void spellEvents() {


        Bukkit.getServer().getPluginManager().registerEvents(new Lumos(), plugin);
    }
}
