package me.ShermansWorld.AlathraWeapons.items.weapons.melee;

import me.ShermansWorld.AlathraWeapons.CustomItem;
import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.enums.WeaponMaterial;
import me.ShermansWorld.AlathraWeapons.enums.WeaponType;
import me.ShermansWorld.AlathraWeapons.exceptions.InvalidMaterialException;
import me.ShermansWorld.AlathraWeapons.items.CustomItemGroup;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class Naginata implements CustomItemGroup {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomItem netheriteItem = new CustomItem("Netherite Naginata", "Netherite Naginata", 132, WeaponMaterial.NETHERITE, WeaponType.SWORD);
        Main.registerItem(netheriteItem);

        final CustomItem diamondItem = new CustomItem("Diamond Naginata", "Diamond Naginata", 332, WeaponMaterial.DIAMOND, WeaponType.SWORD)
            .setUpgradeable(netheriteItem);
        Main.registerItem(diamondItem);

        final CustomItem goldItem = new CustomItem("Golden Naginata", "Golden Naginata", 632, WeaponMaterial.GOLD, WeaponType.SWORD)
            .setUpgradeable(diamondItem);
        Main.registerItem(goldItem);

        final CustomItem ironItem = new CustomItem("Iron Naginata", "Iron Naginata", 32, WeaponMaterial.IRON, WeaponType.SWORD)
            .setUpgradeable(goldItem);
        Main.registerItem(ironItem);

        new RecipeFactory("19", netheriteItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", " % ", "%  ")
            .setIngredient('@', Material.NETHERITE_SWORD)
            .setIngredient('%', Material.STICK)
            .build();

        new RecipeFactory("48", diamondItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", " % ", "%  ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.STICK)
            .build();

        new RecipeFactory("106", goldItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", " % ", "%  ")
            .setIngredient('@', Material.GOLDEN_SWORD)
            .setIngredient('%', Material.STICK)
            .build();

        new RecipeFactory("5", ironItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", " % ", "%  ")
            .setIngredient('@', Material.IRON_SWORD)
            .setIngredient('%', Material.STICK)
            .build();
    }
}