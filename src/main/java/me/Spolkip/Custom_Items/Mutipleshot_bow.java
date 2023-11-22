package me.Spolkip.Custom_Items;

import me.Spolkip.classes;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scheduler.BukkitTask;

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
            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask((Plugin) this, new Runnable() {
                @Override
                public void run() {
                    itemstack.removeEnchantment(Enchantment.ARROW_INFINITE);
                }
            }, 100);
        }

         else {

            long timeElapsed = System.currentTimeMillis() - cooldown.get(p.getUniqueId());
            int time = 600000;

            //10 secs
            if (timeElapsed >= time) {
                this.cooldown.put(p.getUniqueId(), System.currentTimeMillis());
                itemstack.addEnchantment(Enchantment.ARROW_INFINITE, 1);

                    Bukkit.getServer().getScheduler().scheduleSyncDelayedTask((Plugin) this, new Runnable() {
                        @Override
                        public void run() {
                            itemstack.removeEnchantment(Enchantment.ARROW_INFINITE);
                        }
                    }, 100);

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
    }


