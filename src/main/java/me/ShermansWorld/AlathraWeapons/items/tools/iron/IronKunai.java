package me.ShermansWorld.AlathraWeapons.items.tools.iron;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class IronKunai {
    public static void ironKunaiRecipe() {
        new RecipeFactory("31", Main.weaponsMasterList.get(30).getItemStack(), RecipeShape.SHAPED)
            .shape("   ", " @ ", "  %")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.TRIPWIRE_HOOK)
            .build();
    }
}