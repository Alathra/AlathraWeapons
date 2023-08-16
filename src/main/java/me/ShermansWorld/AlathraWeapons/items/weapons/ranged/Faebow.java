package me.ShermansWorld.AlathraWeapons.items.weapons.ranged;

import me.ShermansWorld.AlathraWeapons.CustomItem;
import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.enums.WeaponMaterial;
import me.ShermansWorld.AlathraWeapons.enums.WeaponType;
import me.ShermansWorld.AlathraWeapons.exceptions.InvalidMaterialException;
import me.ShermansWorld.AlathraWeapons.items.CustomItemGroup;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class Faebow implements CustomItemGroup {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomItem bowItem = new CustomItem("Faebow", "Faebow", 14914, WeaponMaterial.IGNORED, WeaponType.CROSSBOW);
        Main.registerItem(bowItem);

        new RecipeFactory(Main.getIncrementNameSpaceKey(), bowItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" @$", "@%^", " @$")
            .setIngredient('@', Material.STRIPPED_MANGROVE_LOG)
            .setIngredient('%', Material.CROSSBOW)
            .setIngredient('$', Material.GOLD_NUGGET)
            .setIngredient('^', Material.FLOWERING_AZALEA_LEAVES)
            .build();
    }
}