package me.ShermansWorld.AlathraWeapons.items.tools.netherite;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class NetheriteKunai {
    public static void netheriteKunaiRecipe() {
        new RecipeFactory("32", Main.weaponsMasterList.get(33).getItemStack(), RecipeShape.SHAPED)
            .shape("   ", " @ ", "  %")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.TRIPWIRE_HOOK)
            .build();
    }
}