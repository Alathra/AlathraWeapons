package me.ShermansWorld.AlathraWeapons;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class WeaponsCommands implements CommandExecutor {
  public WeaponsCommands(Main plugin) {
    plugin.getCommand("weapons").setExecutor(this);
  }
  
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    Player p = (Player)sender;
    if (!p.hasPermission("AlathraWeapons.admin")) {
      p.sendMessage(String.valueOf(Helper.Chatlabel()) + Helper.color("&cYou do not have permission to do this"));
      return false;
    } 
    if (args.length == 1 && args[0].equalsIgnoreCase("unbreakable")) {
      for (int i = 0; i < Main.weaponsMasterList2.size(); i++) {
        ItemStack item = new ItemStack(((Weapon2)Main.weaponsMasterList2.get(i)).getItem());
        ItemMeta meta = item.getItemMeta();
        List<String> lore = meta.getLore();
        lore.clear();
        meta.setLore(lore);
        meta.setUnbreakable(true);
        item.setItemMeta(meta);
        p.getInventory().addItem(new ItemStack[] { item });
      } 
      return true;
    } 
    if (args.length == 0) {
      for (int i = 0; i < Main.weaponsMasterList2.size(); i++) {
        p.getInventory().addItem(new ItemStack[] { ((Weapon2)Main.weaponsMasterList2.get(i)).getItem() });
      } 
      return true;
    } 
    if (args.length == 1) {
      String weaponName = args[0];
      weaponName = weaponName.replaceAll("_", " ");
      for (int i = 0; i < Main.weaponsMasterList2.size(); i++) {
        if (((Weapon2)Main.weaponsMasterList2.get(i)).getName().equalsIgnoreCase(weaponName)) {
          p.getInventory().addItem(new ItemStack[] { ((Weapon2)Main.weaponsMasterList2.get(i)).getItem() });
          return true;
        } 
      } 
      p.sendMessage(String.valueOf(Helper.Chatlabel()) + Helper.color("Weapon not found!"));
      return false;
    } 
    return true;
  }
}
