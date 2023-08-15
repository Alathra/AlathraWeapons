package me.ShermansWorld.AlathraWeapons.listener;


import me.ShermansWorld.AlathraWeapons.Main;
import me.ShermansWorld.AlathraWeapons.Reloadable;

/**
 * A class to handle registration of event listeners.
 */
public class ListenerHandler implements Reloadable {
    private final Main main;

    public ListenerHandler(Main main) {
        this.main = main;
    }

    @Override
    public void onLoad() {
    }

    @Override
    public void onEnable() {
        main.getServer().getPluginManager().registerEvents(new SmithingTableListener(main), main);
    }

    @Override
    public void onDisable() {
    }
}
