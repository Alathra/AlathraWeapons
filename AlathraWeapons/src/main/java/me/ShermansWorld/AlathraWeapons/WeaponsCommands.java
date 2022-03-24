package me.ShermansWorld.AlathraWeapons;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WeaponsCommands implements CommandExecutor {
	
	public WeaponsCommands(final Main plugin) {
        plugin.getCommand("weapons").setExecutor((CommandExecutor)this);
    }

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player p = (Player) sender;
		if (!p.hasPermission("AlathraWeapons.admin")) {
			p.sendMessage(Helper.Chatlabel() + Helper.color("&cYou do not have permission to do this"));
			return false;
		}
		for (int i = 0; i < Main.weaponsMasterList.size(); i++) {
			p.getInventory().addItem(Main.weaponsMasterList.get(i).getItem());
		}
		return true;
	} 
	
}
