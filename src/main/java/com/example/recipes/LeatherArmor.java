package com.example.recipes;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class LeatherArmor {

    public static void register(JavaPlugin plugin) {
        registerShapelessRecipe(plugin, "leather_helmet_to_leather", new ItemStack(Material.LEATHER, 5), Material.LEATHER_HELMET);
        registerShapelessRecipe(plugin, "leather_chestplate_to_leather", new ItemStack(Material.LEATHER, 8), Material.LEATHER_CHESTPLATE);
        registerShapelessRecipe(plugin, "leather_leggings_to_leather", new ItemStack(Material.LEATHER, 7), Material.LEATHER_LEGGINGS);
        registerShapelessRecipe(plugin, "leather_boots_to_leather", new ItemStack(Material.LEATHER, 4), Material.LEATHER_BOOTS);
    }

    private static void registerShapelessRecipe(JavaPlugin plugin, String key, ItemStack result, Material ingredient) {
        ShapelessRecipe recipe = new ShapelessRecipe(new NamespacedKey(plugin, key), result);
        recipe.addIngredient(ingredient);
        plugin.getServer().addRecipe(recipe);
        plugin.getLogger().info("Shapeless recipe registered: " + key);
    }
}
