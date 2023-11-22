package me.Spolkip.events;




import me.Spolkip.Items.Items;
import me.Spolkip.Inventories.PreviewInventories;
import me.Spolkip.classes;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;


import static org.bukkit.Bukkit.getPlayer;
import static org.bukkit.Material.*;



public class GUIClickEvent implements Listener {



    @EventHandler
    public void onGUIClick(InventoryClickEvent e) {

        String view = e.getView().getOriginalTitle();
        Player p = (Player) e.getWhoClicked();
        PersistentDataContainer item = e.getCurrentItem().getItemMeta().getPersistentDataContainer();
        Inventory war_inv = Bukkit.createInventory(null, InventoryType.CHEST, Component.text("Warrior's inventory"));
        Inventory arch_inv = Bukkit.createInventory(null, InventoryType.CHEST, Component.text("Archer's inventory"));
        Inventory wiz_inv = Bukkit.createInventory(null, InventoryType.CHEST, Component.text("Wizard's inventory"));
        Inventory rog_inv = Bukkit.createInventory(null, InventoryType.CHEST, Component.text("Rogue's inventory"));
        ItemStack fireofinvisibility = classes.custom_items_map.get("FireOfInvisibility").getItem();
        ItemStack regensword = classes.custom_items_map.get("Stun_Sword").getItem();
        ItemStack Multple_bow = classes.custom_items_map.get("Mutipleshot_bow").getItem();




        if (view.equals("Choose your class")) {
            e.setCancelled(true);
            p.getPersistentDataContainer().set(new NamespacedKey("discover", "class"), PersistentDataType.STRING, item.get(new NamespacedKey("discover", "class"), PersistentDataType.STRING));
            Items i = new Items();

            switch (e.getCurrentItem().getType()) {
                case DIAMOND_SWORD:
                    if (e.getClick() == ClickType.LEFT) {
                            p.closeInventory();
                            ItemStack[] items = {new ItemStack(regensword)};
                            p.getInventory().setContents(items);
                            p.sendMessage(Component.text("You are now a §4Warrior", TextColor.color(255, 255, 0)));
                    }else if (e.getClick() == ClickType.RIGHT) {
                        war_inv.setContents(PreviewInventories.WarriorItems()[0]);
                        p.openInventory(war_inv);
                    } else {
                        e.setCancelled(true);
                    }
                    break;
                case BOW:
                    if (e.getClick() == ClickType.LEFT) {
                        p.closeInventory();
                        ItemStack[] items_two = {new ItemStack(Multple_bow)};
                        p.getInventory().setContents(items_two);
                        p.sendMessage(Component.text("You are now an §2Archer", TextColor.color(255, 255, 0)));
                    } else if (e.getClick() == ClickType.RIGHT) {
                        arch_inv.setContents(PreviewInventories.ArcherItems()[0]);
                        p.openInventory(arch_inv);
                    } else {
                        e.setCancelled(true);
                    }
                    break;
                case ENDER_PEARL:
                    if (e.getClick() == ClickType.LEFT) {
                        p.closeInventory();
                        ItemStack[] items_three = {new ItemStack(fireofinvisibility)};
                        p.getInventory().setContents(items_three);
                        p.sendMessage(Component.text("You are now a §5Rogue", TextColor.color(255, 255, 0)));
                    } else if (e.getClick() == ClickType.RIGHT) {
                        rog_inv.setContents(PreviewInventories.RogueItems()[0]);
                        p.openInventory(rog_inv);
                    } else {
                        e.setCancelled(true);
                    }
                    break;
                case ENCHANTING_TABLE:
                    if (e.getClick() == ClickType.LEFT) {
                        p.closeInventory();
                        ItemStack[] items_four = {new ItemStack(LEATHER_BOOTS), new ItemStack(LEATHER_LEGGINGS), new ItemStack(LEATHER_CHESTPLATE), new ItemStack(LEATHER_HELMET), new ItemStack(ENCHANTING_TABLE)};
                        p.getInventory().setContents(items_four);
                        p.sendMessage(Component.text("You are now a §9Wizard", TextColor.color(255, 255, 0)));
                    } else if (e.getClick() == ClickType.RIGHT) {
                        wiz_inv.setContents(PreviewInventories.WizardItems()[0]);
                        p.openInventory(wiz_inv);
                    } else {
                        e.setCancelled(true);
                    }
                    break;
                case BARRIER:
                    if (e.getClick() == ClickType.LEFT) {
                        p.closeInventory();
                        p.sendMessage(Component.text("You didnt choose any class", TextColor.color(255, 255, 0)));
                        p.closeInventory();
                    } else {
                        e.setCancelled(true);
                    }
                    break;
                case ORANGE_STAINED_GLASS_PANE:
                    if (e.getClick() == ClickType.DOUBLE_CLICK) {
                        p.sendMessage(Component.text("Stop trying to break the glass", TextColor.color(255, 255, 0 )));
                    }
                    else {
                        e.setCancelled(true);
                    }
            }

        }

        }
    }