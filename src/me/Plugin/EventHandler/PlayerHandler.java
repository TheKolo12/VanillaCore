package me.Plugin.EventHandler;

import net.minecraft.commands.arguments.coordinates.IVectorPosition;
import net.minecraft.core.Position;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerHandler implements Listener {

    // Event : When player join
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        String playerName = event.getPlayer().getName();
        event.getPlayer().sendMessage(ChatColor.GREEN + "Welcome! " + playerName );

    }
    // Event : When player left
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        String playerName = event.getPlayer().getName();
        event.getPlayer().sendMessage(ChatColor.RED + playerName + "He left the game :(" );
    }
    // Event : When player died
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        var player = event.getEntity();
        // Recupera la posizione
        Location deathLocation  = player.getLocation();
        // Recupera le cordiante
        int x = (int) deathLocation .getX();
        int y = (int) deathLocation .getY();
        int z = (int) deathLocation .getZ();

        player.sendMessage("§0You are dead to these cordinates:nate : " + "§aX: §f" + x + " §aY: §f" + y + " §aZ: §f" + z);

    }
}
