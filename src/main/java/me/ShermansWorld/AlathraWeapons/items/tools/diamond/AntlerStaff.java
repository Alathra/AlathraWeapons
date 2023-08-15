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

public class AntlerStaff implements CustomItem {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomWeapon netheriteItem = new CustomWeapon("Netherite Antler Staff", "Netherite Antler Staff", 129, WeaponMaterial.NETHERITE, WeaponType.SWORD);
        Main.registerItem(netheriteItem);

        final CustomWeapon diamondItem = new CustomWeapon("Diamond Antler Staff", "Diamond Antler Staff", 328, WeaponMaterial.DIAMOND, WeaponType.SWORD)
            .setUpgradeable(netheriteItem);
        Main.registerItem(diamondItem);

        final CustomWeapon ironItem = new CustomWeapon("Iron Antler Staff", "Iron Antler Staff", 28, WeaponMaterial.IRON, WeaponType.SWORD)
            .setUpgradeable(diamondItem);
        Main.registerItem(ironItem);

        new RecipeFactory("86", netheriteItem.getItemStack(), RecipeShape.SHAPED)
            .shape("@%@", "$^&", "^$#")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.BONE_BLOCK)
            .setIngredient('$', Material.TWISTING_VINES)
            .setIngredient('^', Material.WARPED_STEM)
            .setIngredient('&', Material.GOLD_NUGGET)
            .setIngredient('#', Material.STRING)
            .build();

        new RecipeFactory("85", diamondItem.getItemStack(), RecipeShape.SHAPED)
            .shape("@%@", "$^&", "^$#")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.BONE_BLOCK)
            .setIngredient('$', Material.TWISTING_VINES)
            .setIngredient('^', Material.WARPED_STEM)
            .setIngredient('&', Material.COPPER_INGOT)
            .setIngredient('#', Material.STRING)
            .build();

        new RecipeFactory("84", ironItem.getItemStack(), RecipeShape.SHAPED)
            .shape("@%@", "$^&", "^$#")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.BONE_BLOCK)
            .setIngredient('$', Material.TWISTING_VINES)
            .setIngredient('^', Material.WARPED_STEM)
            .setIngredient('&', Material.IRON_NUGGET)
            .setIngredient('#', Material.STRING)
            .build();
    }
}