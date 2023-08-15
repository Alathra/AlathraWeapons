package me.ShermansWorld.AlathraWeapons.items.tools.gold;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class GoldenLongsword {
    public static void goldenLongswordRecipe() {
        new RecipeFactory("124", Main.weaponsMasterList.get(122).getItemStack(), RecipeShape.SHAPED)
            .shape("   ", " @ ", "$  ")
            .setIngredient('@', Material.GOLD_INGOT)
            .setIngredient('$', Material.GOLDEN_SWORD)
            .build();
    }
}