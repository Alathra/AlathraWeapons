package me.ShermansWorld.AlathraWeapons.recipes;

import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.enums.RecipeShape;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Server;
import org.bukkit.inventory.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RecipeFactory {
    final static Server server = Bukkit.getServer();
    private static final @NotNull Main instance = Main.getInstance();
    private final @Nullable Recipe recipe;


    public RecipeFactory(String nameSpaceKey, ItemStack itemStack, RecipeShape shape) {
        NamespacedKey key = new NamespacedKey(instance, nameSpaceKey);

        recipe = switch (shape) {
            case SHAPED -> new ShapedRecipe(key, itemStack);
            case SHAPELESS -> new ShapelessRecipe(key, itemStack);
        };
    }

    public void build() {
        server.addRecipe(recipe);
    }

    public RecipeFactory shape(@NotNull String... shape) {
        if (recipe instanceof ShapedRecipe shapedRecipe)
            shapedRecipe.shape(shape);

        return this;
    }

    public RecipeFactory setIngredient(char key, @NotNull ItemStack item) {
        if (recipe instanceof ShapedRecipe shapedRecipe)
            shapedRecipe.setIngredient(key, item);

        return this;
    }

    public RecipeFactory setIngredient(char key, @NotNull Material ingredient) {
        if (recipe instanceof ShapedRecipe shapedRecipe)
            shapedRecipe.setIngredient(key, ingredient);

        return this;
    }

    public RecipeFactory setIngredient(char key, @NotNull RecipeChoice ingredient) {
        if (recipe instanceof ShapedRecipe shapedRecipe)
            shapedRecipe.setIngredient(key, ingredient);

        return this;
    }
}
