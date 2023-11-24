package me.Spolkip.Custom_Items;

import me.Spolkip.classes;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.hanging.HangingBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;

import static me.Spolkip.classes.rpgItemKey;

public class CustomItemHandler implements Listener {

    @EventHandler (priority = EventPriority.MONITOR)
    public void onPlayerInteract(PlayerInteractEvent event) {
    Player p = event.getPlayer();
    ItemStack heldItem = p.getInventory().getItemInMainHand();

    if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK) || event.getAction().equals(Action.RIGHT_CLICK_AIR) && isCustomItem(heldItem)) {
        custom_items customItem = classes.custom_items_map.get(getCustomItemId(heldItem));;
        customItem.handleRightClick(p, heldItem, event);
    }
    if (event.getAction().equals(Action.LEFT_CLICK_BLOCK) || event.getAction().equals(Action.LEFT_CLICK_AIR) && isCustomItem(heldItem)) {
        custom_items customItem = classes.custom_items_map.get(getCustomItemId(heldItem));;
        customItem.handleLeftClick(p, heldItem, event);
    }
}
    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void CancelEvent(HangingBreakEvent event) {
        if (event.getCause() == HangingBreakEvent.RemoveCause.EXPLOSION) {
            event.setCancelled(true);
        }
    }


    private  boolean isCustomItem(ItemStack itemstack){
        return (itemstack.hasItemMeta() && itemstack.getItemMeta().getPersistentDataContainer().has(rpgItemKey));
    }

    private String getCustomItemId(ItemStack itemstack) {
        return itemstack.getItemMeta().getPersistentDataContainer().get(rpgItemKey, PersistentDataType.STRING);
    }

}
