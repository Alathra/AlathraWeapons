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

public class Honshu implements CustomItemGroup {
    @Override
    public void register() throws InvalidMaterialException {

        final CustomItem netheriteItem = new CustomItem("Netherite Honshu", "Netherite Honshu", 156, WeaponMaterial.NETHERITE, WeaponType.SWORD);
        Main.registerItem(netheriteItem);
      
        new RecipeFactory(Main.getIncrementNameSpaceKey(), netheriteItem.getItemStack(), RecipeShape.SHAPED)
        	.shape("  %", " % ", "@  ")
            .setIngredient('@', Material.GOLD_INGOT)
            .setIngredient('%', Material.NETHERITE_INGOT)
            .build();
    }
}