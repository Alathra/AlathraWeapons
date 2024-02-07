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

public class SunrayAxe implements CustomItemGroup {
    @Override
    public void register() throws InvalidMaterialException {
    	
        final CustomItem diamondItem = new CustomItem("Sunray Axe", "Sunray Axe", 541, WeaponMaterial.DIAMOND, WeaponType.AXE);
        Main.registerItem(diamondItem);

        new RecipeFactory(Main.getIncrementNameSpaceKey(), diamondItem.getItemStack(), RecipeShape.SHAPED)
            .shape("$%#", " @%", "@ $")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.DIAMOND_BLOCK)
            .setIngredient('$', Material.BLAZE_POWDER)
            .setIngredient('#', Material.LAVA_BUCKET)
            .build();
    }
}