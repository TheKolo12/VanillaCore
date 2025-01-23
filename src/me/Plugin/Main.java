package me.Plugin;

import me.Plugin.EventHandler.PlayerHandler;
//import me.Plugin.Commands.HomeCommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("Plugin enabled");
        RegisterEvent();
//        RegisterCommands();
    }

    @Override
    public void onDisable() {
        System.out.println("Plugin disabled");
    }

    public void RegisterEvent() {
        Bukkit.getServer().getPluginManager().registerEvents(new PlayerHandler(), this);
    }
//    public void RegisterCommands() {
//            this.getCommand("sethome").setExecutor(new HomeCommandExecutor(this));
//   s         this.getCommand("home").setExecutor(new HomeCommandExecutor(this));
//  }

    }
}
