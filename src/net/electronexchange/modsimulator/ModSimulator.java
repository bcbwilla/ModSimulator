package net.electronexchange.modsimulator;

import org.bukkit.plugin.java.JavaPlugin;


public class ModSimulator extends JavaPlugin {
	public Thread modThread = (new Thread(new ModeratorWork(this)));
	
	@Override
	public void onEnable(){
		getLogger().info("inb4 \"REACH HAX\"");
		getCommand("modsimulator").setExecutor(new ModSimulatorCommand(this));
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void onDisable(){
		getLogger().info("can u appeal my friend");
		
		if(modThread.isAlive()) {
			modThread.stop();
		}
	}
}
