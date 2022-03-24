package me.ShermansWorld.AlathraWeapons;

import java.util.ArrayList;

import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	    public static Main instance;
	    public static ArrayList<Weapon> weaponsMasterList = new ArrayList<Weapon>();
	    
	    public static Main getInstance() {
	        return Main.instance;
	    }
	    
	    public static void initWeapons() {
	    	// swords
	    	weaponsMasterList.add(new Weapon("iron", "sword", "Katana", 238));
	    	weaponsMasterList.add(new Weapon("iron", "sword", "Iron Spear", 239));
	    	weaponsMasterList.add(new Weapon("iron", "sword", "Iron Flanged Mace", 240));
	    	weaponsMasterList.add(new Weapon("iron", "sword", "Iron Naginata", 241));
	    	weaponsMasterList.add(new Weapon("iron", "sword", "Iron Pike", 242));
	    	weaponsMasterList.add(new Weapon("iron", "sword", "Iron Dagger", 243));
	    	weaponsMasterList.add(new Weapon("iron", "sword", "Iron Morning Star", 244));
	    	weaponsMasterList.add(new Weapon("iron", "sword", "Iron Zweihander", 245));
	    	weaponsMasterList.add(new Weapon("iron", "sword", "Iron Warhammer", 246));
	    	weaponsMasterList.add(new Weapon("iron", "sword", "Iron Shortsword", 247));
	    	weaponsMasterList.add(new Weapon("iron", "sword", "Iron Quarterstaff", 248));
	    	//axes
	    	weaponsMasterList.add(new Weapon("iron", "axe", "Iron Hatchet", 247));
	    	weaponsMasterList.add(new Weapon("iron", "axe", "Iron Battleaxe", 245));
	    	weaponsMasterList.add(new Weapon("iron", "axe", "Iron Combat Axe", 243));
	    	weaponsMasterList.add(new Weapon("iron", "axe", "Iron Halberd", 241));
	    	
	    	//netherite versions
	    	// swords
	    	weaponsMasterList.add(new Weapon("netherite", "sword", "Legendary Katana", 2019));
	    	weaponsMasterList.add(new Weapon("netherite", "sword", "Netherite Spear", 2020));
	    	weaponsMasterList.add(new Weapon("netherite", "sword", "Netherite Flanged Mace", 2021));
	    	weaponsMasterList.add(new Weapon("netherite", "sword", "Netherite Naginata", 2022));
	    	weaponsMasterList.add(new Weapon("netherite", "sword", "Netherite Pike", 2023));
	    	weaponsMasterList.add(new Weapon("netherite", "sword", "Netherite Dagger", 2024));
	    	weaponsMasterList.add(new Weapon("netherite", "sword", "Netherite Morning Star", 2025));
	    	weaponsMasterList.add(new Weapon("netherite", "sword", "Netherite Zweihander", 2026));
	    	weaponsMasterList.add(new Weapon("netherite", "sword", "Netherite Warhammer", 2027));
	    	weaponsMasterList.add(new Weapon("netherite", "sword", "Netherite Shortsword", 2028));
	    	weaponsMasterList.add(new Weapon("netherite", "sword", "Netherite Quarterstaff", 2029));
	    	//axes
	    	weaponsMasterList.add(new Weapon("netherite", "axe", "Netherite Hatchet", 2028));
	    	weaponsMasterList.add(new Weapon("netherite", "axe", "Netherite Battleaxe", 2026));
	    	weaponsMasterList.add(new Weapon("netherite", "axe", "Netherite Combat Axe", 2024));
	    	weaponsMasterList.add(new Weapon("netherite", "axe", "Netherite Halberd", 2022));
	    	
	    	
	    }
	    
	    @Override
	    public void onEnable() {
	        Main.instance = this;
	        initWeapons();
	        new WeaponsCommands(this);
	        this.getServer().getPluginManager().registerEvents((Listener)new EntityDamageListener(), (Plugin)this);
	        this.getServer().getPluginManager().registerEvents((Listener)new BlockBreakListener(), (Plugin)this);
	        this.getServer().getPluginManager().registerEvents((Listener)new AnvilListener(), (Plugin)this);
	        this.getServer().getPluginManager().registerEvents((Listener)new SmithingTableListener(), (Plugin)this);
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
	    }
	    
	    @Override
	    public void onDisable() {
	    }
}
