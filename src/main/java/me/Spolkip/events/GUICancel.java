package me.Spolkip.events;

import me.Spolkip.Inventories.PreviewInventories;
import me.Spolkip.Inventories.pages;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;


public class GUICancel implements Listener {

    @EventHandler
    public static void Cancel(InventoryClickEvent e) {

        String view = e.getView().getOriginalTitle();
        Player p = (Player) e.getWhoClicked();
        Inventory g = Bukkit.createInventory(p, InventoryType.CHEST , Component.text("Choose your class"));
        Inventory war_inv = Bukkit.createInventory(null, InventoryType.CHEST , Component.text("Warrior's inventory"));
        Inventory arch_inv = Bukkit.createInventory(null, InventoryType.CHEST , Component.text("Archer's inventory"));
        Inventory wiz_inv = Bukkit.createInventory(null, InventoryType.CHEST , Component.text("Wizard's inventory"));
        Inventory rog_inv = Bukkit.createInventory(null, InventoryType.CHEST , Component.text("Rogue's inventory"));


        if (view.equals("Warrior's inventory")) {
            e.setCancelled(true);
            switch (e.getCurrentItem().getType()) {
                case BARRIER:
                    g.setContents(pages.classpages()[0]);
                    p.openInventory(g);
                    break;
                case MAGENTA_GLAZED_TERRACOTTA:
                    arch_inv.setContents(PreviewInventories.ArcherItems()[0]);
                    p.openInventory(arch_inv);
                    break;
                case SPRUCE_SIGN:
                    wiz_inv.setContents(PreviewInventories.WizardItems()[0]);
                    p.openInventory(wiz_inv);
                    break;
            }

        }
        else if (view.equals("Choose a class")) {
            e.setCancelled(true);
        }
        else if (view.equals("Archer's inventory")) {
            e.setCancelled(true);
            switch (e.getCurrentItem().getType()) {
                case BARRIER:
                    g.setContents(pages.classpages()[0]);
                    p.openInventory(g);
                    break;
                case MAGENTA_GLAZED_TERRACOTTA:
                    rog_inv.setContents(PreviewInventories.RogueItems()[0]);
                    p.openInventory(rog_inv);
                    break;
                case SPRUCE_SIGN:
                    war_inv.setContents(PreviewInventories.WarriorItems()[0]);
                    p.openInventory(war_inv);
                    break;
            }
        }
        else if (view.equals("Rogue's inventory")) {
            e.setCancelled(true);
            switch (e.getCurrentItem().getType()) {
                case BARRIER:
                    g.setContents(pages.classpages()[0]);
                    p.openInventory(g);
                    break;
                case MAGENTA_GLAZED_TERRACOTTA:
                    wiz_inv.setContents(PreviewInventories.WizardItems()[0]);
                    p.openInventory(wiz_inv);
                    break;
                case SPRUCE_SIGN:
                    arch_inv.setContents(PreviewInventories.ArcherItems()[0]);
                    p.openInventory(arch_inv);
                    break;
            }

        }
        else if (view.equals("Wizard's inventory")) {
            e.setCancelled(true);
            switch (e.getCurrentItem().getType()) {
                case BARRIER:
                    g.setContents(pages.classpages()[0]);
                    p.openInventory(g);
                    break;
                case MAGENTA_GLAZED_TERRACOTTA:
                    war_inv.setContents(PreviewInventories.WarriorItems()[0]);
                    p.openInventory(war_inv);
                    break;
                case SPRUCE_SIGN:
                    rog_inv.setContents(PreviewInventories.RogueItems()[0]);
                    p.openInventory(rog_inv);
                    break;
            }
        }

    }
}
