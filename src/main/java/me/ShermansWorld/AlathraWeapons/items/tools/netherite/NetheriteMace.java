package me.ShermansWorld.AlathraWeapons.items.tools.netherite;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class NetheriteMace {
    public static void netheriteMaceRecipe() {
        new RecipeFactory("73", Main.weaponsMasterList.get(71).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "$  ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.RABBIT_HIDE)
            .build();
    }
}