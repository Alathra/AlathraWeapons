package me.ShermansWorld.AlathraWeapons.recipes;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import org.bukkit.Material;

public class CraftingRecipes {
    public void katanaRecipe() {
        new RecipeFactory("1", Main.weaponsMasterList.get(0).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "%  ")
            .setIngredient('@', Material.IRON_BLOCK)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void ironSpearRecipe() {
        new RecipeFactory("4", Main.weaponsMasterList.get(1).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "%  ")
            .setIngredient('@', Material.IRON_SWORD)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void ironFlangedMaceRecipe() {
        new RecipeFactory("6", Main.weaponsMasterList.get(2).getItemStack(), RecipeShape.SHAPED)
            .shape("   ", "@  ", "%  ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void ironNaginataRecipe() {
        new RecipeFactory("5", Main.weaponsMasterList.get(3).getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", " % ", "%  ")
            .setIngredient('@', Material.IRON_SWORD)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void ironPikeRecipe() {
        new RecipeFactory("3", Main.weaponsMasterList.get(4).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "%  ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void ironDaggerRecipe() {
        new RecipeFactory("7", Main.weaponsMasterList.get(5).getItemStack(), RecipeShape.SHAPED)
            .shape("   ", " @ ", "%  ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void ironMorningStarRecipe() {
        new RecipeFactory("8", Main.weaponsMasterList.get(6).getItemStack(), RecipeShape.SHAPED)
            .shape(" $ ", "$@$", "%$ ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.IRON_NUGGET)
            .build();
    }

    public void ironZweihanderRecipe() {
        new RecipeFactory("9", Main.weaponsMasterList.get(7).getItemStack(), RecipeShape.SHAPED)
            .shape("  %", " % ", "@  ")
            .setIngredient('@', Material.IRON_SWORD)
            .setIngredient('%', Material.IRON_INGOT)
            .build();
    }

    public void ironWarHammerRecipe() {
        new RecipeFactory("10", Main.weaponsMasterList.get(8).getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", " %@", "%  ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void ironShortswordRecipe() {
        new RecipeFactory("11", Main.weaponsMasterList.get(9).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "%  ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void ironQuarterStaffRecipe() {
        new RecipeFactory("2", Main.weaponsMasterList.get(10).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "@  ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void ironHatchetRecipe() {
        new RecipeFactory("12", Main.weaponsMasterList.get(11).getItemStack(), RecipeShape.SHAPED)
            .shape("   ", " @@", " @%")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void ironBattleaxeRecipe() {
        new RecipeFactory("13", Main.weaponsMasterList.get(12).getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", " %@", "%  ")
            .setIngredient('@', Material.IRON_AXE)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void ironCombatAxeRecipe() {
        new RecipeFactory("14", Main.weaponsMasterList.get(13).getItemStack(), RecipeShape.SHAPED)
            .shape("   ", "@  ", "%  ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.IRON_AXE)
            .build();
    }

    public void ironHalberdRecipe() {
        new RecipeFactory("15", Main.weaponsMasterList.get(14).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "%  ")
            .setIngredient('@', Material.IRON_AXE)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void legendaryKatanaRecipe() {
        new RecipeFactory("16", Main.weaponsMasterList.get(15).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "%  ")
            .setIngredient('@', Material.NETHERITE_BLOCK)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void netheriteSpearRecipe() {
        new RecipeFactory("17", Main.weaponsMasterList.get(16).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "%  ")
            .setIngredient('@', Material.NETHERITE_SWORD)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void netheriteFlangedMaceRecipe() {
        new RecipeFactory("18", Main.weaponsMasterList.get(17).getItemStack(), RecipeShape.SHAPED)
            .shape("   ", "@  ", "%  ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void netheriteNaginataRecipe() {
        new RecipeFactory("19", Main.weaponsMasterList.get(18).getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", " % ", "%  ")
            .setIngredient('@', Material.NETHERITE_SWORD)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void netheritePikeRecipe() {
        new RecipeFactory("20", Main.weaponsMasterList.get(19).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "%  ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void netheriteDaggerRecipe() {
        new RecipeFactory("21", Main.weaponsMasterList.get(20).getItemStack(), RecipeShape.SHAPED)
            .shape("   ", " @ ", "%  ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void netheriteMorningStarRecipe() {
        new RecipeFactory("22", Main.weaponsMasterList.get(21).getItemStack(), RecipeShape.SHAPED)
            .shape(" $ ", "$@$", "%$ ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.AMETHYST_SHARD)
            .build();
    }

    public void netheriteZweihanderRecipe() {
        new RecipeFactory("23", Main.weaponsMasterList.get(22).getItemStack(), RecipeShape.SHAPED)
            .shape("  %", " % ", "@  ")
            .setIngredient('@', Material.NETHERITE_SWORD)
            .setIngredient('%', Material.NETHERITE_INGOT)
            .build();
    }

    public void netheriteWarHammerRecipe() {
        new RecipeFactory("24", Main.weaponsMasterList.get(23).getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", " %@", "%  ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void netheriteShortswordRecipe() {
        new RecipeFactory("25", Main.weaponsMasterList.get(24).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "%  ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void netheriteQuarterStaffRecipe() {
        new RecipeFactory("26", Main.weaponsMasterList.get(25).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "@  ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void netheriteHatchetRecipe() {
        new RecipeFactory("27", Main.weaponsMasterList.get(26).getItemStack(), RecipeShape.SHAPED)
            .shape("   ", " @@", " @%")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void netheriteBattleaxeRecipe() {
        new RecipeFactory("28", Main.weaponsMasterList.get(27).getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", " %@", "%  ")
            .setIngredient('@', Material.NETHERITE_AXE)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void netheriteCombatAxeRecipe() {
        new RecipeFactory("29", Main.weaponsMasterList.get(28).getItemStack(), RecipeShape.SHAPED)
            .shape("   ", "@  ", "%  ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.NETHERITE_AXE)
            .build();
    }

    public void netheriteHalberdRecipe() {
        new RecipeFactory("30", Main.weaponsMasterList.get(29).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "%  ")
            .setIngredient('@', Material.NETHERITE_AXE)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void ironKunaiRecipe() {
        new RecipeFactory("31", Main.weaponsMasterList.get(30).getItemStack(), RecipeShape.SHAPED)
            .shape("   ", " @ ", "  %")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.TRIPWIRE_HOOK)
            .build();
    }

    public void netheriteKunaiRecipe() {
        new RecipeFactory("32", Main.weaponsMasterList.get(33).getItemStack(), RecipeShape.SHAPED)
            .shape("   ", " @ ", "  %")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.TRIPWIRE_HOOK)
            .build();
    }

    public void ironSabreRecipe() {
        new RecipeFactory("33", Main.weaponsMasterList.get(31).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "$% ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.LAPIS_LAZULI)
            .build();
    }

    public void netheriteSabreRecipe() {
        new RecipeFactory("34", Main.weaponsMasterList.get(34).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "$% ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.AMETHYST_SHARD)
            .build();
    }

    public void ironTwinBladeRecipe() {
        new RecipeFactory("35", Main.weaponsMasterList.get(32).getItemStack(), RecipeShape.SHAPED)
            .shape(" $@", "$%$", "@$ ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.DIAMOND)
            .build();
    }

    public void netheriteTwinBladeRecipe() {
        new RecipeFactory("36", Main.weaponsMasterList.get(35).getItemStack(), RecipeShape.SHAPED)
            .shape(" $@", "$%$", "@$ ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.GOLD_INGOT)
            .build();
    }

    public void ironBattleHoeRecipe() {
        new RecipeFactory("37", Main.weaponsMasterList.get(36).getItemStack(), RecipeShape.SHAPED)
            .shape("@@@", "@% ", " % ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void netheriteBattleHoeRecipe() {
        new RecipeFactory("38", Main.weaponsMasterList.get(37).getItemStack(), RecipeShape.SHAPED)
            .shape("@@@", "@% ", " % ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void ironScimitarRecipe() {
        new RecipeFactory("40", Main.weaponsMasterList.get(38).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", "%@@", "$% ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.GOLD_INGOT)
            .setIngredient('$', Material.STICK)
            .build();
    }

    public void netheriteScimitarRecipe() {
        new RecipeFactory("41", Main.weaponsMasterList.get(39).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", "%@@", "$% ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.GOLD_INGOT)
            .setIngredient('$', Material.STICK)
            .build();
    }

    public void ironRapierRecipe() {
        new RecipeFactory("42", Main.weaponsMasterList.get(40).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "%  ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.LIGHTNING_ROD)
            .build();
    }

    public void netheriteRapierRecipe() {
        new RecipeFactory("43", Main.weaponsMasterList.get(41).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "%  ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.LIGHTNING_ROD)
            .build();
    }

    public void ironScytheRecipe() {
        new RecipeFactory("44", Main.weaponsMasterList.get(42).getItemStack(), RecipeShape.SHAPED)
            .shape("@@%", " $ ", "$  ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.GOLD_NUGGET)
            .setIngredient('$', Material.IRON_BARS)
            .build();
    }

    public void netheriteScytheRecipe() {
        new RecipeFactory("45", Main.weaponsMasterList.get(43).getItemStack(), RecipeShape.SHAPED)
            .shape("@@%", " $ ", "$  ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.GOLD_NUGGET)
            .setIngredient('$', Material.NETHERITE_SCRAP)
            .build();
    }

    public void diamondKatanaRecipe() {
        new RecipeFactory("46", Main.weaponsMasterList.get(44).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "%  ")
            .setIngredient('@', Material.DIAMOND_BLOCK)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void diamondSpearRecipe() {
        new RecipeFactory("47", Main.weaponsMasterList.get(45).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "%  ")
            .setIngredient('@', Material.DIAMOND_SWORD)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void diamondNaginataRecipe() {
        new RecipeFactory("48", Main.weaponsMasterList.get(46).getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", " % ", "%  ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void diamondPikeRecipe() {
        new RecipeFactory("49", Main.weaponsMasterList.get(47).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "%  ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void diamondDaggerRecipe() {
        new RecipeFactory("50", Main.weaponsMasterList.get(48).getItemStack(), RecipeShape.SHAPED)
            .shape("   ", " @ ", "%  ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void diamondZweihanderRecipe() {
        new RecipeFactory("51", Main.weaponsMasterList.get(49).getItemStack(), RecipeShape.SHAPED)
            .shape("  %", " % ", "@  ")
            .setIngredient('@', Material.DIAMOND_SWORD)
            .setIngredient('%', Material.DIAMOND)
            .build();
    }

    public void dimamondShortswordRecipe() {
        new RecipeFactory("52", Main.weaponsMasterList.get(50).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "%  ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void diamondQuarterStaffRecipe() {
        new RecipeFactory("53", Main.weaponsMasterList.get(51).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "@  ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void diamondKunaiRecipe() {
        new RecipeFactory("54", Main.weaponsMasterList.get(52).getItemStack(), RecipeShape.SHAPED)
            .shape("   ", " @ ", "  %")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.TRIPWIRE_HOOK)
            .build();
    }

    public void diamondSabreRecipe() {
        new RecipeFactory("55", Main.weaponsMasterList.get(53).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "$% ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.LAPIS_LAZULI)
            .build();
    }

    public void diamondTwinBladeRecipe() {
        new RecipeFactory("56", Main.weaponsMasterList.get(54).getItemStack(), RecipeShape.SHAPED)
            .shape(" $@", "$%$", "@$ ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.GOLD_INGOT)
            .build();
    }

    public void diamondScimitarRecipe() {
        new RecipeFactory("57", Main.weaponsMasterList.get(55).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", "%@@", "$% ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.GOLD_INGOT)
            .setIngredient('$', Material.STICK)
            .build();
    }

    public void diamondRapierRecipe() {
        new RecipeFactory("58", Main.weaponsMasterList.get(56).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "%  ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.LIGHTNING_ROD)
            .build();
    }

    public void diamondFlangedMaceRecipe() {
        new RecipeFactory("59", Main.weaponsMasterList.get(57).getItemStack(), RecipeShape.SHAPED)
            .shape("   ", "@  ", "%  ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void diamondMorningStarRecipe() {
        new RecipeFactory("60", Main.weaponsMasterList.get(58).getItemStack(), RecipeShape.SHAPED)
            .shape(" $ ", "$@$", "%$ ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.AMETHYST_SHARD)
            .build();
    }

    public void diamondWarHammerRecipe() {
        new RecipeFactory("61", Main.weaponsMasterList.get(59).getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", " %@", "%  ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void diamondHatchetRecipe() {
        new RecipeFactory("62", Main.weaponsMasterList.get(60).getItemStack(), RecipeShape.SHAPED)
            .shape("   ", " @@", " @%")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void diamondBattleaxeRecipe() {
        new RecipeFactory("63", Main.weaponsMasterList.get(61).getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", " %@", "%  ")
            .setIngredient('@', Material.DIAMOND_AXE)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void diamondCombatAxeRecipe() {
        new RecipeFactory("64", Main.weaponsMasterList.get(62).getItemStack(), RecipeShape.SHAPED)
            .shape("   ", "@  ", "%  ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.DIAMOND_AXE)
            .build();
    }

    public void diamondHalberdRecipe() {
        new RecipeFactory("65", Main.weaponsMasterList.get(63).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "%  ")
            .setIngredient('@', Material.DIAMOND_AXE)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void diamondBattleHoeRecipe() {
        new RecipeFactory("66", Main.weaponsMasterList.get(64).getItemStack(), RecipeShape.SHAPED)
            .shape("@@@", "@% ", " % ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void diamondScytheRecipe() {
        new RecipeFactory("67", Main.weaponsMasterList.get(65).getItemStack(), RecipeShape.SHAPED)
            .shape("@@%", " @ ", "@  ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.GOLD_NUGGET)
            .build();
    }

    public void ironHookRecipe() {
        new RecipeFactory("68", Main.weaponsMasterList.get(66).getItemStack(), RecipeShape.SHAPED)
            .shape(" @@", " % ", " $ ")
            .setIngredient('@', Material.IRON_NUGGET)
            .setIngredient('%', Material.IRON_INGOT)
            .setIngredient('$', Material.STICK)
            .build();
    }

    public void diamondHookRecipe() {
        new RecipeFactory("69", Main.weaponsMasterList.get(67).getItemStack(), RecipeShape.SHAPED)
            .shape(" @@", " @ ", " $ ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('$', Material.STICK)
            .build();
    }

    public void netheriteHookRecipe() {
        new RecipeFactory("70", Main.weaponsMasterList.get(68).getItemStack(), RecipeShape.SHAPED)
            .shape(" @@", " % ", " $ ")
            .setIngredient('@', Material.NETHERITE_SCRAP)
            .setIngredient('%', Material.NETHERITE_INGOT)
            .setIngredient('$', Material.STICK)
            .build();
    }

    public void ironMaceRecipe() {
        new RecipeFactory("71", Main.weaponsMasterList.get(69).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "$  ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.LEATHER)
            .build();
    }

    public void diamondMaceRecipe() {
        new RecipeFactory("72", Main.weaponsMasterList.get(70).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "$  ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.LEATHER)
            .build();
    }

    public void netheriteMaceRecipe() {
        new RecipeFactory("73", Main.weaponsMasterList.get(71).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "$  ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.RABBIT_HIDE)
            .build();
    }

    public void ironGreatswordRecipe() {
        new RecipeFactory("74", Main.weaponsMasterList.get(72).getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", "%@%", " $ ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.OAK_LOG)
            .build();
    }

    public void diamondGreatswordRecipe() {
        new RecipeFactory("75", Main.weaponsMasterList.get(73).getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", "%@%", " $ ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.OAK_LOG)
            .build();
    }

    public void netheriteGreatswordRecipe() {
        new RecipeFactory("76", Main.weaponsMasterList.get(74).getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", "%@%", " $ ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.OAK_LOG)
            .build();
    }

    public void ironBidentRecipe() {
        new RecipeFactory("77", Main.weaponsMasterList.get(75).getItemStack(), RecipeShape.SHAPED)
            .shape("@ @", " @ ", " % ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void diamondBidentRecipe() {
        new RecipeFactory("78", Main.weaponsMasterList.get(76).getItemStack(), RecipeShape.SHAPED)
            .shape("@ @", " @ ", " % ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void netheriteBidentRecipe() {
        new RecipeFactory("79", Main.weaponsMasterList.get(77).getItemStack(), RecipeShape.SHAPED)
            .shape("@ @", " @ ", " % ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void diamondGiantSwordRecipe() {
        new RecipeFactory("80", Main.weaponsMasterList.get(78).getItemStack(), RecipeShape.SHAPED)
            .shape(" @@", "%@@", "$% ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.GOLD_INGOT)
            .setIngredient('$', Material.STICK)
            .build();
    }

    public void ironDaneAxeRecipe() {
        new RecipeFactory("81", Main.weaponsMasterList.get(79).getItemStack(), RecipeShape.SHAPED)
            .shape("   ", " @ ", "%  ")
            .setIngredient('@', Material.IRON_AXE)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void diamondDaneAxeRecipe() {
        new RecipeFactory("82", Main.weaponsMasterList.get(80).getItemStack(), RecipeShape.SHAPED)
            .shape("   ", " @ ", "%  ")
            .setIngredient('@', Material.DIAMOND_AXE)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void netheriteDaneAxeRecipe() {
        new RecipeFactory("83", Main.weaponsMasterList.get(81).getItemStack(), RecipeShape.SHAPED)
            .shape("   ", " @ ", "%  ")
            .setIngredient('@', Material.NETHERITE_AXE)
            .setIngredient('%', Material.STICK)
            .build();
    }

    public void ironAntlerStaffRecipe() {
        new RecipeFactory("84", Main.weaponsMasterList.get(82).getItemStack(), RecipeShape.SHAPED)
            .shape("@%@", "$^&", "^$#")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.BONE_BLOCK)
            .setIngredient('$', Material.TWISTING_VINES)
            .setIngredient('^', Material.WARPED_STEM)
            .setIngredient('&', Material.IRON_NUGGET)
            .setIngredient('#', Material.STRING)
            .build();
    }

    public void diamondAntlerStaffRecipe() {
        new RecipeFactory("85", Main.weaponsMasterList.get(83).getItemStack(), RecipeShape.SHAPED)
            .shape("@%@", "$^&", "^$#")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.BONE_BLOCK)
            .setIngredient('$', Material.TWISTING_VINES)
            .setIngredient('^', Material.WARPED_STEM)
            .setIngredient('&', Material.COPPER_INGOT)
            .setIngredient('#', Material.STRING)
            .build();
    }

    public void netheriteAntlerStaffRecipe() {
        new RecipeFactory("86", Main.weaponsMasterList.get(84).getItemStack(), RecipeShape.SHAPED)
            .shape("@%@", "$^&", "^$#")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.BONE_BLOCK)
            .setIngredient('$', Material.TWISTING_VINES)
            .setIngredient('^', Material.WARPED_STEM)
            .setIngredient('&', Material.GOLD_NUGGET)
            .setIngredient('#', Material.STRING)
            .build();
    }

    public void faeBowRecipe() {
        new RecipeFactory("87", Main.weaponsMasterList.get(85).getItemStack(), RecipeShape.SHAPED)
            .shape(" @$", "@%^", " @$")
            .setIngredient('@', Material.STRIPPED_MANGROVE_LOG)
            .setIngredient('%', Material.CROSSBOW)
            .setIngredient('$', Material.GOLD_NUGGET)
            .setIngredient('^', Material.FLOWERING_AZALEA_LEAVES)
            .build();
    }

    public void longbowRecipe() {
        new RecipeFactory("88", Main.weaponsMasterList.get(86).getItemStack(), RecipeShape.SHAPED)
            .shape("@% ", "@ $", "@% ")
            .setIngredient('@', Material.STRING)
            .setIngredient('%', Material.TRIPWIRE_HOOK)
            .setIngredient('$', Material.MANGROVE_PLANKS)
            .build();
    }

    public void ironGladiusRecipe() {
        new RecipeFactory("89", Main.weaponsMasterList.get(87).getItemStack(), RecipeShape.SHAPED)
            .shape(" ^ ", "$^$", "@&%")
            .setIngredient('@', Material.STRING)
            .setIngredient('%', Material.RED_DYE)
            .setIngredient('$', Material.GOLD_INGOT)
            .setIngredient('^', Material.IRON_INGOT)
            .setIngredient('&', Material.STICK)
            .build();
    }

    public void diamondGladiusRecipe() {
        new RecipeFactory("90", Main.weaponsMasterList.get(88).getItemStack(), RecipeShape.SHAPED)
            .shape(" ^ ", "$^$", "@&%")
            .setIngredient('@', Material.STRING)
            .setIngredient('%', Material.RED_DYE)
            .setIngredient('$', Material.GOLD_INGOT)
            .setIngredient('^', Material.DIAMOND)
            .setIngredient('&', Material.STICK)
            .build();
    }

    public void netheriteGladiusRecipe() {
        new RecipeFactory("91", Main.weaponsMasterList.get(89).getItemStack(), RecipeShape.SHAPED)
            .shape(" ^ ", "$^$", "@&%")
            .setIngredient('@', Material.STRING)
            .setIngredient('%', Material.RED_DYE)
            .setIngredient('$', Material.GOLD_INGOT)
            .setIngredient('^', Material.NETHERITE_INGOT)
            .setIngredient('&', Material.STICK)
            .build();
    }

}