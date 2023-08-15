package me.ShermansWorld.AlathraWeapons.items.tools.iron;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class IronQuarterStaff {
    public static void ironQuarterStaffRecipe() {
        new RecipeFactory("2", Main.weaponsMasterList.get(10).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "@  ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
    }
}