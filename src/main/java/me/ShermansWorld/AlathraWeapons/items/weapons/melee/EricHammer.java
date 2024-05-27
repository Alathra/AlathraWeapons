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

public class EricHammer implements CustomItemGroup {
    @Override
    public void register() throws InvalidMaterialException {
    	
        final CustomItem diamondItem = new CustomItem("Eric Hammer", "Eric Hammer", 545, WeaponMaterial.DIAMOND, WeaponType.AXE);
        Main.registerItem(diamondItem);

        new RecipeFactory(Main.getIncrementNameSpaceKey(), diamondItem.getItemStack(), RecipeShape.SHAPED)
            .shape("#%#", "@$@", "#%#")
            .setIngredient('@', Material.RED_DYE)
            .setIngredient('%', Material.IRON_INGOT)
            .setIngredient('$', Material.DIAMOND_AXE)
            .setIngredient('#', Material.VINE)
            .build();
    }
}