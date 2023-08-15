package me.ShermansWorld.AlathraWeapons.commands;

import com.github.milkdrinkers.colorparser.ColorParser;
import dev.jorel.commandapi.CommandAPIBukkit;
import dev.jorel.commandapi.CommandAPICommand;
import dev.jorel.commandapi.arguments.ArgumentSuggestions;
import dev.jorel.commandapi.arguments.BooleanArgument;
import dev.jorel.commandapi.arguments.CommandArgument;
import me.ShermansWorld.AlathraWeapons.CustomWeapon;
import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.Util;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class WeaponsCommand {
    public WeaponsCommand() {
        new CommandAPICommand("weapons")
            .withFullDescription("Used to give weapons.")
            .withShortDescription("Used to give weapons.")
            .withPermission("AlathraWeapons.admin")
            .withSubcommands(this.give())
            .executesPlayer((p, args) -> {
                for (CustomWeapon customWeapon : Main.weaponsMasterList) {
                    p.getInventory().addItem(customWeapon.getItemStack());
                }
            })
            .register();
    }

    private CommandAPICommand give() {
        return new CommandAPICommand("give")
            .withFullDescription("Used to give weapons.")
            .withShortDescription("Used to give weapons.")
            .withPermission("AlathraWeapons.admin")
            .withArguments(
                new CommandArgument("weapon")
                    .replaceSuggestions(ArgumentSuggestions.strings(Main.weaponsMasterList.stream().map(CustomWeapon::getId).sorted().toList())),
                new BooleanArgument("unbreakable")
                    .setOptional(true)
            )
            .executesPlayer((p, args) -> {
                if (args.get("weapons") == null)
                    throw CommandAPIBukkit.failWithAdventureComponent(ColorParser.of("").build());

                final String weaponName = ((String) args.get("weapon")).replaceAll("_", " ");
                final boolean unbreakable = (boolean) args.getOptional("unbreakable").orElse(false);

                for (CustomWeapon customWeapon : Main.weaponsMasterList) {
                    if (customWeapon.getDisplayName().equalsIgnoreCase(weaponName)) {
                        final ItemStack item = customWeapon.getItemStack().asOne();
                        final ItemMeta meta = item.getItemMeta();
                        meta.setUnbreakable(unbreakable);
                        item.setItemMeta(meta);

                        p.getInventory().addItem(item);
                        return;
                    }
                }

                p.sendMessage(ColorParser.of(Util.ChatPrefix() + "CustomWeapon not found!").build());
            });
    }
}