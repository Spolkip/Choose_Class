package me.Spolkip.Custom_Items;

import me.Spolkip.classes;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.hanging.HangingBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Mutipleshot_bow extends custom_items {

    private final HashMap<UUID, Long> cooldown;



    public Mutipleshot_bow() {
        cooldown = new HashMap<>();
    }

    @Override
    public String get_Name() {
        return "Archer's bow";
    }

    @Override
    public Material getMaterial() {
        return Material.BOW;
    }

    @Override
    public Enchantment getEnchantment() {
        return Enchantment.BINDING_CURSE;
    }

    @Override
    public Enchantment getSecondEnchant() {
        return Enchantment.VANISHING_CURSE;
    }

    @Override
    public List<String> getLore() {
        return Arrays.asList("AA");
    }

    @Override
    public void handleLeftClick(Player p, ItemStack itemstack, PlayerInteractEvent event) {

        if (!this.cooldown.containsKey(p.getUniqueId())) {
            this.cooldown.put(p.getUniqueId(), System.currentTimeMillis());
            itemstack.addEnchantment(Enchantment.ARROW_INFINITE, 1);
            itemstack.addEnchantment(Enchantment.ARROW_FIRE , 1);
                Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(
                        Bukkit.getPluginManager().getPlugin("Choose_Class"),
                        () -> {
                            if (itemstack.containsEnchantment(Enchantment.ARROW_INFINITE)) {
                                System.out.println("ARROW_INFINITE enchantment removed successfully!");
                                itemstack.removeEnchantment(Enchantment.ARROW_INFINITE);
                                System.out.println("Enchantment removed successfully!");
                            } else {
                                System.out.println("Enchantment not found. Item may have changed.");
                            }

                        },
                        200  // Delay in server ticks
                );
            }

         else {
             
            long timeElapsed = System.currentTimeMillis() - cooldown.get(p.getUniqueId());
            int time = 600000;


            //10 secs
            if (timeElapsed >= time) {
                this.cooldown.put(p.getUniqueId(), System.currentTimeMillis());
                itemstack.addEnchantment(Enchantment.ARROW_INFINITE, 1);
                itemstack.addEnchantment(Enchantment.ARROW_FIRE , 1);
                Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(
                        Bukkit.getPluginManager().getPlugin("Choose_Class"),
                        () -> {
                            // Code to be executed after the delay
                            // Make sure to use Choose_Class.this.getServer() if needed

                            if (itemstack.containsEnchantment(Enchantment.ARROW_INFINITE)) {
                                itemstack.removeEnchantment(Enchantment.ARROW_INFINITE);
                                System.out.println("ARROW_INFINITE enchantment removed successfully!");
                            } else {
                                System.out.println("ARROW_INFINITE enchantment not found. Item may have changed.");
                            }

                            if (itemstack.containsEnchantment(Enchantment.ARROW_FIRE)) {
                                itemstack.removeEnchantment(Enchantment.ARROW_FIRE);
                                System.out.println("ARROW_FIRE enchantment removed successfully!");
                            } else {
                                System.out.println("ARROW_FIRE enchantment not found. Item may have changed.");
                            }
                        },
                        200  // Delay in server ticks
                );


                } else {
                    long secs = ((time - timeElapsed) / (1000));
                    long mins = (secs / 60);
                    long seconds = (secs % 60);
                    p.sendMessage(Component.text("You will be able to change class again in " + (mins) + " minutes and " + (seconds) + " seconds."));
                }
            }
         }



        @Override
        public void handleRightClick (Player p, ItemStack itemstack, PlayerInteractEvent event){

        }

    @Override
    public void CancelEvent(Player p, HangingBreakEvent e) {

    }

}


