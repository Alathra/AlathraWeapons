package me.ShermansWorld.AlathraWeapons.items.tools.gold;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class GoldenMorningstar {
    public static void goldenMorningstarRecipe() {
        new RecipeFactory("126", Main.weaponsMasterList.get(124).getItemStack(), RecipeShape.SHAPED)
            .shape(" $ ", "$@$", "%$ ")
            .setIngredient('@', Material.GOLD_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.GOLD_NUGGET)
            .build();
    }
}