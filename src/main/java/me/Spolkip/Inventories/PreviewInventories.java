package me.Spolkip.Inventories;


import me.Spolkip.Items.Items;
import org.bukkit.inventory.ItemStack;
import static org.bukkit.Material.*;

public class PreviewInventories {


    public static ItemStack[][] WarriorItems() {
        Items i = new Items();


        ItemStack Warrior_sword = i.WarriorSword();
        ItemStack Shield = new ItemStack(SHIELD);
        ItemStack em = new ItemStack(AIR);
        ItemStack next = i.NextPage_Archer();
        ItemStack MainPage = i.MainPage();
        ItemStack BackPage = i.BackPage_Wizard();


        ItemStack[] warriors_items = {
                Warrior_sword, Shield, em, em, em, em, em, em, em,
                em, em, em, em, em, em, em, em, em,
                BackPage, em, em, em, MainPage, em, em, em, next,

        };

        ItemStack[][] w_i = {warriors_items};

        return w_i;
    }

    public static ItemStack[][] ArcherItems() {
        Items i = new Items();



        ItemStack Archer_bow = i.ArcherBow();
        ItemStack Leather_Boots = new ItemStack(LEATHER_BOOTS);
        ItemStack Leather_Leggings = new ItemStack(LEATHER_LEGGINGS);
        ItemStack Leather_Chestplate = new ItemStack(LEATHER_CHESTPLATE);
        ItemStack Leather_Helmet = new ItemStack(LEATHER_HELMET);
        ItemStack Arrow = new ItemStack(ARROW);
        ItemStack em = new ItemStack(AIR);
        ItemStack MainPage = i.MainPage();
        ItemStack next = i.NextPage_Rogue();
        ItemStack BackPage = i.BackPage_Warrior();


        ItemStack[] archer_items = {
                Archer_bow, Arrow, Leather_Boots, Leather_Leggings, Leather_Chestplate, Leather_Helmet, em, em, em,
                em, em, em, em, em, em, em, em, em,
                BackPage, em, em, em, MainPage, em, em, em, next,

        };

        ItemStack[][] a_i = {archer_items};

        return a_i;

    }

    public static ItemStack[][] RogueItems() {
        Items i = new Items();


        ItemStack Wooden_sword = new ItemStack(WOODEN_SWORD);
        ItemStack Leather_Boots = new ItemStack(LEATHER_BOOTS);
        ItemStack Leather_Leggings = new ItemStack(LEATHER_LEGGINGS);
        ItemStack Leather_Chestplate = new ItemStack(LEATHER_CHESTPLATE);
        ItemStack Leather_Helmet = new ItemStack(LEATHER_HELMET);
        ItemStack Ender_Pearl = new ItemStack(ENDER_PEARL, 8);
        ItemStack em = new ItemStack(AIR);
        ItemStack MainPage = i.MainPage();
        ItemStack next = i.NextPage_Wizard();
        ItemStack BackPage = i.BackPage_Archer();

        ItemStack[] rogue_items = {
                Leather_Boots, Leather_Leggings, Leather_Chestplate, Leather_Helmet, Wooden_sword, Ender_Pearl, em, em, em,
                em, em, em, em, em, em, em, em, em,
                BackPage, em, em, em, MainPage, em, em, em, next,
        };

        ItemStack[][] r_i = {rogue_items};

        return r_i;
    }
    public static ItemStack[][] WizardItems() {
        Items i = new Items();


        ItemStack EnchantingTable = new ItemStack(ENCHANTING_TABLE);
        ItemStack Leather_Boots = new ItemStack(LEATHER_BOOTS);
        ItemStack Leather_Leggings = new ItemStack(LEATHER_LEGGINGS);
        ItemStack Leather_Chestplate = new ItemStack(LEATHER_CHESTPLATE);
        ItemStack Leather_Helmet = new ItemStack(LEATHER_HELMET);
        ItemStack em = new ItemStack(AIR);
        ItemStack next = i.NextPage_Warrior();
        ItemStack MainPage = i.MainPage();
        ItemStack BackPage = i.BackPage_Rogue();

        ItemStack[] wizard_items = {
                Leather_Boots, Leather_Leggings, Leather_Chestplate, Leather_Helmet, EnchantingTable, em, em, em, em,
                em, em, em, em, em, em, em, em, em,
                BackPage, em, em, em, MainPage, em, em, em, next,
        };

        ItemStack[][] w_i = {wizard_items};

        return w_i;


    }

}
