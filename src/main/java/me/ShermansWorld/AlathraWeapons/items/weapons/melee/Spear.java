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

public class Spear implements CustomItemGroup {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomItem netheriteItem = new CustomItem("Netherite Spear", "Netherite Spear", 131, WeaponMaterial.NETHERITE, WeaponType.SWORD);
        Main.registerItem(netheriteItem);

        final CustomItem diamondItem = new CustomItem("Diamond Spear", "Diamond Spear", 331, WeaponMaterial.DIAMOND, WeaponType.SWORD)
            .setUpgradeable(netheriteItem);
        Main.registerItem(diamondItem);

        final CustomItem goldItem = new CustomItem("Golden Spear", "Golden Spear", 631, WeaponMaterial.GOLD, WeaponType.SWORD)
            .setUpgradeable(diamondItem);
        Main.registerItem(goldItem);

        final CustomItem ironItem = new CustomItem("Iron Spear", "Iron Spear", 31, WeaponMaterial.IRON, WeaponType.SWORD)
            .setUpgradeable(goldItem);
        Main.registerItem(ironItem);

        new RecipeFactory("17", netheriteItem.getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "%  ")
            .setIngredient('@', Material.NETHERITE_SWORD)
            .setIngredient('%', Material.STICK)
            .build();

        new RecipeFactory("47", diamondItem.getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "%  ")
            .setIngredient('@', Material.DIAMOND_SWORD)
            .setIngredient('%', Material.STICK)
            .build();

        new RecipeFactory("105", goldItem.getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "%  ")
            .setIngredient('@', Material.GOLDEN_SWORD)
            .setIngredient('%', Material.STICK)
            .build();

        new RecipeFactory("4", ironItem.getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "%  ")
            .setIngredient('@', Material.IRON_SWORD)
            .setIngredient('%', Material.STICK)
            .build();
    }
}