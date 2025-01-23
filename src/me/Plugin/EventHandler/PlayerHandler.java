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

    // Evento : Quando un player entra
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        String playerName = event.getPlayer().getName();
        event.getPlayer().sendMessage(ChatColor.GREEN + "Benvenuto! " + playerName );

    }
    // Evento : Quando un player esce
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        String playerName = event.getPlayer().getName();
        event.getPlayer().sendMessage(ChatColor.RED + playerName + "Ha lasciato la partita :(" );
    }
    // Evento : Quando un player muore
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        var player = event.getEntity();
        // Recupera la posizione
        Location deathLocation  = player.getLocation();
        // Recupera le cordiante
        int x = (int) deathLocation .getX();
        int y = (int) deathLocation .getY();
        int z = (int) deathLocation .getZ();

        player.sendMessage("§0Sei morto a queste coordinate : " + "§aX: §f" + x + " §aY: §f" + y + " §aZ: §f" + z);

    }
}
