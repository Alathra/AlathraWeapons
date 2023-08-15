package me.ShermansWorld.AlathraWeapons.items.tools.iron;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class IronWarHammer {
    public static void ironWarHammerRecipe() {
        new RecipeFactory("10", Main.weaponsMasterList.get(8).getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", " %@", "%  ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
    }
}