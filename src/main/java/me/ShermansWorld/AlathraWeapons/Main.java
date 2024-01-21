package me.ShermansWorld.AlathraWeapons;

import me.ShermansWorld.AlathraWeapons.commands.CommandHandler;
import me.ShermansWorld.AlathraWeapons.exceptions.InvalidMaterialException;
import me.ShermansWorld.AlathraWeapons.items.CustomItemGroup;
import me.ShermansWorld.AlathraWeapons.items.weapons.melee.*;
import me.ShermansWorld.AlathraWeapons.items.weapons.ranged.Faebow;
import me.ShermansWorld.AlathraWeapons.items.weapons.ranged.Longbow;
import me.ShermansWorld.AlathraWeapons.listener.ListenerHandler;
import me.ShermansWorld.AlathraWeapons.recipes.VanillaSmithing;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main extends JavaPlugin {
    public static Main instance;
    private final List<Reloadable> reloadables = new ArrayList<>();

    private static final HashMap<CustomItem, CustomItem> smithingUpgrades = new HashMap<>();

    public static List<CustomItem> registeredItems = new ArrayList<>(); // A list of all registered items

    public static List<CustomItemGroup> unregisteredItemsList = List.of( // A list of the item groups to be registered
        // Weapons Melee
        new AntlerStaff(),
        new Battleaxe(),
        new BattleHoe(),
        new Bident(),
        new BlackfeldSword(),
        new BoneDagger(),
        new Cleaver(),
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
        new RusteyeCleaver(),
        new Slasher(),
        new RusteyePartisan(),
        new DarkIronSword(),
        // Weapons ranged
        new Faebow(),
        new Longbow()
        // new AmethystTrident() Don't enable. This weapon does not exist in the resource pack.
    );

    public static Main getInstance() {
        return instance;
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

    public static void addSmithingUpgrade(CustomItem inputItem, CustomItem outputItem) {
        smithingUpgrades.put(inputItem, outputItem);
    }

    public static HashMap<CustomItem, CustomItem> getSmithingUpgrades() {
        return smithingUpgrades;
    }

    public static int nameSpaceKey = -1; // First item will get namespace key 0
    public static String getIncrementNameSpaceKey() {
        nameSpaceKey++;
        return String.valueOf(nameSpaceKey);
    }

    public void runOnLoads() {
        for (Reloadable reloadable : reloadables) {
            reloadable.onLoad();
        }
    }

    public void runOnEnables() {
        for (Reloadable reloadable : reloadables) {
            reloadable.onEnable();
        }
    }

    public void runOnDisables() {
        for (Reloadable reloadable : reloadables) {
            reloadable.onDisable();
        }
    }

    @Override
    public void onLoad() {
        instance = this;
        CommandHandler commandHandler = new CommandHandler(instance);
        ListenerHandler listenerHandler = new ListenerHandler(instance);
        new VanillaSmithing();

        reloadables.add(commandHandler);
        reloadables.add(listenerHandler);

        runOnLoads();

        registerCustomItems();
    }

    @Override
    public void onEnable() {
        runOnEnables();
    }

    @Override
    public void onDisable() {
        runOnDisables();
    }
}
