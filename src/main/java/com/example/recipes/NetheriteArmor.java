package com.example.recipes;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class NetheriteArmor {

    public static void register(JavaPlugin plugin) {

        registerShapelessRecipe(plugin, "netherite_helmet_to_ingots", new ItemStack(Material.NETHERITE_INGOT, 5), Material.NETHERITE_HELMET);
        registerShapelessRecipe(plugin, "netherite_chestplate_to_ingots", new ItemStack(Material.NETHERITE_INGOT, 8), Material.NETHERITE_CHESTPLATE);
        registerShapelessRecipe(plugin, "netherite_leggings_to_ingots", new ItemStack(Material.NETHERITE_INGOT, 7), Material.NETHERITE_LEGGINGS);
        registerShapelessRecipe(plugin, "netherite_boots_to_ingots", new ItemStack(Material.NETHERITE_INGOT, 4), Material.NETHERITE_BOOTS);
    }

    private static void registerShapelessRecipe(JavaPlugin plugin, String key, ItemStack result, Material ingredient) {
        ShapelessRecipe recipe = new ShapelessRecipe(new NamespacedKey(plugin, key), result);
        recipe.addIngredient(ingredient);
        plugin.getServer().addRecipe(recipe);
        plugin.getLogger().info("Shapeless recipe registered: " + key);
    }
}