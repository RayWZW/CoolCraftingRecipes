package com.example.recipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.NamespacedKey;

public class ReverseCobweb {
    public static void register(JavaPlugin plugin) {

        ItemStack stringStack = new ItemStack(Material.STRING, 5);

        ShapelessRecipe reverseCobwebRecipe = new ShapelessRecipe(new NamespacedKey(plugin, "reverse_cobweb"), stringStack);
        reverseCobwebRecipe.addIngredient(Material.COBWEB);

        Bukkit.addRecipe(reverseCobwebRecipe);
    }
}