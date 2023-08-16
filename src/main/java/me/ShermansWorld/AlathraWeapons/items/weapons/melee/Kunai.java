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

public class Kunai implements CustomItemGroup {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomItem netheriteItem = new CustomItem("Netherite Kunai", "Netherite Kunai", 138, WeaponMaterial.NETHERITE, WeaponType.SWORD);
        Main.registerItem(netheriteItem);

        final CustomItem diamondItem = new CustomItem("Diamond Kunai", "Diamond Kunai", 338, WeaponMaterial.DIAMOND, WeaponType.SWORD)
            .setUpgradeable(netheriteItem);
        Main.registerItem(diamondItem);

        final CustomItem goldItem = new CustomItem("Golden Kunai", "Golden Kunai", 638, WeaponMaterial.GOLD, WeaponType.SWORD)
            .setUpgradeable(diamondItem);
        Main.registerItem(goldItem);

        final CustomItem ironItem = new CustomItem("Iron Kunai", "Iron Kunai", 38, WeaponMaterial.IRON, WeaponType.SWORD)
            .setUpgradeable(goldItem);
        Main.registerItem(ironItem);

        new RecipeFactory("32", netheriteItem.getItemStack(), RecipeShape.SHAPED)
            .shape("   ", " @ ", "  %")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.TRIPWIRE_HOOK)
            .build();

        new RecipeFactory("54", diamondItem.getItemStack(), RecipeShape.SHAPED)
            .shape("   ", " @ ", "  %")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.TRIPWIRE_HOOK)
            .build();

        new RecipeFactory("112", goldItem.getItemStack(), RecipeShape.SHAPED)
            .shape("   ", " @ ", "  %")
            .setIngredient('@', Material.GOLD_INGOT)
            .setIngredient('%', Material.TRIPWIRE_HOOK)
            .build();

        new RecipeFactory("31", ironItem.getItemStack(), RecipeShape.SHAPED)
            .shape("   ", " @ ", "  %")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.TRIPWIRE_HOOK)
            .build();
    }
}