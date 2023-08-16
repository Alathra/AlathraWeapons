package me.ShermansWorld.AlathraWeapons.items.weapons.melee;

import me.ShermansWorld.AlathraWeapons.CustomItem;
import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.enums.WeaponMaterial;
import me.ShermansWorld.AlathraWeapons.enums.WeaponType;
import me.ShermansWorld.AlathraWeapons.exceptions.InvalidMaterialException;
import me.ShermansWorld.AlathraWeapons.items.CustomItemGroup;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class Gladius implements CustomItemGroup {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomItem netheriteItem = new CustomItem("Netherite Gladius", "Netherite Gladius", 147, WeaponMaterial.NETHERITE, WeaponType.SWORD);
        Main.registerItem(netheriteItem);

        final CustomItem diamondItem = new CustomItem("Diamond Gladius", "Diamond Gladius", 347, WeaponMaterial.DIAMOND, WeaponType.SWORD)
            .setUpgradeable(netheriteItem);
        Main.registerItem(diamondItem);

        final CustomItem goldItem = new CustomItem("Golden Gladius", "Golden Gladius", 647, WeaponMaterial.GOLD, WeaponType.SWORD)
            .setUpgradeable(diamondItem);
        Main.registerItem(goldItem);

        final CustomItem ironItem = new CustomItem("Iron Gladius", "Iron Gladius", 47, WeaponMaterial.IRON, WeaponType.SWORD)
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