package me.ShermansWorld.AlathraWeapons.items.tools.netherite;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class NetheriteQuarterStaff {
    public static void netheriteQuarterStaffRecipe() {
        new RecipeFactory("26", Main.weaponsMasterList.get(25).getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "@  ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
    }
}