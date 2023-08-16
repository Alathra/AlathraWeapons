package me.ShermansWorld.AlathraWeapons.items;

import me.ShermansWorld.AlathraWeapons.exceptions.InvalidMaterialException;

public interface CustomItemGroup {
    default void register() throws InvalidMaterialException {};
}
