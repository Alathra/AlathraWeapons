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

public class KitsuneGohei implements CustomItemGroup {
    @Override
    public void register() throws InvalidMaterialException {
    	
        final CustomItem diamondItem = new CustomItem("Kitsune Gohei", "Kitsune Gohei", 357, WeaponMaterial.DIAMOND, WeaponType.SWORD);
        Main.registerItem(diamondItem);

        new RecipeFactory(Main.getIncrementNameSpaceKey(), diamondItem.getItemStack(), RecipeShape.SHAPED)
            .shape("@#@", "%&%", "$*$")
            .setIngredient('@', Material.CHERRY_SAPLING)
            .setIngredient('%', Material.REDSTONE_TORCH)
            .setIngredient('$', Material.ROSE_BUSH)
            .setIngredient('#', Material.DIAMOND_SWORD)
            .setIngredient('&', Material.LODESTONE)
            .setIngredient('*', Material.SCULK_SENSOR)
            .build();
    }
}