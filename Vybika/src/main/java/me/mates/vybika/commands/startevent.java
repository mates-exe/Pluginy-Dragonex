package me.mates.vybika.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class startevent implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;

        if(player.hasPermission("vybika.eventstart")) {

            for(Player p : Bukkit.getOnlinePlayers()) {

                Inventory vyberteamu = Bukkit.createInventory(player, 9, "Výběr teamu");

                ItemStack item1 = new ItemStack(Material.RED_BANNER, 1);
                ItemStack item2 = new ItemStack(Material.BLUE_BANNER, 1);

                ItemMeta meta1 = item1.getItemMeta();
                assert meta1 != null;
                meta1.setDisplayName(ChatColor.RED + "RED TEAM");
                ArrayList<String> lore1 = new ArrayList<>();
                lore1.add(ChatColor.GREEN + "Zvolí team RED");
                meta1.setLore(lore1);
                item1.setItemMeta(meta1);

                ItemMeta meta2 = item2.getItemMeta();
                assert meta2 != null;
                meta2.setDisplayName(ChatColor.BLUE + "BLUE TEAM");
                ArrayList<String> lore2 = new ArrayList<>();
                lore2.add(ChatColor.GREEN + "Zvolí team BLUE");
                meta2.setLore(lore2);
                item2.setItemMeta(meta2);


                vyberteamu.setItem(0, item1);
                vyberteamu.setItem(1, item1);
                vyberteamu.setItem(2, item1);
                vyberteamu.setItem(3, item1);

                vyberteamu.setItem(5, item2);
                vyberteamu.setItem(6, item2);
                vyberteamu.setItem(7, item2);
                vyberteamu.setItem(8, item2);


                p.openInventory(vyberteamu);

            }

            } else {
            player.sendMessage("uh");
        }

        return true;
    }
}
