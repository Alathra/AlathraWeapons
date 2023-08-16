package me.ShermansWorld.AlathraWeapons;

import com.github.milkdrinkers.colorparser.ColorParser;
import me.ShermansWorld.AlathraWeapons.enums.WeaponMaterial;
import me.ShermansWorld.AlathraWeapons.enums.WeaponType;
import me.ShermansWorld.AlathraWeapons.exceptions.InvalidMaterialException;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class CustomItem {
    private final String id;
    private final String displayName;
    private final WeaponMaterial material;
    private final int modelData;
    private final ItemStack itemStack;
    private boolean isUpgradeable = false;
    private CustomItem upgradeable = null;

    public CustomItem(@NotNull String identifierKey, @NotNull String displayName, int modelData, @NotNull WeaponMaterial material, @NotNull WeaponType type) throws InvalidMaterialException {
        this.id = identifierKey.replaceAll(" ", "_").toLowerCase();
        this.displayName = displayName;
        this.material = material;
        this.modelData = modelData;
        this.itemStack = switch (type) {
            case SWORD -> switch (material) {
                case IRON -> new ItemStack(Material.IRON_SWORD, 1);
                case GOLD -> new ItemStack(Material.GOLDEN_SWORD, 1);
                case DIAMOND -> new ItemStack(Material.DIAMOND_SWORD, 1);
                case NETHERITE -> new ItemStack(Material.NETHERITE_SWORD, 1);
                case IGNORED -> throw new InvalidMaterialException("Tried to register item %s with invalid Material.".formatted(getDisplayName()));
            };
            case AXE -> switch (material) {
                case IRON -> new ItemStack(Material.IRON_AXE, 1);
                case GOLD -> new ItemStack(Material.GOLDEN_AXE, 1);
                case DIAMOND -> new ItemStack(Material.DIAMOND_AXE, 1);
                case NETHERITE -> new ItemStack(Material.NETHERITE_AXE, 1);
                case IGNORED -> throw new InvalidMaterialException("Tried to register item %s with invalid Material.".formatted(getDisplayName()));
            };
            case CROSSBOW -> switch (material) {
                case IGNORED -> new ItemStack(Material.CROSSBOW, 1);
                case IRON, DIAMOND, GOLD, NETHERITE -> throw new InvalidMaterialException("Tried to register item %s with invalid Material.".formatted(getDisplayName()));
            };
            case BOW -> switch (material) {
                case IGNORED -> new ItemStack(Material.BOW, 1);
                case IRON, DIAMOND, GOLD, NETHERITE -> throw new InvalidMaterialException("Tried to register item %s with invalid Material.".formatted(getDisplayName()));
            };
        };

        final ItemMeta meta = this.itemStack.getItemMeta();

        final List<Component> lore = List.of(
            ColorParser.of("<gold>Custom Weapon").build().decoration(TextDecoration.ITALIC, TextDecoration.State.FALSE)
        );
        meta.displayName(ColorParser.of(displayName).build());
        meta.setCustomModelData(modelData);
        meta.lore(lore);

        this.itemStack.setItemMeta(meta);
    }

    @NotNull
    public String getId() {
        return this.id;
    }

    @NotNull
    public String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public WeaponMaterial getMaterial() {
        return this.material;
    }

    public int getModelData() {
        return this.modelData;
    }

    @NotNull
    public ItemStack getItemStack() {
        return this.itemStack;
    }

    public boolean equals(@NotNull ItemStack itemStack) {
        if (!itemStack.hasItemMeta()) return false;

        final ItemMeta meta = itemStack.getItemMeta();
        if (!meta.hasCustomModelData()) return false;

        return itemStack.getType().equals(getItemStack().getType()) && meta.getCustomModelData() == getModelData();
    }

    public boolean isUpgradeable() {
        return isUpgradeable;
    }

    public CustomItem setUpgradeable(@NotNull CustomItem customItem) {
        this.isUpgradeable = true;
        this.upgradeable = customItem;
        return this;
    }

    public CustomItem getUpgradeable() {
        return this.upgradeable;
    }
}
