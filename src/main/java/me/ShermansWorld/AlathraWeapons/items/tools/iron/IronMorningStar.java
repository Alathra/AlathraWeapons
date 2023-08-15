package me.ShermansWorld.AlathraWeapons.items.tools.iron;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class IronMorningStar {
    public static void ironMorningStarRecipe() {
        new RecipeFactory("8", Main.weaponsMasterList.get(6).getItemStack(), RecipeShape.SHAPED)
            .shape(" $ ", "$@$", "%$ ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.IRON_NUGGET)
            .build();
    }
}