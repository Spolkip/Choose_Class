package me.Spolkip.Items;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import org.w3c.dom.Attr;

import java.util.ArrayList;

import static org.bukkit.Material.*;

public class Items {


    public ItemStack WarriorSword(){
        ItemStack Warrior_sword = new ItemStack(DIAMOND_SWORD);
        ItemMeta sword_meta = Warrior_sword.getItemMeta();
        sword_meta.displayName(Component.text("§4Warrior's §8sword"));
        sword_meta.addEnchant(Enchantment.KNOCKBACK, 2, true);
        ArrayList<Component> warrior_lore = new ArrayList<Component>();
        warrior_lore.add(Component.text("This will be the beginning!", TextColor.color(128,128,128)));
        sword_meta.lore(warrior_lore);
        Warrior_sword.setItemMeta(sword_meta);
        return Warrior_sword;
    }

    public ItemStack ArcherBow(){
        ItemStack Archer_bow = new ItemStack(BOW);
        ItemMeta archer_meta = Archer_bow.getItemMeta();
        archer_meta.displayName(Component.text("§2Archer's §8bow"));
        archer_meta.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
        ArrayList<Component> archer_lore = new ArrayList<Component>();
        archer_lore.add(Component.text("This will be the beginning!", TextColor.color(128,128,128)));
        archer_meta.lore(archer_lore);
        Archer_bow.setItemMeta(archer_meta);
        return Archer_bow;
    }

    public ItemStack Warrior(){

        ItemStack warrior = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta warrior_meta = warrior.getItemMeta();
        warrior_meta.displayName(Component.text("§4Warrior"));
        warrior_meta.getPersistentDataContainer().set(new NamespacedKey("discover", "class"), PersistentDataType.STRING, "war");
        ArrayList<Component> warrior_lore = new ArrayList<Component>();
        warrior_lore.add(Component.text("§8This is the §4warrior §8class"));
        warrior_meta.lore(warrior_lore);
        warrior.setItemMeta(warrior_meta);

        return warrior;
    }

    public ItemStack Archer(){
        ItemStack archer = new ItemStack(Material.BOW);
        ItemMeta archer_meta = archer.getItemMeta();
        archer_meta.displayName(Component.text("§2Archer"));
        archer_meta.getPersistentDataContainer().set(new NamespacedKey("discover", "class"), PersistentDataType.STRING, "arch");
        ArrayList<Component> archer_lore = new ArrayList<Component>();
        archer_lore.add(Component.text("§8This is the §2archer §8class"));
        archer_meta.lore(archer_lore);
        archer.setItemMeta(archer_meta);

        return archer;
    }

    public ItemStack Rogue(){
        ItemStack rogue = new ItemStack(Material.ENDER_PEARL);
        ItemMeta rogue_meta = rogue.getItemMeta();
        rogue_meta.displayName(Component.text("§5Rogue", TextColor.color(0, 0, 255)));
        rogue_meta.getPersistentDataContainer().set(new NamespacedKey("discover", "class"), PersistentDataType.STRING, "rogue");
        ArrayList<Component> rogue_lore = new ArrayList<Component>();
        rogue_lore.add(Component.text("This it is a class for §5rogues", TextColor.color(128,128,128)));
        rogue_meta.lore(rogue_lore);
        rogue.setItemMeta(rogue_meta);

        return rogue;
    }

    public ItemStack Magician(){
        ItemStack magician = new ItemStack(Material.ENCHANTING_TABLE);
        ItemMeta magician_meta = magician.getItemMeta();
        magician_meta.displayName(Component.text("§9Magician"));
        magician_meta.getPersistentDataContainer().set(new NamespacedKey("discover", "class"), PersistentDataType.STRING, "mage");
        ArrayList<Component> magician_lore = new ArrayList<Component>();
        magician_lore.add(Component.text("This is a class for §9mages", TextColor.color(128,128,128)));
        magician_meta.lore(magician_lore);
        magician.setItemMeta(magician_meta);

        return magician;
    }

    public ItemStack MainPage(){

        ItemStack mainpage = new ItemStack(Material.BARRIER);
        ItemMeta mainpage_meta = mainpage.getItemMeta();
        mainpage_meta.displayName(Component.text("Back", TextColor.color(255, 0, 0)));
        ArrayList<Component> mainpage_lore = new ArrayList<Component>();
        mainpage_lore.add(Component.text("Press it to go to the main page", TextColor.color(128,128,128)));
        mainpage_meta.lore(mainpage_lore);
        mainpage.setItemMeta(mainpage_meta);

        return mainpage;
    }
    public ItemStack Close(){

        ItemStack close = new ItemStack(Material.BARRIER);
        ItemMeta close_meta = close.getItemMeta();
        close_meta.displayName(Component.text("Exit", TextColor.color(255, 0, 0)));
        close_meta.getPersistentDataContainer().set(new NamespacedKey("discover", "class"), PersistentDataType.STRING, "mage");
        ArrayList<Component> close_lore = new ArrayList<Component>();
        close_lore.add(Component.text("Close this GUI", TextColor.color(128,128,128)));
        close_meta.lore(close_lore);
        close.setItemMeta(close_meta);

        return close;
    }

    public ItemStack NextPage_Archer() {

        ItemStack nextpage_archer = new ItemStack(Material.MAGENTA_GLAZED_TERRACOTTA);
        ItemMeta nextpage_archer_meta = nextpage_archer.getItemMeta();
        nextpage_archer_meta.displayName(Component.text("Next", TextColor.color(255, 0, 0)));
        ArrayList<Component> nextpage_archer_lore = new ArrayList<Component>();
        nextpage_archer_lore.add(Component.text("§8Press it to check §2Archer's §8Inventory"));
        nextpage_archer_meta.lore(nextpage_archer_lore);
        nextpage_archer.setItemMeta(nextpage_archer_meta);

        return nextpage_archer;
    }

