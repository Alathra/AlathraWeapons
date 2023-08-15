package me.ShermansWorld.AlathraWeapons.items;

import me.ShermansWorld.AlathraWeapons.exceptions.InvalidMaterialException;

public interface CustomItem {
    default void register() throws InvalidMaterialException {};
}
