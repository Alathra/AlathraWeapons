package me.ShermansWorld.AlathraWeapons;

import me.ShermansWorld.AlathraWeapons.commands.CommandHandler;
import me.ShermansWorld.AlathraWeapons.exceptions.InvalidMaterialException;
import me.ShermansWorld.AlathraWeapons.items.CustomItemGroup;
import me.ShermansWorld.AlathraWeapons.items.weapons.melee.*;
import me.ShermansWorld.AlathraWeapons.items.weapons.ranged.Faebow;
import me.ShermansWorld.AlathraWeapons.items.weapons.ranged.Longbow;
import me.ShermansWorld.AlathraWeapons.listener.ListenerHandler;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Main extends JavaPlugin {
    public static Main instance;
    private CommandHandler commandHandler;
    private ListenerHandler listenerHandler;

    public static List<CustomItem> registeredItems = new ArrayList<>(); // A list of all registered items
    public static List<CustomItemGroup> unregisteredItemsList = List.of( // A list of the item groups to be registered
        // Weapons Melee
        new AntlerStaff(),
        new Battleaxe(),
        new BattleHoe(),
        new Bident(),
        new BlackfeldSword(),
        new CombatAxe(),
        new Dagger(),
        new DaneAxe(),
        new Dreistkleze(),
        new FlangedMace(),
        new GiantSword(),
        new Gladius(),
        new Greatsword(),
        new Halberd(),
        new Hatchet(),
        new Hook(),
        new Katana(),
        new Kunai(),
        new Longsword(),
        new Mace(),
        new MorningStar(),
        new Naginata(),
        new Pike(),
        new QuarterStaff(),
        new Rapier(),
        new Sabre(),
        new Scimitar(),
        new Scythe(),
        new Shortsword(),
        new Spear(),
        new TwinBlade(),
        new WarHammer(),
        new Zweihander(),
        // Weapons ranged
        new Faebow(),
        new Longbow()
    );

    public static Main getInstance() {
        return instance;
    }

    @Nullable
    public CustomItem getCustomItemFromItemStack(@NotNull ItemStack itemStack) {
        for (CustomItem customItem : registeredItems)
            if (customItem.equals(itemStack))
                return customItem;

        return null;
    }

    public void registerCustomItems() {
        try {
            for (CustomItemGroup customItemGroup : unregisteredItemsList) {
                customItemGroup.register();
            }
        } catch (InvalidMaterialException e) {
            getInstance().getLogger().warning(e.getMessage());
            getInstance().getServer().getPluginManager().disablePlugin(getInstance());
        }
    }

    public static void registerItem(@NotNull CustomItem customItem) {
        registeredItems.add(customItem);
    }

    public static int nameSpaceKey = -1; // First item will get namespace key 0
    public static String getIncrementNameSpaceKey() {
        nameSpaceKey++;
        return String.valueOf(nameSpaceKey);
    }

    @Override
    public void onLoad() {
        instance = this;
        commandHandler = new CommandHandler(instance);
        listenerHandler = new ListenerHandler(instance);

        commandHandler.onLoad();
        listenerHandler.onLoad();

        registerCustomItems();
    }

    @Override
    public void onEnable() {
        commandHandler.onEnable();
        listenerHandler.onEnable();
    }

    @Override
    public void onDisable() {
        commandHandler.onDisable();
        listenerHandler.onDisable();
    }
}
