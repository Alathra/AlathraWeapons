package me.ShermansWorld.AlathraWeapons.items.tools.gold;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class GoldenKunai {
    public static void goldenKunaiRecipe() {
        new RecipeFactory("112", Main.weaponsMasterList.get(110).getItemStack(), RecipeShape.SHAPED)
            .shape("   ", " @ ", "  %")
            .setIngredient('@', Material.GOLD_INGOT)
            .setIngredient('%', Material.TRIPWIRE_HOOK)
            .build();
    }
}