package com.example.recipes;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class IronArmor {

    public static void register(JavaPlugin plugin) {

        registerShapelessRecipe(plugin, "iron_helmet_to_ingots", new ItemStack(Material.IRON_INGOT, 5), Material.IRON_HELMET);
        registerShapelessRecipe(plugin, "iron_chestplate_to_ingots", new ItemStack(Material.IRON_INGOT, 8), Material.IRON_CHESTPLATE);
        registerShapelessRecipe(plugin, "iron_leggings_to_ingots", new ItemStack(Material.IRON_INGOT, 7), Material.IRON_LEGGINGS);
        registerShapelessRecipe(plugin, "iron_boots_to_ingots", new ItemStack(Material.IRON_INGOT, 4), Material.IRON_BOOTS);
    }

    private static void registerShapelessRecipe(JavaPlugin plugin, String key, ItemStack result, Material ingredient) {
        ShapelessRecipe recipe = new ShapelessRecipe(new NamespacedKey(plugin, key), result);
        recipe.addIngredient(ingredient);
        plugin.getServer().addRecipe(recipe);
        plugin.getLogger().info("Shapeless recipe registered: " + key);
    }
}