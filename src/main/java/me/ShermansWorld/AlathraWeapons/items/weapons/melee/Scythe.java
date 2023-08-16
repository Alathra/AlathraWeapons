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

public class Scythe implements CustomItemGroup {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomItem netheriteItem = new CustomItem("Netherite Scythe", "Netherite Scythe", 439, WeaponMaterial.NETHERITE, WeaponType.AXE);
        Main.registerItem(netheriteItem);

        final CustomItem diamondItem = new CustomItem("Diamond Scythe", "Diamond Scythe", 539, WeaponMaterial.DIAMOND, WeaponType.AXE)
            .setUpgradeable(netheriteItem);
        Main.registerItem(diamondItem);

        final CustomItem goldItem = new CustomItem("Golden Scythe", "Golden Scythe", 739, WeaponMaterial.GOLD, WeaponType.AXE)
            .setUpgradeable(diamondItem);
        Main.registerItem(goldItem);

        final CustomItem ironItem = new CustomItem("Iron Scythe", "Iron Scythe", 239, WeaponMaterial.IRON, WeaponType.AXE)
            .setUpgradeable(goldItem);
        Main.registerItem(ironItem);

        new RecipeFactory("45", netheriteItem.getItemStack(), RecipeShape.SHAPED)
            .shape("@@%", " @ ", "@  ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.GOLD_NUGGET)
            .build();

        new RecipeFactory("67", diamondItem.getItemStack(), RecipeShape.SHAPED)
            .shape("@@%", " @ ", "@  ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.GOLD_NUGGET)
            .build();

        new RecipeFactory("133", goldItem.getItemStack(), RecipeShape.SHAPED)
            .shape("@@%", " @ ", "@  ")
            .setIngredient('@', Material.GOLD_INGOT)
            .setIngredient('%', Material.AMETHYST_SHARD)
            .build();

        new RecipeFactory("44", ironItem.getItemStack(), RecipeShape.SHAPED)
            .shape("@@%", " @ ", "@  ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.GOLD_NUGGET)
            .build();
    }
}