    public ItemStack NextPage_Rogue() {

        ItemStack nextpage_rogue = new ItemStack(Material.MAGENTA_GLAZED_TERRACOTTA);
        ItemMeta nextpage_rogue_meta = nextpage_rogue.getItemMeta();
        nextpage_rogue_meta.displayName(Component.text("Next", TextColor.color(255, 0, 0)));
        ArrayList<Component> nextpage_rogue_lore = new ArrayList<Component>();
        nextpage_rogue_lore.add(Component.text("§8Press it to check §5Rogue's §8Inventory"));
        nextpage_rogue_meta.lore(nextpage_rogue_lore);
        nextpage_rogue.setItemMeta(nextpage_rogue_meta);

        return nextpage_rogue;
    }

    public ItemStack NextPage_Wizard() {

        ItemStack nextpage_wizard = new ItemStack(Material.MAGENTA_GLAZED_TERRACOTTA);
        ItemMeta nextpage_wizard_meta = nextpage_wizard.getItemMeta();
        nextpage_wizard_meta.displayName(Component.text("Next", TextColor.color(255, 0, 0)));
        ArrayList<Component> nextpage_rogue_lore = new ArrayList<Component>();
        nextpage_rogue_lore.add(Component.text("§8Press it to check §9Wizard's §8Inventory"));
        nextpage_wizard_meta.lore(nextpage_rogue_lore);
        nextpage_wizard.setItemMeta(nextpage_wizard_meta);

        return nextpage_wizard;
    }

    public ItemStack NextPage_Warrior() {

        ItemStack nextpage_warrior = new ItemStack(Material.MAGENTA_GLAZED_TERRACOTTA);
        ItemMeta nextpage_rogue_meta = nextpage_warrior.getItemMeta();
        nextpage_rogue_meta.displayName(Component.text("Next", TextColor.color(255, 0, 0)));
        ArrayList<Component> nextpage_rogue_lore = new ArrayList<Component>();
        nextpage_rogue_lore.add(Component.text("§8Press it to check §4Warrior's §8Inventory"));
        nextpage_rogue_meta.lore(nextpage_rogue_lore);
        nextpage_warrior.setItemMeta(nextpage_rogue_meta);

        return nextpage_warrior;
    }

    public ItemStack BackPage_Wizard() {

        ItemStack backpage_wizard = new ItemStack(Material.SPRUCE_SIGN);
        ItemMeta backpage_wizard_meta = backpage_wizard.getItemMeta();
        backpage_wizard_meta.displayName(Component.text("Previous", TextColor.color(255, 0, 0)));
        ArrayList<Component> nextpage_rogue_lore = new ArrayList<Component>();
        nextpage_rogue_lore.add(Component.text("§8Press it to check §9Wizard's §8Inventory"));
        backpage_wizard_meta.lore(nextpage_rogue_lore);
        backpage_wizard.setItemMeta(backpage_wizard_meta);

        return backpage_wizard;
    }

    public ItemStack BackPage_Rogue() {

        ItemStack backpage_rogue = new ItemStack(Material.SPRUCE_SIGN);
        ItemMeta backpage_rogue_meta = backpage_rogue.getItemMeta();
        backpage_rogue_meta.displayName(Component.text("Previous", TextColor.color(255, 0, 0)));
        ArrayList<Component> nextpage_rogue_lore = new ArrayList<Component>();
        nextpage_rogue_lore.add(Component.text("§8Press it to check §5Rogue's §8Inventory"));
        backpage_rogue_meta.lore(nextpage_rogue_lore);
        backpage_rogue.setItemMeta(backpage_rogue_meta);

        return backpage_rogue;
    }
    public ItemStack BackPage_Archer() {

        ItemStack backpage_archer = new ItemStack(Material.SPRUCE_SIGN);
        ItemMeta backpage_archer_meta = backpage_archer.getItemMeta();
        backpage_archer_meta.displayName(Component.text("Previous", TextColor.color(255, 0, 0)));
        ArrayList<Component> backpage_archer_lore = new ArrayList<Component>();
        backpage_archer_lore.add(Component.text("§8Press it to check §2Archer's §8Inventory"));
        backpage_archer_meta.lore(backpage_archer_lore);
        backpage_archer.setItemMeta(backpage_archer_meta);

        return backpage_archer;
    }
    public ItemStack BackPage_Warrior() {

        ItemStack backpage_warrior = new ItemStack(Material.SPRUCE_SIGN);
        ItemMeta backpage_rogue_meta = backpage_warrior.getItemMeta();
        backpage_rogue_meta.displayName(Component.text("Previous", TextColor.color(255, 0, 0)));
        ArrayList<Component> backpage_rogue_lore = new ArrayList<Component>();
        backpage_rogue_lore.add(Component.text("§8Press it to check §4Warrior's §8Inventory"));
        backpage_rogue_meta.lore(backpage_rogue_lore);
        backpage_warrior.setItemMeta(backpage_rogue_meta);

        return backpage_warrior;
    }
    public ItemStack EmptyBlock(){
        ItemStack emptyblock = new ItemStack(ORANGE_STAINED_GLASS_PANE);
        ItemMeta emptyblock_meta = emptyblock.getItemMeta();
       emptyblock_meta.displayName(Component.text("Just a glass"));
        ArrayList<Component> emptyblock_lore = new ArrayList<Component>();
        emptyblock_meta.getPersistentDataContainer().set(new NamespacedKey("discover", "class"), PersistentDataType.STRING, "empty");
        emptyblock_meta.lore(emptyblock_lore);
        emptyblock.setItemMeta(emptyblock_meta);

        return emptyblock;

    }

}


