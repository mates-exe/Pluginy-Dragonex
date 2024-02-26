package me.mates.vybika;

import me.mates.vybika.commands.*;
import me.mates.vybika.events.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class Vybika extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new onDeath(), this);
        getServer().getPluginManager().registerEvents(new MenuHandler(), this);
        getServer().getPluginManager().registerEvents(new onRespawn(), this);
        getServer().getPluginManager().registerEvents(new onJoin(), this);
        getServer().getPluginManager().registerEvents(new noBreak(), this);
        getServer().getPluginManager().registerEvents(new noDrop(), this);
        getServer().getPluginManager().registerEvents(new noHunger(), this);

        getCommand("gg").setExecutor(new gg());
        getCommand("startevent").setExecutor(new startevent());

    }

}
