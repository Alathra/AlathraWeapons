package me.ShermansWorld.AlathraWeapons.items.tools.iron;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class IronSabre {
    public static void ironSabreRecipe() {
        new RecipeFactory("33", Main.weaponsMasterList.get(31).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "$% ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.LAPIS_LAZULI)
            .build();
    }
}