package me.ShermansWorld.AlathraWeapons.items.tools.gold;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class GoldenNaginata {
    public static void goldenNaginataRecipe() {
        new RecipeFactory("106", Main.weaponsMasterList.get(104).getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", " % ", "%  ")
            .setIngredient('@', Material.GOLDEN_SWORD)
            .setIngredient('%', Material.STICK)
            .build();
    }
}