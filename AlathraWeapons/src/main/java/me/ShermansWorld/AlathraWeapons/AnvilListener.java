package me.ShermansWorld.AlathraWeapons;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class AnvilListener implements Listener {

	@EventHandler
	public static void MendingListener(PrepareAnvilEvent e) {
		ItemStack item1 = e.getInventory().getItem(0);
		ItemStack item2 = e.getInventory().getItem(1);

		if ((item1.getItemMeta().hasLore() && item1.getItemMeta().isUnbreakable())) {
			if (item1.getItemMeta().getLore().get(0).equalsIgnoreCase(Helper.color("&aCustom Weapon"))) {
				// It should definitely be one of the custom weapons at this point
				if (item2.getType().equals(Material.ENCHANTED_BOOK)) {
					ItemMeta meta = item2.getItemMeta();
					if (meta.toString().contains("MENDING")) {
						Player p;
						if (e.getViewers().get(0) instanceof Player) {
							p = Bukkit.getPlayer(e.getViewers().get(0).getName());
						} else {
							return;
						}
						e.getInventory().remove(item2);
						p.getInventory().addItem(item2);
						p.sendMessage(Helper.Chatlabel() + Helper.color(
								"&cYou cannot put mending on custom weapons. Repair them with a smithing table!"));
						p.playSound(p.getLocation(), Sound.ENTITY_GHAST_HURT, 5F, 1F);

					}
				}
			}
		}
	}
}
