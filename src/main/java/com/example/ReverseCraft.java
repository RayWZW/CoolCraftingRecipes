package com.example;

import com.example.recipes.Cobweb;
import com.example.recipes.DiamondArmor;
import com.example.recipes.IronArmor;
import com.example.recipes.NetheriteArmor;
import com.example.recipes.ReverseCobweb;
import com.example.recipes.SuperApple;
import com.example.recipes.LeatherArmor;
import com.example.recipes.Tools;
import com.example.recipes.GoldenAppleRecipe; 
import org.bukkit.plugin.java.JavaPlugin;

public class ReverseCraft extends JavaPlugin {

    @Override
    public void onEnable() {

        DiamondArmor.register(this);
        IronArmor.register(this);
        NetheriteArmor.register(this);
        LeatherArmor.register(this);
        Tools.register(this);
        GoldenAppleRecipe.register(this); 
        Cobweb.register(this);
        ReverseCobweb.register(this);
        SuperApple.register(this);

        getLogger().info("ReverseCraft plugin enabled!");
    }
}