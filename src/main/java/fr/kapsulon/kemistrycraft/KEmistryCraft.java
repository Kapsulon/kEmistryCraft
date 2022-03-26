package fr.kapsulon.kemistrycraft;

import fr.kapsulon.kemistrycraft.commands.GiveAllKemistElements;
import fr.kapsulon.kemistrycraft.commands.GiveKemistElement;
import fr.kapsulon.kemistrycraft.events.OnBlockPlace;
import fr.kapsulon.kemistrycraft.items.ItemManager;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public final class KEmistryCraft extends JavaPlugin {

    public void giveOrDrop(Player player, ItemStack item) {
        HashMap<Integer, ItemStack> leftOver = new HashMap<Integer, ItemStack>();
        leftOver.putAll(player.getInventory().addItem(item));
        if (!leftOver.isEmpty()) {
            for (ItemStack i : leftOver.values()) {
                player.getWorld().dropItemNaturally(player.getLocation(), i);
            }
        }
    }

    @Override
    public void onEnable() {
        ItemManager.init();
        getCommand("givekemistelement").setExecutor(new GiveKemistElement(this));
        getCommand("givekemistelement").setTabCompleter(new GiveKemistElement(this));
        getCommand("giveallkemistelements").setExecutor(new GiveAllKemistElements(this));
        getServer().getPluginManager().registerEvents(new OnBlockPlace(this), this);
    }
}
