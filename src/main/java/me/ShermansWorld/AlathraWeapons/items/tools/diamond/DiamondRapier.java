package me.ShermansWorld.AlathraWeapons.items.tools.diamond;

import me.ShermansWorld.AlathraWeapons.CustomWeapon;
import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.enums.WeaponMaterial;
import me.ShermansWorld.AlathraWeapons.enums.WeaponType;
import me.ShermansWorld.AlathraWeapons.exceptions.InvalidMaterialException;
import me.ShermansWorld.AlathraWeapons.items.CustomItem;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class DiamondRapier implements CustomItem {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomWeapon ironItem = ;

        Main.registerItem(ironItem);

        final CustomWeapon goldItem = ;

        Main.registerItem(goldItem);

        final CustomWeapon netheriteItem = ;

        Main.registerItem(netheriteItem);
        final CustomWeapon diamondItem = new CustomWeapon("Diamond Rapier", "Diamond Rapier", 342, WeaponMaterial.DIAMOND, WeaponType.SWORD);

        Main.registerItem(diamondItem);

        new RecipeFactory("58", diamondItem.getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "%  ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.LIGHTNING_ROD)
            .build();
    }
}