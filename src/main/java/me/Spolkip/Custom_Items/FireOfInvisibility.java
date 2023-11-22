package me.Spolkip.Custom_Items;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class FireOfInvisibility extends custom_items {

    private final HashMap<UUID, Long> cooldown;

    public FireOfInvisibility() {cooldown = new HashMap<>();}

    @Override
    public String get_Name() {
        return "Fire of invisibility";
    }

    @Override
    public Material getMaterial() {
        return Material.FIRE_CHARGE;
    }

    @Override
    public Enchantment getEnchantment() {
        return Enchantment.VANISHING_CURSE;
    }

    @Override
    public Enchantment getSecondEnchant() {
        return Enchantment.BINDING_CURSE;
    }

    @Override
    public List<String> getLore() {
        return Arrays.asList("Press right click to be faster and invisible");
    }

    @Override
    public void handleLeftClick(Player player, ItemStack itemstack, PlayerInteractEvent event) {

    }

    @Override
    public void handleRightClick(Player p, ItemStack itemstack, PlayerInteractEvent event) {
        if (!this.cooldown.containsKey(p.getUniqueId())) {
            this.cooldown.put(p.getUniqueId(), System.currentTimeMillis());
            p.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.INVISIBILITY, 600, 1, true, false, true));
            p.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.SPEED, 600, 1, true, false, true));
        } else {

            long timeElapsed = System.currentTimeMillis() - cooldown.get(p.getUniqueId());
            int time = 600000;

            //10 secs
            if (timeElapsed >= time) {
                this.cooldown.put(p.getUniqueId(), System.currentTimeMillis());
                p.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.INVISIBILITY, 600, 1, true, false, true));
                p.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.SPEED, 600, 1, true, false, true));
            } else {
                long secs = ((time - timeElapsed) / (1000));
                long mins = (secs / 60);
                long seconds = (secs % 60);
                p.sendMessage(Component.text("You will be able to change class again in " + (mins) + " minutes and " + (seconds) + " seconds."));
            }
        }
    }
}