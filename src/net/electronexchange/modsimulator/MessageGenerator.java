package net.electronexchange.modsimulator;

import org.bukkit.ChatColor;



public class MessageGenerator extends WorkGenerator {

	public String generateMessage() {
		String message = ChatColor.GRAY + "(From";
		message = message +  ChatColor.AQUA + super.generateName();
		message = message +  ChatColor.GRAY + "): ";
		message = message + ChatColor.WHITE + generateReason();
		return message;
	}
	
	private String generateReason() {
		String[] reasons = {"hi","hey","sup","hi","hi","hey can you come on nostalgia really quick","r u mod","how d u mod",
							"i'm from planet minecraft can you op me","how do you become a mod","do u know cacklingpanda",
							"why dont u respond to reports","will you check out my map on the forums","HALP","can you set harb next plz"};
		
		return randomElement(reasons);
	}
	
}
