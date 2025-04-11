package com.gavinhsmith.sugarcanepanel;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Entrypoint for the plugin.
 *
 * @author Gavin Smith
 */
public final class Main extends JavaPlugin {
    /**
     * Initialize the plugin and connect to Sugarcane's backend.
     */
    @Override
    public void onEnable() {
        getLogger().info("Connecting to the Sugarcane servers...");
    }

    @Override
    public void onDisable() {
        // getLogger().info("");
    }
}
