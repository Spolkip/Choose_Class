package me.Spolkip.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;


public class reload_command implements CommandExecutor {

    final Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin("Choose_Class");
    final FileConfiguration config = plugin.getConfig();

    @Override
    public boolean onCommand(CommandSender s, Command command, String label, String[] args) {
        plugin.reloadConfig();





        return true;
    }
}

