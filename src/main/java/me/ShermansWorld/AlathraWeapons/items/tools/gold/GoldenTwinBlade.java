package me.ShermansWorld.AlathraWeapons.items.tools.gold;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class GoldenTwinBlade {
    public static void goldenTwinBladeRecipe() {
        new RecipeFactory("114", Main.weaponsMasterList.get(112).getItemStack(), RecipeShape.SHAPED)
            .shape(" $@", "$%$", "@$ ")
            .setIngredient('@', Material.GOLD_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.AMETHYST_SHARD)
            .build();
    }
}