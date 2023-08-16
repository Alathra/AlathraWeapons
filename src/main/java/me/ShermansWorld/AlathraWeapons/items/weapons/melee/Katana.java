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

public class Katana implements CustomItemGroup {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomItem netheriteItem = new CustomItem("Legendary Katana", "Legendary Katana", 130, WeaponMaterial.NETHERITE, WeaponType.SWORD);
        Main.registerItem(netheriteItem);

        final CustomItem diamondItem = new CustomItem("Majestic Katana", "Majestic Katana", 330, WeaponMaterial.DIAMOND, WeaponType.SWORD)
            .setUpgradeable(netheriteItem);
        Main.registerItem(diamondItem);

        final CustomItem goldItem = new CustomItem("Glorious Katana", "Glorious Katana", 630, WeaponMaterial.GOLD, WeaponType.SWORD)
            .setUpgradeable(diamondItem);
        Main.registerItem(goldItem);

        final CustomItem ironItem = new CustomItem("Katana", "Katana", 30, WeaponMaterial.IRON, WeaponType.SWORD)
            .setUpgradeable(goldItem);
        Main.registerItem(ironItem);

        new RecipeFactory("16", netheriteItem.getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "%  ")
            .setIngredient('@', Material.NETHERITE_BLOCK)
            .setIngredient('%', Material.STICK)
            .build();

        new RecipeFactory("46", diamondItem.getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "%  ")
            .setIngredient('@', Material.DIAMOND_BLOCK)
            .setIngredient('%', Material.STICK)
            .build();

        new RecipeFactory("104", goldItem.getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "%  ")
            .setIngredient('@', Material.GOLD_BLOCK)
            .setIngredient('%', Material.STICK)
            .build();

        new RecipeFactory(Main.getIncrementNameSpaceKey(), ironItem.getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "%  ")
            .setIngredient('@', Material.IRON_BLOCK)
            .setIngredient('%', Material.STICK)
            .build();
    }
}