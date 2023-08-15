package me.ShermansWorld.AlathraWeapons.items.tools.netherite;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class NetheriteTwinBlade {
    public static void netheriteTwinBladeRecipe() {
        new RecipeFactory("36", Main.weaponsMasterList.get(35).getItemStack(), RecipeShape.SHAPED)
            .shape(" $@", "$%$", "@$ ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.GOLD_INGOT)
            .build();
    }
}