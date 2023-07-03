package me.ShermansWorld.AlathraWeapons;

import me.ShermansWorld.AlathraWeapons.commands.WeaponsCommands;
import me.ShermansWorld.AlathraWeapons.commands.WeaponsTabCompletion;
import me.ShermansWorld.AlathraWeapons.enums.WeaponMaterial;
import me.ShermansWorld.AlathraWeapons.enums.WeaponType;
import me.ShermansWorld.AlathraWeapons.exceptions.InvalidMaterialException;
import me.ShermansWorld.AlathraWeapons.recipes.CraftingRecipes;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public class Main extends JavaPlugin {
    private final static CraftingRecipes craftingRecipes = new CraftingRecipes();
    public static Main instance;
    public static List<CustomWeapon> weaponsMasterList;

    public static Main getInstance() {
        return instance;
    }

    public void registerWeapons() {
        try {
            weaponsMasterList = List.of(
                new CustomWeapon("Katana", 30, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Iron Spear", 31, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Iron Flanged Mace", 230, WeaponMaterial.IRON, WeaponType.AXE),
                new CustomWeapon("Iron Naginata", 32, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Iron Pike", 33, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Iron Dagger", 34, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Iron Morning Star", 231, WeaponMaterial.IRON, WeaponType.AXE),
                new CustomWeapon("Iron Zweihander", 35, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Iron Warhammer", 232, WeaponMaterial.IRON, WeaponType.AXE),
                new CustomWeapon("Iron Shortsword", 36, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Iron Quarterstaff", 37, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Iron Hatchet", 233, WeaponMaterial.IRON, WeaponType.AXE),
                new CustomWeapon("Iron Battleaxe", 234, WeaponMaterial.IRON, WeaponType.AXE),
                new CustomWeapon("Iron Combat Axe", 235, WeaponMaterial.IRON, WeaponType.AXE),
                new CustomWeapon("Iron Halberd", 236, WeaponMaterial.IRON, WeaponType.AXE),
                new CustomWeapon("Legendary Katana", 130, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Netherite Spear", 131, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Netherite Flanged Mace", 430, WeaponMaterial.NETHERITE, WeaponType.AXE),
                new CustomWeapon("Netherite Naginata", 132, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Netherite Pike", 133, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Netherite Dagger", 134, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Netherite Morning Star", 431, WeaponMaterial.NETHERITE, WeaponType.AXE),
                new CustomWeapon("Netherite Zweihander", 135, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Netherite Warhammer", 432, WeaponMaterial.NETHERITE, WeaponType.AXE),
                new CustomWeapon("Netherite Shortsword", 136, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Netherite Quarterstaff", 137, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Netherite Hatchet", 433, WeaponMaterial.NETHERITE, WeaponType.AXE),
                new CustomWeapon("Netherite Battleaxe", 434, WeaponMaterial.NETHERITE, WeaponType.AXE),
                new CustomWeapon("Netherite Combat Axe", 435, WeaponMaterial.NETHERITE, WeaponType.AXE),
                new CustomWeapon("Netherite Halberd", 436, WeaponMaterial.NETHERITE, WeaponType.AXE),
                new CustomWeapon("Iron Kunai", 38, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Iron Sabre", 39, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Iron Twin Blade", 40, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Netherite Kunai", 138, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Netherite Sabre", 139, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Netherite Twin Blade", 140, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Iron Battle Hoe", 237, WeaponMaterial.IRON, WeaponType.AXE),
                new CustomWeapon("Netherite Battle Hoe", 437, WeaponMaterial.NETHERITE, WeaponType.AXE),
                new CustomWeapon("Iron Scimitar", 41, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Netherite Scimitar", 141, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Iron Rapier", 42, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Netherite Rapier", 142, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Iron Scythe", 239, WeaponMaterial.IRON, WeaponType.AXE),
                new CustomWeapon("Netherite Scythe", 439, WeaponMaterial.NETHERITE, WeaponType.AXE),
                new CustomWeapon("Diamond Katana", 330, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Diamond Spear", 331, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Diamond Naginata", 332, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Diamond Pike", 333, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Diamond Dagger", 334, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Diamond Zweihander", 335, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Diamond Shortsword", 336, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Diamond Quarterstaff", 337, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Diamond Kunai", 338, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Diamond Sabre", 339, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Diamond Twin Blade", 340, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Diamond Scimitar", 341, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Diamond Rapier", 342, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Diamond Flanged Mace", 530, WeaponMaterial.DIAMOND, WeaponType.AXE),
                new CustomWeapon("Diamond Morning Star", 531, WeaponMaterial.DIAMOND, WeaponType.AXE),
                new CustomWeapon("Diamond Warhammer", 532, WeaponMaterial.DIAMOND, WeaponType.AXE),
                new CustomWeapon("Diamond Hatchet", 533, WeaponMaterial.DIAMOND, WeaponType.AXE),
                new CustomWeapon("Diamond Battleaxe", 534, WeaponMaterial.DIAMOND, WeaponType.AXE),
                new CustomWeapon("Diamond Combat Axe", 535, WeaponMaterial.DIAMOND, WeaponType.AXE),
                new CustomWeapon("Diamond Halberd", 536, WeaponMaterial.DIAMOND, WeaponType.AXE),
                new CustomWeapon("Diamond Battle Hoe", 537, WeaponMaterial.DIAMOND, WeaponType.AXE),
                new CustomWeapon("Diamond Scythe", 539, WeaponMaterial.DIAMOND, WeaponType.AXE),
                new CustomWeapon("Iron Hook", 43, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Diamond Hook", 343, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Netherite Hook", 143, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Iron Mace", 44, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Diamond Mace", 344, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Netherite Mace", 144, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Iron Greatsword", 45, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Diamond Greatsword", 345, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Netherite Greatsword", 145, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Iron Bident", 46, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Diamond Bident", 346, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Netherite Bident", 146, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Diamond Giant Sword", 329, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Iron Dane Axe", 240, WeaponMaterial.IRON, WeaponType.AXE),
                new CustomWeapon("Diamond Dane Axe", 540, WeaponMaterial.DIAMOND, WeaponType.AXE),
                new CustomWeapon("Netherite Dane Axe", 440, WeaponMaterial.NETHERITE, WeaponType.AXE),
                new CustomWeapon("Iron Antler Staff", 28, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Diamond Antler Staff", 328, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Netherite Antler Staff", 129, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Faebow", 14914, WeaponMaterial.IGNORED, WeaponType.CROSSBOW),
                new CustomWeapon("Longbow", 14915, WeaponMaterial.IGNORED, WeaponType.BOW),
                new CustomWeapon("Iron Gladius", 47, WeaponMaterial.IRON, WeaponType.SWORD),
                new CustomWeapon("Diamond Gladius", 347, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Netherite Gladius", 147, WeaponMaterial.NETHERITE, WeaponType.SWORD),
                new CustomWeapon("Diamond Blackfeld Sword", 348, WeaponMaterial.DIAMOND, WeaponType.SWORD),
                new CustomWeapon("Netherite Blackfeld Sword", 148, WeaponMaterial.NETHERITE, WeaponType.SWORD)
            );
        } catch (InvalidMaterialException e) {
            getInstance().getLogger().warning(e.getMessage());
            getInstance().getServer().getPluginManager().disablePlugin(getInstance());
        }
    }

    public void registerRecipes() {
        craftingRecipes.katanaRecipe();
        craftingRecipes.ironQuarterStaffRecipe();
        craftingRecipes.ironPikeRecipe();
        craftingRecipes.ironSpearRecipe();
        craftingRecipes.ironNaginataRecipe();
        craftingRecipes.ironFlangedMaceRecipe();
        craftingRecipes.ironDaggerRecipe();
        craftingRecipes.ironMorningStarRecipe();
        craftingRecipes.ironZweihanderRecipe();
        craftingRecipes.ironWarHammerRecipe();
        craftingRecipes.ironShortswordRecipe();
        craftingRecipes.ironHatchetRecipe();
        craftingRecipes.ironBattleaxeRecipe();
        craftingRecipes.ironCombatAxeRecipe();
        craftingRecipes.ironHalberdRecipe();
        craftingRecipes.legendaryKatanaRecipe();
        craftingRecipes.netheriteQuarterStaffRecipe();
        craftingRecipes.netheritePikeRecipe();
        craftingRecipes.netheriteSpearRecipe();
        craftingRecipes.netheriteNaginataRecipe();
        craftingRecipes.netheriteFlangedMaceRecipe();
        craftingRecipes.netheriteMorningStarRecipe();
        craftingRecipes.netheriteDaggerRecipe();
        craftingRecipes.netheriteZweihanderRecipe();
        craftingRecipes.netheriteWarHammerRecipe();
        craftingRecipes.netheriteShortswordRecipe();
        craftingRecipes.netheriteHatchetRecipe();
        craftingRecipes.netheriteBattleaxeRecipe();
        craftingRecipes.netheriteCombatAxeRecipe();
        craftingRecipes.netheriteHalberdRecipe();
        craftingRecipes.ironKunaiRecipe();
        craftingRecipes.netheriteKunaiRecipe();
        craftingRecipes.ironSabreRecipe();
        craftingRecipes.netheriteSabreRecipe();
        craftingRecipes.ironTwinBladeRecipe();
        craftingRecipes.netheriteTwinBladeRecipe();
        craftingRecipes.ironBattleHoeRecipe();
        craftingRecipes.netheriteBattleHoeRecipe();
        craftingRecipes.ironScimitarRecipe();
        craftingRecipes.netheriteScimitarRecipe();
        craftingRecipes.ironRapierRecipe();
        craftingRecipes.netheriteRapierRecipe();
        craftingRecipes.ironScytheRecipe();
        craftingRecipes.netheriteScytheRecipe();
        craftingRecipes.diamondKatanaRecipe();
        craftingRecipes.diamondSpearRecipe();
        craftingRecipes.diamondNaginataRecipe();
        craftingRecipes.diamondPikeRecipe();
        craftingRecipes.diamondDaggerRecipe();
        craftingRecipes.diamondZweihanderRecipe();
        craftingRecipes.dimamondShortswordRecipe();
        craftingRecipes.diamondQuarterStaffRecipe();
        craftingRecipes.diamondKunaiRecipe();
        craftingRecipes.diamondSabreRecipe();
        craftingRecipes.diamondTwinBladeRecipe();
        craftingRecipes.diamondScimitarRecipe();
        craftingRecipes.diamondRapierRecipe();
        craftingRecipes.diamondFlangedMaceRecipe();
        craftingRecipes.diamondMorningStarRecipe();
        craftingRecipes.diamondWarHammerRecipe();
        craftingRecipes.diamondHatchetRecipe();
        craftingRecipes.diamondBattleaxeRecipe();
        craftingRecipes.diamondCombatAxeRecipe();
        craftingRecipes.diamondHalberdRecipe();
        craftingRecipes.diamondBattleHoeRecipe();
        craftingRecipes.diamondScytheRecipe();
        craftingRecipes.ironHookRecipe();
        craftingRecipes.diamondHookRecipe();
        craftingRecipes.netheriteHookRecipe();
        craftingRecipes.ironMaceRecipe();
        craftingRecipes.diamondMaceRecipe();
        craftingRecipes.netheriteMaceRecipe();
        craftingRecipes.ironGreatswordRecipe();
        craftingRecipes.diamondGreatswordRecipe();
        craftingRecipes.netheriteGreatswordRecipe();
        craftingRecipes.ironBidentRecipe();
        craftingRecipes.diamondBidentRecipe();
        craftingRecipes.netheriteBidentRecipe();
        craftingRecipes.diamondGiantSwordRecipe();
        craftingRecipes.ironDaneAxeRecipe();
        craftingRecipes.diamondDaneAxeRecipe();
        craftingRecipes.netheriteDaneAxeRecipe();
        craftingRecipes.ironAntlerStaffRecipe();
        craftingRecipes.diamondAntlerStaffRecipe();
        craftingRecipes.netheriteAntlerStaffRecipe();
        craftingRecipes.faeBowRecipe();
        craftingRecipes.longbowRecipe();
        craftingRecipes.ironGladiusRecipe();
        craftingRecipes.diamondGladiusRecipe();
        craftingRecipes.netheriteGladiusRecipe();
        craftingRecipes.diamondBlackfeldSwordRecipe();
        craftingRecipes.netheriteBlackfeldSwordRecipe();
    }

    public void onEnable() {
        instance = this;
        registerWeapons();
        registerRecipes();
        new WeaponsCommands(this);
        getCommand("weapons").setTabCompleter(new WeaponsTabCompletion());
    }
}
