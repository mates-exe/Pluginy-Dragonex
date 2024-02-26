package me.mates.vybika.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class onJoin implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        Player p = e.getPlayer();

        p.setHealth(20.0);

        p.getInventory().clear();

        p.teleport(new Location(Bukkit.getWorld("world"), -208, 139, 221, 0, 0));

        p.sendMessage(ChatColor.GOLD + "------------------------");
        p.sendMessage("");
        p.sendMessage(ChatColor.GOLD + "Vítej na Eventu");
        p.sendMessage(ChatColor.RED + "TEAM KILLING JE PŘÍSNĚ ZAKÁZANÝ");
        p.sendMessage("");
        p.sendMessage(ChatColor.GOLD + "PRO ZAPOJENÍ DO HRY POUŽIJ" + ChatColor.GREEN + " /gg");
        p.sendMessage("");
        p.sendMessage(ChatColor.GOLD + "------------------------");



    }

}
