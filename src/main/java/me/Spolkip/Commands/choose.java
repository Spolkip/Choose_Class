package me.Spolkip.Commands;

import me.Spolkip.pages;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class choose implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender s, Command command, String label, String[] args) {

        if (s instanceof Player) {

            Player p = (Player) s;
            Inventory g = Bukkit.createInventory(p, InventoryType.CHEST , Component.text("Choose your class", TextColor.color(255, 255, 0)));

            g.setContents(pages.createpages()[0]);
            p.openInventory(g);

        }

        return true;
    }
}

