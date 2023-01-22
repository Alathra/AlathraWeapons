package me.ShermansWorld.AlathraWeapons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

public class WeaponsTabCompletion implements TabCompleter {
  public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
    List<String> completions = new ArrayList<String>();
    if (args.length == 1) {
      completions.add("Katana");
      completions.add("Legendary_Katana");
      completions.add("Iron_Spear");
      completions.add("Iron_Flanged_Mace");
      completions.add("Iron_Naginata");
      completions.add("Iron_Pike");
      completions.add("Iron_Dagger");
      completions.add("Iron_Morning_Star");
      completions.add("Iron_Zweihander");
      completions.add("Iron_Warhammer");
      completions.add("Iron_Shortsword");
      completions.add("Iron_Quarterstaff");
      completions.add("Iron_Kunai");
      completions.add("Iron_Sabre");
      completions.add("Iron_Halberd");
      completions.add("Iron_Combat_Axe");
      completions.add("Iron_Battleaxe");
      completions.add("Iron_Hatchet");
      completions.add("Iron_Battle_Hoe");
      completions.add("Netherite_Spear");
      completions.add("Netherite_Flanged_Mace");
      completions.add("Netherite_Naginata");
      completions.add("Netherite_Pike");
      completions.add("Netherite_Dagger");
      completions.add("Netherite_Morning_Star");
      completions.add("Netherite_Zweihander");
      completions.add("Netherite_Warhammer");
      completions.add("Netherite_Shortsword");
      completions.add("Netherite_Quarterstaff");
      completions.add("Netherite_Kunai");
      completions.add("Netherite_Sabre");
      completions.add("Netherite_Halberd");
      completions.add("Netherite_Combat_Axe");
      completions.add("Netherite_Battleaxe");
      completions.add("Netherite_Hatchet");
      completions.add("Netherite_Battle_Hoe");
      completions.add("Obsidian_Obliterator");
      completions.add("Iron_Scimitar");
      completions.add("Netherite_Scimitar");
      return completions;
    } 
    return Collections.emptyList();
  }
}
