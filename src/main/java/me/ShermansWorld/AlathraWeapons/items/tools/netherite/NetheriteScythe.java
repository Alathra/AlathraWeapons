package me.ShermansWorld.AlathraWeapons.items.tools.netherite;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class NetheriteScythe {
    public static void netheriteScytheRecipe() {
        new RecipeFactory("45", Main.weaponsMasterList.get(43).getItemStack(), RecipeShape.SHAPED)
            .shape("@@%", " @ ", "@  ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.GOLD_NUGGET)
            .build();
    }
}