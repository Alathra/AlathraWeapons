package me.ShermansWorld.AlathraWeapons.items.tools.misc;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class LongBow {
    public static void longbowRecipe() {
        new RecipeFactory("88", Main.weaponsMasterList.get(86).getItemStack(), RecipeShape.SHAPED)
            .shape("@% ", "@ $", "@% ")
            .setIngredient('@', Material.STRING)
            .setIngredient('%', Material.TRIPWIRE_HOOK)
            .setIngredient('$', Material.MANGROVE_PLANKS)
            .build();
    }
}