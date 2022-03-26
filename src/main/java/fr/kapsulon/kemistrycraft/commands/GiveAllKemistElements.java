package fr.kapsulon.kemistrycraft.commands;

import fr.kapsulon.kemistrycraft.KEmistryCraft;
import fr.kapsulon.kemistrycraft.items.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GiveAllKemistElements implements CommandExecutor {
    private final KEmistryCraft plugin;

    public GiveAllKemistElements(KEmistryCraft plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length != 1) { return false; }
        Player player = Bukkit.getServer().getPlayerExact(args[0]);
        if (player == null) { return false; }
        for (ItemManager.CustomItem item : ItemManager.CustomItem.values()) {
            plugin.giveOrDrop(player, item.item);
        }
        player.sendMessage(String.format("§c[kEmistryCraft]§r: Gave all kEmist items to %s", player.getDisplayName()));
        return true;
    }
}
