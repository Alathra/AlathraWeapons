package me.ShermansWorld.AlathraWeapons.items.tools.netherite;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class NetheriteZweihander {
    public static void netheriteZweihanderRecipe() {
        new RecipeFactory("23", Main.weaponsMasterList.get(22).getItemStack(), RecipeShape.SHAPED)
            .shape("  %", " % ", "@  ")
            .setIngredient('@', Material.NETHERITE_SWORD)
            .setIngredient('%', Material.NETHERITE_INGOT)
            .build();
    }
}