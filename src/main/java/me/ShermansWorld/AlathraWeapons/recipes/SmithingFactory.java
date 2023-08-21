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
    private final @Nullable SmithingRecipe recipe;


    public SmithingFactory(String namespaceKey, ItemStack itemStackInput, ItemStack result) {
        RecipeChoice.MaterialChoice input = new RecipeChoice.MaterialChoice(itemStackInput.getType());

        NamespacedKey key = new NamespacedKey(instance, namespaceKey);

        RecipeChoice.ExactChoice empty = new RecipeChoice.ExactChoice(new ItemStack(Material.AIR));
        recipe = new SmithingTransformRecipe(key, result, empty, input, new RecipeChoice.MaterialChoice(Material.NETHERITE_INGOT));
    }

    public void build() {
        server.addRecipe(recipe);
    }
}