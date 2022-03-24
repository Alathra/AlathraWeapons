package me.ShermansWorld.AlathraWeapons;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class BlockBreakListener implements Listener {

	@EventHandler
	public static void BlockBreak(BlockBreakEvent e) {
		Player p = e.getPlayer();
		ItemStack item = p.getInventory().getItemInMainHand();
		ItemMeta meta = item.getItemMeta();
		if (meta.hasLore() && meta.isUnbreakable()) { // It should definitely be one of the custom weapons at this
														// point
			List<String> lore = new ArrayList<String>();
			lore = meta.getLore();
			if (lore.get(0).equalsIgnoreCase(Helper.color("&aCustom Weapon"))) {
				String loreLine2 = lore.get(1);
				loreLine2 = loreLine2.replaceAll("[^\\d.]", ""); // strips string of letters so it is numeric
				int durability = 0;
				if (item.getType().equals(Material.IRON_AXE) || item.getType().equals(Material.IRON_SWORD)) {
					loreLine2 = loreLine2.substring(1, loreLine2.length() - 3); // remove extra numbers
					durability = Integer.parseInt(loreLine2) - 1;
					lore.set(1, Helper.color("&6Durability: " + String.valueOf(durability) + "/250"));
					meta.setLore(lore);
					item.setItemMeta(meta);
				} else if (item.getType().equals(Material.NETHERITE_AXE) || item.getType().equals(Material.NETHERITE_SWORD)) {
					loreLine2 = loreLine2.substring(1, loreLine2.length() - 4); // remove extra numbers
					durability = Integer.parseInt(loreLine2) - 1;
					lore.set(1, Helper.color("&6Durability: " + String.valueOf(durability) + "/2031"));
					meta.setLore(lore);
					item.setItemMeta(meta);
				}
				if (durability <= 0) {
					p.getInventory().remove(item);
					p.playSound(p.getLocation(), Sound.ENTITY_ITEM_BREAK, 5F, 1F);
				}
			}
		}

	}
}
