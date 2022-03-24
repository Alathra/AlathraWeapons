package me.ShermansWorld.AlathraWeapons;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;



public class CraftingRecipes implements Listener {
	
	public void katanaRecipe() {
		ItemStack katana = Main.weaponsMasterList.get(0).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "1");
	    ShapedRecipe katanaRecipe = new ShapedRecipe(key, katana);
	    katanaRecipe.shape("  @", " @ ", "%  ");
	    katanaRecipe.setIngredient('@', Material.IRON_BLOCK);
	    katanaRecipe.setIngredient('%', Material.STICK);
	    Main.getInstance().getServer().addRecipe(katanaRecipe);
	}
	
	public void ironSpearRecipe() {
		ItemStack ironSpear = Main.weaponsMasterList.get(1).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "4");
	    ShapedRecipe ironSpearRecipe = new ShapedRecipe(key, ironSpear);
	    ironSpearRecipe.shape("  @", " % ", "%  ");
	    ironSpearRecipe.setIngredient('@', Material.IRON_SWORD);
	    ironSpearRecipe.setIngredient('%', Material.STICK);
	    Main.getInstance().getServer().addRecipe(ironSpearRecipe);
	}
	
	public void ironFlangedMaceRecipe() {
		ItemStack ironFlangedMace = Main.weaponsMasterList.get(2).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "6");
	    ShapedRecipe ironFlangedMaceRecipe = new ShapedRecipe(key, ironFlangedMace);
	    ironFlangedMaceRecipe.shape("   ", "@  ", "%  ");
	    ironFlangedMaceRecipe.setIngredient('@', Material.IRON_INGOT);
	    ironFlangedMaceRecipe.setIngredient('%', Material.STICK);
	    Main.getInstance().getServer().addRecipe(ironFlangedMaceRecipe);
	}
	
	public void ironNaginataRecipe() {
		ItemStack ironNaginata = Main.weaponsMasterList.get(3).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "5");
	    ShapedRecipe ironNaginataRecipe = new ShapedRecipe(key, ironNaginata);
	    ironNaginataRecipe.shape(" @ ", " % ", "%  ");
	    ironNaginataRecipe.setIngredient('@', Material.IRON_SWORD);
	    ironNaginataRecipe.setIngredient('%', Material.STICK);
	    Main.getInstance().getServer().addRecipe(ironNaginataRecipe);
	}
	
	public void ironPikeRecipe() {
		ItemStack ironPike = Main.weaponsMasterList.get(4).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "3");
	    ShapedRecipe ironPikeRecipe = new ShapedRecipe(key, ironPike);
	    ironPikeRecipe.shape("  @", " % ", "%  ");
	    ironPikeRecipe.setIngredient('@', Material.IRON_INGOT);
	    ironPikeRecipe.setIngredient('%', Material.STICK);
	    Main.getInstance().getServer().addRecipe(ironPikeRecipe);
	}
	
	public void ironDaggerRecipe() {
		ItemStack ironDagger = Main.weaponsMasterList.get(5).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "7");
	    ShapedRecipe ironDaggerRecipe = new ShapedRecipe(key, ironDagger);
	    ironDaggerRecipe.shape("   ", " @ ", "%  ");
	    ironDaggerRecipe.setIngredient('@', Material.IRON_INGOT);
	    ironDaggerRecipe.setIngredient('%', Material.STICK);
	    Main.getInstance().getServer().addRecipe(ironDaggerRecipe);
	}
	
	public void ironMorningStarRecipe() {
		ItemStack ironMorningStar = Main.weaponsMasterList.get(6).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "8");
	    ShapedRecipe ironMorningStarRecipe = new ShapedRecipe(key, ironMorningStar);
	    ironMorningStarRecipe.shape(" $ ", "$@$", "%$ ");
	    ironMorningStarRecipe.setIngredient('@', Material.IRON_INGOT);
	    ironMorningStarRecipe.setIngredient('%', Material.STICK);
	    ironMorningStarRecipe.setIngredient('$', Material.IRON_NUGGET);
	    Main.getInstance().getServer().addRecipe(ironMorningStarRecipe);
	}
	
	public void ironZweihanderRecipe() {
		ItemStack ironZweihander = Main.weaponsMasterList.get(7).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "9");
	    ShapedRecipe ironZweihanderRecipe = new ShapedRecipe(key, ironZweihander);
	    ironZweihanderRecipe.shape("  %", " % ", "@  ");
	    ironZweihanderRecipe.setIngredient('@', Material.IRON_SWORD);
	    ironZweihanderRecipe.setIngredient('%', Material.IRON_INGOT);
	    Main.getInstance().getServer().addRecipe(ironZweihanderRecipe);
	}
	
	public void ironWarHammerRecipe() {
		ItemStack ironWarHammer = Main.weaponsMasterList.get(8).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "10");
	    ShapedRecipe ironWarHammerRecipe = new ShapedRecipe(key, ironWarHammer);
	    ironWarHammerRecipe.shape(" @ ", " %@", "%  ");
	    ironWarHammerRecipe.setIngredient('@', Material.IRON_INGOT);
	    ironWarHammerRecipe.setIngredient('%', Material.STICK);
	    Main.getInstance().getServer().addRecipe(ironWarHammerRecipe);
	}
	
	public void ironShortswordRecipe() {
		ItemStack ironShortsword = Main.weaponsMasterList.get(9).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "11");
	    ShapedRecipe ironShortswordRecipe = new ShapedRecipe(key, ironShortsword);
	    ironShortswordRecipe.shape("  @", " @ ", "%  ");
	    ironShortswordRecipe.setIngredient('@', Material.IRON_INGOT);
	    ironShortswordRecipe.setIngredient('%', Material.STICK);
	    Main.getInstance().getServer().addRecipe(ironShortswordRecipe);
	}
	
	public void ironQuarterStaffRecipe() {
		ItemStack ironQuarterStaff = Main.weaponsMasterList.get(10).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "2");
	    ShapedRecipe ironQuarterStaffRecipe = new ShapedRecipe(key, ironQuarterStaff);
	    ironQuarterStaffRecipe.shape("  @", " % ", "@  ");
	    ironQuarterStaffRecipe.setIngredient('@', Material.IRON_INGOT);
	    ironQuarterStaffRecipe.setIngredient('%', Material.STICK);
	    Main.getInstance().getServer().addRecipe(ironQuarterStaffRecipe);
	}
	
	public void ironHatchetRecipe() {
		ItemStack ironHatchet = Main.weaponsMasterList.get(11).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "12");
	    ShapedRecipe ironHatchetRecipe = new ShapedRecipe(key, ironHatchet);
	    ironHatchetRecipe.shape("   ", " @@", " @%");
	    ironHatchetRecipe.setIngredient('@', Material.IRON_INGOT);
	    ironHatchetRecipe.setIngredient('%', Material.STICK);
	    Main.getInstance().getServer().addRecipe(ironHatchetRecipe);
	}
	
	public void ironBattleaxeRecipe() {
		ItemStack ironBattleaxe = Main.weaponsMasterList.get(12).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "13");
	    ShapedRecipe ironBattleaxeRecipe = new ShapedRecipe(key, ironBattleaxe);
	    ironBattleaxeRecipe.shape(" @ ", " %@", "%  ");
	    ironBattleaxeRecipe.setIngredient('@', Material.IRON_AXE);
	    ironBattleaxeRecipe.setIngredient('%', Material.STICK);
	    Main.getInstance().getServer().addRecipe(ironBattleaxeRecipe);
	}
	
	public void ironCombatAxeRecipe() {
		ItemStack ironCombatAxe = Main.weaponsMasterList.get(13).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "14");
	    ShapedRecipe ironCombatAxeRecipe = new ShapedRecipe(key, ironCombatAxe);
	    ironCombatAxeRecipe.shape("   ", "@  ", "%  ");
	    ironCombatAxeRecipe.setIngredient('@', Material.IRON_INGOT);
	    ironCombatAxeRecipe.setIngredient('%', Material.IRON_AXE);
	    Main.getInstance().getServer().addRecipe(ironCombatAxeRecipe);
	}
	
	public void ironHalberdRecipe() {
		ItemStack ironHalberd = Main.weaponsMasterList.get(14).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "15");
	    ShapedRecipe ironHalberdRecipe = new ShapedRecipe(key, ironHalberd);
	    ironHalberdRecipe.shape("  @", " % ", "%  ");
	    ironHalberdRecipe.setIngredient('@', Material.IRON_AXE);
	    ironHalberdRecipe.setIngredient('%', Material.STICK);
	    Main.getInstance().getServer().addRecipe(ironHalberdRecipe);
	}
	
	public void legendaryKatanaRecipe() {
		ItemStack legendaryKatana = Main.weaponsMasterList.get(15).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "16");
	    ShapedRecipe legendaryKatanaRecipe = new ShapedRecipe(key, legendaryKatana);
	    legendaryKatanaRecipe.shape("  @", " @ ", "%  ");
	    legendaryKatanaRecipe.setIngredient('@', Material.NETHERITE_BLOCK);
	    legendaryKatanaRecipe.setIngredient('%', Material.STICK);
	    Main.getInstance().getServer().addRecipe(legendaryKatanaRecipe);
	}
	
	public void netheriteSpearRecipe() {
		ItemStack netheriteSpear = Main.weaponsMasterList.get(16).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "17");
	    ShapedRecipe netheritenSpearRecipe = new ShapedRecipe(key, netheriteSpear);
	    netheritenSpearRecipe.shape("  @", " % ", "%  ");
	    netheritenSpearRecipe.setIngredient('@', Material.NETHERITE_SWORD);
	    netheritenSpearRecipe.setIngredient('%', Material.STICK);
	    Main.getInstance().getServer().addRecipe(netheritenSpearRecipe);
	}
	
	public void netheriteFlangedMaceRecipe() {
		ItemStack netheriteFlangedMace = Main.weaponsMasterList.get(17).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "18");
	    ShapedRecipe netheriteFlangedMaceRecipe = new ShapedRecipe(key, netheriteFlangedMace);
	    netheriteFlangedMaceRecipe.shape("   ", "@  ", "%  ");
	    netheriteFlangedMaceRecipe.setIngredient('@', Material.NETHERITE_INGOT);
	    netheriteFlangedMaceRecipe.setIngredient('%', Material.STICK);
	    Main.getInstance().getServer().addRecipe(netheriteFlangedMaceRecipe);
	}
	
	public void netheriteNaginataRecipe() {
		ItemStack netheriteNaginata = Main.weaponsMasterList.get(18).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "19");
	    ShapedRecipe netheriteNaginataRecipe = new ShapedRecipe(key, netheriteNaginata);
	    netheriteNaginataRecipe.shape(" @ ", " % ", "%  ");
	    netheriteNaginataRecipe.setIngredient('@', Material.NETHERITE_SWORD);
	    netheriteNaginataRecipe.setIngredient('%', Material.STICK);
	    Main.getInstance().getServer().addRecipe(netheriteNaginataRecipe);
	}
	
	public void netheritePikeRecipe() {
		ItemStack netheritePike = Main.weaponsMasterList.get(19).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "20");
	    ShapedRecipe netheritePikeRecipe = new ShapedRecipe(key, netheritePike);
	    netheritePikeRecipe.shape("  @", " % ", "%  ");
	    netheritePikeRecipe.setIngredient('@', Material.NETHERITE_INGOT);
	    netheritePikeRecipe.setIngredient('%', Material.STICK);
	    Main.getInstance().getServer().addRecipe(netheritePikeRecipe);
	}
	
	public void netheriteDaggerRecipe() {
		ItemStack netheriteDagger = Main.weaponsMasterList.get(20).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "21");
	    ShapedRecipe netheriteDaggerRecipe = new ShapedRecipe(key, netheriteDagger);
	    netheriteDaggerRecipe.shape("   ", " @ ", "%  ");
	    netheriteDaggerRecipe.setIngredient('@', Material.NETHERITE_INGOT);
	    netheriteDaggerRecipe.setIngredient('%', Material.STICK);
	    Main.getInstance().getServer().addRecipe(netheriteDaggerRecipe);
	}
	
	public void netheriteMorningStarRecipe() {
		ItemStack netheriteMorningStar = Main.weaponsMasterList.get(21).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "22");
	    ShapedRecipe netheriteMorningStarRecipe = new ShapedRecipe(key, netheriteMorningStar);
	    netheriteMorningStarRecipe.shape(" $ ", "$@$", "%$ ");
	    netheriteMorningStarRecipe.setIngredient('@', Material.NETHERITE_INGOT);
	    netheriteMorningStarRecipe.setIngredient('%', Material.STICK);
	    netheriteMorningStarRecipe.setIngredient('$', Material.AMETHYST_SHARD);
	    Main.getInstance().getServer().addRecipe(netheriteMorningStarRecipe);
	}
	
	public void netheriteZweihanderRecipe() {
		ItemStack netheriteZweihander = Main.weaponsMasterList.get(22).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "23");
	    ShapedRecipe netheriteZweihanderRecipe = new ShapedRecipe(key, netheriteZweihander);
	    netheriteZweihanderRecipe.shape("  %", " % ", "@  ");
	    netheriteZweihanderRecipe.setIngredient('@', Material.NETHERITE_SWORD);
	    netheriteZweihanderRecipe.setIngredient('%', Material.NETHERITE_INGOT);
	    Main.getInstance().getServer().addRecipe(netheriteZweihanderRecipe);
	}
	
	public void netheriteWarHammerRecipe() {
		ItemStack netheriteWarHammer = Main.weaponsMasterList.get(23).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "24");
	    ShapedRecipe netheriteWarHammerRecipe = new ShapedRecipe(key, netheriteWarHammer);
	    netheriteWarHammerRecipe.shape(" @ ", " %@", "%  ");
	    netheriteWarHammerRecipe.setIngredient('@', Material.NETHERITE_INGOT);
	    netheriteWarHammerRecipe.setIngredient('%', Material.STICK);
	    Main.getInstance().getServer().addRecipe(netheriteWarHammerRecipe);
	}
	
	public void netheriteShortswordRecipe() {
		ItemStack netheriteShortsword = Main.weaponsMasterList.get(24).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "25");
	    ShapedRecipe netheriteShortswordRecipe = new ShapedRecipe(key, netheriteShortsword);
	    netheriteShortswordRecipe.shape("  @", " @ ", "%  ");
	    netheriteShortswordRecipe.setIngredient('@', Material.NETHERITE_INGOT);
	    netheriteShortswordRecipe.setIngredient('%', Material.STICK);
	    Main.getInstance().getServer().addRecipe(netheriteShortswordRecipe);
	}
	
	public void netheriteQuarterStaffRecipe() {
		ItemStack netheriteQuarterStaff = Main.weaponsMasterList.get(25).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "26");
	    ShapedRecipe netheriteQuarterStaffRecipe = new ShapedRecipe(key, netheriteQuarterStaff);
	    netheriteQuarterStaffRecipe.shape("  @", " % ", "@  ");
	    netheriteQuarterStaffRecipe.setIngredient('@', Material.NETHERITE_INGOT);
	    netheriteQuarterStaffRecipe.setIngredient('%', Material.STICK);
	    Main.getInstance().getServer().addRecipe(netheriteQuarterStaffRecipe);
	}
	
	public void netheriteHatchetRecipe() {
		ItemStack netheriteHatchet = Main.weaponsMasterList.get(26).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "27");
	    ShapedRecipe netheriteHatchetRecipe = new ShapedRecipe(key, netheriteHatchet);
	    netheriteHatchetRecipe.shape("   ", " @@", " @%");
	    netheriteHatchetRecipe.setIngredient('@', Material.NETHERITE_INGOT);
	    netheriteHatchetRecipe.setIngredient('%', Material.STICK);
	    Main.getInstance().getServer().addRecipe(netheriteHatchetRecipe);
	}
	
	public void netheriteBattleaxeRecipe() {
		ItemStack netheriteBattleaxe = Main.weaponsMasterList.get(27).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "28");
	    ShapedRecipe netheriteBattleaxeRecipe = new ShapedRecipe(key, netheriteBattleaxe);
	    netheriteBattleaxeRecipe.shape(" @ ", " %@", "%  ");
	    netheriteBattleaxeRecipe.setIngredient('@', Material.NETHERITE_AXE);
	    netheriteBattleaxeRecipe.setIngredient('%', Material.STICK);
	    Main.getInstance().getServer().addRecipe(netheriteBattleaxeRecipe);
	}
	
	public void netheriteCombatAxeRecipe() {
		ItemStack netheriteCombatAxe = Main.weaponsMasterList.get(28).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "29");
	    ShapedRecipe netheriteCombatAxeRecipe = new ShapedRecipe(key, netheriteCombatAxe);
	    netheriteCombatAxeRecipe.shape("   ", "@  ", "%  ");
	    netheriteCombatAxeRecipe.setIngredient('@', Material.NETHERITE_INGOT);
	    netheriteCombatAxeRecipe.setIngredient('%', Material.NETHERITE_AXE);
	    Main.getInstance().getServer().addRecipe(netheriteCombatAxeRecipe);
	}
	
	public void netheriteHalberdRecipe() {
		ItemStack netheriteHalberd = Main.weaponsMasterList.get(29).getItem();
	    NamespacedKey key = new NamespacedKey(Main.getInstance(), Main.getInstance().getDescription().getName() + "30");
	    ShapedRecipe netheriteHalberdRecipe = new ShapedRecipe(key, netheriteHalberd);
	    netheriteHalberdRecipe.shape("  @", " % ", "%  ");
	    netheriteHalberdRecipe.setIngredient('@', Material.NETHERITE_AXE);
	    netheriteHalberdRecipe.setIngredient('%', Material.STICK);
	    Main.getInstance().getServer().addRecipe(netheriteHalberdRecipe);
	}
	
	public void onEnchantmentMending(PrepareAnvilEvent e) { // stop players from trying to put mending on custom weapons
		return;
	}

}