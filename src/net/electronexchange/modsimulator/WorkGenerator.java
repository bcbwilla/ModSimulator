package net.electronexchange.modsimulator;
import java.util.Random;

public class WorkGenerator {
	
	protected String generateName() {
		String[] prefix1 = {"xx","_","the","The","xX","Xx","__","","","","","","","","",""};
		String[] prefix2 = {"mr","mrs","sr","_","Doctor","dr","Dr","","","","","","","","","","","","","","",
							"","","","","","","","","","","","","","","","",""};
		String[] base = {"commander","crafter","creeper","scout","doc","blarg","bro","griefer","troll","bird",
						 "Crafter","Creeper","Scout","Blarg","Bro","Griefer","panda","Panda","panda","toad",
						 "derp",};
		String[] suffix1 = {"man","woman","girl","boy","gal","dude","master","Master","Dude","creeper",
							"Creeper","","","","",""};
		String[] suffix2 = {"xx","_","","","","","","","","","","","","","","","","","","","","",""};
		
		String p1 = randomElement(prefix1);
		String p2 = randomElement(prefix2);
		String b = randomElement(base);
		String s1 = randomElement(suffix1);
		String s2 = randomElement(suffix2);
		String number = Integer.toString(new Random().nextInt(10000));
		
		if (new Random().nextInt(10) > 3) {
			number = "";
		}		
		return p1 + p2 + b + s1 + s2 + number;
	}
	
	protected String randomElement(String[] s) {
		return s[new Random().nextInt(s.length)];
	}
}
