package com.glorial.phoneix.items;

import com.glorial.phoneix.Main;
import com.glorial.phoneix.commands.commandBlocker;
import com.glorial.phoneix.events.obsSharderShard;
import com.glorial.phoneix.events.paneBlocker;
import com.glorial.phoneix.events.wandCrafter;
import com.glorial.phoneix.items.msc.obsSharder;
import com.glorial.phoneix.items.wands.wandCarver;
import com.glorial.phoneix.spells.Lumos;
import com.glorial.phoneix.spells.WandMechanics;
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


        Bukkit.addRecipe(new ShapelessRecipe(new NamespacedKey(plugin, "wandCarver"),new wandCarver().carver()).addIngredient(Material.STICK).addIngredient(Material.OBSIDIAN));
        Bukkit.addRecipe(new ShapelessRecipe(new NamespacedKey(plugin, "obsSharder"),new obsSharder().obsSharder()).addIngredient(Material.SHEARS).addIngredient(Material.DIAMOND));


    }
    public void events() {

        server.getPluginManager().registerEvents(new com.glorial.phoneix.events.events(), plugin);
        server.getPluginManager().registerEvents(new com.glorial.phoneix.events.playerJoinEvents(), plugin);
        server.getPluginManager().registerEvents(new commandBlocker(), plugin);
        server.getPluginManager().registerEvents(new wandCrafter(), plugin);
        server.getPluginManager().registerEvents(new obsSharderShard(), plugin);
        server.getPluginManager().registerEvents(new WandMechanics(), plugin);
        server.getPluginManager().registerEvents(new paneBlocker(), plugin);

    }
    public void spellEvents() {


        Bukkit.getServer().getPluginManager().registerEvents(new Lumos(), plugin);
    }
}
