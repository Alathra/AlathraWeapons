package me.ShermansWorld.AlathraWeapons;

import java.util.ArrayList;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
  public static Main instance;
  
  public static ArrayList<Weapon2> weaponsMasterList2 = new ArrayList<Weapon2>();
  
  public static Main getInstance() {
    return instance;
  }
  
  public static void initWeapons() {
    weaponsMasterList2.add(new Weapon2("iron", "sword", "Katana", 14800));
    weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Spear", 14801));
    weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Flanged Mace", 14802));
    weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Naginata", 14803));
    weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Pike", 14804));
    weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Dagger", 14805));
    weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Morning Star", 14806));
    weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Zweihander", 14807));
    weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Warhammer", 14808));
    weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Shortsword", 1489));
    weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Quarterstaff", 14810));
    weaponsMasterList2.add(new Weapon2("iron", "axe", "Iron Hatchet", 15000));
    weaponsMasterList2.add(new Weapon2("iron", "axe", "Iron Battleaxe", 15001));
    weaponsMasterList2.add(new Weapon2("iron", "axe", "Iron Combat Axe", 15002));
    weaponsMasterList2.add(new Weapon2("iron", "axe", "Iron Halberd", 15003));
    weaponsMasterList2.add(new Weapon2("netherite", "sword", "Legendary Katana", 14900));
    weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Spear", 14901));
    weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Flanged Mace", 14902));
    weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Naginata", 14903));
    weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Pike", 14904));
    weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Dagger", 14905));
    weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Morning Star", 14906));
    weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Zweihander", 14907));
    weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Warhammer", 14908));
    weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Shortsword", 14909));
    weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Quarterstaff", 14910));
    weaponsMasterList2.add(new Weapon2("netherite", "axe", "Netherite Hatchet", 15100));
    weaponsMasterList2.add(new Weapon2("netherite", "axe", "Netherite Battleaxe", 15101));
    weaponsMasterList2.add(new Weapon2("netherite", "axe", "Netherite Combat Axe", 15102));
    weaponsMasterList2.add(new Weapon2("netherite", "axe", "Netherite Halberd", 15103));
    weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Kunai", 14811));
    weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Sabre", 14812));
    weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Twin Blade", 14813));
    weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Kunai", 14911));
    weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Sabre", 14912));
    weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Twin Blade", 14913));
    weaponsMasterList2.add(new Weapon2("iron", "axe", "Iron Battle Hoe", 15004));
    weaponsMasterList2.add(new Weapon2("netherite", "axe", "Netherite Battle Hoe", 15104));
    weaponsMasterList2.add(new Weapon2("netherite", "axe", "Obsidian Obliterator", 15105));
  }
  
  public void onEnable() {
    instance = this;
    initWeapons();
    new WeaponsCommands(this);
    getCommand("weapons").setTabCompleter(new WeaponsTabCompletion());
    CraftingRecipes customRecipes = new CraftingRecipes();
    customRecipes.katanaRecipe();
    customRecipes.ironQuarterStaffRecipe();
    customRecipes.ironPikeRecipe();
    customRecipes.ironSpearRecipe();
    customRecipes.ironNaginataRecipe();
    customRecipes.ironFlangedMaceRecipe();
    customRecipes.ironDaggerRecipe();
    customRecipes.ironMorningStarRecipe();
    customRecipes.ironZweihanderRecipe();
    customRecipes.ironWarHammerRecipe();
    customRecipes.ironShortswordRecipe();
    customRecipes.ironHatchetRecipe();
    customRecipes.ironBattleaxeRecipe();
    customRecipes.ironCombatAxeRecipe();
    customRecipes.ironHalberdRecipe();
    customRecipes.legendaryKatanaRecipe();
    customRecipes.netheriteQuarterStaffRecipe();
    customRecipes.netheritePikeRecipe();
    customRecipes.netheriteSpearRecipe();
    customRecipes.netheriteNaginataRecipe();
    customRecipes.netheriteFlangedMaceRecipe();
    customRecipes.netheriteMorningStarRecipe();
    customRecipes.netheriteDaggerRecipe();
    customRecipes.netheriteZweihanderRecipe();
    customRecipes.netheriteWarHammerRecipe();
    customRecipes.netheriteShortswordRecipe();
    customRecipes.netheriteHatchetRecipe();
    customRecipes.netheriteBattleaxeRecipe();
    customRecipes.netheriteCombatAxeRecipe();
    customRecipes.netheriteHalberdRecipe();
    customRecipes.ironKunaiRecipe();
    customRecipes.netheriteKunaiRecipe();
    customRecipes.ironSabreRecipe();
    customRecipes.netheriteSabreRecipe();
    customRecipes.ironTwinBladeRecipe();
    customRecipes.netheriteTwinBladeRecipe();
    customRecipes.ironBattleHoeRecipe();
    customRecipes.netheriteBattleHoeRecipe();
    customRecipes.obsidianObliteratorRecipe();
  }
  
  public void onDisable() {}
}
