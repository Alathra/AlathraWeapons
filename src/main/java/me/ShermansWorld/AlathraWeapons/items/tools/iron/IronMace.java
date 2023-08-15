package me.ShermansWorld.AlathraWeapons.items.tools.iron;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class IronMace {
    public static void ironMaceRecipe() {
        new RecipeFactory("71", Main.weaponsMasterList.get(69).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "$  ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.LEATHER)
            .build();
    }
}