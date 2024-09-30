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

public class Lance implements CustomItemGroup {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomItem netheriteItem = new CustomItem("Netherite Lance", "Netherite Lance", 157, WeaponMaterial.NETHERITE, WeaponType.SWORD);
        Main.registerItem(netheriteItem);

        final CustomItem diamondItem = new CustomItem("Diamond Lance", "Diamond Lance", 358, WeaponMaterial.DIAMOND, WeaponType.SWORD)
            .setUpgradeable(netheriteItem);
        Main.registerItem(diamondItem);

        final CustomItem goldItem = new CustomItem("Golden Lance", "Golden Lance", 655, WeaponMaterial.GOLD, WeaponType.SWORD)
            .setUpgradeable(diamondItem);
        Main.registerItem(goldItem);

        final CustomItem ironItem = new CustomItem("Iron Lance", "Iron Lance", 56, WeaponMaterial.IRON, WeaponType.SWORD)
            .setUpgradeable(goldItem);
        Main.registerItem(ironItem);

        final CustomItem stoneItem = new CustomItem("Stone Lance", "Stone Lance", 852, WeaponMaterial.STONE, WeaponType.SWORD)
            .setUpgradeable(ironItem);
        Main.registerItem(stoneItem);

        new RecipeFactory(Main.getIncrementNameSpaceKey(), netheriteItem.getItemStack(), RecipeShape.SHAPED)
            .shape("  %", "@% ", "#@ ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.NETHERITE_BLOCK)
            .setIngredient('#', Material.STICK)
            .build();

        new RecipeFactory(Main.getIncrementNameSpaceKey(), diamondItem.getItemStack(), RecipeShape.SHAPED)
            .shape("  %", "@% ", "#@ ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.DIAMOND_BLOCK)
            .setIngredient('#', Material.STICK)
            .build();

        new RecipeFactory(Main.getIncrementNameSpaceKey(), goldItem.getItemStack(), RecipeShape.SHAPED)
            .shape("  %", "@% ", "#@ ")
            .setIngredient('@', Material.GOLD_INGOT)
            .setIngredient('%', Material.GOLD_BLOCK)
            .setIngredient('#', Material.STICK)
            .build();

        new RecipeFactory(Main.getIncrementNameSpaceKey(), ironItem.getItemStack(), RecipeShape.SHAPED)
            .shape("  %", "@% ", "#@ ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.IRON_BLOCK)
            .setIngredient('#', Material.STICK)
            .build();

        new RecipeFactory(Main.getIncrementNameSpaceKey(), stoneItem.getItemStack(), RecipeShape.SHAPED)
            .shape("  %", "@% ", "#@ ")
            .setIngredient('@', Material.COBBLESTONE_STAIRS)
            .setIngredient('%', Material.COBBLESTONE)
            .setIngredient('#', Material.STICK)
            .build();

        Main.addSmithingUpgrade(diamondItem, netheriteItem);
    }
}