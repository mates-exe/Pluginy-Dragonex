package me.mates.dnlobby.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;

public class itemInteract implements Listener {

    @EventHandler
    public void onInvClick(InventoryClickEvent e) {

        Player p = (Player) e.getWhoClicked();

        if(e.getCurrentItem().getType().equals(Material.REPEATING_COMMAND_BLOCK)) {

            p.performCommand("gb");

            e.setCancelled(true);

        }

    }

    @EventHandler
    public void onDrop(PlayerDropItemEvent e) {

        e.setCancelled(true);
    }

}
