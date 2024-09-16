package com.example.recipes;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class Tools {

    public static void register(JavaPlugin plugin) {

        registerShapelessRecipe(plugin, "diamond_sword_to_diamonds", new ItemStack(Material.DIAMOND, 2), Material.DIAMOND_SWORD);
        registerShapelessRecipe(plugin, "diamond_pickaxe_to_diamonds", new ItemStack(Material.DIAMOND, 3), Material.DIAMOND_PICKAXE);
        registerShapelessRecipe(plugin, "diamond_axe_to_diamonds", new ItemStack(Material.DIAMOND, 3), Material.DIAMOND_AXE);
        registerShapelessRecipe(plugin, "diamond_shovel_to_diamonds", new ItemStack(Material.DIAMOND, 1), Material.DIAMOND_SHOVEL);
        registerShapelessRecipe(plugin, "diamond_hoe_to_diamonds", new ItemStack(Material.DIAMOND, 2), Material.DIAMOND_HOE);

        registerShapelessRecipe(plugin, "iron_sword_to_ingots", new ItemStack(Material.IRON_INGOT, 2), Material.IRON_SWORD);
        registerShapelessRecipe(plugin, "iron_pickaxe_to_ingots", new ItemStack(Material.IRON_INGOT, 3), Material.IRON_PICKAXE);
        registerShapelessRecipe(plugin, "iron_axe_to_ingots", new ItemStack(Material.IRON_INGOT, 3), Material.IRON_AXE);
        registerShapelessRecipe(plugin, "iron_shovel_to_ingots", new ItemStack(Material.IRON_INGOT, 1), Material.IRON_SHOVEL);
        registerShapelessRecipe(plugin, "iron_hoe_to_ingots", new ItemStack(Material.IRON_INGOT, 2), Material.IRON_HOE);

        registerShapelessRecipe(plugin, "netherite_sword_to_ingots", new ItemStack(Material.NETHERITE_INGOT, 2), Material.NETHERITE_SWORD);
        registerShapelessRecipe(plugin, "netherite_pickaxe_to_ingots", new ItemStack(Material.NETHERITE_INGOT, 3), Material.NETHERITE_PICKAXE);
        registerShapelessRecipe(plugin, "netherite_axe_to_ingots", new ItemStack(Material.NETHERITE_INGOT, 3), Material.NETHERITE_AXE);
        registerShapelessRecipe(plugin, "netherite_shovel_to_ingots", new ItemStack(Material.NETHERITE_INGOT, 1), Material.NETHERITE_SHOVEL);
        registerShapelessRecipe(plugin, "netherite_hoe_to_ingots", new ItemStack(Material.NETHERITE_INGOT, 2), Material.NETHERITE_HOE);
    }

    private static void registerShapelessRecipe(JavaPlugin plugin, String key, ItemStack result, Material ingredient) {
        ShapelessRecipe recipe = new ShapelessRecipe(new NamespacedKey(plugin, key), result);
        recipe.addIngredient(ingredient);
        plugin.getServer().addRecipe(recipe);
        plugin.getLogger().info("Shapeless recipe registered: " + key);
    }
}