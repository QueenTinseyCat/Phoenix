package com.glorial.phoneix.items;

import com.glorial.phoneix.commands.CommandBlocker;
import com.glorial.phoneix.events.PaneBlocker;
import com.glorial.phoneix.events.WandCrafter;
import com.glorial.phoneix.events.obsSharderShard;
import com.glorial.phoneix.items.msc.OBSSharder;
import com.glorial.phoneix.items.wands.WandCarver;
import com.glorial.phoneix.spells.Lumos;
import com.glorial.phoneix.spells.WandMechanics;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Server;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.Plugin;

public class register {

private Plugin plugin = com.glorial.phoneix.Main.getPlugin(com.glorial.phoneix.Main.class);
public Server server = Bukkit.getServer();
    public void recipes() {


        Bukkit.addRecipe(new ShapelessRecipe(new NamespacedKey(plugin, "wandCarver"),new WandCarver().carver()).addIngredient(Material.STICK).addIngredient(Material.OBSIDIAN));
        Bukkit.addRecipe(new ShapelessRecipe(new NamespacedKey(plugin, "obsSharder"),new OBSSharder().obsSharder()).addIngredient(Material.SHEARS).addIngredient(Material.DIAMOND));


    }
    public void events() {

        server.getPluginManager().registerEvents(new com.glorial.phoneix.events.Events(), plugin);
        server.getPluginManager().registerEvents(new com.glorial.phoneix.events.PlayerJoinEvents(), plugin);
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
