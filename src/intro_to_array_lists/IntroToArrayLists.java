package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList<String> cuboid = new ArrayList<String>();
		//   Don't forget to import the ArrayList class
		
		//2. Add five Strings to your list
		cuboid.add("My");
		cuboid.add("name");
		cuboid.add("is");
		cuboid.add("Bingo");
		cuboid.add("Radioisotope");
		
		//3. Print all the Strings using a standard for-loop
		for (int now = 0; now < cuboid.size(); now++) {
			System.out.println(cuboid.get(now));
		}
		System.out.println("");
		//4. Print all the Strings using a for-each loop
		for (String string : cuboid) {
			System.out.println(string);
		}
		System.out.println("");
		//5. Print only the even numbered elements in the list.
		for (int later = 0; later < cuboid.size(); later++) {
			if (later % 2 == 1) {
				System.out.println(cuboid.get(later));
			}
		}
		System.out.println("");
		//6. Print all the Strings in reverse order.
		for (int dont = cuboid.size() - 1; dont >= 0; dont--) {
			System.out.println(cuboid.get(dont));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		System.out.println("");
		for (int wart = 0; wart < cuboid.size(); wart++) {
			if (cuboid.get(wart).contains("e")) {
				System.out.println(cuboid.get(wart));
			}
		}
	}
}
