package hw;

import java.util.HashMap;
import java.util.TreeMap;

public class HWDemo {

	// Instruction: Each team member pushes at least once by adding 1 method
	// Practice Cloning, Pulling, Pushing, Stashing

	public static void main(String[] args) {

		System.out.println("Everyone!!!!! Please Push a line of code at Saturday 3AM");
		// Lets do it i will push one too at 3AM

		// Team1 hobbies before Java
		TreeMap<String, String> team1Hobbies = new TreeMap<String, String>();
		// share your hobbies guys!
		team1Hobbies.put("Karina", "Dancing");
		team1Hobbies.put("Noor", null);
		team1Hobbies.put("Maboob", "Billiard Pro");
		team1Hobbies.put("Gustavo", "Soccer");
		team1Hobbies.put("Freshta", null);
		team1Hobbies.put("Erick", null);

		// Team1 Number of SCREENS
		HashMap<String, Integer> screenTotal = new HashMap<String, Integer>();
		// How many screen do you use now?
		screenTotal.put("Gustavo", 2);
		screenTotal.put("Noor", null);
		screenTotal.put("Karina", 1);
		screenTotal.put("Maboob", null);
		screenTotal.put("Freshta", null);
		screenTotal.put("Erick", null);
		screenTotal.put("Cindy", null);

	}

}
