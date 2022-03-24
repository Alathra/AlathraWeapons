package me.ShermansWorld.AlathraWeapons;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareSmithingEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SmithingTableListener implements Listener {

	@EventHandler
	public static void RepairListener(PrepareSmithingEvent e) {
		ItemStack item1 = e.getInventory().getItem(0);
		ItemStack item2 = e.getInventory().getItem(1);

		if ((item1.getItemMeta().hasLore() && item1.getItemMeta().isUnbreakable())) {
			// It should definitely be one of the custom weapons at this point
			if (item1.getItemMeta().getLore().get(0).equalsIgnoreCase(Helper.color("&aCustom Weapon"))) {
				if (item1.getType().equals(Material.IRON_SWORD) || item1.getType().equals(Material.IRON_AXE)) {
					if (item2.getType().equals(Material.IRON_INGOT)) {
						ItemMeta meta = item1.getItemMeta();
						List<String> lore = new ArrayList<String>(); // repair weapon
						lore = meta.getLore();
						lore.set(1, Helper.color("&6Durability: 250/250"));
						meta.setLore(lore);
						item1.setItemMeta(meta);
						Player p;
						if (e.getViewers().get(0) instanceof Player) {
							p = Bukkit.getPlayer(e.getViewers().get(0).getName());
						} else {
							return;
						}
						e.getInventory().remove(item1);
						if (item2.getAmount() > 1) {
							item2.setAmount(item2.getAmount() - 1);
							Bukkit.getScheduler().runTaskLater(Main.getInstance(), () -> {
								p.getInventory().addItem(item2);
							}, 5L); // amount to wait in ticks , 20 ticks = 1 second
						}
						e.getInventory().remove(item2);
						Bukkit.getScheduler().runTaskLater(Main.getInstance(), () -> {
							p.getInventory().addItem(item1);
						}, 5L); // amount to wait in ticks , 20 ticks = 1 second
						p.playSound(p.getLocation(), Sound.BLOCK_SMITHING_TABLE_USE, 5F, 1F);
						p.sendMessage(Helper.Chatlabel() + Helper.color("&aWeapon has been repaired"));
						p.closeInventory();
					}
				} else if (item1.getType().equals(Material.NETHERITE_SWORD)
						|| item1.getType().equals(Material.NETHERITE_AXE)) {
					if (item2.getType().equals(Material.NETHERITE_INGOT)) {
						ItemMeta meta = item1.getItemMeta();
						List<String> lore = new ArrayList<String>(); // repair weapon
						lore = meta.getLore();
						lore.set(1, Helper.color("&6Durability: 2031/2031"));
						meta.setLore(lore);
						item1.setItemMeta(meta);
						Player p;
						if (e.getViewers().get(0) instanceof Player) {
							p = Bukkit.getPlayer(e.getViewers().get(0).getName());
						} else {
							return;
						}
						e.getInventory().remove(item1);
						if (item2.getAmount() > 1) {
							item2.setAmount(item2.getAmount() - 1);
							Bukkit.getScheduler().runTaskLater(Main.getInstance(), () -> {
								p.getInventory().addItem(item2);
							}, 5L); // amount to wait in ticks , 20 ticks = 1 second
						}
						e.getInventory().remove(item2);
						Bukkit.getScheduler().runTaskLater(Main.getInstance(), () -> {
							p.getInventory().addItem(item1);
						}, 5L); // amount to wait in ticks , 20 ticks = 1 second
						p.playSound(p.getLocation(), Sound.BLOCK_SMITHING_TABLE_USE, 5F, 1F);
						p.sendMessage(Helper.Chatlabel() + Helper.color("&aWeapon has been repaired"));
						p.closeInventory();
					}
				}
			}

		}
	}
}
