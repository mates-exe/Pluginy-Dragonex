package me.mates.vybika.events;

import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class MenuHandler implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent e) {

        Player p = (Player) e.getWhoClicked();

        /*
        ZBRANĚ
        */

        ItemStack luk = new ItemStack(Material.BOW, 1);
        luk.addEnchantment(Enchantment.ARROW_INFINITE, 1);
        luk.addEnchantment(Enchantment.ARROW_DAMAGE, 1);
        ItemMeta lukmeta = luk.getItemMeta();
        assert lukmeta != null;
        lukmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        lukmeta.setDisplayName(ChatColor.WHITE + "LUK");
        lukmeta.setUnbreakable(true);

        luk.setItemMeta(lukmeta);


        ItemStack nuz = new ItemStack(Material.IRON_SWORD, 1);
        nuz.addEnchantment(Enchantment.DAMAGE_ALL, 5);
        ItemMeta nuzmeta = nuz.getItemMeta();
        assert nuzmeta != null;
        nuzmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        nuzmeta.setDisplayName(ChatColor.WHITE + "NŮŽ");
        nuzmeta.setUnbreakable(true);

        nuz.setItemMeta(nuzmeta);


        ItemStack sip = new ItemStack(Material.ARROW, 3);
        ItemMeta sipmeta = sip.getItemMeta();
        assert sipmeta != null;
        sipmeta.setDisplayName(ChatColor.WHITE + "ŠÍP");

        sip.setItemMeta(sipmeta);

        /*
        GUI NA VYBER TEAMU
         */

            e.setCancelled(true);
            if(e.getCurrentItem() == null) {
                return;
            } else if(e.getCurrentItem().getType().equals(Material.RED_BANNER)) {
                // sem nahazet veci ohledne teamu a veci
                // cervenej team



                /*
                ARMOR
                 */
                p.getInventory().clear();

                ItemStack redhelma = new ItemStack(Material.LEATHER_HELMET, 1);
                ItemStack redchest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
                ItemStack redlegins = new ItemStack(Material.LEATHER_LEGGINGS, 1);
                ItemStack redboots = new ItemStack(Material.LEATHER_BOOTS, 1);


                redhelma.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 1);
                LeatherArmorMeta redarmor = (LeatherArmorMeta) redhelma.getItemMeta();
                assert redarmor != null;
                redarmor.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                redarmor.setColor(Color.RED);
                redarmor.setUnbreakable(true);

                redhelma.setItemMeta(redarmor);
                redchest.setItemMeta(redarmor);
                redlegins.setItemMeta(redarmor);
                redboots.setItemMeta(redarmor);


                p.getEquipment().setHelmet(redhelma);
                p.getEquipment().setChestplate(redchest);
                p.getEquipment().setLeggings(redlegins);
                p.getEquipment().setBoots(redboots);

                p.getInventory().addItem(luk);
                p.getInventory().addItem(nuz);
                p.getInventory().setItem(9, sip);

                p.teleport(new Location(Bukkit.getWorld("world"), -208, 98, 261));
                p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 3, 5));

                p.closeInventory();
            } else if(e.getCurrentItem().getType().equals(Material.BLUE_BANNER)) {
                // modrej team

                /*
                ARMOR
                 */
                p.getInventory().clear();

                ItemStack redhelma = new ItemStack(Material.LEATHER_HELMET, 1);
                ItemStack redchest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
                ItemStack redlegins = new ItemStack(Material.LEATHER_LEGGINGS, 1);
                ItemStack redboots = new ItemStack(Material.LEATHER_BOOTS, 1);


                redhelma.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 1);
                LeatherArmorMeta redarmor = (LeatherArmorMeta) redhelma.getItemMeta();
                assert redarmor != null;
                redarmor.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                redarmor.setColor(Color.BLUE);
                redarmor.setUnbreakable(true);

                redhelma.setItemMeta(redarmor);
                redchest.setItemMeta(redarmor);
                redlegins.setItemMeta(redarmor);
                redboots.setItemMeta(redarmor);


                p.getEquipment().setHelmet(redhelma);
                p.getEquipment().setChestplate(redchest);
                p.getEquipment().setLeggings(redlegins);
                p.getEquipment().setBoots(redboots);

                p.getInventory().addItem(luk);
                p.getInventory().addItem(nuz);
                p.getInventory().setItem(9, sip);

                p.teleport(new Location(Bukkit.getWorld("world"), -208, 98, 181));
                p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 3, 5));

                p.closeInventory();
            }

    }

}
