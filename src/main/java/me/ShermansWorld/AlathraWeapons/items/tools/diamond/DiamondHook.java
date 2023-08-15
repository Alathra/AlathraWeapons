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

public class DiamondHook implements CustomItem {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomWeapon netheriteItem = new CustomWeapon("Netherite Hook", "Netherite Hook", 143, WeaponMaterial.NETHERITE, WeaponType.SWORD);
        Main.registerItem(netheriteItem);

        final CustomWeapon diamondItem = new CustomWeapon("Diamond Hook", "Diamond Hook", 343, WeaponMaterial.DIAMOND, WeaponType.SWORD)
            .setUpgradeable(netheriteItem);
        Main.registerItem(diamondItem);

        final CustomWeapon goldItem = new CustomWeapon("Golden Hook", "Golden Hook", 643, WeaponMaterial.GOLD, WeaponType.SWORD)
            .setUpgradeable(diamondItem);
        Main.registerItem(goldItem);

        final CustomWeapon ironItem = new CustomWeapon("Iron Hook", "Iron Hook", 43, WeaponMaterial.IRON, WeaponType.SWORD)
            .setUpgradeable(goldItem);
        Main.registerItem(ironItem);

        new RecipeFactory("70", diamondItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" @@", " @ ", " $ ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('$', Material.STICK)
            .build();

        new RecipeFactory("69", diamondItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" @@", " @ ", " $ ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('$', Material.STICK)
            .build();

        new RecipeFactory("117", goldItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" @@", " % ", " $ ")
            .setIngredient('@', Material.GOLD_NUGGET)
            .setIngredient('%', Material.GOLD_INGOT)
            .setIngredient('$', Material.STICK)
            .build();

        new RecipeFactory("68", ironItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" @@", " % ", " $ ")
            .setIngredient('@', Material.IRON_NUGGET)
            .setIngredient('%', Material.IRON_INGOT)
            .setIngredient('$', Material.STICK)
            .build();
    }
}