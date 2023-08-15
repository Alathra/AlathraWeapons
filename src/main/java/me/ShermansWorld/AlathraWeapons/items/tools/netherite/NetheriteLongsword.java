package me.ShermansWorld.AlathraWeapons.items.tools.netherite;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class NetheriteLongsword {
    public static void netheriteLongswordRecipe() {
        new RecipeFactory("99", Main.weaponsMasterList.get(97).getItemStack(), RecipeShape.SHAPED)
            .shape("   ", " @ ", "$  ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('$', Material.NETHERITE_SWORD)
            .build();
    }
}