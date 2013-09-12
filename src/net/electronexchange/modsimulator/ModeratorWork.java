package net.electronexchange.modsimulator;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.bukkit.plugin.java.JavaPlugin;

public class ModeratorWork implements Runnable {
	private final JavaPlugin plugin;
	
	public ModeratorWork(JavaPlugin plugin) {
		this.plugin = plugin;
	}
	
	public void run() {		
		while(true) {	
			String toMod;
			
			if(new Random().nextInt(20) < 2){
				toMod = new MessageGenerator().generateMessage();
			} else {
				toMod = new ReportGenerator().generateReport();
			}
			plugin.getServer().broadcastMessage(toMod);
			
			Long seconds = (long) (new Random().nextInt(16));
			try {
				TimeUnit.SECONDS.sleep(seconds);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
