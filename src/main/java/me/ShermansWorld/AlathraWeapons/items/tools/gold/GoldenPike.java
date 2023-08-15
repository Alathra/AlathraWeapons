package me.ShermansWorld.AlathraWeapons.items.tools.gold;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class GoldenPike {
    public static void goldenPikeRecipe() {
        new RecipeFactory("107", Main.weaponsMasterList.get(105).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "%  ")
            .setIngredient('@', Material.GOLD_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
    }
}