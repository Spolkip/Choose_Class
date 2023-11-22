package me.Spolkip.Custom_Items;


import me.Spolkip.Custom_Items.Utils.Common;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.List;

import static me.Spolkip.classes.rpgItemKey;

public abstract class custom_items {

    public abstract String get_Name();

    public abstract Material getMaterial();

    public abstract Enchantment getEnchantment();

    public abstract Enchantment getSecondEnchant();

    public abstract List<String> getLore();

    public abstract void handleLeftClick(Player player, ItemStack itemstack, PlayerInteractEvent event);

    public abstract void handleRightClick(Player player, ItemStack itemstack, PlayerInteractEvent event);

    public String getId() {
        return getClass().getSimpleName();
    }


    public ItemStack getItem() {


        ItemStack itemstack = new ItemStack(getMaterial());
        ItemMeta itemmeta = itemstack.getItemMeta();
        PersistentDataContainer container = itemmeta.getPersistentDataContainer();
        itemmeta.setDisplayName(Common.colorize(get_Name()));
        itemmeta.addEnchant(getEnchantment(), 1, true);
        itemmeta.addEnchant(getSecondEnchant(), 1, true);
        List<String> lore = new ArrayList<String>();
        getLore().forEach(l -> lore.add(Common.colorize(l)));


        container.set(rpgItemKey, PersistentDataType.STRING, getId());
        itemstack.setItemMeta(itemmeta);
        return itemstack;
    }
}

