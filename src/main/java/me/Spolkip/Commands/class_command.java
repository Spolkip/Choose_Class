package me.Spolkip.Commands;

import me.Spolkip.Inventories.pages;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;


import java.util.HashMap;
import java.util.UUID;

public class class_command implements CommandExecutor {

    private final HashMap<UUID , Long> cooldown;

    public class_command() {
        cooldown = new HashMap<>();
    }


    @Override
    public boolean onCommand(CommandSender s, Command command, String label, String[] args) {
        if (s instanceof Player) {

            Player p = (Player) s;
            Inventory g = Bukkit.createInventory(p, InventoryType.CHEST , Component.text("Choose your class"));



            if (!this.cooldown.containsKey(p.getUniqueId())) {
                this.cooldown.put(p.getUniqueId(), System.currentTimeMillis());
                g.setContents(pages.classpages()[0]);
                p.openInventory(g);

            }else {

                long timeElapsed = System.currentTimeMillis() - cooldown.get(p.getUniqueId());
                int time = 100000;

                //10 secs
                if (timeElapsed >= time || p.isOp()) {
                    this.cooldown.put(p.getUniqueId(), System.currentTimeMillis());
                    g.setContents(pages.classpages()[0]);
                    p.openInventory(g);




                }

                else{

                    long secs = ((time - timeElapsed)/(1000));
                    long mins = (secs / 60);
                    long seconds = (secs % 60);
                    p.sendMessage(Component.text("You will be able to change class again in " + (mins) + " minutes and " + (seconds) + " seconds."));
                }


            }

        }

        return true;
    }

}

