package net.electronexchange.modsimulator;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class ModSimulatorCommand implements CommandExecutor {
	private ModSimulator plugin;
	 
	public ModSimulatorCommand(ModSimulator plugin) {
		this.plugin = plugin;
	}
	
	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){					
		if (args.length == 1) {
			if (args[0].equalsIgnoreCase("on") || args[0].equalsIgnoreCase("start")) {
				if(!this.plugin.modThread.isAlive()) {	
					Thread t = (new Thread(new ModeratorWork(this.plugin)));
					this.plugin.modThread = t;
					t.start();
				} else {
					sender.sendMessage(ChatColor.RED + "Modsimulator is already running!");
				}
				return true;
				
			} else if (args[0].equalsIgnoreCase("off") || args[0].equalsIgnoreCase("stop")) {
				Thread t = this.plugin.modThread;
				if(t.isAlive()) {
					t.stop();
				}
				return true;
			}
		}
		return false;
	}
}
