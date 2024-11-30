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

public class LeviathanBlade implements CustomItemGroup {
    @Override
    public void register() throws InvalidMaterialException {
        final CustomItem netheriteItem = new CustomItem("Netherite Leviathan Blade", "Netherite Leviathan Blade", 158, WeaponMaterial.NETHERITE, WeaponType.SWORD);
        Main.registerItem(netheriteItem);

        final CustomItem diamondItem = new CustomItem("Diamond Leviathan Blade", "Diamond Leviathan Blade", 359, WeaponMaterial.DIAMOND, WeaponType.SWORD)
            .setUpgradeable(netheriteItem);
        Main.registerItem(diamondItem);

        new RecipeFactory(Main.getIncrementNameSpaceKey(), netheriteItem.getItemStack(), RecipeShape.SHAPED)
            .shape("!@#", "%#$", "^$&")
            .setIngredient('!', Material.GHAST_TEAR)
            .setIngredient('@', Material.CHAIN)
            .setIngredient('#', Material.NETHERITE_BLOCK)
            .setIngredient('$', Material.NETHERITE_AXE)
            .setIngredient('%', Material.IRON_BLOCK)
            .setIngredient('^', Material.SMITHING_TABLE)
            .setIngredient('&', Material.OBSIDIAN)
            .build();

        new RecipeFactory(Main.getIncrementNameSpaceKey(), diamondItem.getItemStack(), RecipeShape.SHAPED)
            .shape("!@#", "%#$", "^$&")
            .shape("!@#", "%#$", "^$&")
            .setIngredient('!', Material.GHAST_TEAR)
            .setIngredient('@', Material.CHAIN)
            .setIngredient('#', Material.DIAMOND_BLOCK)
            .setIngredient('$', Material.DIAMOND_AXE)
            .setIngredient('%', Material.IRON_BLOCK)
            .setIngredient('^', Material.SMITHING_TABLE)
            .setIngredient('&', Material.OBSIDIAN)
            .build();

        Main.addSmithingUpgrade(diamondItem, netheriteItem);
    }
}