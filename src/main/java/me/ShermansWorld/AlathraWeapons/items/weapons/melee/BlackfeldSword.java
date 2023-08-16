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

public class BlackfeldSword implements CustomItemGroup {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomItem netheriteItem = new CustomItem("Netherite Blackfeld Sword", "Netherite Blackfeld Sword", 148, WeaponMaterial.NETHERITE, WeaponType.SWORD);
        Main.registerItem(netheriteItem);

        final CustomItem diamondItem = new CustomItem("Diamond Blackfeld Sword", "Diamond Blackfeld Sword", 348, WeaponMaterial.DIAMOND, WeaponType.SWORD)
            .setUpgradeable(netheriteItem);
        Main.registerItem(diamondItem);

        final CustomItem goldItem = new CustomItem("Golden Blackfeld Sword", "Golden Blackfeld Sword", 648, WeaponMaterial.GOLD, WeaponType.SWORD)
            .setUpgradeable(diamondItem);
        Main.registerItem(goldItem);

        final CustomItem ironItem = new CustomItem("Iron Blackfeld Sword", "Iron Blackfeld Sword", 50, WeaponMaterial.IRON, WeaponType.SWORD)
            .setUpgradeable(goldItem);
        Main.registerItem(ironItem);

        new RecipeFactory("93", netheriteItem.getItemStack(), RecipeShape.SHAPED)
            .shape("   ", "@% ", "$^ ")
            .setIngredient('@', Material.NETHERITE_SWORD)
            .setIngredient('%', Material.GOLD_NUGGET)
            .setIngredient('$', Material.RED_DYE)
            .setIngredient('^', Material.GOLD_INGOT)
            .build();

        new RecipeFactory("92", diamondItem.getItemStack(), RecipeShape.SHAPED)
            .shape("   ", "@% ", "$^ ")
            .setIngredient('@', Material.DIAMOND_SWORD)
            .setIngredient('%', Material.GOLD_NUGGET)
            .setIngredient('$', Material.RED_DYE)
            .setIngredient('^', Material.GOLD_INGOT)
            .build();

        new RecipeFactory("122", goldItem.getItemStack(), RecipeShape.SHAPED)
            .shape("   ", "@% ", "$^ ")
            .setIngredient('@', Material.GOLDEN_SWORD)
            .setIngredient('%', Material.AMETHYST_SHARD)
            .setIngredient('$', Material.MAGENTA_DYE)
            .setIngredient('^', Material.COPPER_INGOT)
            .build();

        new RecipeFactory("101", ironItem.getItemStack(), RecipeShape.SHAPED)
            .shape("   ", "@% ", "$^ ")
            .setIngredient('@', Material.IRON_SWORD)
            .setIngredient('%', Material.GOLD_NUGGET)
            .setIngredient('$', Material.RED_DYE)
            .setIngredient('^', Material.GOLD_INGOT)
            .build();
    }
}