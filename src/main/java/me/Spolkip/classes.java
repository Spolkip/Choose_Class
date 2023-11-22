package me.Spolkip;


import me.Spolkip.Commands.class_command;
import me.Spolkip.Commands.races_command;
import me.Spolkip.Custom_Items.*;
import me.Spolkip.events.GUICancel;
import me.Spolkip.events.GUIClickEvent;
import me.Spolkip.events.leave_join;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;


public final class classes extends JavaPlugin {

    public static NamespacedKey rpgItemKey;
    public static Map<String, custom_items> custom_items_map;



    @Override
    public void onEnable() {

        rpgItemKey = new NamespacedKey(this, "rpgItem");
        custom_items_map = new HashMap<>();

        Logger logging = Bukkit.getLogger();

        // Plugin startup logic
        logging.info("============================");
        logging.info("Choose_Class is now enabled");
        logging.info("============================");


        getCommand("class").setExecutor(new class_command());
        getCommand("race").setExecutor(new races_command());
        getServer().getPluginManager().registerEvents(new GUIClickEvent(), this);
        getServer().getPluginManager().registerEvents(new leave_join(), this);
        getServer().getPluginManager().registerEvents(new GUICancel(), this);
        registerListeners(new CustomItemHandler());
        registerItems(new FireOfInvisibility(), new Stun_Sword(), new Mutipleshot_bow());



    }
    private void registerItems(custom_items... Custom_Items) {
        Arrays.asList(Custom_Items).forEach(ci -> custom_items_map.put(ci.getId(), ci));
    }
    private void registerListeners(Listener... listeners) {
        Arrays.asList(listeners).forEach(l -> Bukkit.getPluginManager().registerEvents(l, this));
    }
}