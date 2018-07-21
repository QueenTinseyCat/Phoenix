package com.glorial;

import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
    public void onEnable() {
        getCommand(new com.glorial.commands.main().grant).setExecutor(new com.glorial.commands.main());
        getServer().getPluginManager().registerEvents(new events.events(), this);
        getServer().getPluginManager().registerEvents(new events.playerJoinEvents(), this);
    }
}
