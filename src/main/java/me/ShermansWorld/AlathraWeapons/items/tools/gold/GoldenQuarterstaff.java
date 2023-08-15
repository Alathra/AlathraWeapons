package me.ShermansWorld.AlathraWeapons.items.tools.gold;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class GoldenQuarterstaff {
    public static void goldenQuarterstaffRecipe() {
        new RecipeFactory("111", Main.weaponsMasterList.get(109).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "@  ")
            .setIngredient('@', Material.GOLD_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
    }
}