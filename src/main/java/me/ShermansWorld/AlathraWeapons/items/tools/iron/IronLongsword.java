package me.ShermansWorld.AlathraWeapons.items.tools.iron;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class IronLongsword {
    public static void ironLongswordRecipe() {
        new RecipeFactory("97", Main.weaponsMasterList.get(95).getItemStack(), RecipeShape.SHAPED)
            .shape("   ", " @ ", "$  ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('$', Material.IRON_SWORD)
            .build();
    }
}