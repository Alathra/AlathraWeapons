package me.ShermansWorld.AlathraWeapons.items.weapons.ranged;

import me.ShermansWorld.AlathraWeapons.CustomItem;
import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.enums.WeaponMaterial;
import me.ShermansWorld.AlathraWeapons.enums.WeaponType;
import me.ShermansWorld.AlathraWeapons.exceptions.InvalidMaterialException;
import me.ShermansWorld.AlathraWeapons.items.CustomItemGroup;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class AmethystTrident implements CustomItemGroup {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomItem tridentItem = new CustomItem("Amethyst Trident", "Amethyst Trident", 1100, WeaponMaterial.IGNORED, WeaponType.TRIDENT);
        Main.registerItem(tridentItem);

        new RecipeFactory(Main.getIncrementNameSpaceKey(), tridentItem.getItemStack(), RecipeShape.SHAPED)
            .shape("@@@", "$%$", " ^ ")
            .setIngredient('@', Material.AMETHYST_SHARD)
            .setIngredient('%', Material.TRIDENT)
            .setIngredient('$', Material.COPPER_INGOT)
            .setIngredient('^', Material.LIGHTNING_ROD)
            .build();
    }
}