package me.ShermansWorld.AlathraWeapons.items.tools.iron;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class IronPike {
    public static void ironPikeRecipe() {
        new RecipeFactory("3", Main.weaponsMasterList.get(4).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "%  ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
    }
}