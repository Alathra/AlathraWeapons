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

public class DiamondBattleaxe implements CustomItem {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomWeapon netheriteItem = new CustomWeapon("Netherite Battleaxe", "Netherite Battleaxe", 434, WeaponMaterial.NETHERITE, WeaponType.AXE);
        Main.registerItem(netheriteItem);

        final CustomWeapon diamondItem = new CustomWeapon("Diamond Battleaxe", "Diamond Battleaxe", 534, WeaponMaterial.DIAMOND, WeaponType.AXE)
            .setUpgradeable(netheriteItem);
        Main.registerItem(diamondItem);

        final CustomWeapon goldItem = new CustomWeapon("Golden Battleaxe", "Golden Battleaxe", 734, WeaponMaterial.GOLD, WeaponType.AXE)
            .setUpgradeable(diamondItem);
        Main.registerItem(goldItem);

        final CustomWeapon ironItem = new CustomWeapon("Iron Battleaxe", "Iron Battleaxe", 234, WeaponMaterial.IRON, WeaponType.AXE)
            .setUpgradeable(goldItem);
        Main.registerItem(ironItem);

        new RecipeFactory("28", netheriteItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", " %@", "%  ")
            .setIngredient('@', Material.NETHERITE_AXE)
            .setIngredient('%', Material.STICK)
            .build();

        new RecipeFactory("63", diamondItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", " %@", "%  ")
            .setIngredient('@', Material.DIAMOND_AXE)
            .setIngredient('%', Material.STICK)
            .build();

        new RecipeFactory("129", goldItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", " %@", "%  ")
            .setIngredient('@', Material.GOLDEN_AXE)
            .setIngredient('%', Material.STICK)
            .build();

        new RecipeFactory("13", ironItem.getItemStack(), RecipeShape.SHAPED)
            .shape(" @ ", " %@", "%  ")
            .setIngredient('@', Material.IRON_AXE)
            .setIngredient('%', Material.STICK)
            .build();
    }
}