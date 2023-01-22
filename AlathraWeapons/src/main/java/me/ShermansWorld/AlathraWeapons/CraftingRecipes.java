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

	public void obsidianObliteratorRecipe() {
		ItemStack obsidianObliterator = ((Weapon2) Main.weaponsMasterList2.get(38)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "39");
		ShapedRecipe obsidianObliteratorRecipe = new ShapedRecipe(key, obsidianObliterator);
		obsidianObliteratorRecipe.shape(new String[] { " $%", "$@$", "%$ " });
		obsidianObliteratorRecipe.setIngredient('@', Material.NETHERITE_INGOT);
		obsidianObliteratorRecipe.setIngredient('%', Material.OBSIDIAN);
		obsidianObliteratorRecipe.setIngredient('$', Material.GLOWSTONE_DUST);
		Main.getInstance().getServer().addRecipe((Recipe) obsidianObliteratorRecipe);
	}
	
	public void ironScimitarRecipe() {
		ItemStack ironScimitar = ((Weapon2) Main.weaponsMasterList2.get(39)).getItem();
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
		ItemStack netheriteScimitar = ((Weapon2) Main.weaponsMasterList2.get(40)).getItem();
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
		ItemStack ironRapier = ((Weapon2) Main.weaponsMasterList2.get(41)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "42");
		ShapedRecipe ironRapierRecipe = new ShapedRecipe(key, ironRapier);
		ironRapierRecipe.shape(new String[] { "  @", " @ ", "%  " });
		ironRapierRecipe.setIngredient('@', Material.IRON_INGOT);
		ironRapierRecipe.setIngredient('%', Material.LIGHTNING_ROD);
		Main.getInstance().getServer().addRecipe((Recipe) ironRapierRecipe);
	}
	
	public void netheriteRapierRecipe() {
		ItemStack netheriteRapier = ((Weapon2) Main.weaponsMasterList2.get(42)).getItem();
		NamespacedKey key = new NamespacedKey((Plugin) Main.getInstance(),
				String.valueOf(Main.getInstance().getDescription().getName()) + "43");
		ShapedRecipe netheriteRapierRecipe = new ShapedRecipe(key, netheriteRapier);
		netheriteRapierRecipe.shape(new String[] { "  @", " @ ", "%  " });
		netheriteRapierRecipe.setIngredient('@', Material.NETHERITE_INGOT);
		netheriteRapierRecipe.setIngredient('%', Material.LIGHTNING_ROD);
		Main.getInstance().getServer().addRecipe((Recipe) netheriteRapierRecipe);
	}
}
