package me.ShermansWorld.AlathraWeapons.items.tools.netherite;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class NetheritePike {
    public static void netheritePikeRecipe() {
        new RecipeFactory("20", Main.weaponsMasterList.get(19).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "%  ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
    }
}