package me.ShermansWorld.AlathraWeapons.items.tools;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class LegendaryKatana {
    public static void legendaryKatanaRecipe() {
        new RecipeFactory("16", Main.weaponsMasterList.get(15).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "%  ")
            .setIngredient('@', Material.NETHERITE_BLOCK)
            .setIngredient('%', Material.STICK)
            .build();
    }
}