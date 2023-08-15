package me.ShermansWorld.AlathraWeapons.items.tools.gold;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class GoldenKatana {
    public static void goldenKatanaRecipe() {
        new RecipeFactory("104", Main.weaponsMasterList.get(102).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "%  ")
            .setIngredient('@', Material.GOLD_BLOCK)
            .setIngredient('%', Material.STICK)
            .build();
    }
}