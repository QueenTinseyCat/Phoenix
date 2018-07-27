package xyz.phoenix.phoneix;


import xyz.phoenix.phoneix.items.register;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.phoenix.phoneix.commands.MainCommand;

import java.util.HashMap;
import java.util.UUID;

public class Main extends JavaPlugin {
    public static HashMap<UUID, String> spellsSpoken = new HashMap<>();
    public static HashMap<UUID, String> wandStatus = new HashMap<>();
    public static HashMap<UUID, String> spellId = new HashMap<>();
    public static HashMap<UUID, Inventory> raisedInv = new HashMap<>();
    public void onEnable() {
        getCommand(new MainCommand().grant).setExecutor(new MainCommand());



        new register().recipes();
        new register().events();
        new register().spellEvents();
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