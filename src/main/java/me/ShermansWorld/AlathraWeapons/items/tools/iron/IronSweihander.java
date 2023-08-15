package me.ShermansWorld.AlathraWeapons.items.tools.iron;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class IronSweihander {
    public static void ironZweihanderRecipe() {
        new RecipeFactory("9", Main.weaponsMasterList.get(7).getItemStack(), RecipeShape.SHAPED)
            .shape("  %", " % ", "@  ")
            .setIngredient('@', Material.IRON_SWORD)
            .setIngredient('%', Material.IRON_INGOT)
            .build();
    }
}