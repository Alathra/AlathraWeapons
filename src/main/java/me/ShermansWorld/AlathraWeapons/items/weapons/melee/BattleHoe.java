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

public class BattleHoe implements CustomItemGroup {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomItem netheriteItem = new CustomItem("Netherite Battle Hoe", "Netherite Battle Hoe", 437, WeaponMaterial.NETHERITE, WeaponType.AXE);
        Main.registerItem(netheriteItem);

        final CustomItem diamondItem = new CustomItem("Diamond Battle Hoe", "Diamond Battle Hoe", 537, WeaponMaterial.DIAMOND, WeaponType.AXE)
            .setUpgradeable(netheriteItem);
        Main.registerItem(diamondItem);

        final CustomItem goldItem = new CustomItem("Golden Battle Hoe", "Golden Battle Hoe", 737, WeaponMaterial.GOLD, WeaponType.AXE)
            .setUpgradeable(diamondItem);
        Main.registerItem(goldItem);

        final CustomItem ironItem = new CustomItem("Iron Battle Hoe", "Iron Battle Hoe", 237, WeaponMaterial.IRON, WeaponType.AXE)
            .setUpgradeable(goldItem);
        Main.registerItem(ironItem);

        new RecipeFactory("38", netheriteItem.getItemStack(), RecipeShape.SHAPED)
            .shape("@@@", "@% ", " % ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.STICK)
            .build();

        new RecipeFactory("66", diamondItem.getItemStack(), RecipeShape.SHAPED)
            .shape("@@@", "@% ", " % ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.STICK)
            .build();

        new RecipeFactory("132", goldItem.getItemStack(), RecipeShape.SHAPED)
            .shape("@@@", "@% ", " % ")
            .setIngredient('@', Material.GOLD_INGOT)
            .setIngredient('%', Material.STICK)
            .build();

        new RecipeFactory("37", ironItem.getItemStack(), RecipeShape.SHAPED)
            .shape("@@@", "@% ", " % ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .build();
    }
}