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

public class Pike implements CustomItemGroup {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomItem netheriteItem = new CustomItem("Netherite Pike", "Netherite Pike", 133, WeaponMaterial.NETHERITE, WeaponType.SWORD);
        Main.registerItem(netheriteItem);

        final CustomItem diamondItem = new CustomItem("Diamond Pike", "Diamond Pike", 333, WeaponMaterial.DIAMOND, WeaponType.SWORD)
            .setUpgradeable(netheriteItem);
        Main.registerItem(diamondItem);

        final CustomItem goldItem = new CustomItem("Golden Pike", "Golden Pike", 633, WeaponMaterial.GOLD, WeaponType.SWORD)
            .setUpgradeable(diamondItem);
        Main.registerItem(goldItem);

        final CustomItem ironItem = new CustomItem("Iron Pike", "Iron Pike", 33, WeaponMaterial.IRON, WeaponType.SWORD)
            .setUpgradeable(goldItem);
        Main.registerItem(ironItem);

        new RecipeFactory(Main.getIncrementNameSpaceKey(), netheriteItem.getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "%  ")
            .setIngredient('@', Material.NETHERITE_INGOT)
            .setIngredient('%', Material.STICK)
            .build();

        new RecipeFactory(Main.getIncrementNameSpaceKey(), diamondItem.getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "%  ")
            .setIngredient('@', Material.DIAMOND)
            .setIngredient('%', Material.STICK)
            .build();

        new RecipeFactory(Main.getIncrementNameSpaceKey(), goldItem.getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "%  ")
            .setIngredient('@', Material.GOLD_INGOT)
            .setIngredient('%', Material.STICK)
            .build();

        new RecipeFactory(Main.getIncrementNameSpaceKey(), ironItem.getItemStack(), RecipeShape.SHAPED)
            .shape("  @", " % ", "%  ")
            .setIngredient('@', Material.IRON_INGOT)
            .setIngredient('%', Material.STICK)
            .build();

        Main.addSmithingUpgrade(diamondItem, netheriteItem);
    }
}