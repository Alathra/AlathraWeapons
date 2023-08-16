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

public class Scimitar implements CustomItemGroup {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomItem netheriteItem = new CustomItem("Netherite Scimitar", "Netherite Scimitar", 141, WeaponMaterial.NETHERITE, WeaponType.SWORD);
        Main.registerItem(netheriteItem);

        final CustomItem diamondItem = new CustomItem("Diamond Scimitar", "Diamond Scimitar", 341, WeaponMaterial.DIAMOND, WeaponType.SWORD)
            .setUpgradeable(netheriteItem);
        Main.registerItem(diamondItem);

        final CustomItem goldItem = new CustomItem("Golden Scimitar", "Golden Scimitar", 641, WeaponMaterial.GOLD, WeaponType.SWORD)
            .setUpgradeable(diamondItem);
        Main.registerItem(goldItem);

        final CustomItem ironItem = new CustomItem("Iron Scimitar", "Iron Scimitar", 41, WeaponMaterial.IRON, WeaponType.SWORD)
            .setUpgradeable(goldItem);
        Main.registerItem(ironItem);

        new RecipeFactory("41", netheriteItem.getItemStack(), RecipeShape.SHAPED)
            .shape("  @", "%@@", "$% ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.GOLD_INGOT)
            .setIngredient('$', Material.STICK)
            .build();

        new RecipeFactory("57", diamondItem.getItemStack(), RecipeShape.SHAPED)
            .shape("  @", "%@@", "$% ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.GOLD_INGOT)
            .setIngredient('$', Material.STICK)
            .build();

        new RecipeFactory("115", goldItem.getItemStack(), RecipeShape.SHAPED)
            .shape("  @", "%@@", "$% ")
            .setIngredient('@', Material.GOLD_INGOT)
            .setIngredient('%', Material.AMETHYST_SHARD)
            .setIngredient('$', Material.STICK)
            .build();

        new RecipeFactory("40", ironItem.getItemStack(), RecipeShape.SHAPED)
            .shape("  @", "%@@", "$% ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.GOLD_INGOT)
            .setIngredient('$', Material.STICK)
            .build();
    }
}