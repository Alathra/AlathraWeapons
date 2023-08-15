package me.ShermansWorld.AlathraWeapons.items.tools.netherite;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class NetheriteSpear {
    public static void netheriteSpearRecipe() {
        new RecipeFactory("17", Main.weaponsMasterList.get(16).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "%  ")
            .setIngredient('@', Material.NETHERITE_SWORD)
            .setIngredient('%', Material.STICK)
            .build();
    }
}