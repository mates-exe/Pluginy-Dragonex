package me.mates.vybika.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class onDeath implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent e) {

        Player player = e.getEntity();
        Entity killer = e.getEntity().getKiller();

        if(killer != null) {
            Bukkit.broadcastMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Event" + ChatColor.DARK_GRAY + "] " + ChatColor.YELLOW + player.getName() + ChatColor.RED + " dostal flákanec od " + ChatColor.YELLOW + killer.getName());
        }

        player.getInventory().clear();

    }

}
