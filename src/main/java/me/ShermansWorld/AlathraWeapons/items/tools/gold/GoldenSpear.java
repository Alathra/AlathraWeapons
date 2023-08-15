package me.ShermansWorld.AlathraWeapons.items.tools.gold;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class GoldenSpear {
    public static void goldenSpearRecipe() {
        new RecipeFactory("105", Main.weaponsMasterList.get(103).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "%  ")
            .setIngredient('@', Material.GOLDEN_SWORD)
            .setIngredient('%', Material.STICK)
            .build();
    }
}