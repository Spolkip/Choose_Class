package me.Spolkip.Inventories;

import me.Spolkip.Items.Items;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;


public class pages {


    public static ItemStack[][] classpages() {
        Items i = new Items();

        ItemStack warrior = i.Warrior();
        ItemStack archer = i.Archer();
        ItemStack magician = i.Magician();
        ItemStack rogue = i.Rogue();
        ItemStack close = i.Close();
        ItemStack em = i.EmptyBlock();



        ItemStack[] mip1 = {
                em,em,em,em,em,em,em,em,em,
                em,warrior,em,archer,em,rogue,em,magician,em,
                em,em,em,em,close,em,em,em,em,

        };

        ItemStack[][] mi = {mip1};

        return mi;



    }
    public static ItemStack[][] racepages() {




        ItemStack back = new ItemStack(Material.LIME_STAINED_GLASS); ItemMeta backm = back.getItemMeta(); backm.displayName(Component.text("Back")); backm.getPersistentDataContainer().set(new NamespacedKey("discover", "race"), PersistentDataType.STRING, "back"); back.setItemMeta(backm);
        ItemStack forwards = new ItemStack(Material.LIME_STAINED_GLASS); ItemMeta forwardsm = forwards.getItemMeta(); forwardsm.displayName(Component.text("Forwards")); forwardsm.getPersistentDataContainer().set(new NamespacedKey("discover", "race"), PersistentDataType.STRING, "forwards"); forwards.setItemMeta(forwardsm);
        ItemStack em = new ItemStack(Material.AIR); //ItemMeta emm = em.getItemMeta(); emm.displayName(Component.text("")); emm.getPersistentDataContainer().set(new NamespacedKey("discover", "race"), PersistentDataType.STRING, ""); em.setItemMeta(emm);

        ItemStack exampleone = new ItemStack(Material.RED_WOOL, 1); ItemMeta exampleonem = exampleone.getItemMeta(); exampleonem.displayName(Component.text("Race 1")); exampleonem.getPersistentDataContainer().set(new NamespacedKey("discover", "race"), PersistentDataType.STRING, "examplerace1"); exampleone.setItemMeta(exampleonem);
        ItemStack exampletwo = new ItemStack(Material.BLUE_WOOL, 1); ItemMeta exampletwom = exampletwo.getItemMeta(); exampletwom.displayName(Component.text("Race 2")); exampletwom.getPersistentDataContainer().set(new NamespacedKey("discover", "race"), PersistentDataType.STRING, "examplerace2"); exampletwo.setItemMeta(exampletwom);
        ItemStack goblin = new ItemStack(Material.GREEN_GLAZED_TERRACOTTA); ItemMeta goblinm = goblin.getItemMeta(); goblinm.displayName(Component.text("Goblin")); goblinm.getPersistentDataContainer().set(new NamespacedKey("discover", "race"), PersistentDataType.STRING, "goblin"); goblin.setItemMeta(goblinm);
        ItemStack dwarf = new ItemStack(Material.COAL_ORE); ItemMeta dwarfm = dwarf.getItemMeta(); dwarfm.displayName(Component.text("Dwarf")); dwarfm.getPersistentDataContainer().set(new NamespacedKey("discover", "race"), PersistentDataType.STRING, "dwarf"); dwarf.setItemMeta(dwarfm);
        ItemStack vampire = new ItemStack(Material.REDSTONE); ItemMeta vampirem = vampire.getItemMeta(); vampirem.displayName(Component.text("Vampire")); vampirem.getPersistentDataContainer().set(new NamespacedKey("discover", "race"), PersistentDataType.STRING, "vampire"); vampire.setItemMeta(vampirem);
        ItemStack elf = new ItemStack(Material.JUNGLE_LEAVES); ItemMeta elfm = elf.getItemMeta(); elfm.displayName(Component.text("Elf")); elfm.getPersistentDataContainer().set(new NamespacedKey("discover", "race"), PersistentDataType.STRING, "elf"); elf.setItemMeta(elfm);

        ItemStack[] mip1 = {
                em,em,em,em,em,em,em,em,em,
                goblin,dwarf,vampire,elf,em,em,em,em,em,
                em,em,em,em,em,em,em,em,em,
        };

        ItemStack[][] mi = {mip1};


        return mi;
    }


}

