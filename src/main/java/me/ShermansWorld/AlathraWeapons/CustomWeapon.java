package me.ShermansWorld.AlathraWeapons;

import com.github.milkdrinkers.colorparser.ColorParser;
import me.ShermansWorld.AlathraWeapons.enums.WeaponMaterial;
import me.ShermansWorld.AlathraWeapons.enums.WeaponType;
import me.ShermansWorld.AlathraWeapons.exceptions.InvalidMaterialException;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class CustomWeapon {
    private final ItemStack itemStack;

    private final String displayName;

    private final WeaponMaterial material;

    private final int modelData;

    public CustomWeapon(@NotNull String displayName, int modelData, @NotNull WeaponMaterial material, @NotNull WeaponType type) throws InvalidMaterialException {
        this.displayName = displayName;
        this.material = material;
        this.modelData = modelData;
        this.itemStack = switch (type) {
            case SWORD -> switch (material) {
                case IRON -> new ItemStack(Material.IRON_SWORD, 1);
                case GOLD -> new ItemStack(Material.GOLDEN_SWORD, 1);
                case DIAMOND -> new ItemStack(Material.DIAMOND_SWORD, 1);
                case NETHERITE -> new ItemStack(Material.NETHERITE_SWORD, 1);
                case IGNORED -> {
                    throw new InvalidMaterialException("Tried to register item %s with invalid Material.".formatted(getDisplayName()));
                }
            };
            case AXE -> switch (material) {
                case IRON -> new ItemStack(Material.IRON_AXE, 1);
                case GOLD -> new ItemStack(Material.GOLDEN_AXE, 1);
                case DIAMOND -> new ItemStack(Material.DIAMOND_AXE, 1);
                case NETHERITE -> new ItemStack(Material.NETHERITE_AXE, 1);
                case IGNORED -> {
                    throw new InvalidMaterialException("Tried to register item %s with invalid Material.".formatted(getDisplayName()));
                }
            };
            case CROSSBOW -> switch (material) {
                case IGNORED -> new ItemStack(Material.CROSSBOW, 1);
                case IRON, DIAMOND, GOLD, NETHERITE -> {
                    throw new InvalidMaterialException("Tried to register item %s with invalid Material.".formatted(getDisplayName()));
                }
            };
            case BOW -> switch (material) {
                case IGNORED -> new ItemStack(Material.BOW, 1);
                case IRON, DIAMOND, GOLD, NETHERITE -> {
                    throw new InvalidMaterialException("Tried to register item %s with invalid Material.".formatted(getDisplayName()));
                }
            };
        };

        final ItemMeta meta = this.itemStack.getItemMeta();

        final List<Component> lore = List.of(
            new ColorParser("&6Custom Weapon").parseLegacy().build()
        );
        meta.displayName(new ColorParser(displayName).parseLegacy().build());
        meta.setCustomModelData(modelData);
        meta.lore(lore);

        this.itemStack.setItemMeta(meta);
    }

    @NotNull
    public ItemStack getItemStack() {
        return this.itemStack;
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
}
