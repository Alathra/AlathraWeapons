package me.ShermansWorld.AlathraWeapons.items.tools.gold;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class GoldenScimitar {
    public static void goldenScimitarRecipe() {
        new RecipeFactory("115", Main.weaponsMasterList.get(113).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", "%@@", "$% ")
            .setIngredient('@', Material.GOLD_INGOT)
            .setIngredient('%', Material.AMETHYST_SHARD)
            .setIngredient('$', Material.STICK)
            .build();
    }
}