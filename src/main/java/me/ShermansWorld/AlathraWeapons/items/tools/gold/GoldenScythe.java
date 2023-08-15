package me.ShermansWorld.AlathraWeapons.items.tools.gold;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class GoldenScythe {
    public static void goldenScytheRecipe() {
        new RecipeFactory("133", Main.weaponsMasterList.get(131).getItemStack(), RecipeShape.SHAPED)
            .shape("@@%", " @ ", "@  ")
            .setIngredient('@', Material.GOLD_INGOT)
            .setIngredient('%', Material.AMETHYST_SHARD)
            .build();
    }
}