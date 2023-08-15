package me.ShermansWorld.AlathraWeapons.items.tools.gold;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class GoldenZweihander {
    public static void goldenZweihanderRecipe() {
        new RecipeFactory("109", Main.weaponsMasterList.get(107).getItemStack(), RecipeShape.SHAPED)
            .shape("  %", " % ", "@  ")
            .setIngredient('@', Material.GOLDEN_SWORD)
            .setIngredient('%', Material.GOLD_INGOT)
            .build();
    }
}