package me.ShermansWorld.AlathraWeapons.items.tools.diamond;

import me.ShermansWorld.AlathraWeapons.CustomWeapon;
import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import me.ShermansWorld.AlathraWeapons.enums.WeaponMaterial;
import me.ShermansWorld.AlathraWeapons.enums.WeaponType;
import me.ShermansWorld.AlathraWeapons.exceptions.InvalidMaterialException;
import me.ShermansWorld.AlathraWeapons.items.CustomItem;
import me.ShermansWorld.AlathraWeapons.recipes.RecipeFactory;
import org.bukkit.Material;

public class DiamondFlangedMace implements CustomItem {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomWeapon netheriteItem = new CustomWeapon("Netherite Flanged Mace", "Netherite Flanged Mace", 430, WeaponMaterial.NETHERITE, WeaponType.AXE);
        Main.registerItem(netheriteItem);

        final CustomWeapon diamondItem = new CustomWeapon("Diamond Flanged Mace", "Diamond Flanged Mace", 530, WeaponMaterial.DIAMOND, WeaponType.AXE)
            .setUpgradeable(netheriteItem);
        Main.registerItem(diamondItem);

        final CustomWeapon goldItem = new CustomWeapon("Golden Flanged Mace", "Golden Flanged Mace", 730, WeaponMaterial.GOLD, WeaponType.AXE)
            .setUpgradeable(diamondItem);
        Main.registerItem(goldItem);

        final CustomWeapon ironItem = new CustomWeapon("Iron Flanged Mace", "Iron Flanged Mace", 230, WeaponMaterial.IRON, WeaponType.AXE)
            .setUpgradeable(goldItem);
        Main.registerItem(ironItem);

        new RecipeFactory("18", netheriteItem.getItemStack(), RecipeShape.SHAPED)
            .shape("   ", "@  ", "%  ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.STICK)
            .build();

        new RecipeFactory("59", diamondItem.getItemStack(), RecipeShape.SHAPED)
            .shape("   ", "@  ", "%  ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.STICK)
            .build();

        new RecipeFactory("125", goldItem.getItemStack(), RecipeShape.SHAPED)
            .shape("   ", "@  ", "%  ")
            .setIngredient('@', Material.GOLD_INGOT)
            .setIngredient('%', Material.STICK)
            .build();

        new RecipeFactory("6", ironItem.getItemStack(), RecipeShape.SHAPED)
            .shape("   ", "@  ", "%  ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
    }
}