package me.ShermansWorld.AlathraWeapons;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.Plugin;

public class CraftingRecipes implements Listener {
	public void katanaRecipe() {
		ItemStack katana = ((Weapon2) Main.weaponsMasterList2.get(0)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "1");
		ShapedRecipe katanaRecipe = new ShapedRecipe(key, katana);
		katanaRecipe.shape(new String[] { "  @", " @ ", "%  " });
		katanaRecipe.setIngredient('@', Material.IRON_BLOCK);
		katanaRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) katanaRecipe);
	}

	public void ironSpearRecipe() {
		ItemStack ironSpear = ((Weapon2) Main.weaponsMasterList2.get(1)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "4");
		ShapedRecipe ironSpearRecipe = new ShapedRecipe(key, ironSpear);
		ironSpearRecipe.shape(new String[] { "  @", " % ", "%  " });
		ironSpearRecipe.setIngredient('@', Material.IRON_SWORD);
		ironSpearRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) ironSpearRecipe);
	}

	public void ironFlangedMaceRecipe() {
		ItemStack ironFlangedMace = ((Weapon2) Main.weaponsMasterList2.get(2)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "6");
		ShapedRecipe ironFlangedMaceRecipe = new ShapedRecipe(key, ironFlangedMace);
		ironFlangedMaceRecipe.shape(new String[] { "   ", "@  ", "%  " });
		ironFlangedMaceRecipe.setIngredient('@', Material.IRON_INGOT);
		ironFlangedMaceRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) ironFlangedMaceRecipe);
	}

	public void ironNaginataRecipe() {
		ItemStack ironNaginata = ((Weapon2) Main.weaponsMasterList2.get(3)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "5");
		ShapedRecipe ironNaginataRecipe = new ShapedRecipe(key, ironNaginata);
		ironNaginataRecipe.shape(new String[] { " @ ", " % ", "%  " });
		ironNaginataRecipe.setIngredient('@', Material.IRON_SWORD);
		ironNaginataRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) ironNaginataRecipe);
	}

	public void ironPikeRecipe() {
		ItemStack ironPike = ((Weapon2) Main.weaponsMasterList2.get(4)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "3");
		ShapedRecipe ironPikeRecipe = new ShapedRecipe(key, ironPike);
		ironPikeRecipe.shape(new String[] { "  @", " % ", "%  " });
		ironPikeRecipe.setIngredient('@', Material.IRON_INGOT);
		ironPikeRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) ironPikeRecipe);
	}

	public void ironDaggerRecipe() {
		ItemStack ironDagger = ((Weapon2) Main.weaponsMasterList2.get(5)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "7");
		ShapedRecipe ironDaggerRecipe = new ShapedRecipe(key, ironDagger);
		ironDaggerRecipe.shape(new String[] { "   ", " @ ", "%  " });
		ironDaggerRecipe.setIngredient('@', Material.IRON_INGOT);
		ironDaggerRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) ironDaggerRecipe);
	}

	public void ironMorningStarRecipe() {
		ItemStack ironMorningStar = ((Weapon2) Main.weaponsMasterList2.get(6)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "8");
		ShapedRecipe ironMorningStarRecipe = new ShapedRecipe(key, ironMorningStar);
		ironMorningStarRecipe.shape(new String[] { " $ ", "$@$", "%$ " });
		ironMorningStarRecipe.setIngredient('@', Material.IRON_INGOT);
		ironMorningStarRecipe.setIngredient('%', Material.STICK);
		ironMorningStarRecipe.setIngredient('$', Material.IRON_NUGGET);
		Main.getInstance().getServer().addRecipe((Recipe) ironMorningStarRecipe);
	}

	public void ironZweihanderRecipe() {
		ItemStack ironZweihander = ((Weapon2) Main.weaponsMasterList2.get(7)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "9");
		ShapedRecipe ironZweihanderRecipe = new ShapedRecipe(key, ironZweihander);
		ironZweihanderRecipe.shape(new String[] { "  %", " % ", "@  " });
		ironZweihanderRecipe.setIngredient('@', Material.IRON_SWORD);
		ironZweihanderRecipe.setIngredient('%', Material.IRON_INGOT);
		Main.getInstance().getServer().addRecipe((Recipe) ironZweihanderRecipe);
	}

	public void ironWarHammerRecipe() {
		ItemStack ironWarHammer = ((Weapon2) Main.weaponsMasterList2.get(8)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "10");
		ShapedRecipe ironWarHammerRecipe = new ShapedRecipe(key, ironWarHammer);
		ironWarHammerRecipe.shape(new String[] { " @ ", " %@", "%  " });
		ironWarHammerRecipe.setIngredient('@', Material.IRON_INGOT);
		ironWarHammerRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) ironWarHammerRecipe);
	}

	public void ironShortswordRecipe() {
		ItemStack ironShortsword = ((Weapon2) Main.weaponsMasterList2.get(9)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "11");
		ShapedRecipe ironShortswordRecipe = new ShapedRecipe(key, ironShortsword);
		ironShortswordRecipe.shape(new String[] { "  @", " @ ", "%  " });
		ironShortswordRecipe.setIngredient('@', Material.IRON_INGOT);
		ironShortswordRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) ironShortswordRecipe);
	}

	public void ironQuarterStaffRecipe() {
		ItemStack ironQuarterStaff = ((Weapon2) Main.weaponsMasterList2.get(10)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "2");
		ShapedRecipe ironQuarterStaffRecipe = new ShapedRecipe(key, ironQuarterStaff);
		ironQuarterStaffRecipe.shape(new String[] { "  @", " % ", "@  " });
		ironQuarterStaffRecipe.setIngredient('@', Material.IRON_INGOT);
		ironQuarterStaffRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) ironQuarterStaffRecipe);
	}

	public void ironHatchetRecipe() {
		ItemStack ironHatchet = ((Weapon2) Main.weaponsMasterList2.get(11)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "12");
		ShapedRecipe ironHatchetRecipe = new ShapedRecipe(key, ironHatchet);
		ironHatchetRecipe.shape(new String[] { "   ", " @@", " @%" });
		ironHatchetRecipe.setIngredient('@', Material.IRON_INGOT);
		ironHatchetRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) ironHatchetRecipe);
	}

	public void ironBattleaxeRecipe() {
		ItemStack ironBattleaxe = ((Weapon2) Main.weaponsMasterList2.get(12)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "13");
		ShapedRecipe ironBattleaxeRecipe = new ShapedRecipe(key, ironBattleaxe);
		ironBattleaxeRecipe.shape(new String[] { " @ ", " %@", "%  " });
		ironBattleaxeRecipe.setIngredient('@', Material.IRON_AXE);
		ironBattleaxeRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) ironBattleaxeRecipe);
	}

	public void ironCombatAxeRecipe() {
		ItemStack ironCombatAxe = ((Weapon2) Main.weaponsMasterList2.get(13)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "14");
		ShapedRecipe ironCombatAxeRecipe = new ShapedRecipe(key, ironCombatAxe);
		ironCombatAxeRecipe.shape(new String[] { "   ", "@  ", "%  " });
		ironCombatAxeRecipe.setIngredient('@', Material.IRON_INGOT);
		ironCombatAxeRecipe.setIngredient('%', Material.IRON_AXE);
		Main.getInstance().getServer().addRecipe((Recipe) ironCombatAxeRecipe);
	}

	public void ironHalberdRecipe() {
		ItemStack ironHalberd = ((Weapon2) Main.weaponsMasterList2.get(14)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "15");
		ShapedRecipe ironHalberdRecipe = new ShapedRecipe(key, ironHalberd);
		ironHalberdRecipe.shape(new String[] { "  @", " % ", "%  " });
		ironHalberdRecipe.setIngredient('@', Material.IRON_AXE);
		ironHalberdRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) ironHalberdRecipe);
	}

	public void legendaryKatanaRecipe() {
		ItemStack legendaryKatana = ((Weapon2) Main.weaponsMasterList2.get(15)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "16");
		ShapedRecipe legendaryKatanaRecipe = new ShapedRecipe(key, legendaryKatana);
		legendaryKatanaRecipe.shape(new String[] { "  @", " @ ", "%  " });
		legendaryKatanaRecipe.setIngredient('@', Material.NETHERITE_BLOCK);
		legendaryKatanaRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) legendaryKatanaRecipe);
	}

	public void netheriteSpearRecipe() {
		ItemStack netheriteSpear = ((Weapon2) Main.weaponsMasterList2.get(16)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "17");
		ShapedRecipe netheritenSpearRecipe = new ShapedRecipe(key, netheriteSpear);
		netheritenSpearRecipe.shape(new String[] { "  @", " % ", "%  " });
		netheritenSpearRecipe.setIngredient('@', Material.NETHERITE_SWORD);
		netheritenSpearRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) netheritenSpearRecipe);
	}

	public void netheriteFlangedMaceRecipe() {
		ItemStack netheriteFlangedMace = ((Weapon2) Main.weaponsMasterList2.get(17)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "18");
		ShapedRecipe netheriteFlangedMaceRecipe = new ShapedRecipe(key, netheriteFlangedMace);
		netheriteFlangedMaceRecipe.shape(new String[] { "   ", "@  ", "%  " });
		netheriteFlangedMaceRecipe.setIngredient('@', Material.NETHERITE_INGOT);
		netheriteFlangedMaceRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) netheriteFlangedMaceRecipe);
	}

	public void netheriteNaginataRecipe() {
		ItemStack netheriteNaginata = ((Weapon2) Main.weaponsMasterList2.get(18)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "19");
		ShapedRecipe netheriteNaginataRecipe = new ShapedRecipe(key, netheriteNaginata);
		netheriteNaginataRecipe.shape(new String[] { " @ ", " % ", "%  " });
		netheriteNaginataRecipe.setIngredient('@', Material.NETHERITE_SWORD);
		netheriteNaginataRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) netheriteNaginataRecipe);
	}

	public void netheritePikeRecipe() {
		ItemStack netheritePike = ((Weapon2) Main.weaponsMasterList2.get(19)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "20");
		ShapedRecipe netheritePikeRecipe = new ShapedRecipe(key, netheritePike);
		netheritePikeRecipe.shape(new String[] { "  @", " % ", "%  " });
		netheritePikeRecipe.setIngredient('@', Material.NETHERITE_INGOT);
		netheritePikeRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) netheritePikeRecipe);
	}

	public void netheriteDaggerRecipe() {
		ItemStack netheriteDagger = ((Weapon2) Main.weaponsMasterList2.get(20)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "21");
		ShapedRecipe netheriteDaggerRecipe = new ShapedRecipe(key, netheriteDagger);
		netheriteDaggerRecipe.shape(new String[] { "   ", " @ ", "%  " });
		netheriteDaggerRecipe.setIngredient('@', Material.NETHERITE_INGOT);
		netheriteDaggerRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) netheriteDaggerRecipe);
	}

	public void netheriteMorningStarRecipe() {
		ItemStack netheriteMorningStar = ((Weapon2) Main.weaponsMasterList2.get(21)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "22");
		ShapedRecipe netheriteMorningStarRecipe = new ShapedRecipe(key, netheriteMorningStar);
		netheriteMorningStarRecipe.shape(new String[] { " $ ", "$@$", "%$ " });
		netheriteMorningStarRecipe.setIngredient('@', Material.NETHERITE_INGOT);
		netheriteMorningStarRecipe.setIngredient('%', Material.STICK);
		netheriteMorningStarRecipe.setIngredient('$', Material.AMETHYST_SHARD);
		Main.getInstance().getServer().addRecipe((Recipe) netheriteMorningStarRecipe);
	}

	public void netheriteZweihanderRecipe() {
		ItemStack netheriteZweihander = ((Weapon2) Main.weaponsMasterList2.get(22)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "23");
		ShapedRecipe netheriteZweihanderRecipe = new ShapedRecipe(key, netheriteZweihander);
		netheriteZweihanderRecipe.shape(new String[] { "  %", " % ", "@  " });
		netheriteZweihanderRecipe.setIngredient('@', Material.NETHERITE_SWORD);
		netheriteZweihanderRecipe.setIngredient('%', Material.NETHERITE_INGOT);
		Main.getInstance().getServer().addRecipe((Recipe) netheriteZweihanderRecipe);
	}

	public void netheriteWarHammerRecipe() {
		ItemStack netheriteWarHammer = ((Weapon2) Main.weaponsMasterList2.get(23)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "24");
		ShapedRecipe netheriteWarHammerRecipe = new ShapedRecipe(key, netheriteWarHammer);
		netheriteWarHammerRecipe.shape(new String[] { " @ ", " %@", "%  " });
		netheriteWarHammerRecipe.setIngredient('@', Material.NETHERITE_INGOT);
		netheriteWarHammerRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) netheriteWarHammerRecipe);
	}

	public void netheriteShortswordRecipe() {
		ItemStack netheriteShortsword = ((Weapon2) Main.weaponsMasterList2.get(24)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "25");
		ShapedRecipe netheriteShortswordRecipe = new ShapedRecipe(key, netheriteShortsword);
		netheriteShortswordRecipe.shape(new String[] { "  @", " @ ", "%  " });
		netheriteShortswordRecipe.setIngredient('@', Material.NETHERITE_INGOT);
		netheriteShortswordRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) netheriteShortswordRecipe);
	}

	public void netheriteQuarterStaffRecipe() {
		ItemStack netheriteQuarterStaff = ((Weapon2) Main.weaponsMasterList2.get(25)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "26");
		ShapedRecipe netheriteQuarterStaffRecipe = new ShapedRecipe(key, netheriteQuarterStaff);
		netheriteQuarterStaffRecipe.shape(new String[] { "  @", " % ", "@  " });
		netheriteQuarterStaffRecipe.setIngredient('@', Material.NETHERITE_INGOT);
		netheriteQuarterStaffRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) netheriteQuarterStaffRecipe);
	}

	public void netheriteHatchetRecipe() {
		ItemStack netheriteHatchet = ((Weapon2) Main.weaponsMasterList2.get(26)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "27");
		ShapedRecipe netheriteHatchetRecipe = new ShapedRecipe(key, netheriteHatchet);
		netheriteHatchetRecipe.shape(new String[] { "   ", " @@", " @%" });
		netheriteHatchetRecipe.setIngredient('@', Material.NETHERITE_INGOT);
		netheriteHatchetRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) netheriteHatchetRecipe);
	}

	public void netheriteBattleaxeRecipe() {
		ItemStack netheriteBattleaxe = ((Weapon2) Main.weaponsMasterList2.get(27)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "28");
		ShapedRecipe netheriteBattleaxeRecipe = new ShapedRecipe(key, netheriteBattleaxe);
		netheriteBattleaxeRecipe.shape(new String[] { " @ ", " %@", "%  " });
		netheriteBattleaxeRecipe.setIngredient('@', Material.NETHERITE_AXE);
		netheriteBattleaxeRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) netheriteBattleaxeRecipe);
	}

	public void netheriteCombatAxeRecipe() {
		ItemStack netheriteCombatAxe = ((Weapon2) Main.weaponsMasterList2.get(28)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "29");
		ShapedRecipe netheriteCombatAxeRecipe = new ShapedRecipe(key, netheriteCombatAxe);
		netheriteCombatAxeRecipe.shape(new String[] { "   ", "@  ", "%  " });
		netheriteCombatAxeRecipe.setIngredient('@', Material.NETHERITE_INGOT);
		netheriteCombatAxeRecipe.setIngredient('%', Material.NETHERITE_AXE);
		Main.getInstance().getServer().addRecipe((Recipe) netheriteCombatAxeRecipe);
	}

	public void netheriteHalberdRecipe() {
		ItemStack netheriteHalberd = ((Weapon2) Main.weaponsMasterList2.get(29)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "30");
		ShapedRecipe netheriteHalberdRecipe = new ShapedRecipe(key, netheriteHalberd);
		netheriteHalberdRecipe.shape(new String[] { "  @", " % ", "%  " });
		netheriteHalberdRecipe.setIngredient('@', Material.NETHERITE_AXE);
		netheriteHalberdRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) netheriteHalberdRecipe);
	}

	public void ironKunaiRecipe() {
		ItemStack ironKunai = ((Weapon2) Main.weaponsMasterList2.get(30)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "31");
		ShapedRecipe ironKunaiRecipe = new ShapedRecipe(key, ironKunai);
		ironKunaiRecipe.shape(new String[] { "   ", " @ ", "  %" });
		ironKunaiRecipe.setIngredient('@', Material.IRON_INGOT);
		ironKunaiRecipe.setIngredient('%', Material.TRIPWIRE_HOOK);
		Main.getInstance().getServer().addRecipe((Recipe) ironKunaiRecipe);
	}

	public void netheriteKunaiRecipe() {
		ItemStack netheriteKunai = ((Weapon2) Main.weaponsMasterList2.get(33)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "32");
		ShapedRecipe netheriteKunaiRecipe = new ShapedRecipe(key, netheriteKunai);
		netheriteKunaiRecipe.shape(new String[] { "   ", " @ ", "  %" });
		netheriteKunaiRecipe.setIngredient('@', Material.NETHERITE_INGOT);
		netheriteKunaiRecipe.setIngredient('%', Material.TRIPWIRE_HOOK);
		Main.getInstance().getServer().addRecipe((Recipe) netheriteKunaiRecipe);
	}

	public void ironSabreRecipe() {
		ItemStack ironSabre = ((Weapon2) Main.weaponsMasterList2.get(31)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "33");
		ShapedRecipe ironSabreRecipe = new ShapedRecipe(key, ironSabre);
		ironSabreRecipe.shape(new String[] { "  @", " @ ", "$% " });
		ironSabreRecipe.setIngredient('@', Material.IRON_INGOT);
		ironSabreRecipe.setIngredient('%', Material.STICK);
		ironSabreRecipe.setIngredient('$', Material.LAPIS_LAZULI);
		Main.getInstance().getServer().addRecipe((Recipe) ironSabreRecipe);
	}

	public void netheriteSabreRecipe() {
		ItemStack netheriteSabre = ((Weapon2) Main.weaponsMasterList2.get(34)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "34");
		ShapedRecipe netheriteSabreRecipe = new ShapedRecipe(key, netheriteSabre);
		netheriteSabreRecipe.shape(new String[] { "  @", " @ ", "$% " });
		netheriteSabreRecipe.setIngredient('@', Material.NETHERITE_INGOT);
		netheriteSabreRecipe.setIngredient('%', Material.STICK);
		netheriteSabreRecipe.setIngredient('$', Material.AMETHYST_SHARD);
		Main.getInstance().getServer().addRecipe((Recipe) netheriteSabreRecipe);
	}

	public void ironTwinBladeRecipe() {
		ItemStack ironTwinBlade = ((Weapon2) Main.weaponsMasterList2.get(32)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "35");
		ShapedRecipe ironTwinBladeRecipe = new ShapedRecipe(key, ironTwinBlade);
		ironTwinBladeRecipe.shape(new String[] { " $@", "$%$", "@$ " });
		ironTwinBladeRecipe.setIngredient('@', Material.IRON_INGOT);
		ironTwinBladeRecipe.setIngredient('%', Material.STICK);
		ironTwinBladeRecipe.setIngredient('$', Material.DIAMOND);
		Main.getInstance().getServer().addRecipe((Recipe) ironTwinBladeRecipe);
	}

	public void netheriteTwinBladeRecipe() {
		ItemStack netheriteTwinBlade = ((Weapon2) Main.weaponsMasterList2.get(35)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "36");
		ShapedRecipe netheriteTwinBladeRecipe = new ShapedRecipe(key, netheriteTwinBlade);
		netheriteTwinBladeRecipe.shape(new String[] { " $@", "$%$", "@$ " });
		netheriteTwinBladeRecipe.setIngredient('@', Material.NETHERITE_INGOT);
		netheriteTwinBladeRecipe.setIngredient('%', Material.STICK);
		netheriteTwinBladeRecipe.setIngredient('$', Material.GOLD_INGOT);
		Main.getInstance().getServer().addRecipe((Recipe) netheriteTwinBladeRecipe);
	}

	public void ironBattleHoeRecipe() {
		ItemStack ironBattleHoe = ((Weapon2) Main.weaponsMasterList2.get(36)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "37");
		ShapedRecipe ironBattleHoeRecipe = new ShapedRecipe(key, ironBattleHoe);
		ironBattleHoeRecipe.shape(new String[] { "@@@", "@% ", " % " });
		ironBattleHoeRecipe.setIngredient('@', Material.IRON_INGOT);
		ironBattleHoeRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) ironBattleHoeRecipe);
	}

	public void netheriteBattleHoeRecipe() {
		ItemStack netheriteBattleHoe = ((Weapon2) Main.weaponsMasterList2.get(37)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "38");
		ShapedRecipe netheriteBattleHoeRecipe = new ShapedRecipe(key, netheriteBattleHoe);
		netheriteBattleHoeRecipe.shape(new String[] { "@@@", "@% ", " % " });
		netheriteBattleHoeRecipe.setIngredient('@', Material.NETHERITE_INGOT);
		netheriteBattleHoeRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) netheriteBattleHoeRecipe);
	}
	
	public void ironScimitarRecipe() {
		ItemStack ironScimitar = ((Weapon2) Main.weaponsMasterList2.get(38)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "40");
		ShapedRecipe ironScimitarRecipe = new ShapedRecipe(key, ironScimitar);
		ironScimitarRecipe.shape(new String[] { "  @", "%@@", "$% " });
		ironScimitarRecipe.setIngredient('@', Material.IRON_INGOT);
		ironScimitarRecipe.setIngredient('%', Material.GOLD_INGOT);
		ironScimitarRecipe.setIngredient('$', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) ironScimitarRecipe);
	}
	
	public void netheriteScimitarRecipe() {
		ItemStack netheriteScimitar = ((Weapon2) Main.weaponsMasterList2.get(39)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "41");
		ShapedRecipe netheriteScimitarRecipe = new ShapedRecipe(key, netheriteScimitar);
		netheriteScimitarRecipe.shape(new String[] { "  @", "%@@", "$% " });
		netheriteScimitarRecipe.setIngredient('@', Material.NETHERITE_INGOT);
		netheriteScimitarRecipe.setIngredient('%', Material.GOLD_INGOT);
		netheriteScimitarRecipe.setIngredient('$', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) netheriteScimitarRecipe);
	}
	
	public void ironRapierRecipe() {
		ItemStack ironRapier = ((Weapon2) Main.weaponsMasterList2.get(40)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "42");
		ShapedRecipe ironRapierRecipe = new ShapedRecipe(key, ironRapier);
		ironRapierRecipe.shape(new String[] { "  @", " @ ", "%  " });
		ironRapierRecipe.setIngredient('@', Material.IRON_INGOT);
		ironRapierRecipe.setIngredient('%', Material.LIGHTNING_ROD);
		Main.getInstance().getServer().addRecipe((Recipe) ironRapierRecipe);
	}
	
	public void netheriteRapierRecipe() {
		ItemStack netheriteRapier = ((Weapon2) Main.weaponsMasterList2.get(41)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "43");
		ShapedRecipe netheriteRapierRecipe = new ShapedRecipe(key, netheriteRapier);
		netheriteRapierRecipe.shape(new String[] { "  @", " @ ", "%  " });
		netheriteRapierRecipe.setIngredient('@', Material.NETHERITE_INGOT);
		netheriteRapierRecipe.setIngredient('%', Material.LIGHTNING_ROD);
		Main.getInstance().getServer().addRecipe((Recipe) netheriteRapierRecipe);
	}
	
	public void ironScytheRecipe() {
		ItemStack ironScythe = ((Weapon2) Main.weaponsMasterList2.get(42)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "44");
		ShapedRecipe ironScytheRecipe = new ShapedRecipe(key, ironScythe);
		ironScytheRecipe.shape(new String[] { "@@%", " $ ", "$  " });
		ironScytheRecipe.setIngredient('@', Material.IRON_INGOT);
		ironScytheRecipe.setIngredient('%', Material.GOLD_NUGGET);
		ironScytheRecipe.setIngredient('$', Material.IRON_BARS);
		Main.getInstance().getServer().addRecipe((Recipe) ironScytheRecipe);
	}
	
	public void netheriteScytheRecipe() {
		ItemStack netheriteScythe = ((Weapon2) Main.weaponsMasterList2.get(43)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "45");
		ShapedRecipe netheriteScytheRecipe = new ShapedRecipe(key, netheriteScythe);
		netheriteScytheRecipe.shape(new String[] { "@@%", " $ ", "$  " });
		netheriteScytheRecipe.setIngredient('@', Material.NETHERITE_INGOT);
		netheriteScytheRecipe.setIngredient('%', Material.GOLD_NUGGET);
		netheriteScytheRecipe.setIngredient('$', Material.NETHERITE_SCRAP);
		Main.getInstance().getServer().addRecipe((Recipe) netheriteScytheRecipe);
	}
	
	public void diamondKatanaRecipe() {
		ItemStack diamondKatana = ((Weapon2) Main.weaponsMasterList2.get(44)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "46");
		ShapedRecipe diamondKatanaRecipe = new ShapedRecipe(key, diamondKatana);
		diamondKatanaRecipe.shape(new String[] { "  @", " @ ", "%  " });
		diamondKatanaRecipe.setIngredient('@', Material.DIAMOND_BLOCK);
		diamondKatanaRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) diamondKatanaRecipe);
	}
	
	public void diamondSpearRecipe() {
		ItemStack diamondSpear = ((Weapon2) Main.weaponsMasterList2.get(45)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "47");
		ShapedRecipe diamondSpearRecipe = new ShapedRecipe(key, diamondSpear);
		diamondSpearRecipe.shape(new String[] { "  @", " % ", "%  " });
		diamondSpearRecipe.setIngredient('@', Material.DIAMOND_SWORD);
		diamondSpearRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) diamondSpearRecipe);
	}
	
	public void diamondNaginataRecipe() {
		ItemStack diamondNaginata = ((Weapon2) Main.weaponsMasterList2.get(46)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "48");
		ShapedRecipe diamondNaginataRecipe = new ShapedRecipe(key, diamondNaginata);
		diamondNaginataRecipe.shape(new String[] { " @ ", " % ", "%  " });
		diamondNaginataRecipe.setIngredient('@', Material.DIAMOND);
		diamondNaginataRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) diamondNaginataRecipe);
	}
	
	public void diamondPikeRecipe() {
		ItemStack diamondPike = ((Weapon2) Main.weaponsMasterList2.get(47)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "49");
		ShapedRecipe diamondPikeRecipe = new ShapedRecipe(key, diamondPike);
		diamondPikeRecipe.shape(new String[] { "  @", " % ", "%  " });
		diamondPikeRecipe.setIngredient('@', Material.DIAMOND);
		diamondPikeRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) diamondPikeRecipe);
	}
	
	public void diamondDaggerRecipe() {
		ItemStack diamondDagger = ((Weapon2) Main.weaponsMasterList2.get(48)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "50");
		ShapedRecipe diamondDaggerRecipe = new ShapedRecipe(key, diamondDagger);
		diamondDaggerRecipe.shape(new String[] { "   ", " @ ", "%  " });
		diamondDaggerRecipe.setIngredient('@', Material.DIAMOND);
		diamondDaggerRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) diamondDaggerRecipe);
	}
	
	public void diamondZweihanderRecipe() {
		ItemStack diamondZweihander = ((Weapon2) Main.weaponsMasterList2.get(49)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "51");
		ShapedRecipe diamondZweihanderRecipe = new ShapedRecipe(key, diamondZweihander);
		diamondZweihanderRecipe.shape(new String[] { "  %", " % ", "@  " });
		diamondZweihanderRecipe.setIngredient('@', Material.DIAMOND_SWORD);
		diamondZweihanderRecipe.setIngredient('%', Material.DIAMOND);
		Main.getInstance().getServer().addRecipe((Recipe) diamondZweihanderRecipe);
	}
	
	public void dimamondShortswordRecipe() {
		ItemStack diamondShortsword = ((Weapon2) Main.weaponsMasterList2.get(50)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "52");
		ShapedRecipe dimamondShortswordRecipe = new ShapedRecipe(key, diamondShortsword);
		dimamondShortswordRecipe.shape(new String[] { "  @", " @ ", "%  " });
		dimamondShortswordRecipe.setIngredient('@', Material.DIAMOND);
		dimamondShortswordRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) dimamondShortswordRecipe);
	}
	
	public void diamondQuarterStaffRecipe() {
		ItemStack dimaondQuarterstaff = ((Weapon2) Main.weaponsMasterList2.get(51)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "53");
		ShapedRecipe diamondQuarterStaffRecipe = new ShapedRecipe(key, dimaondQuarterstaff);
		diamondQuarterStaffRecipe.shape(new String[] { "  @", " % ", "@  " });
		diamondQuarterStaffRecipe.setIngredient('@', Material.DIAMOND);
		diamondQuarterStaffRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) diamondQuarterStaffRecipe);
	}
	
	public void diamondKunaiRecipe() {
		ItemStack diamondKunai = ((Weapon2) Main.weaponsMasterList2.get(52)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "54");
		ShapedRecipe diamondKunaiRecipe = new ShapedRecipe(key, diamondKunai);
		diamondKunaiRecipe.shape(new String[] { "   ", " @ ", "  %" });
		diamondKunaiRecipe.setIngredient('@', Material.DIAMOND);
		diamondKunaiRecipe.setIngredient('%', Material.TRIPWIRE_HOOK);
		Main.getInstance().getServer().addRecipe((Recipe) diamondKunaiRecipe);
	}
	
	public void diamondSabreRecipe() {
		ItemStack diamondSabre = ((Weapon2) Main.weaponsMasterList2.get(53)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "55");
		ShapedRecipe diamondSabreRecipe = new ShapedRecipe(key, diamondSabre);
		diamondSabreRecipe.shape(new String[] { "  @", " @ ", "$% " });
		diamondSabreRecipe.setIngredient('@', Material.DIAMOND);
		diamondSabreRecipe.setIngredient('%', Material.STICK);
		diamondSabreRecipe.setIngredient('$', Material.LAPIS_LAZULI);
		Main.getInstance().getServer().addRecipe((Recipe) diamondSabreRecipe);
	}
	
	public void diamondTwinBladeRecipe() {
		ItemStack diamondTwinBlade = ((Weapon2) Main.weaponsMasterList2.get(54)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "56");
		ShapedRecipe diamondTwinBladeRecipe = new ShapedRecipe(key, diamondTwinBlade);
		diamondTwinBladeRecipe.shape(new String[] { " $@", "$%$", "@$ " });
		diamondTwinBladeRecipe.setIngredient('@', Material.DIAMOND);
		diamondTwinBladeRecipe.setIngredient('%', Material.STICK);
		diamondTwinBladeRecipe.setIngredient('$', Material.GOLD_INGOT);
		Main.getInstance().getServer().addRecipe((Recipe) diamondTwinBladeRecipe);
	}
	
	public void diamondScimitarRecipe() {
		ItemStack diamondScimitar = ((Weapon2) Main.weaponsMasterList2.get(55)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "57");
		ShapedRecipe diamondScimitarRecipe = new ShapedRecipe(key, diamondScimitar);
		diamondScimitarRecipe.shape(new String[] { "  @", "%@@", "$% " });
		diamondScimitarRecipe.setIngredient('@', Material.DIAMOND);
		diamondScimitarRecipe.setIngredient('%', Material.GOLD_INGOT);
		diamondScimitarRecipe.setIngredient('$', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) diamondScimitarRecipe);
	}
	
	public void diamondRapierRecipe() {
		ItemStack diamondRapier = ((Weapon2) Main.weaponsMasterList2.get(56)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "58");
		ShapedRecipe diamondRapierRecipe = new ShapedRecipe(key, diamondRapier);
		diamondRapierRecipe.shape(new String[] { "  @", " @ ", "%  " });
		diamondRapierRecipe.setIngredient('@', Material.DIAMOND);
		diamondRapierRecipe.setIngredient('%', Material.LIGHTNING_ROD);
		Main.getInstance().getServer().addRecipe((Recipe) diamondRapierRecipe);
	}
	
	public void diamondFlangedMaceRecipe() {
		ItemStack diamondFlangedMace = ((Weapon2) Main.weaponsMasterList2.get(57)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "59");
		ShapedRecipe diamondFlangedMaceRecipe = new ShapedRecipe(key, diamondFlangedMace);
		diamondFlangedMaceRecipe.shape(new String[] { "   ", "@  ", "%  " });
		diamondFlangedMaceRecipe.setIngredient('@', Material.DIAMOND);
		diamondFlangedMaceRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) diamondFlangedMaceRecipe);
	}
	
	public void diamondMorningStarRecipe() {
		ItemStack diamondMorningStar = ((Weapon2) Main.weaponsMasterList2.get(58)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "60");
		ShapedRecipe diamondMorningStarRecipe = new ShapedRecipe(key, diamondMorningStar);
		diamondMorningStarRecipe.shape(new String[] { " $ ", "$@$", "%$ " });
		diamondMorningStarRecipe.setIngredient('@', Material.DIAMOND);
		diamondMorningStarRecipe.setIngredient('%', Material.STICK);
		diamondMorningStarRecipe.setIngredient('$', Material.AMETHYST_SHARD);
		Main.getInstance().getServer().addRecipe((Recipe) diamondMorningStarRecipe);
	}
	
	public void diamondWarHammerRecipe() {
		ItemStack diamondWarHammer = ((Weapon2) Main.weaponsMasterList2.get(59)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "61");
		ShapedRecipe diamondWarHammerRecipe = new ShapedRecipe(key, diamondWarHammer);
		diamondWarHammerRecipe.shape(new String[] { " @ ", " %@", "%  " });
		diamondWarHammerRecipe.setIngredient('@', Material.DIAMOND);
		diamondWarHammerRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) diamondWarHammerRecipe);
	}
	
	public void diamondHatchetRecipe() {
		ItemStack diamondHatchet = ((Weapon2) Main.weaponsMasterList2.get(60)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "62");
		ShapedRecipe diamondHatchetRecipe = new ShapedRecipe(key, diamondHatchet);
		diamondHatchetRecipe.shape(new String[] { "   ", " @@", " @%" });
		diamondHatchetRecipe.setIngredient('@', Material.DIAMOND);
		diamondHatchetRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) diamondHatchetRecipe);
	}
	
	public void diamondBattleaxeRecipe() {
		ItemStack diamondBattleaxe = ((Weapon2) Main.weaponsMasterList2.get(61)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "63");
		ShapedRecipe diamondBattleaxeRecipe = new ShapedRecipe(key, diamondBattleaxe);
		diamondBattleaxeRecipe.shape(new String[] { " @ ", " %@", "%  " });
		diamondBattleaxeRecipe.setIngredient('@', Material.DIAMOND_AXE);
		diamondBattleaxeRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) diamondBattleaxeRecipe);
	}
	
	public void diamondCombatAxeRecipe() {
		ItemStack diamondCombatAxe = ((Weapon2) Main.weaponsMasterList2.get(62)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "64");
		ShapedRecipe diamondCombatAxeRecipe = new ShapedRecipe(key, diamondCombatAxe);
		diamondCombatAxeRecipe.shape(new String[] { "   ", "@  ", "%  " });
		diamondCombatAxeRecipe.setIngredient('@', Material.DIAMOND);
		diamondCombatAxeRecipe.setIngredient('%', Material.DIAMOND_AXE);
		Main.getInstance().getServer().addRecipe((Recipe) diamondCombatAxeRecipe);
	}
	
	public void diamondHalberdRecipe() {
		ItemStack diamondHalberd = ((Weapon2) Main.weaponsMasterList2.get(63)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "65");
		ShapedRecipe diamondHalberdRecipe = new ShapedRecipe(key, diamondHalberd);
		diamondHalberdRecipe.shape(new String[] { "  @", " % ", "%  " });
		diamondHalberdRecipe.setIngredient('@', Material.DIAMOND_AXE);
		diamondHalberdRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) diamondHalberdRecipe);
	}
	
	public void diamondBattleHoeRecipe() {
		ItemStack diamondBattleHoe = ((Weapon2) Main.weaponsMasterList2.get(64)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "66");
		ShapedRecipe diamondBattleHoeRecipe = new ShapedRecipe(key, diamondBattleHoe);
		diamondBattleHoeRecipe.shape(new String[] { "@@@", "@% ", " % " });
		diamondBattleHoeRecipe.setIngredient('@', Material.DIAMOND);
		diamondBattleHoeRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) diamondBattleHoeRecipe);
	}
	
	public void diamondScytheRecipe() {
		ItemStack diamondScythe = ((Weapon2) Main.weaponsMasterList2.get(65)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "67");
		ShapedRecipe diamondScytheRecipe = new ShapedRecipe(key, diamondScythe);
		diamondScytheRecipe.shape(new String[] { "@@%", " @ ", "@  " });
		diamondScytheRecipe.setIngredient('@', Material.DIAMOND);
		diamondScytheRecipe.setIngredient('%', Material.GOLD_NUGGET);
		Main.getInstance().getServer().addRecipe((Recipe) diamondScytheRecipe);
	}
	
	public void ironHookRecipe() {
		ItemStack ironHook = ((Weapon2) Main.weaponsMasterList2.get(66)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "68");
		ShapedRecipe ironHookRecipe = new ShapedRecipe(key, ironHook);
		ironHookRecipe.shape(new String[] { " @@", " % ", " $ " });
		ironHookRecipe.setIngredient('@', Material.IRON_NUGGET);
		ironHookRecipe.setIngredient('%', Material.IRON_INGOT);
		ironHookRecipe.setIngredient('$', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) ironHookRecipe);
	}
	
	public void diamondHookRecipe() {
		ItemStack ironHook = ((Weapon2) Main.weaponsMasterList2.get(67)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "69");
		ShapedRecipe ironHookRecipe = new ShapedRecipe(key, ironHook);
		ironHookRecipe.shape(new String[] { " @@", " @ ", " $ " });
		ironHookRecipe.setIngredient('@', Material.DIAMOND);
		ironHookRecipe.setIngredient('$', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) ironHookRecipe);
	}
	
	public void netheriteHookRecipe() {
		ItemStack netheriteHook = ((Weapon2) Main.weaponsMasterList2.get(68)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "70");
		ShapedRecipe netheriteHookRecipe = new ShapedRecipe(key, netheriteHook);
		netheriteHookRecipe.shape(new String[] { " @@", " % ", " $ " });
		netheriteHookRecipe.setIngredient('@', Material.NETHERITE_SCRAP);
		netheriteHookRecipe.setIngredient('%', Material.NETHERITE_INGOT);
		netheriteHookRecipe.setIngredient('$', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) netheriteHookRecipe);
	}
	
	public void ironMaceRecipe() {
		ItemStack ironMace = ((Weapon2) Main.weaponsMasterList2.get(69)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "71");
		ShapedRecipe ironMaceRecipe = new ShapedRecipe(key, ironMace);
		ironMaceRecipe.shape(new String[] { "  @", " % ", "$  " });
		ironMaceRecipe.setIngredient('@', Material.IRON_INGOT);
		ironMaceRecipe.setIngredient('%', Material.STICK);
		ironMaceRecipe.setIngredient('$', Material.LEATHER);
		Main.getInstance().getServer().addRecipe((Recipe) ironMaceRecipe);
	}
	
	public void diamondMaceRecipe() {
		ItemStack diamondMace = ((Weapon2) Main.weaponsMasterList2.get(70)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "72");
		ShapedRecipe diamondMaceRecipe = new ShapedRecipe(key, diamondMace);
		diamondMaceRecipe.shape(new String[] { "  @", " % ", "$  " });
		diamondMaceRecipe.setIngredient('@', Material.DIAMOND);
		diamondMaceRecipe.setIngredient('%', Material.STICK);
		diamondMaceRecipe.setIngredient('$', Material.LEATHER);
		Main.getInstance().getServer().addRecipe((Recipe) diamondMaceRecipe);
	}
	
	public void netheriteMaceRecipe() {
		ItemStack netheriteMace = ((Weapon2) Main.weaponsMasterList2.get(71)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "73");
		ShapedRecipe netheriteMaceRecipe = new ShapedRecipe(key, netheriteMace);
		netheriteMaceRecipe.shape(new String[] { "  @", " % ", "$  " });
		netheriteMaceRecipe.setIngredient('@', Material.NETHERITE_INGOT);
		netheriteMaceRecipe.setIngredient('%', Material.STICK);
		netheriteMaceRecipe.setIngredient('$', Material.RABBIT_HIDE);
		Main.getInstance().getServer().addRecipe((Recipe) netheriteMaceRecipe);
	}
	
	public void ironGreatswordRecipe() {
		ItemStack ironGreatsword = ((Weapon2) Main.weaponsMasterList2.get(72)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "74");
		ShapedRecipe ironGreatswordRecipe = new ShapedRecipe(key, ironGreatsword);
		ironGreatswordRecipe.shape(new String[] { " @ ", "%@%", " $ " });
		ironGreatswordRecipe.setIngredient('@', Material.IRON_INGOT);
		ironGreatswordRecipe.setIngredient('%', Material.STICK);
		ironGreatswordRecipe.setIngredient('$', Material.OAK_LOG);
		Main.getInstance().getServer().addRecipe((Recipe) ironGreatswordRecipe);
	}
	
	public void diamondGreatswordRecipe() {
		ItemStack diamondGreatsword = ((Weapon2) Main.weaponsMasterList2.get(73)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "75");
		ShapedRecipe diamondGreatswordRecipe = new ShapedRecipe(key, diamondGreatsword);
		diamondGreatswordRecipe.shape(new String[] { " @ ", "%@%", " $ " });
		diamondGreatswordRecipe.setIngredient('@', Material.DIAMOND);
		diamondGreatswordRecipe.setIngredient('%', Material.STICK);
		diamondGreatswordRecipe.setIngredient('$', Material.OAK_LOG);
		Main.getInstance().getServer().addRecipe((Recipe) diamondGreatswordRecipe);
	}
	
	public void netheriteGreatswordRecipe() {
		ItemStack netheriteGreatsword = ((Weapon2) Main.weaponsMasterList2.get(74)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "76");
		ShapedRecipe netheriteGreatswordRecipe = new ShapedRecipe(key, netheriteGreatsword);
		netheriteGreatswordRecipe.shape(new String[] { " @ ", "%@%", " $ " });
		netheriteGreatswordRecipe.setIngredient('@', Material.NETHERITE_INGOT);
		netheriteGreatswordRecipe.setIngredient('%', Material.STICK);
		netheriteGreatswordRecipe.setIngredient('$', Material.OAK_LOG);
		Main.getInstance().getServer().addRecipe((Recipe) netheriteGreatswordRecipe);
	}
	
	public void ironBidentRecipe() {
		ItemStack ironBident = ((Weapon2) Main.weaponsMasterList2.get(75)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "77");
		ShapedRecipe ironBidentRecipe = new ShapedRecipe(key, ironBident);
		ironBidentRecipe.shape(new String[] { "@ @", " @ ", " % " });
		ironBidentRecipe.setIngredient('@', Material.IRON_INGOT);
		ironBidentRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) ironBidentRecipe);
	}
	
	public void diamondBidentRecipe() {
		ItemStack diamondBident = ((Weapon2) Main.weaponsMasterList2.get(76)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "78");
		ShapedRecipe diamondBidentRecipe = new ShapedRecipe(key, diamondBident);
		diamondBidentRecipe.shape(new String[] { "@ @", " @ ", " % " });
		diamondBidentRecipe.setIngredient('@', Material.DIAMOND);
		diamondBidentRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) diamondBidentRecipe);
	}
	
	public void netheriteBidentRecipe() {
		ItemStack netheriteBident = ((Weapon2) Main.weaponsMasterList2.get(77)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "79");
		ShapedRecipe netheriteBidentRecipe = new ShapedRecipe(key, netheriteBident);
		netheriteBidentRecipe.shape(new String[] { "@ @", " @ ", " % " });
		netheriteBidentRecipe.setIngredient('@', Material.NETHERITE_INGOT);
		netheriteBidentRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) netheriteBidentRecipe);
	}
	
	public void diamondGiantSwordRecipe() {
		ItemStack diamondGiantSword = ((Weapon2) Main.weaponsMasterList2.get(78)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "80");
		ShapedRecipe diamondGiantSwordRecipe = new ShapedRecipe(key, diamondGiantSword);
		diamondGiantSwordRecipe.shape(new String[] { " @@", "%@@", "$% " });
		diamondGiantSwordRecipe.setIngredient('@', Material.DIAMOND);
		diamondGiantSwordRecipe.setIngredient('%', Material.GOLD_INGOT);
		diamondGiantSwordRecipe.setIngredient('$', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) diamondGiantSwordRecipe);
	}
	
	public void ironDaneAxeRecipe() {
		ItemStack ironDaneAxe = ((Weapon2) Main.weaponsMasterList2.get(79)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "81");
		ShapedRecipe ironDaneAxeRecipe = new ShapedRecipe(key, ironDaneAxe);
		ironDaneAxeRecipe.shape(new String[] { "   ", " @ ", "%  " });
		ironDaneAxeRecipe.setIngredient('@', Material.IRON_AXE);
		ironDaneAxeRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) ironDaneAxeRecipe);
	}
	
	public void diamondDaneAxeRecipe() {
		ItemStack diamondDaneAxe = ((Weapon2) Main.weaponsMasterList2.get(80)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "82");
		ShapedRecipe diamondDaneAxeRecipe = new ShapedRecipe(key, diamondDaneAxe);
		diamondDaneAxeRecipe.shape(new String[] { "   ", " @ ", "%  " });
		diamondDaneAxeRecipe.setIngredient('@', Material.DIAMOND_AXE);
		diamondDaneAxeRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) diamondDaneAxeRecipe);
	}
	
	public void netheriteDaneAxeRecipe() {
		ItemStack netheriteDaneAxe = ((Weapon2) Main.weaponsMasterList2.get(81)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "83");
		ShapedRecipe netheriteDaneAxeRecipe = new ShapedRecipe(key, netheriteDaneAxe);
		netheriteDaneAxeRecipe.shape(new String[] { "   ", " @ ", "%  " });
		netheriteDaneAxeRecipe.setIngredient('@', Material.NETHERITE_AXE);
		netheriteDaneAxeRecipe.setIngredient('%', Material.STICK);
		Main.getInstance().getServer().addRecipe((Recipe) netheriteDaneAxeRecipe);
	}
	
	public void ironAntlerStaffRecipe() {
		ItemStack ironAntlerStaff = ((Weapon2) Main.weaponsMasterList2.get(82)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "84");
		ShapedRecipe ironAntlerStaffRecipe = new ShapedRecipe(key, ironAntlerStaff);
		ironAntlerStaffRecipe.shape(new String[] { "@%@", "$^&", "^$#" });
		ironAntlerStaffRecipe.setIngredient('@', Material.IRON_INGOT);
		ironAntlerStaffRecipe.setIngredient('%', Material.BONE_BLOCK);
		ironAntlerStaffRecipe.setIngredient('$', Material.TWISTING_VINES);
		ironAntlerStaffRecipe.setIngredient('^', Material.WARPED_STEM);
		ironAntlerStaffRecipe.setIngredient('&', Material.IRON_NUGGET);
		ironAntlerStaffRecipe.setIngredient('#', Material.STRING);
		Main.getInstance().getServer().addRecipe((Recipe) ironAntlerStaffRecipe);
	}
	
	public void diamondAntlerStaffRecipe() {
		ItemStack diamondAntlerStaff = ((Weapon2) Main.weaponsMasterList2.get(83)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "85");
		ShapedRecipe diamondAntlerStaffRecipe = new ShapedRecipe(key, diamondAntlerStaff);
		diamondAntlerStaffRecipe.shape(new String[] { "@%@", "$^&", "^$#" });
		diamondAntlerStaffRecipe.setIngredient('@', Material.DIAMOND);
		diamondAntlerStaffRecipe.setIngredient('%', Material.BONE_BLOCK);
		diamondAntlerStaffRecipe.setIngredient('$', Material.TWISTING_VINES);
		diamondAntlerStaffRecipe.setIngredient('^', Material.WARPED_STEM);
		diamondAntlerStaffRecipe.setIngredient('&', Material.COPPER_INGOT);
		diamondAntlerStaffRecipe.setIngredient('#', Material.STRING);
		Main.getInstance().getServer().addRecipe((Recipe) diamondAntlerStaffRecipe);
	}
	
	public void netheriteAntlerStaffRecipe() {
		ItemStack netheriteAntlerStaff = ((Weapon2) Main.weaponsMasterList2.get(84)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "86");
		ShapedRecipe netheriteAntlerStaffRecipe = new ShapedRecipe(key, netheriteAntlerStaff);
		netheriteAntlerStaffRecipe.shape(new String[] { "@%@", "$^&", "^$#" });
		netheriteAntlerStaffRecipe.setIngredient('@', Material.NETHERITE_INGOT);
		netheriteAntlerStaffRecipe.setIngredient('%', Material.BONE_BLOCK);
		netheriteAntlerStaffRecipe.setIngredient('$', Material.TWISTING_VINES);
		netheriteAntlerStaffRecipe.setIngredient('^', Material.WARPED_STEM);
		netheriteAntlerStaffRecipe.setIngredient('&', Material.GOLD_NUGGET);
		netheriteAntlerStaffRecipe.setIngredient('#', Material.STRING);
		Main.getInstance().getServer().addRecipe((Recipe) netheriteAntlerStaffRecipe);
	}
	
	public void faeBowRecipe() {
		ItemStack faeBow = ((Weapon2) Main.weaponsMasterList2.get(85)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "87");
		ShapedRecipe faeBowRecipe = new ShapedRecipe(key, faeBow);
		faeBowRecipe.shape(new String[] { " @$", "@%^", " @$" });
		faeBowRecipe.setIngredient('@', Material.STRIPPED_MANGROVE_LOG);
		faeBowRecipe.setIngredient('%', Material.CROSSBOW);
		faeBowRecipe.setIngredient('$', Material.GOLD_NUGGET);
		faeBowRecipe.setIngredient('^', Material.FLOWERING_AZALEA_LEAVES);
		Main.getInstance().getServer().addRecipe((Recipe) faeBowRecipe);
	}
	
}
