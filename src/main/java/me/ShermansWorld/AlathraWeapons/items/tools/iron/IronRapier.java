package me.ShermansWorld.AlathraWeapons.items.tools.iron;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class IronRapier {
    public static void ironRapierRecipe() {
        new RecipeFactory("42", Main.weaponsMasterList.get(40).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " @ ", "%  ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.LIGHTNING_ROD)
            .build();
    }
}