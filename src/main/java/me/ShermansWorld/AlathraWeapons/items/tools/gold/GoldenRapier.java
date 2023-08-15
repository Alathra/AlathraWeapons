package me.ShermansWorld.AlathraWeapons.items.tools.gold;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class GoldenRapier {
    public static void goldenRapierRecipe() {
        new RecipeFactory("116", Main.weaponsMasterList.get(114).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "%  ")
            .setIngredient('@', Material.GOLD_INGOT)
            .setIngredient('%', Material.LIGHTNING_ROD)
            .build();
    }
}