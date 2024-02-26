package me.mates.nightvision;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public final class Nightvision extends JavaPlugin {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(command.getName().equals("nightvision")) {

            Player player = (Player) sender;

            if (sender instanceof Player) {

                if (player.hasPermission("at.use")) {

                    if(args[0].equals("on")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, Integer.MAX_VALUE, 1));
                    } else if(args[0].equals("off")) {
                        player.removePotionEffect(PotionEffectType.NIGHT_VISION);
                    } else {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, Integer.MAX_VALUE, 1));
                    }



                } else {

                    player.sendMessage("Nope");

                }


            } else {
                System.out.println("Nope");
            }
        }
        return false;
    }

}
