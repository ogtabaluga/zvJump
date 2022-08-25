package dev.zvsv.Events;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleFlightEvent;

public class onFly implements Listener {

    @EventHandler
    public void onPlayerFly(PlayerToggleFlightEvent e) {
        Player p = e.getPlayer();

        if(p.hasPermission("doublejump")) { // Checks if player have permissions to use double jump
            if(p.getGameMode() != GameMode.CREATIVE) { // Checks if player isnt in creative
                e.setCancelled(true);

                p.setAllowFlight(false);
                p.setFlying(false);
                p.setVelocity(p.getLocation().getDirection().multiply(2.0).setY(0.9)); // multiply is how much its gonna launch the player
            }                                                                             // forward and setY is how much its gonna launch him higher
        } else {
            e.setCancelled(true);
        }
    }
}
