package me.mates.dnlobby;

import me.mates.dnlobby.events.Speed;
import me.mates.dnlobby.events.clearConsole;
import me.mates.dnlobby.events.itemInteract;
import org.bukkit.plugin.java.JavaPlugin;

public final class DNLobby extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new Speed(), this);
        getServer().getPluginManager().registerEvents(new itemInteract(), this);
        getServer().getPluginManager().registerEvents(new clearConsole(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
