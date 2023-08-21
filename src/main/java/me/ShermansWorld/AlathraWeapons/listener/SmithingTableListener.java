package me.ShermansWorld.AlathraWeapons.listener;

import me.ShermansWorld.AlathraWeapons.CustomItem;
import me.ShermansWorld.AlathraWeapons.Main;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareSmithingEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.HashMap;

public class SmithingTableListener implements Listener {
    private final HashMap<CustomItem, CustomItem> smithingConversions = Main.getSmithingUpgrades();

    public Component nameParser(Component equipmentName) {
        for (CustomItem customItem : smithingConversions.keySet()) {
            if (equipmentName.equals(customItem.getDisplayNameComponent())) {
                return smithingConversions.get(customItem).getDisplayNameComponent();
            }
        }

        return equipmentName;
    }

    public int modelParser(int equipmentModel) {
        for (CustomItem customItem : smithingConversions.keySet()) {
            if (equipmentModel == customItem.getModelData()) {
                return smithingConversions.get(customItem).getModelData();
            }
        }

        return equipmentModel;
    }

    @EventHandler
    @SuppressWarnings("unused")
    public void upgradeHandler(PrepareSmithingEvent upgradeEvent) {
        if (upgradeEvent.getInventory().getInputTemplate() != null) return;

        if (upgradeEvent.getInventory().getInputEquipment() == null) return;

        if (upgradeEvent.getInventory().getInputMineral() == null) return;

        if (upgradeEvent.getInventory().getInputMineral().getType() != Material.NETHERITE_INGOT) return;

        if (upgradeEvent.getResult() == null) return;

        ItemStack result = upgradeEvent.getResult();
        ItemMeta resultMeta = result.getItemMeta();

        ItemMeta equipmentMeta = upgradeEvent.getInventory().getInputEquipment().getItemMeta();
        Component nameCheck = null;
        int modelCheck = 0;

        if (equipmentMeta.hasDisplayName()) nameCheck = nameParser(equipmentMeta.displayName());

        if (equipmentMeta.hasCustomModelData()) modelCheck = modelParser(equipmentMeta.getCustomModelData());

        if (nameCheck != null) resultMeta.displayName(nameCheck);

        if (modelCheck != 0) resultMeta.setCustomModelData(modelCheck);

        result.setItemMeta(resultMeta);

        upgradeEvent.setResult(result);
    }
}
