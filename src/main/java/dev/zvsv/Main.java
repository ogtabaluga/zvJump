package dev.zvsv;

import dev.zvsv.Events.onFly;
import dev.zvsv.Events.onJoin;
import dev.zvsv.Events.onMove;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    //* This is a OpenSource double jump plugin made by Zvsv *//


    @Override
    public void onEnable() {
        getLogger().info("Enabled DoubleJump");

        //Events
        getServer().getPluginManager().registerEvents(new onFly(), this);
        getServer().getPluginManager().registerEvents(new onJoin(), this);
        getServer().getPluginManager().registerEvents(new onMove(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Disabled DoubleJump");
    }
}
