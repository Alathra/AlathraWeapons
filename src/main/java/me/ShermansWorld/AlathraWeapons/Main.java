package me.ShermansWorld.AlathraWeapons;

import me.ShermansWorld.AlathraWeapons.commands.CommandHandler;
import me.ShermansWorld.AlathraWeapons.enums.WeaponMaterial;
import me.ShermansWorld.AlathraWeapons.enums.WeaponType;
import me.ShermansWorld.AlathraWeapons.exceptions.InvalidMaterialException;
import me.ShermansWorld.AlathraWeapons.items.CustomItem;
import me.ShermansWorld.AlathraWeapons.items.tools.LegendaryKatana;
import me.ShermansWorld.AlathraWeapons.items.tools.diamond.DiamondBattleaxe;
import me.ShermansWorld.AlathraWeapons.items.tools.gold.*;
import me.ShermansWorld.AlathraWeapons.items.tools.iron.*;
import me.ShermansWorld.AlathraWeapons.items.tools.misc.FaeBow;
import me.ShermansWorld.AlathraWeapons.items.tools.misc.LongBow;
import me.ShermansWorld.AlathraWeapons.items.tools.netherite.*;
import me.ShermansWorld.AlathraWeapons.listener.ListenerHandler;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Main extends JavaPlugin {
    public static Main instance;
    private CommandHandler commandHandler;
    private ListenerHandler listenerHandler;

    public static List<CustomWeapon> weaponsMasterList;
    public static List<CustomItem> unregisteredList = List.of(
        new DiamondBattleaxe()
    );

    public static Main getInstance() {
        return instance;
    }

    @Nullable
    public CustomWeapon getCustomWeaponFromItemStack(@NotNull ItemStack itemStack) {
        for (CustomWeapon customWeapon : weaponsMasterList)
            if (customWeapon.equals(itemStack))
                return customWeapon;

        return null;
    }

    public void registerWeapons() {
        try {
            for (CustomItem customItem : unregisteredList) {
                customItem.register();
            }
            weaponsMasterList = List.of(
                new CustomWeapon("Katana", "Katana", 30, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Iron Spear", "Iron Spear", 31, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Iron Naginata", "Iron Naginata", 32, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Iron Pike", "Iron Pike", 33, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Iron Morning Star", "Iron Morning Star", 231, WeaponMaterial.IRON, WeaponType.AXE),
                new CustomWeapon("Iron Zweihander", "Iron Zweihander", 35, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Iron Warhammer", "Iron Warhammer", 232, WeaponMaterial.IRON, WeaponType.AXE),
                new CustomWeapon("Iron Shortsword", "Iron Shortsword", 36, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Iron Quarterstaff", "Iron Quarterstaff", 37, WeaponMaterial.IRON, WeaponType.SWORD),
                ,
                ,
                new CustomWeapon("Legendary Katana", "Legendary Katana", 130, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Netherite Spear", "Netherite Spear", 131, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Netherite Naginata", "Netherite Naginata", 132, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Netherite Pike", "Netherite Pike", 133, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Netherite Morning Star", "Netherite Morning Star", 431, WeaponMaterial.NETHERITE, WeaponType.AXE),
                new CustomWeapon("Netherite Zweihander", "Netherite Zweihander", 135, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Netherite Warhammer", "Netherite Warhammer", 432, WeaponMaterial.NETHERITE, WeaponType.AXE),
                new CustomWeapon("Netherite Shortsword", "Netherite Shortsword", 136, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Netherite Quarterstaff", "Netherite Quarterstaff", 137, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                ,
                ,
                new CustomWeapon("Iron Kunai", "Iron Kunai", 38, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Iron Sabre", "Iron Sabre", 39, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Iron Twin Blade", "Iron Twin Blade", 40, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Netherite Kunai", "Netherite Kunai", 138, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Netherite Sabre", "Netherite Sabre", 139, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Netherite Twin Blade", "Netherite Twin Blade", 140, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Iron Scimitar", "Iron Scimitar", 41, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Netherite Scimitar", "Netherite Scimitar", 141, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Iron Rapier", "Iron Rapier", 42, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Netherite Rapier", "Netherite Rapier", 142, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Iron Scythe", "Iron Scythe", 239, WeaponMaterial.IRON, WeaponType.AXE),
                new CustomWeapon("Netherite Scythe", "Netherite Scythe", 439, WeaponMaterial.NETHERITE, WeaponType.AXE),
                new CustomWeapon("Majestic Katana", "Majestic Katana", 330, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Diamond Spear", "Diamond Spear", 331, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Diamond Naginata", "Diamond Naginata", 332, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Diamond Pike", "Diamond Pike", 333, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Diamond Zweihander", "Diamond Zweihander", 335, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Diamond Shortsword", "Diamond Shortsword", 336, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Diamond Quarterstaff", "Diamond Quarterstaff", 337, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Diamond Kunai", "Diamond Kunai", 338, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Diamond Sabre", "Diamond Sabre", 339, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Diamond Twin Blade", "Diamond Twin Blade", 340, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Diamond Scimitar", "Diamond Scimitar", 341, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Diamond Rapier", "Diamond Rapier", 342, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Diamond Morning Star", "Diamond Morning Star", 531, WeaponMaterial.DIAMOND, WeaponType.AXE),
                new CustomWeapon("Diamond Warhammer", "Diamond Warhammer", 532, WeaponMaterial.DIAMOND, WeaponType.AXE),
                ,
                ,
                new CustomWeapon("Diamond Scythe", "Diamond Scythe", 539, WeaponMaterial.DIAMOND, WeaponType.AXE),
                ,
                ,
                ,
                new CustomWeapon("Iron Mace", "Iron Mace", 44, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Diamond Mace", "Diamond Mace", 344, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Netherite Mace", "Netherite Mace", 144, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                ,
                ,
                ,
                new CustomWeapon("Iron Antler Staff", "Iron Antler Staff", 28, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Diamond Antler Staff", "Diamond Antler Staff", 328, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Netherite Antler Staff", "Netherite Antler Staff", 129, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Faebow", "Faebow", 14914, WeaponMaterial.IGNORED, WeaponType.CROSSBOW),
                new CustomWeapon("Longbow", "Longbow", 14915, WeaponMaterial.IGNORED, WeaponType.BOW),
                new CustomWeapon("Iron Longsword", "Iron Longsword", 49, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Diamond Longsword", "Diamond Longsword", 350, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Netherite Longsword", "Netherite Longsword", 150, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Glorious Katana", "Glorious Katana", 630, WeaponMaterial.GOLD, WeaponType.SWORD),
                new CustomWeapon("Golden Spear", "Golden Spear", 631, WeaponMaterial.GOLD, WeaponType.SWORD),
                new CustomWeapon("Golden Naginata", "Golden Naginata", 632, WeaponMaterial.GOLD, WeaponType.SWORD),
                new CustomWeapon("Golden Pike", "Golden Pike", 633, WeaponMaterial.GOLD, WeaponType.SWORD),
                new CustomWeapon("Golden Zweihander", "Golden Zweihander", 635, WeaponMaterial.GOLD, WeaponType.SWORD),
                new CustomWeapon("Golden Shortsword", "Golden Shortsword", 636, WeaponMaterial.GOLD, WeaponType.SWORD),
                new CustomWeapon("Golden Quarterstaff", "Golden Quarterstaff", 637, WeaponMaterial.GOLD, WeaponType.SWORD),
                new CustomWeapon("Golden Kunai", "Golden Kunai", 638, WeaponMaterial.GOLD, WeaponType.SWORD),
                new CustomWeapon("Golden Sabre", "Golden Sabre", 639, WeaponMaterial.GOLD, WeaponType.SWORD),
                new CustomWeapon("Golden Twin Blade", "Golden Twin Blade", 640, WeaponMaterial.GOLD, WeaponType.SWORD),
                new CustomWeapon("Golden Scimitar", "Golden Scimitar", 641, WeaponMaterial.GOLD, WeaponType.SWORD),
                new CustomWeapon("Golden Rapier", "Golden Rapier", 642, WeaponMaterial.GOLD, WeaponType.SWORD),
                ,
                new CustomWeapon("Golden Mace", "Golden Mace", 644, WeaponMaterial.GOLD, WeaponType.SWORD),
                ,
                new CustomWeapon("Golden Gladius", "Golden Gladius", 647, WeaponMaterial.GOLD, WeaponType.SWORD),
                new CustomWeapon("Golden Longsword", "Golden Longsword", 650, WeaponMaterial.GOLD, WeaponType.SWORD),
                new CustomWeapon("Golden Morningstar", "Golden Morningstar", 731, WeaponMaterial.GOLD, WeaponType.AXE),
                new CustomWeapon("Golden Warhammer", "Golden Warhammer", 732, WeaponMaterial.GOLD, WeaponType.AXE),
                ,
                ,
                new CustomWeapon("Golden Scythe", "Golden Scythe", 739, WeaponMaterial.GOLD, WeaponType.AXE)

            );
        } catch (InvalidMaterialException e) {
            getInstance().getLogger().warning(e.getMessage());
            getInstance().getServer().getPluginManager().disablePlugin(getInstance());
        }
    }

    public static void registerItem(@NotNull CustomWeapon customWeapon) {
        weaponsMasterList.add(customWeapon);
    }

    public static int nameSpaceKey = -1; // First item will get namespace key 0
    public static String getIncrementNameSpaceKey() {
        nameSpaceKey++;
        return String.valueOf(nameSpaceKey);
    }

    public static void registerRecipes() {
        IronQuarterStaff.ironQuarterStaffRecipe();
        IronPike.ironPikeRecipe();
        IronSpear.ironSpearRecipe();
        IronNaginata.ironNaginataRecipe();
        IronFlangedMace.ironFlangedMaceRecipe();
        IronDagger.ironDaggerRecipe();
        IronMorningStar.ironMorningStarRecipe();
        IronSweihander.ironZweihanderRecipe();
        IronWarHammer.ironWarHammerRecipe();
        IronShortsword.ironShortswordRecipe();
        IronHatchet.ironHatchetRecipe();
        IronBattleaxe.ironBattleaxeRecipe();
        IronCombatAxe.ironCombatAxeRecipe();
        IronHalberd.ironHalberdRecipe();
        LegendaryKatana.legendaryKatanaRecipe();
        NetheriteQuarterStaff.netheriteQuarterStaffRecipe();
        NetheritePike.netheritePikeRecipe();
        NetheriteSpear.netheriteSpearRecipe();
        NetheriteNaginata.netheriteNaginataRecipe();
        NetheriteFlangedMace.netheriteFlangedMaceRecipe();
        NetheriteMorningStar.netheriteMorningStarRecipe();
        NetheriteDagger.netheriteDaggerRecipe();
        NetheriteZweihander.netheriteZweihanderRecipe();
        NetheriteWarHammer.netheriteWarHammerRecipe();
        NetheriteShortsword.netheriteShortswordRecipe();
        NetheriteHatchet.netheriteHatchetRecipe();
        NetheriteBattleaxe.netheriteBattleaxeRecipe();
        NetheriteCombatAxe.netheriteCombatAxeRecipe();
        NetheriteHalberd.netheriteHalberdRecipe();
        IronKunai.ironKunaiRecipe();
        NetheriteKunai.netheriteKunaiRecipe();
        IronSabre.ironSabreRecipe();
        NetheriteSabre.netheriteSabreRecipe();
        IronTwinBlade.ironTwinBladeRecipe();
        NetheriteTwinBlade.netheriteTwinBladeRecipe();
        IronBattleHoe.ironBattleHoeRecipe();
        NetheriteBattleHoe.netheriteBattleHoeRecipe();
        IronSchimitar.ironScimitarRecipe();
        NetheriteSchimitar.netheriteScimitarRecipe();
        IronRapier.ironRapierRecipe();
        NetheriteRapier.netheriteRapierRecipe();
        IronScythe.ironScytheRecipe();
        NetheriteScythe.netheriteScytheRecipe();
        IronHook.ironHookRecipe();
        NetheriteHook.netheriteHookRecipe();
        IronMace.ironMaceRecipe();
        NetheriteMace.netheriteMaceRecipe();
        IronGreatsword.ironGreatswordRecipe();
        NetheriteGreatsword.netheriteGreatswordRecipe();
        IronBident.ironBidentRecipe();
        NetheriteBident.netheriteBidentRecipe();
        IronDaneAxe.ironDaneAxeRecipe();
        NetheriteDaneAxe.netheriteDaneAxeRecipe();
        IronAntlerStaff.ironAntlerStaffRecipe();
        NetheriteAntlerStaff.netheriteAntlerStaffRecipe();
        FaeBow.faeBowRecipe();
        LongBow.longbowRecipe();
        IronGladius.ironGladiusRecipe();
        NetheriteGladius.netheriteGladiusRecipe();
        NetheriteBlackfeldSword.netheriteBlackfeldSwordRecipe();
        IronDreistkleze.ironDreistklezeRecipe();
        NetheriteDreistkleze.netheriteDreistklezeRecipe();
        IronLongsword.ironLongswordRecipe();
        NetheriteLongsword.netheriteLongswordRecipe();
        IronGiantSword.ironGiantSwordRecipe();
        IronBlackfeldSword.ironBlackfeldSwordRecipe();
        NetheriteGiantSword.netheriteGiantSwordRecipe();
        GoldenGiantSword.goldenGiantSwordRecipe();
        GoldenKatana.goldenKatanaRecipe();
        GoldenSpear.goldenSpearRecipe();
        GoldenNaginata.goldenNaginataRecipe();
        GoldenPike.goldenPikeRecipe();
        GoldenDagger.goldenDaggerRecipe();
        GoldenZweihander.goldenZweihanderRecipe();
        GoldenShortsword.goldenShortswordRecipe();
        GoldenQuarterstaff.goldenQuarterstaffRecipe();
        GoldenKunai.goldenKunaiRecipe();
        GoldenSabre.goldenSabreRecipe();
        GoldenTwinBlade.goldenTwinBladeRecipe();
        GoldenScimitar.goldenScimitarRecipe();
        GoldenRapier.goldenRapierRecipe();
        GoldenHook.goldenHookRecipe();
        GoldenMace.goldenMaceRecipe();
        GoldenGreatsword.goldenGreatswordRecipe();
        GoldenBident.goldenBidentRecipe();
        GoldenGladius.goldenGladiusRecipe();
        GoldenBlackfeldSword.goldenBlackfeldSwordRecipe();
        GoldenDreistkleze.goldenDreistklezeRecipe();
        GoldenLongsword.goldenLongswordRecipe();
        GoldenFlangedMace.goldenFlangedMaceRecipe();
        GoldenMorningstar.goldenMorningstarRecipe();
        GoldenWarhammer.goldenWarhammerRecipe();
        GoldenHatchet.goldenHatchetRecipe();
        GoldenBattleaxe.goldenBattleaxeRecipe();
        GoldenCombatAxe.goldenCombatAxeRecipe();
        GoldenHalberd.goldenHalberdRecipe();
        GoldenBattleHoe.goldenBattleHoeRecipe();
        GoldenScythe.goldenScytheRecipe();
        GoldenDaneAxe.goldenDaneAxeRecipe();
    }

    @Override
    public void onLoad() {
        instance = this;
        commandHandler = new CommandHandler(instance);
        listenerHandler = new ListenerHandler(instance);

        commandHandler.onLoad();
        listenerHandler.onLoad();
    }

    @Override
    public void onEnable() {
        registerWeapons();
        registerRecipes();

        commandHandler.onEnable();
        listenerHandler.onEnable();
    }

    @Override
    public void onDisable() {
        commandHandler.onDisable();
        listenerHandler.onDisable();
    }
}
