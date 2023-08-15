package me.ShermansWorld.AlathraWeapons.items.tools.netherite;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class NetheriteSchimitar {
    public static void netheriteScimitarRecipe() {
        new RecipeFactory("41", Main.weaponsMasterList.get(39).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", "%@@", "$% ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.GOLD_INGOT)
            .setIngredient('$', Material.STICK)
            .build();
    }
}