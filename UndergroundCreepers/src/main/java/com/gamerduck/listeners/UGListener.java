package com.gamerduck.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Creeper;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

public class UGListener implements Listener {
	@EventHandler
	public void onSpawn(EntitySpawnEvent e) {
			if (e.getEntity().getLocation().getBlockY() >=
					e.getEntity().getWorld().getHighestBlockAt(e.getEntity().getLocation()).getLocation().getY()) {
				Bukkit.broadcastMessage("TOP2");
				e.setCancelled(true);
			}
			if (e.getEntity() instanceof Creeper) {
				if (e.getEntity().getWorld().getHighestBlockAt(e.getEntity().getLocation()).getType().toString().contains("LEAVE")) {
					for (int i = 1; i <= 5; i++) {
						Location loc = e.getEntity().getLocation().add(0, i, 0);
						if (loc.getBlock().getType().toString().contains("LEAVE")) {
							Bukkit.broadcastMessage("TOP");
							e.setCancelled(true);
						}
					}
				}
		}
	}
}
