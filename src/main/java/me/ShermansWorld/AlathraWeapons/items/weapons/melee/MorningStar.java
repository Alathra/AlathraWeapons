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

public class MorningStar implements CustomItemGroup {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomItem netheriteItem = new CustomItem("Netherite Morning Star", "Netherite Morning Star", 431, WeaponMaterial.NETHERITE, WeaponType.AXE);
        Main.registerItem(netheriteItem);

        final CustomItem diamondItem = new CustomItem("Diamond Morning Star", "Diamond Morning Star", 531, WeaponMaterial.DIAMOND, WeaponType.AXE)
            .setUpgradeable(netheriteItem);
        Main.registerItem(diamondItem);

        final CustomItem goldItem = new CustomItem("Golden Morningstar", "Golden Morningstar", 731, WeaponMaterial.GOLD, WeaponType.AXE)
            .setUpgradeable(diamondItem);
        Main.registerItem(goldItem);

        final CustomItem ironItem = new CustomItem("Iron Morning Star", "Iron Morning Star", 231, WeaponMaterial.IRON, WeaponType.AXE)
            .setUpgradeable(goldItem);
        Main.registerItem(ironItem);

        new RecipeFactory("22", netheriteItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" $ ", "$@$", "%$ ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.AMETHYST_SHARD)
            .build();

        new RecipeFactory("60", diamondItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" $ ", "$@$", "%$ ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.AMETHYST_SHARD)
            .build();

        new RecipeFactory("126", goldItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" $ ", "$@$", "%$ ")
            .setIngredient('@', Material.GOLD_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.GOLD_NUGGET)
            .build();

        new RecipeFactory("8", ironItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" $ ", "$@$", "%$ ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .setIngredient('$', Material.IRON_NUGGET)
            .build();
    }
}