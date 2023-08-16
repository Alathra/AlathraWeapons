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

public class Shortsword implements CustomItemGroup {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomItem netheriteItem = new CustomItem("Netherite Shortsword", "Netherite Shortsword", 136, WeaponMaterial.NETHERITE, WeaponType.SWORD);
        Main.registerItem(netheriteItem);

        final CustomItem diamondItem = new CustomItem("Diamond Shortsword", "Diamond Shortsword", 336, WeaponMaterial.DIAMOND, WeaponType.SWORD)
            .setUpgradeable(netheriteItem);
        Main.registerItem(diamondItem);

        final CustomItem goldItem = new CustomItem("Golden Shortsword", "Golden Shortsword", 636, WeaponMaterial.GOLD, WeaponType.SWORD)
            .setUpgradeable(diamondItem);
        Main.registerItem(goldItem);

        final CustomItem ironItem = new CustomItem("Iron Shortsword", "Iron Shortsword", 36, WeaponMaterial.IRON, WeaponType.SWORD)
            .setUpgradeable(goldItem);
        Main.registerItem(ironItem);

        new RecipeFactory("25", netheriteItem.getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "%  ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.STICK)
            .build();

        new RecipeFactory("52", diamondItem.getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "%  ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.STICK)
            .build();

        new RecipeFactory("110", goldItem.getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "%  ")
            .setIngredient('@', Material.GOLD_INGOT)
            .setIngredient('%', Material.STICK)
            .build();

        new RecipeFactory("11", ironItem.getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "%  ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
    }
}