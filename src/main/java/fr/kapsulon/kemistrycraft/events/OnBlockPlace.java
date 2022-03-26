package fr.kapsulon.kemistrycraft.events;

import fr.kapsulon.kemistrycraft.KEmistryCraft;
import fr.kapsulon.kemistrycraft.items.ItemManager;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

public class OnBlockPlace implements Listener {
    private final KEmistryCraft plugin;

    public OnBlockPlace(KEmistryCraft plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        Player player = event.getPlayer();
        Block block = event.getBlock();
        ItemStack item = event.getItemInHand();
        for (ItemManager.CustomItem customItem : ItemManager.CustomItem.values()) {
            if (item.isSimilar(customItem.item)) {
                event.setCancelled(true);
                player.playSound(player, Sound.ENTITY_VILLAGER_HURT, 3f, 10f);
            }
        }
    }
}
