package me.ShermansWorld.AlathraWeapons.items.tools.netherite;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class NetheriteMorningStar {
    public static void netheriteMorningStarRecipe() {
        new RecipeFactory("22", Main.weaponsMasterList.get(21).getItemStack(), RecipeShape.SHAPED)
            .shape(" $ ", "$@$", "%$ ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.AMETHYST_SHARD)
            .build();
    }
}