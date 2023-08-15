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

public class DiamondDreistkleze implements CustomItem {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomWeapon netheriteItem = new CustomWeapon("Netherite Dreistkleze", "Netherite Dreistkleze", 149, WeaponMaterial.NETHERITE, WeaponType.SWORD);
        Main.registerItem(netheriteItem);

        final CustomWeapon diamondItem = new CustomWeapon("Diamond Dreistkleze", "Diamond Dreistkleze", 349, WeaponMaterial.DIAMOND, WeaponType.SWORD)
            .setUpgradeable(netheriteItem);
        Main.registerItem(diamondItem);

        final CustomWeapon goldItem = new CustomWeapon("Golden Dreistkleze", "Golden Dreistkleze", 649, WeaponMaterial.GOLD, WeaponType.SWORD)
            .setUpgradeable(diamondItem);
        Main.registerItem(goldItem);

        final CustomWeapon ironItem = new CustomWeapon("Iron Dreistkleze", "Iron Dreistkleze", 48, WeaponMaterial.IRON, WeaponType.SWORD)
            .setUpgradeable(goldItem);
        Main.registerItem(ironItem);

        new RecipeFactory("96", netheriteItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", " @ ", "$%$")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.OAK_PLANKS)
            .setIngredient('$', Material.STICK)
            .build();

        new RecipeFactory("95", diamondItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", " @ ", "$%$")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.OAK_PLANKS)
            .setIngredient('$', Material.STICK)
            .build();

        new RecipeFactory("123", goldItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", " @ ", "$%$")
            .setIngredient('@', Material.GOLD_INGOT)
            .setIngredient('%', Material.OAK_PLANKS)
            .setIngredient('$', Material.STICK)
            .build();

        new RecipeFactory("94", ironItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", " @ ", "$%$")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.OAK_PLANKS)
            .setIngredient('$', Material.STICK)
            .build();
    }
}