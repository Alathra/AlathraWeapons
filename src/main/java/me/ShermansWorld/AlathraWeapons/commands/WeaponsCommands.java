package me.ShermansWorld.AlathraWeapons.commands;

import com.github.milkdrinkers.colorparser.ColorParser;
import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.Util;
import net.kyori.adventure.text.Component;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class WeaponsCommands implements CommandExecutor {
    public WeaponsCommands(Main plugin) {
        PluginCommand pluginCommand = plugin.getCommand("weapons");
        if (pluginCommand != null)
            pluginCommand.setExecutor(this);
    }

    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        Player p = (Player) sender;
        if (!p.hasPermission("AlathraWeapons.admin")) {
            p.sendMessage(new ColorParser(Util.ChatPrefix() + "&cYou do not have permission to do this").build());
            return false;
        }
        if (args.length == 1 && args[0].equalsIgnoreCase("unbreakable")) {
            for (int i = 0; i < Main.weaponsMasterList.size(); i++) {
                ItemStack item = new ItemStack(Main.weaponsMasterList.get(i).getItemStack());
                ItemMeta meta = item.getItemMeta();
                @Nullable List<Component> lore = meta.lore();

                if (lore == null) {
                    p.sendMessage(new ColorParser(Util.ChatPrefix() + "&cError reading lore").build());
                    return false;
                }

                lore.clear();
                meta.lore(lore);
                meta.setUnbreakable(true);
                item.setItemMeta(meta);
                p.getInventory().addItem(item);
            }
            return true;
        }
        if (args.length == 0) {
            for (int i = 0; i < Main.weaponsMasterList.size(); i++) {
                p.getInventory().addItem(Main.weaponsMasterList.get(i).getItemStack());
            }
            return true;
        }
        if (args.length == 1) {
            String weaponName = args[0];
            weaponName = weaponName.replaceAll("_", " ");
            for (int i = 0; i < Main.weaponsMasterList.size(); i++) {
                if (Main.weaponsMasterList.get(i).getDisplayName().equalsIgnoreCase(weaponName)) {
                    p.getInventory().addItem(Main.weaponsMasterList.get(i).getItemStack());
                    return true;
                }
            }
            p.sendMessage(new ColorParser(Util.ChatPrefix() + "CustomWeapon not found!").build());
            return false;
        }
        return true;
    }
}
