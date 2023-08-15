package me.ShermansWorld.AlathraWeapons.items.tools.iron;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class IronSchimitar {
    public static void ironScimitarRecipe() {
        new RecipeFactory("40", Main.weaponsMasterList.get(38).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", "%@@", "$% ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.GOLD_INGOT)
            .setIngredient('$', Material.STICK)
            .build();
    }
}