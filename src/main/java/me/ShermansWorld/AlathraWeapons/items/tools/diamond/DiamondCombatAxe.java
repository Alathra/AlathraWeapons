package me.ShermansWorld.AlathraWeapons.items.tools.diamond;

import me.ShermansWorld.AlathraWeapons.CustomWeapon;
import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.enums.WeaponMaterial;
import me.ShermansWorld.AlathraWeapons.enums.WeaponType;
import me.ShermansWorld.AlathraWeapons.exceptions.InvalidMaterialException;
import me.ShermansWorld.AlathraWeapons.items.CustomItem;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class DiamondCombatAxe implements CustomItem {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomWeapon netheriteItem = new CustomWeapon("Netherite Combat Axe", "Netherite Combat Axe", 435, WeaponMaterial.NETHERITE, WeaponType.AXE);
        Main.registerItem(netheriteItem);

        final CustomWeapon diamondItem = new CustomWeapon("Diamond Combat Axe", "Diamond Combat Axe", 535, WeaponMaterial.DIAMOND, WeaponType.AXE)
            .setUpgradeable(netheriteItem);
        Main.registerItem(diamondItem);

        final CustomWeapon goldItem = new CustomWeapon("Golden Combat Axe", "Golden Combat Axe", 735, WeaponMaterial.GOLD, WeaponType.AXE)
            .setUpgradeable(diamondItem);
        Main.registerItem(goldItem);

        final CustomWeapon ironItem = new CustomWeapon("Iron Combat Axe", "Iron Combat Axe", 235, WeaponMaterial.IRON, WeaponType.AXE)
            .setUpgradeable(goldItem);
        Main.registerItem(ironItem);

        new RecipeFactory("29", netheriteItem.getItemStack(), RecipeShape.SHAPED)
            .shape("   ", "@  ", "%  ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.NETHERITE_AXE)
            .build();

        new RecipeFactory("64", diamondItem.getItemStack(), RecipeShape.SHAPED)
            .shape("   ", "@  ", "%  ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.DIAMOND_AXE)
            .build();

        new RecipeFactory("130", goldItem.getItemStack(), RecipeShape.SHAPED)
            .shape("   ", "@  ", "%  ")
            .setIngredient('@', Material.GOLD_INGOT)
            .setIngredient('%', Material.GOLDEN_AXE)
            .build();

        new RecipeFactory("14", ironItem.getItemStack(), RecipeShape.SHAPED)
            .shape("   ", "@  ", "%  ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.IRON_AXE)
            .build();
    }
}