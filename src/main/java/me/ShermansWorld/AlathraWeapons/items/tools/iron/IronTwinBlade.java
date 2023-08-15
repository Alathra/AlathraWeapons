package me.ShermansWorld.AlathraWeapons.items.tools.iron;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class IronTwinBlade {
    public static void ironTwinBladeRecipe() {
        new RecipeFactory("35", Main.weaponsMasterList.get(32).getItemStack(), RecipeShape.SHAPED)
            .shape(" $@", "$%$", "@$ ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.DIAMOND)
            .build();
    }
}