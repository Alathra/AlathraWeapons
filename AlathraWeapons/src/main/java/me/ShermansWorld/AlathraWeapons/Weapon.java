package me.ShermansWorld.AlathraWeapons;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;

public class Weapon {

	private ItemStack item;

	private String name;
	private String material;
	private int durability;

	public Weapon(String material, String type, String name, int damage) {

		this.name = name;
		this.material = material;

		if (type.equalsIgnoreCase("sword")) {
			if (material.equalsIgnoreCase("iron")) {
				item = new ItemStack(Material.IRON_SWORD, 1);
				durability = 250;
			} else if (material.equalsIgnoreCase("netherite")) {
				item = new ItemStack(Material.NETHERITE_SWORD, 1);
				durability = 2031;
			}
		}

		if (type.equalsIgnoreCase("axe")) {
			if (material.equalsIgnoreCase("iron")) {
				item = new ItemStack(Material.IRON_AXE, 1);
				durability = 250;
			} else if (material.equalsIgnoreCase("netherite")) {
				item = new ItemStack(Material.NETHERITE_AXE, 1);
				durability = 2031;
			}
		}

		ItemMeta meta = item.getItemMeta();
		meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE });
		meta.setDisplayName(name); // used for displayname

		List<String> lore = new ArrayList<String>(); // show real durability in lore under item
		lore.add(Helper.color("&aCustom Weapon"));
		if (material.equalsIgnoreCase("iron")) {
			lore.add(Helper.color("&6Durability: " + Integer.toString(durability) + "/250"));
		} else if (material.equalsIgnoreCase("netherite")) {
			lore.add(Helper.color("&6Durability: " + Integer.toString(durability) + "/2031"));
		}
		meta.setLore(lore);
		item.setItemMeta(meta);

		Damageable dmg = (Damageable) meta; // set "damage" or durability to match texture
		dmg.setDamage(damage);
		item.setItemMeta(dmg);

		meta = item.getItemMeta();
		meta.setUnbreakable(true); // removes durability bar at the bottom
		item.setItemMeta(meta);

	}

	public ItemStack getItem() {
		return item;
	}

	public String getName() {
		return name;
	}

	public String getMaterial() {
		return material;
	}
}
