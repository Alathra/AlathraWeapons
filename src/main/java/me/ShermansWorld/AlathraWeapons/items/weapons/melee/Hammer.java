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

public class Hammer implements CustomItemGroup {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomItem stoneItem = new CustomItem("Stone Hammer", "Stone Hammer", 943, WeaponMaterial.STONE, WeaponType.AXE);
        Main.registerItem(stoneItem);
        
        final CustomItem ironItem = new CustomItem("Iron Hammer", "Iron Hammer", 243, WeaponMaterial.IRON, WeaponType.AXE);
        Main.registerItem(ironItem);
            
        final CustomItem diamondItem = new CustomItem("Obsidian Hammer", "Obsidian Hammer", 543, WeaponMaterial.DIAMOND, WeaponType.AXE);
        Main.registerItem(diamondItem);
        
        new RecipeFactory(Main.getIncrementNameSpaceKey(), stoneItem.getItemStack(), RecipeShape.SHAPED)
            .shape("@#@", "@$@", " % ")
            .setIngredient('@', Material.STONE)
            .setIngredient('#', Material.EMERALD)
            .setIngredient('$', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
       
        new RecipeFactory(Main.getIncrementNameSpaceKey(), ironItem.getItemStack(), RecipeShape.SHAPED)
        	.shape("@#@", "@$@", " % ")
        	.setIngredient('@', Material.IRON_BLOCK)
        	.setIngredient('#', Material.EMERALD)
        	.setIngredient('$', Material.IRON_INGOT)
        	.setIngredient('%', Material.STICK)
        	.build();

        new RecipeFactory(Main.getIncrementNameSpaceKey(), diamondItem.getItemStack(), RecipeShape.SHAPED)
        	.shape("@#@", "@$@", " % ")
            .setIngredient('@', Material.OBSIDIAN)
            .setIngredient('#', Material.DIAMOND)
            .setIngredient('$', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
        
    }
}