package me.Spolkip;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;

public class pages {


    public static ItemStack[][] createpages() {

        ItemStack warrior = new ItemStack(Material.DIAMOND_SWORD);
        ItemStack archer = new ItemStack(Material.BOW);
        ItemStack magician = new ItemStack(Material.ENCHANTING_TABLE);
        ItemStack rogue = new ItemStack(Material.ENDER_PEARL);
        ItemStack em = new ItemStack(Material.AIR);


        ItemMeta warrior_meta = warrior.getItemMeta();
        warrior_meta.displayName(Component.text("Warrior", TextColor.color(255, 0, 0)));
        warrior_meta.getPersistentDataContainer().set(new NamespacedKey("discover", "class"), PersistentDataType.STRING, "war");
        ArrayList<Component> warrior_lore = new ArrayList<Component>();
        warrior_lore.add(Component.text("This is the warrior class", TextColor.color(0, 0, 0)));
        warrior_meta.lore(warrior_lore);
        warrior.setItemMeta(warrior_meta);


        ItemMeta archer_meta = archer.getItemMeta();
        archer_meta.displayName(Component.text("Archer", TextColor.color(0, 255, 100)));
        archer_meta.getPersistentDataContainer().set(new NamespacedKey("discover", "class"), PersistentDataType.STRING, "arch");
        ArrayList<Component> archer_lore = new ArrayList<Component>();
        archer_lore.add(Component.text("This is the archer class", TextColor.color(0, 0, 0)));
        archer_meta.lore(archer_lore);
        archer.setItemMeta(archer_meta);

        ItemMeta magician_meta = magician.getItemMeta();
        magician_meta.displayName(Component.text("Magician", TextColor.color(128, 0, 128)));
        magician_meta.getPersistentDataContainer().set(new NamespacedKey("discover", "class"), PersistentDataType.STRING, "mage");
        ArrayList<Component> magician_lore = new ArrayList<Component>();
        magician_lore.add(Component.text("This is a class for mages", TextColor.color(0, 0, 0)));
        magician_meta.lore(magician_lore);
        magician.setItemMeta(magician_meta);

        ItemMeta rogue_meta = rogue.getItemMeta();
        rogue_meta.displayName(Component.text("Rogue", TextColor.color(0, 0, 255)));
        rogue_meta.getPersistentDataContainer().set(new NamespacedKey("discover", "class"), PersistentDataType.STRING, "rogue");
        ArrayList<Component> rogue_lore = new ArrayList<Component>();
        rogue_lore.add(Component.text("This is a class for rogues", TextColor.color(50,50,50)));
        rogue_meta.lore(rogue_lore);
        rogue.setItemMeta(rogue_meta);


        ItemStack[] mip1 = {
                warrior,archer,magician,rogue,em,em,em,em,em,
                em,em,em,em,em,em,em,em,em,
                em,em,em,em,em,em,em,em,em,

        };

        ItemStack[][] mi = {mip1};

        return mi;



    }


}
