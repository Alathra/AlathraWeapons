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

public class TwinBlade implements CustomItemGroup {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomItem netheriteItem = new CustomItem("Netherite Twin Blade", "Netherite Twin Blade", 140, WeaponMaterial.NETHERITE, WeaponType.SWORD);
        Main.registerItem(netheriteItem);

        final CustomItem diamondItem = new CustomItem("Diamond Twin Blade", "Diamond Twin Blade", 340, WeaponMaterial.DIAMOND, WeaponType.SWORD)
            .setUpgradeable(netheriteItem);
        Main.registerItem(diamondItem);

        final CustomItem goldItem = new CustomItem("Golden Twin Blade", "Golden Twin Blade", 640, WeaponMaterial.GOLD, WeaponType.SWORD)
            .setUpgradeable(diamondItem);
        Main.registerItem(goldItem);

        final CustomItem ironItem = new CustomItem("Iron Twin Blade", "Iron Twin Blade", 40, WeaponMaterial.IRON, WeaponType.SWORD)
            .setUpgradeable(goldItem);
        Main.registerItem(ironItem);

        new RecipeFactory("36", netheriteItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" $@", "$%$", "@$ ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.GOLD_INGOT)
            .build();

        new RecipeFactory("56", diamondItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" $@", "$%$", "@$ ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.GOLD_INGOT)
            .build();

        new RecipeFactory("114", goldItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" $@", "$%$", "@$ ")
            .setIngredient('@', Material.GOLD_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.AMETHYST_SHARD)
            .build();

        new RecipeFactory("35", ironItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" $@", "$%$", "@$ ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.DIAMOND)
            .build();
    }
}