package me.ShermansWorld.AlathraWeapons.items.tools.iron;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class IronNaginata {
    public static void ironNaginataRecipe() {
        new RecipeFactory("5", Main.weaponsMasterList.get(3).getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", " % ", "%  ")
            .setIngredient('@', Material.IRON_SWORD)
            .setIngredient('%', Material.STICK)
            .build();
    }
}