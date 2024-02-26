package me.mates.auplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class AuPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("Plugin zapnut");

        getServer().getPluginManager().registerEvents(this, this);

    }

    @EventHandler
    public void PlayerMoveEvent(PlayerMoveEvent event) {

        event.setCancelled(true);

    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {

        event.setCancelled(true);

    }

    @EventHandler
    public void PlayerJoinEvent(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        player.setInvisible(true);

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(command.getName().equals("visible")) {
            Player player = (Player) sender;


                if (sender instanceof Player) {
                    if (player.hasPermission("auplugin.visible")) {
                    if (player.isInvisible()) {

                        player.sendMessage("Neviditelnost vypnuta");
                        player.setInvisible(false);

                    } else {

                        player.sendMessage("Nejsi neviditelný");

                    }
                } else {
                    System.out.println("Nope");
                }
            } else {
                player.sendMessage("Nope");
            }
        }
        return false;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Plugin vypnut");
    }
}
