package com.example.recipes;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SuperApple implements Listener {
    private final JavaPlugin plugin;

    public SuperApple(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public static void register(JavaPlugin plugin) {

        ItemStack superApple = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1);
        ItemMeta meta = superApple.getItemMeta();

        if (meta != null) {

            meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "SUPER APPLE");
            meta.addEnchant(Enchantment.UNBREAKING, 3, true); 
            superApple.setItemMeta(meta);
        }

        ShapedRecipe superAppleRecipe = new ShapedRecipe(new NamespacedKey(plugin, "super_apple"), superApple);
        superAppleRecipe.shape("NNN", "NNN", "NNN");
        superAppleRecipe.setIngredient('N', Material.NETHERITE_BLOCK);

        Bukkit.addRecipe(superAppleRecipe);

        Bukkit.getPluginManager().registerEvents(new SuperApple(plugin), plugin);
    }

    @EventHandler
    public void onConsume(PlayerItemConsumeEvent event) {
        ItemStack item = event.getItem();
        if (item != null && item.hasItemMeta()) {
            ItemMeta meta = item.getItemMeta();
            if (meta != null && ChatColor.stripColor(meta.getDisplayName()).equalsIgnoreCase("SUPER APPLE")) {

                event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 30 * 20, 3)); 
                event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.RESISTANCE, 40 * 20, 1)); 
                event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 30 * 20, 4)); 
                event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, 50 * 20, 9)); 
            }
        }
    }
}