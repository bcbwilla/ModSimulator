package net.electronexchange.modsimulator;
import java.util.Random;

import org.bukkit.ChatColor;

public class ReportGenerator extends WorkGenerator{
	
	public ReportGenerator() {
	}
	
	public String generateReport() {
		String report = "[" + ChatColor.GOLD + "R" + ChatColor.WHITE + "] " + server();
		report = report + ChatColor.DARK_AQUA + generateName();
		report = report + ChatColor.YELLOW + " reports ";
		report = report + ChatColor.DARK_AQUA + generateName() + ChatColor.YELLOW + ": ";
		report = report + ChatColor.WHITE + generateReason();
		report = report + ChatColor.YELLOW + " [" + ChatColor.RED + "0" + ChatColor.YELLOW + "]";
		return report;
	}
	
	private String generateReason() {
		String[] reasons = {"hacks","hacking","hacker","ff","tg tnt","he killed me pig","LOL","hes hacking",
							"help me he is hacking guys","fly hacking","tnt","he killed me","focus","nodus",
							"aimbot","click aimbot","bow hacks","pvp hacks","teleport hacks","teleporting",
							"speed hacks","team grief","greifer","griefing","toggle sprint", "targeting",
							"spamming","spamming chat", "swearing", "he spleefed me and we were on the same team",
							"being dumb","wont stopp hacking","hurry mods hes hacking","one hit kill","reach hacks",
							"strength hacks","hit me through wall","knockback hacks","knockback with no enchants",
							"i am upset by her superior pvp skills","mods do something ffs","ban this guy already",
							"on trees (rift)", "item hacks", "carpet bombing on shroom tip", "sword hacks","hac",
							"he hack", "he have diamond sword with no diamon on map","griefing defense","greifer",
							"killed me in one hit","abuse","reporting me for no reason","forcefield","forcefield",
							"forcefeild","forcefiled","forcefield hacks","aimbot/forcefield","aura","kill aura",
							"killaura","breaking team chests","he killed phil","killed team pig","spam","spammer",
							"swearing","he said a bad word","THESE CAPS WILL GET YOUR ATTENTION","spawning in items",
							"block glitching","fly","dont touch my cannon!","team griefing is not allowed!",
							"shot me thru wall","no","racism","xray","X-Ray","radar"};
		
		String reason = randomElement(reasons);
		
		if(new Random().nextInt(11) < 3) {
			reason = reason.toUpperCase();
		}
		
		return reason;	
	}
	
	private String server() {
		String[] servers = {"CTW1","CTW2","DTC1","DTC2","TDM","Mini01","Mini02","Mini03","Mini04","Mini05",
							"Nostalgia","CTW1","CTW2","DTC1","DTC2","TDM","Mini01","Mini02","Mini03","Mini04",
							"Mini05","Nostalgia","CTW1","CTW2","DTC1","DTC2","TDM","Mini01","Mini02","Mini03",
							"Mini04","Mini05","Nostalgia","Nostalgia","Nostalgia","Nostalgia","CTW1","CTW2",
							"DTC1","DTC2","TDM","Mini01","Mini02","Mini03","Mini04","Mini05","Nostalgia","CTW1",
							"CTW2","DTC1","DTC2","TDM","Mini01","Mini02","Mini03","Mini04","Mini05","Nostalgia",
							"Chaos","Cronus","GS01","GS03"};
		
		return ChatColor.WHITE + "[" + ChatColor.GOLD + randomElement(servers) + ChatColor.WHITE + "] ";
	}
}
