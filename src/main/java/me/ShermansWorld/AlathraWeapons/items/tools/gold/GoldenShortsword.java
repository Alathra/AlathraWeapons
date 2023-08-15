package me.ShermansWorld.AlathraWeapons.items.tools.gold;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class GoldenShortsword {
    public static void goldenShortswordRecipe() {
        new RecipeFactory("110", Main.weaponsMasterList.get(108).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "%  ")
            .setIngredient('@', Material.GOLD_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
    }
}