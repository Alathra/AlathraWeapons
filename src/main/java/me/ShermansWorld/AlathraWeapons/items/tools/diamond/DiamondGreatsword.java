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

public class DiamondGreatsword implements CustomItem {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomWeapon netheriteItem = new CustomWeapon("Netherite Greatsword", "Netherite Greatsword", 145, WeaponMaterial.NETHERITE, WeaponType.SWORD);
        Main.registerItem(netheriteItem);

        final CustomWeapon diamondItem = new CustomWeapon("Diamond Greatsword", "Diamond Greatsword", 345, WeaponMaterial.DIAMOND, WeaponType.SWORD)
            .setUpgradeable(netheriteItem);
        Main.registerItem(diamondItem);

        final CustomWeapon goldItem = new CustomWeapon("Golden Greatsword", "Golden Greatsword", 645, WeaponMaterial.GOLD, WeaponType.SWORD)
            .setUpgradeable(diamondItem);
        Main.registerItem(goldItem);

        final CustomWeapon ironItem = new CustomWeapon("Iron Greatsword", "Iron Greatsword", 45, WeaponMaterial.IRON, WeaponType.SWORD)
            .setUpgradeable(goldItem);
        Main.registerItem(ironItem);

        new RecipeFactory("76", netheriteItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", "%@%", " $ ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.OAK_LOG)
            .build();

        new RecipeFactory("75", diamondItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", "%@%", " $ ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.OAK_LOG)
            .build();

        new RecipeFactory("119", goldItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", "%@%", " $ ")
            .setIngredient('@', Material.GOLD_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.OAK_LOG)
            .build();

        new RecipeFactory("74", ironItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", "%@%", " $ ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.OAK_LOG)
            .build();
    }
}