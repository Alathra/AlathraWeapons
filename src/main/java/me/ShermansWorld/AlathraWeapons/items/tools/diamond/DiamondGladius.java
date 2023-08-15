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

public class DiamondGladius implements CustomItem {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomWeapon netheriteItem = new CustomWeapon("Netherite Gladius", "Netherite Gladius", 147, WeaponMaterial.NETHERITE, WeaponType.SWORD);
        Main.registerItem(netheriteItem);

        final CustomWeapon diamondItem = new CustomWeapon("Diamond Gladius", "Diamond Gladius", 347, WeaponMaterial.DIAMOND, WeaponType.SWORD)
            .setUpgradeable(netheriteItem);
        Main.registerItem(diamondItem);

        final CustomWeapon goldItem = new CustomWeapon("Golden Gladius", "Golden Gladius", 647, WeaponMaterial.GOLD, WeaponType.SWORD)
            .setUpgradeable(diamondItem);
        Main.registerItem(goldItem);

        final CustomWeapon ironItem = new CustomWeapon("Iron Gladius", "Iron Gladius", 47, WeaponMaterial.IRON, WeaponType.SWORD)
            .setUpgradeable(goldItem);
        Main.registerItem(ironItem);

        new RecipeFactory("91", netheriteItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" ^ ", "$^$", "@&%")
            .setIngredient('@', Material.STRING)
            .setIngredient('%', Material.RED_DYE)
            .setIngredient('$', Material.GOLD_INGOT)
            .setIngredient('^', Material.NETHERITE_INGOT)
            .setIngredient('&', Material.STICK)
            .build();

        new RecipeFactory("90", diamondItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" ^ ", "$^$", "@&%")
            .setIngredient('@', Material.STRING)
            .setIngredient('%', Material.RED_DYE)
            .setIngredient('$', Material.GOLD_INGOT)
            .setIngredient('^', Material.DIAMOND)
            .setIngredient('&', Material.STICK)
            .build();

        new RecipeFactory("121", goldItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" ^ ", "$^$", "@&%")
            .setIngredient('@', Material.STRING)
            .setIngredient('%', Material.RED_DYE)
            .setIngredient('$', Material.GOLD_INGOT)
            .setIngredient('^', Material.GOLD_INGOT)
            .setIngredient('&', Material.STICK)
            .build();

        new RecipeFactory("89", ironItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" ^ ", "$^$", "@&%")
            .setIngredient('@', Material.STRING)
            .setIngredient('%', Material.RED_DYE)
            .setIngredient('$', Material.GOLD_INGOT)
            .setIngredient('^', Material.IRON_INGOT)
            .setIngredient('&', Material.STICK)
            .build();
    }
}