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

public class RusteyeCleaver implements CustomItemGroup {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomItem netheriteItem = new CustomItem("Netherite Rusteye Cleaver", "Netherite Rusteye Cleaver", 153, WeaponMaterial.NETHERITE, WeaponType.SWORD);
        Main.registerItem(netheriteItem);

        final CustomItem diamondItem = new CustomItem("Diamond Rusteye Cleaver", "Diamond Rusteye Cleaver", 353, WeaponMaterial.DIAMOND, WeaponType.SWORD)
            .setUpgradeable(netheriteItem);
        Main.registerItem(diamondItem);

        final CustomItem ironItem = new CustomItem("Iron Rusteye Cleaver", "Iron Rusteye Cleaver", 53, WeaponMaterial.IRON, WeaponType.SWORD)
        		.setUpgradeable(diamondItem);
        Main.registerItem(ironItem);
        
        new RecipeFactory(Main.getIncrementNameSpaceKey(), netheriteItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" @%", " %#", "$  ")
            .setIngredient('@', Material.VINE)
            .setIngredient('%', Material.NETHERITE_INGOT)
            .setIngredient('#', Material.MAGMA_CREAM)
            .setIngredient('$', Material.STICK)
            .build();

        new RecipeFactory(Main.getIncrementNameSpaceKey(), diamondItem.getItemStack(), RecipeShape.SHAPED)
        	.shape(" @%", " %#", "$  ")
            .setIngredient('@', Material.VINE)
            .setIngredient('%', Material.DIAMOND)
            .setIngredient('#', Material.MAGMA_CREAM)
            .setIngredient('$', Material.STICK)
            .build();

        new RecipeFactory(Main.getIncrementNameSpaceKey(), ironItem.getItemStack(), RecipeShape.SHAPED)
        	.shape(" @%", " %#", "$  ")
            .setIngredient('@', Material.VINE)
            .setIngredient('%', Material.IRON_INGOT)
            .setIngredient('#', Material.MAGMA_CREAM)
            .setIngredient('$', Material.STICK)
            .build();
        
        Main.addSmithingUpgrade(diamondItem, netheriteItem);
    }
}