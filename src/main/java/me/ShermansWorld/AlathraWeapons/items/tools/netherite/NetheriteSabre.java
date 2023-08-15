package me.ShermansWorld.AlathraWeapons.items.tools.netherite;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class NetheriteSabre {
    public static void netheriteSabreRecipe() {
        new RecipeFactory("34", Main.weaponsMasterList.get(34).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "$% ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.AMETHYST_SHARD)
            .build();
    }
}