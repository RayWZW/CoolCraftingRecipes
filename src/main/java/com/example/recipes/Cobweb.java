package com.example.recipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.NamespacedKey;

public class Cobweb {
    public static void register(JavaPlugin plugin) {

        ItemStack cobweb = new ItemStack(Material.COBWEB);

        ShapedRecipe cobwebRecipe = new ShapedRecipe(new NamespacedKey(plugin, "cobweb"), cobweb);
        cobwebRecipe.shape("S S", " S ", "S S");
        cobwebRecipe.setIngredient('S', Material.STRING);

        Bukkit.addRecipe(cobwebRecipe);
    }
}