package me.ShermansWorld.AlathraWeapons.recipes;

import me.ShermansWorld.AlathraWeapons.Main;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

public class VanillaSmithing {
    private static final Map<Material, Material> vanillaUpgrades = Map.of(
            Material.DIAMOND_SWORD, Material.NETHERITE_SWORD,
            Material.DIAMOND_AXE, Material.NETHERITE_AXE,
            Material.DIAMOND_PICKAXE, Material.NETHERITE_PICKAXE,
            Material.DIAMOND_SHOVEL, Material.NETHERITE_SHOVEL,
            Material.DIAMOND_HOE, Material.NETHERITE_HOE,
            Material.DIAMOND_BOOTS, Material.NETHERITE_BOOTS,
            Material.DIAMOND_LEGGINGS, Material.NETHERITE_LEGGINGS,
            Material.DIAMOND_CHESTPLATE, Material.NETHERITE_CHESTPLATE,
            Material.DIAMOND_HELMET, Material.NETHERITE_HELMET);

    public VanillaSmithing() {
        for (Material key : vanillaUpgrades.keySet()) {
            new SmithingFactory(Main.getIncrementNameSpaceKey(),
                    new ItemStack(key),
                    new ItemStack(vanillaUpgrades.get(key))).build();
        }
    }
}
