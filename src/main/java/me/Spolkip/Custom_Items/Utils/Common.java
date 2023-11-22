package me.Spolkip.Custom_Items.Utils;

import org.bukkit.ChatColor;

public class Common {

    private Common() {

    }

    public static String colorize(String string){
    return ChatColor.translateAlternateColorCodes('&', string);
    }
}
