package me.ShermansWorld.AlathraWeapons;

import org.bukkit.ChatColor;

public class Helper {
  public static String color(String input) {
    return ChatColor.translateAlternateColorCodes('&', input);
  }
  
  public static String Chatlabel() {
    return color("&6[&5AlathraWeapons&6]&r ");
  }
}
