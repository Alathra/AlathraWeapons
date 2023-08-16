package me.ShermansWorld.AlathraWeapons.commands;

import com.github.milkdrinkers.colorparser.ColorParser;
import dev.jorel.commandapi.CommandAPIBukkit;
import dev.jorel.commandapi.CommandAPICommand;
import dev.jorel.commandapi.arguments.ArgumentSuggestions;
import dev.jorel.commandapi.arguments.BooleanArgument;
import dev.jorel.commandapi.arguments.StringArgument;
import me.ShermansWorld.AlathraWeapons.CustomItem;
import me.ShermansWorld.AlathraWeapons.Main;
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
                for (CustomItem customItem : Main.registeredItems) {
                    p.getInventory().addItem(customItem.getItemStack());
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
                new StringArgument("weapon")
                    .replaceSuggestions(ArgumentSuggestions.strings(Main.registeredItems.stream().map(CustomItem::getId).sorted().toList())),
                new BooleanArgument("unbreakable")
                    .setOptional(true)
            )
            .executesPlayer((p, args) -> {
                if (args.get("weapon") == null)
                    throw CommandAPIBukkit.failWithAdventureComponent(ColorParser.of("<red>You must specify a weapon id!").build());

                final String weaponName = ((String) args.get("weapon")).replaceAll(" ", "_").toLowerCase();
                final boolean unbreakable = (boolean) args.getOptional("unbreakable").orElse(false);

                for (CustomItem customItem : Main.registeredItems) {
                    if (customItem.getId().equalsIgnoreCase(weaponName)) {
                        final ItemStack item = customItem.getItemStack().asOne();
                        final ItemMeta meta = item.getItemMeta();
                        meta.setUnbreakable(unbreakable);
                        item.setItemMeta(meta);

                        p.getInventory().addItem(item);
                        return;
                    }
                }

                throw CommandAPIBukkit.failWithAdventureComponent(ColorParser.of("<red>Weapon not found!").build());
            });
    }
}