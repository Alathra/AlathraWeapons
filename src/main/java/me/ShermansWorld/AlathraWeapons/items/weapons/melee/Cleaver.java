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

public class Cleaver implements CustomItemGroup {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomItem netheriteItem = new CustomItem("Netherite Cleaver", "Netherite Cleaver", 152, WeaponMaterial.NETHERITE, WeaponType.SWORD);
        Main.registerItem(netheriteItem);

        final CustomItem diamondItem = new CustomItem("Diamond Cleaver", "Diamond Cleaver", 352, WeaponMaterial.DIAMOND, WeaponType.SWORD)
            .setUpgradeable(netheriteItem);
        Main.registerItem(diamondItem);

        final CustomItem goldItem = new CustomItem("Golden Cleaver", "Golden Cleaver", 652, WeaponMaterial.GOLD, WeaponType.SWORD)
            .setUpgradeable(diamondItem);
        Main.registerItem(goldItem);

        final CustomItem ironItem = new CustomItem("Iron Cleaver", "Iron Cleaver", 52, WeaponMaterial.IRON, WeaponType.SWORD)
            .setUpgradeable(goldItem);
        Main.registerItem(ironItem);

        new RecipeFactory(Main.getIncrementNameSpaceKey(), netheriteItem.getItemStack(), RecipeShape.SHAPED)
        	.shape("$@ ", "$@ ", " # ")
        	.setIngredient('@', Material.NETHERITE_INGOT)
        	.setIngredient('$', Material.AMETHYST_SHARD)
        	.setIngredient('#', Material.STICK)
            .build();

        new RecipeFactory(Main.getIncrementNameSpaceKey(), diamondItem.getItemStack(), RecipeShape.SHAPED)
        	.shape("$@ ", "$@ ", " # ")
        	.setIngredient('@', Material.DIAMOND)
        	.setIngredient('$', Material.AMETHYST_SHARD)
        	.setIngredient('#', Material.STICK)
            .build();

        new RecipeFactory(Main.getIncrementNameSpaceKey(), goldItem.getItemStack(), RecipeShape.SHAPED)
        	.shape("$@ ", "$@ ", " # ")
        	.setIngredient('@', Material.GOLD_INGOT)
        	.setIngredient('$', Material.FLINT)
        	.setIngredient('#', Material.STICK)
            .build();

        new RecipeFactory(Main.getIncrementNameSpaceKey(), ironItem.getItemStack(), RecipeShape.SHAPED)
            .shape("$@ ", "$@ ", " # ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('$', Material.FLINT)
            .setIngredient('#', Material.STICK)
            .build();

        Main.addSmithingUpgrade(diamondItem, netheriteItem);
    }
}