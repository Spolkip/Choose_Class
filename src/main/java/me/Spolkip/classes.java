package me.Spolkip;


import me.Spolkip.Commands.choose;
import org.bukkit.plugin.java.JavaPlugin;

public final class classes extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("This plugin is enabled!");


        getCommand("choose").setExecutor(new choose());


    }
}