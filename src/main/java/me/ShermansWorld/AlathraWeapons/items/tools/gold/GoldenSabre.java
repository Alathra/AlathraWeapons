package me.ShermansWorld.AlathraWeapons.items.tools.gold;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class GoldenSabre {
    public static void goldenSabreRecipe() {
        new RecipeFactory("113", Main.weaponsMasterList.get(111).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "$% ")
            .setIngredient('@', Material.GOLD_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.LAPIS_LAZULI)
            .build();
    }
}