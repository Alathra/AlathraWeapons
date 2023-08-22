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

public class BoneKnife implements CustomItemGroup {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomItem netheriteItem = new CustomItem("Netherite Bone Knife", "Netherite Bone Knife", 151, WeaponMaterial.NETHERITE, WeaponType.SWORD);
        Main.registerItem(netheriteItem);

        final CustomItem diamondItem = new CustomItem("Diamond Bone Knife", "Diamond Bone Knife", 351, WeaponMaterial.DIAMOND, WeaponType.SWORD);
        Main.registerItem(diamondItem);

        final CustomItem goldItem = new CustomItem("Golden Bone Knife", "Golden Bone Knife", 651, WeaponMaterial.GOLD, WeaponType.SWORD);
        Main.registerItem(goldItem);

        final CustomItem ironItem = new CustomItem("Iron Bone Knife", "Iron Bone Knife", 51, WeaponMaterial.IRON, WeaponType.SWORD);
        Main.registerItem(ironItem);

        final CustomItem stoneItem = new CustomItem("Stone Bone Knife", "Stone Bone Knife", 851, WeaponMaterial.STONE, WeaponType.SWORD);
        Main.registerItem(stoneItem);

        final CustomItem woodenItem = new CustomItem("Wooden Bone Knife", "Wooden Bone Knife", 1051, WeaponMaterial.WOOD, WeaponType.SWORD);
        Main.registerItem(woodenItem);

        new RecipeFactory(Main.getIncrementNameSpaceKey(), netheriteItem.getItemStack(), RecipeShape.SHAPED)
                .shape("^@@", " %@", "$ ^")
                .setIngredient('@', Material.BONE)
                .setIngredient('%', Material.DIAMOND)
                .setIngredient('^', Material.GOLD_NUGGET)
                .setIngredient('$', Material.NETHERITE_INGOT)
                .build();

        new RecipeFactory(Main.getIncrementNameSpaceKey(), diamondItem.getItemStack(), RecipeShape.SHAPED)
                .shape("^@@", " %@", "$ ^")
                .setIngredient('@', Material.BONE)
                .setIngredient('%', Material.DIAMOND)
                .setIngredient('^', Material.GOLD_NUGGET)
                .setIngredient('$', Material.STICK)
                .build();

        new RecipeFactory(Main.getIncrementNameSpaceKey(), goldItem.getItemStack(), RecipeShape.SHAPED)
                .shape("^@@", " %@", "$ ^")
                .setIngredient('@', Material.BONE)
                .setIngredient('%', Material.GOLD_INGOT)
                .setIngredient('^', Material.GOLD_NUGGET)
                .setIngredient('$', Material.STICK)
                .build();

        new RecipeFactory(Main.getIncrementNameSpaceKey(), ironItem.getItemStack(), RecipeShape.SHAPED)
                .shape("#@@", " %@", "$^#")
                .setIngredient('@', Material.BONE)
                .setIngredient('%', Material.IRON_INGOT)
                .setIngredient('#', Material.IRON_NUGGET)
                .setIngredient('$', Material.STICK)
                .setIngredient('^', Material.LEATHER)
                .build();

        new RecipeFactory(Main.getIncrementNameSpaceKey(), stoneItem.getItemStack(), RecipeShape.SHAPED)
                .shape("$@@", " %@", "$ $")
                .setIngredient('@', Material.BONE)
                .setIngredient('%', Material.COBBLESTONE)
                .setIngredient('$', Material.STICK)
                .build();

        new RecipeFactory(Main.getIncrementNameSpaceKey(), woodenItem.getItemStack(), RecipeShape.SHAPED)
                .shape("%@@", " $@", "$ %")
                .setIngredient('@', Material.BONE)
                .setIngredient('%', Material.VINE)
                .setIngredient('$', Material.STICK)
                .build();

        Main.addSmithingUpgrade(diamondItem, netheriteItem);
    }
}