package me.ShermansWorld.AlathraWeapons.items.tools.iron;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class IronScythe {
    public static void ironScytheRecipe() {
        new RecipeFactory("44", Main.weaponsMasterList.get(42).getItemStack(), RecipeShape.SHAPED)
            .shape("@@%", " @ ", "@  ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.GOLD_NUGGET)
            .build();
    }
}