package com.gamerduck;

import org.bukkit.plugin.java.JavaPlugin;

import com.gamerduck.listeners.UGListener;

public class UGMain extends JavaPlugin {
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new UGListener(), this);
	}
}
