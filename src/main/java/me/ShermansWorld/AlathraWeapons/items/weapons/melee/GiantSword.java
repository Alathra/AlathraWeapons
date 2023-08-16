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

public class GiantSword implements CustomItemGroup {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomItem netheriteItem = new CustomItem("Netherite Giant Sword", "Netherite Giant Sword", 128, WeaponMaterial.NETHERITE, WeaponType.SWORD);
        Main.registerItem(netheriteItem);

        final CustomItem diamondItem = new CustomItem("Diamond Giant Sword", "Diamond Giant Sword", 329, WeaponMaterial.DIAMOND, WeaponType.SWORD)
            .setUpgradeable(netheriteItem);
        Main.registerItem(diamondItem);

        final CustomItem goldItem = new CustomItem("Golden Giant Sword", "Golden Giant Sword", 629, WeaponMaterial.GOLD, WeaponType.SWORD)
            .setUpgradeable(diamondItem);
        Main.registerItem(goldItem);

        final CustomItem ironItem = new CustomItem("Iron Giant Sword", "Iron Giant Sword", 29, WeaponMaterial.IRON, WeaponType.SWORD)
            .setUpgradeable(goldItem);
        Main.registerItem(ironItem);

        new RecipeFactory("102", netheriteItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" @@", "%@@", "$% ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.GOLD_INGOT)
            .setIngredient('$', Material.STICK)
            .build();

        new RecipeFactory("80", diamondItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" @@", "%@@", "$% ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.GOLD_INGOT)
            .setIngredient('$', Material.STICK)
            .build();

        new RecipeFactory("103", goldItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" @@", "%@@", "$% ")
            .setIngredient('@', Material.GOLD_INGOT)
            .setIngredient('%', Material.AMETHYST_SHARD)
            .setIngredient('$', Material.STICK)
            .build();

        new RecipeFactory("100", ironItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" @@", "%@@", "$% ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.GOLD_INGOT)
            .setIngredient('$', Material.STICK)
            .build();
    }
}