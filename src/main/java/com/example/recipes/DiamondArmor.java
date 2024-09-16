package com.example.recipes;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class DiamondArmor {

    public static void register(JavaPlugin plugin) {

        registerShapelessRecipe(plugin, "diamond_helmet_to_diamonds", new ItemStack(Material.DIAMOND, 5), Material.DIAMOND_HELMET);
        registerShapelessRecipe(plugin, "diamond_chestplate_to_diamonds", new ItemStack(Material.DIAMOND, 8), Material.DIAMOND_CHESTPLATE);
        registerShapelessRecipe(plugin, "diamond_leggings_to_diamonds", new ItemStack(Material.DIAMOND, 7), Material.DIAMOND_LEGGINGS);
        registerShapelessRecipe(plugin, "diamond_boots_to_diamonds", new ItemStack(Material.DIAMOND, 4), Material.DIAMOND_BOOTS);
    }

    private static void registerShapelessRecipe(JavaPlugin plugin, String key, ItemStack result, Material ingredient) {
        ShapelessRecipe recipe = new ShapelessRecipe(new NamespacedKey(plugin, key), result);
        recipe.addIngredient(ingredient);
        plugin.getServer().addRecipe(recipe);
        plugin.getLogger().info("Shapeless recipe registered: " + key);
    }
}