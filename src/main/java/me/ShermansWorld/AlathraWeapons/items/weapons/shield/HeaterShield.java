package me.ShermansWorld.AlathraWeapons.items.weapons.shield;

import me.ShermansWorld.AlathraWeapons.CustomItem;
import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.enums.WeaponMaterial;
import me.ShermansWorld.AlathraWeapons.enums.WeaponType;
import me.ShermansWorld.AlathraWeapons.exceptions.InvalidMaterialException;
import me.ShermansWorld.AlathraWeapons.items.CustomItemGroup;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class HeaterShield implements CustomItemGroup {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomItem shieldItem = new CustomItem("Heater Shield", "Heater Shield", 403, WeaponMaterial.IGNORED, WeaponType.SHIELD);
        Main.registerItem(shieldItem);

        new RecipeFactory(Main.getIncrementNameSpaceKey(), shieldItem.getItemStack(), RecipeShape.SHAPED)
        	.shape("#@#", "#@#", " # ")
        	.setIngredient('@', Material.OAK_PLANKS)
        	.setIngredient('#', Material.IRON_INGOT)
            .build();
    }
}