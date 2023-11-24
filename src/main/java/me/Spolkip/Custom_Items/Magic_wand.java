package me.Spolkip.Custom_Items;

import me.Spolkip.classes;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.event.hanging.HangingBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Magic_wand extends custom_items{

    private final HashMap<UUID, Long> cooldown;


    public Magic_wand() {
        cooldown = new HashMap<>();
    }



    @Override
    public String get_Name() {
        return "magic_wand";
    }

    @Override
    public Material getMaterial() {
        return Material.STICK;
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
        return Arrays.asList("AA");
    }

    @Override
    public void handleLeftClick(Player p, ItemStack itemstack, PlayerInteractEvent event) {
        if (!this.cooldown.containsKey(p.getUniqueId())) {
            this.cooldown.put(p.getUniqueId(), System.currentTimeMillis());
            Fireball fireball = p.launchProjectile(Fireball.class);
            Vector direction = p.getVelocity();
            fireball.setVelocity(direction);
        } else {

            long timeElapsed = System.currentTimeMillis() - cooldown.get(p.getUniqueId());
            int time = 5000;

            //10 secs
            if (timeElapsed >= time) {
                this.cooldown.put(p.getUniqueId(), System.currentTimeMillis());
                SmallFireball fireball = p.launchProjectile(SmallFireball.class);
                Vector direction = p.getVelocity().multiply(10);
                fireball.setVelocity(direction);
            } else {
                long secs = ((time - timeElapsed) / (1000));
                long mins = (secs / 60);
                long seconds = (secs % 60);
                p.sendMessage(Component.text("You will be able to change class again in " + (mins) + " minutes and " + (seconds) + " seconds."));
            }
        }
    }

    @Override
    public void handleRightClick(Player p, ItemStack itemstack, PlayerInteractEvent event) {


            LlamaSpit d_f = p.launchProjectile(LlamaSpit.class);
            Vector direction = p.getLocation().getDirection().multiply(0.5);
            d_f.setVelocity(direction);

    }

    @Override
    public void CancelEvent(Player p, HangingBreakEvent e) {

    }


}
