package me.ShermansWorld.AlathraWeapons.items.tools.misc;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class FaeBow {
    public static void faeBowRecipe() {
        new RecipeFactory("87", Main.weaponsMasterList.get(85).getItemStack(), RecipeShape.SHAPED)
            .shape(" @$", "@%^", " @$")
            .setIngredient('@', Material.STRIPPED_MANGROVE_LOG)
            .setIngredient('%', Material.CROSSBOW)
            .setIngredient('$', Material.GOLD_NUGGET)
            .setIngredient('^', Material.FLOWERING_AZALEA_LEAVES)
            .build();
    }
}