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

public class Longbow implements CustomItemGroup {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomItem bowItem = new CustomItem("Longbow", "Longbow", 14915, WeaponMaterial.IGNORED, WeaponType.BOW);
        Main.registerItem(bowItem);

        new RecipeFactory("88", bowItem.getItemStack(), RecipeShape.SHAPED)
            .shape("@% ", "@ $", "@% ")
            .setIngredient('@', Material.STRING)
            .setIngredient('%', Material.TRIPWIRE_HOOK)
            .setIngredient('$', Material.MANGROVE_PLANKS)
            .build();
    }
}