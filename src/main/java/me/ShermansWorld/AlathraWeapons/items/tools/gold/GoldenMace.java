package me.ShermansWorld.AlathraWeapons.items.tools.gold;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class GoldenMace {
    public static void goldenMaceRecipe() {
        new RecipeFactory("118", Main.weaponsMasterList.get(116).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "$  ")
            .setIngredient('@', Material.GOLD_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.LEATHER)
            .build();
    }
}