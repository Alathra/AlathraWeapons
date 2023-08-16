package me.ShermansWorld.AlathraWeapons.recipes;

import me.ShermansWorld.AlathraWeapons.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Server;
import org.bukkit.inventory.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SmithingFactory {
    final static Server server = Bukkit.getServer();
    private static final @NotNull Main instance = Main.getInstance();
    private static @Nullable NamespacedKey key;
    private final @Nullable SmithingRecipe recipe;


    public SmithingFactory(String nameSpaceKey, ItemStack itemStackInput, ItemStack result) {
        RecipeChoice.ExactChoice input = new RecipeChoice.ExactChoice(itemStackInput);

        key = new NamespacedKey(instance, nameSpaceKey);
        recipe = new SmithingRecipe(key, result, input, new RecipeChoice.MaterialChoice(Material.NETHERITE_INGOT), false);
    }

    public void build() {
        server.addRecipe(recipe);
    }
}