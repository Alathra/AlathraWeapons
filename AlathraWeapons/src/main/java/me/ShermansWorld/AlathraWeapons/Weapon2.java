package me.ShermansWorld.AlathraWeapons;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Weapon2 {
	private ItemStack item;

	private String name;

	private String material;

	private int modelData;

	public Weapon2(String material, String type, String name, int modelData) {
		this.name = name;
		this.material = material;
		this.modelData = modelData;
		if (type.equalsIgnoreCase("sword"))
			if (material.equalsIgnoreCase("iron")) {
				this.item = new ItemStack(Material.IRON_SWORD, 1);
			} else if (material.equalsIgnoreCase("netherite")) {
				this.item = new ItemStack(Material.NETHERITE_SWORD, 1);
			} else if (material.equalsIgnoreCase("diamond")) {
				this.item = new ItemStack(Material.DIAMOND_SWORD, 1);
			}
		if (type.equalsIgnoreCase("axe"))
			if (material.equalsIgnoreCase("iron")) {
				this.item = new ItemStack(Material.IRON_AXE, 1);
			} else if (material.equalsIgnoreCase("netherite")) {
				this.item = new ItemStack(Material.NETHERITE_AXE, 1);
			} else if (material.equalsIgnoreCase("diamond")) {
				this.item = new ItemStack(Material.DIAMOND_AXE, 1);
			}
		if (type.equalsIgnoreCase("crossbow")) {
			this.item = new ItemStack(Material.CROSSBOW, 1);
		}
		ItemMeta meta = this.item.getItemMeta();
		meta.setDisplayName(name);
		List<String> lore = new ArrayList<String>();
		lore.add(Helper.color("&6Custom Weapon"));
		meta.setLore(lore);
		meta.setCustomModelData(Integer.valueOf(modelData));
		this.item.setItemMeta(meta);
	}

	public ItemStack getItem() {
		return this.item;
	}

	public String getName() {
		return this.name;
	}

	public String getMaterial() {
		return this.material;
	}

	public int getModelData() {
		return this.modelData;
	}
}
