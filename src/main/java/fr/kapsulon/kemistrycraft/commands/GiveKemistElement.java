package fr.kapsulon.kemistrycraft.commands;

import fr.kapsulon.kemistrycraft.KEmistryCraft;
import fr.kapsulon.kemistrycraft.items.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GiveKemistElement implements CommandExecutor, TabCompleter {
    private final KEmistryCraft plugin;

    public GiveKemistElement(KEmistryCraft plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(args.length >= 2 && args.length <= 3)) { return false; }
        if (Objects.equals(args[0], "@a")) {
            ItemStack item = ItemManager.CustomItem.getCustomItemByCode(args[1]);
            if (item == null) { return false; }
            if (args.length == 3) { try {item.setAmount(Integer.parseInt(args[2]));} catch (NumberFormatException n) {}}
            for (Player player : plugin.getServer().getOnlinePlayers()) {
                plugin.giveOrDrop(player, item);
                player.sendMessage(String.format("§c[kEmistryCraft]§r: %s gave you %s§r [%s§r]", sender.getName(), item.getAmount(), item.getItemMeta().getDisplayName()));
                sender.sendMessage(String.format("§c[kEmistryCraft]§r: You gave %s§r [%s§r] to %s", item.getAmount(), item.getItemMeta().getDisplayName(), player.getDisplayName()));
            }
            item.setAmount(1);
            return true;
        } else {
            Player player = Bukkit.getServer().getPlayerExact(args[0]);
            if (player == null) { return false; }
            ItemStack item = ItemManager.CustomItem.getCustomItemByCode(args[1]);
            if (item == null) { return false; }
            if (args.length == 3) { try {item.setAmount(Integer.parseInt(args[2]));} catch (NumberFormatException n) {}}
            plugin.giveOrDrop(player, item);
            player.sendMessage(String.format("§c[kEmistryCraft]§r: Gave %s§r [%s§r] to %s", item.getAmount(), item.getItemMeta().getDisplayName(), player.getDisplayName()));
            item.setAmount(1);
            return true;
        }
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 1) {
            List<String> playerNames = new ArrayList<>();
            Player[] players = new Player[Bukkit.getServer().getOnlinePlayers().size()];
            plugin.getServer().getOnlinePlayers().toArray(players);
            for (Player player : players) {
                if (player.getName().startsWith(args[0])) {
                    playerNames.add(player.getName());
                }
            }
            if ("@a".startsWith(args[0])) { playerNames.add("@a"); }
            return playerNames;
        } else if (args.length == 2) {
            List<String> availableItems = new ArrayList<>();
            for (ItemManager.CustomItem item : ItemManager.CustomItem.values()) {
                if (item.code.startsWith(args[1])) {
                    availableItems.add(item.code);
                }
            }
            return availableItems;
        } else {
            return new ArrayList<>();
        }
    }
}
