package me.ShermansWorld.AlathraWeapons.listener;

import me.ShermansWorld.AlathraWeapons.CustomItem;
import me.ShermansWorld.AlathraWeapons.Main;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareSmithingEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.SmithingInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

public class SmithingTableListener implements Listener {
    private final Main main;

    public SmithingTableListener(Main main) {
        this.main = main;
    }

    @EventHandler
    public void onSmithingItemManipulation(PrepareSmithingEvent e) {
        final SmithingInventory inv = e.getInventory();
        final @Nullable ItemStack oldItem = inv.getInputEquipment();

        // If there's no meta data then this isn't a custom item
        if (!oldItem.hasItemMeta()) return;

        final ItemMeta oldMeta = oldItem.getItemMeta();

        // If there's no custom model data then this isn't a custom item
        if (!oldMeta.hasCustomModelData()) return;

        final @Nullable CustomItem customItem = main.getCustomItemFromItemStack(oldItem);

        // Do nothing if this isn't a custom item
        if (customItem == null) return;

        // Make item not upgradeable if there is no defined upgrade
        if (!customItem.isUpgradeable()) {
            e.setResult(null);
            return;
        }

        // Upgrade item ourselves
        final ItemStack newItem = customItem.getUpgradeable().getItemStack().asOne();
        final ItemMeta newMeta = newItem.getItemMeta();

        if (oldItem.hasItemMeta()) {
            if (oldMeta.hasAttributeModifiers())
                newMeta.setAttributeModifiers(oldMeta.getAttributeModifiers());

            if (oldMeta.hasEnchants()) {
                Map<Enchantment, Integer> enchants = oldMeta.getEnchants();
                enchants.forEach((enchant, level) -> newMeta.addEnchant(enchant, level, true));
            }

            if(oldMeta.hasDisplayName())
                newMeta.displayName(oldMeta.displayName());

            if (oldMeta.hasLore())
                newMeta.lore(oldMeta.lore());
        }

        newItem.setItemMeta(newMeta);

        // Override result item
        inv.setResult(newItem);
    }
}
