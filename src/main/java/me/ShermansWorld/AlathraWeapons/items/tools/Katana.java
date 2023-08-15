package me.ShermansWorld.AlathraWeapons.items.tools;

import me.ShermansWorld.AlathraWeapons.CustomWeapon;
import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.enums.WeaponMaterial;
import me.ShermansWorld.AlathraWeapons.enums.WeaponType;
import me.ShermansWorld.AlathraWeapons.exceptions.InvalidMaterialException;
import me.ShermansWorld.AlathraWeapons.items.CustomItem;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class Katana implements CustomItem {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomWeapon item = new CustomWeapon("Katana", "Katana", 30, WeaponMaterial.IRON, WeaponType.SWORD);

        Main.registerItem(item);

        new RecipeFactory(Main.getIncrementNameSpaceKey(), item.getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "%  ")
            .setIngredient('@', Material.IRON_BLOCK)
            .setIngredient('%', Material.STICK)
            .build();
    }

    /*public static void katanaRecipe() {
        new RecipeFactory("1", Main.weaponsMasterList.get(0).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "%  ")
            .setIngredient('@', Material.IRON_BLOCK)
            .setIngredient('%', Material.STICK)
            .build();
    }

    @Override
    public void custom() {
        CustomItem.super.custom();
    }*/
}