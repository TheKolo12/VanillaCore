package me.Plugin.EventHandler;

public class ServerHandler implements Listener {

    // Task: Message Annuncer
    @Override
    public void onEnable() {
        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.broadcastMessage("Join us on teamspeak: ts.example.com");
            }
        }.runTaskTimer(this, 0, 1200); // Every 60 second = 1200 tick ( 1 second = 20 tick)

}