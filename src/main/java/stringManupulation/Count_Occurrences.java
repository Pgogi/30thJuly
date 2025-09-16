package stringManupulation;

import java.util.HashMap;

public class Count_Occurrences {

	public static void main(String[] args) {
		//Count Occurrences of Each Character
		String input = "Automation";
		input = input.toLowerCase();
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (char c: input.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map);
		
		System.out.println(" "); // just to add space between
		//same example 
		String input1 = "Selenium";
		input1 = input1.toLowerCase();
		HashMap<Character, Integer> maps = new HashMap<>();
		
		for (char a : input1.toCharArray()) {
			maps.put(a, maps.getOrDefault(a, 0)+1);
		}
		System.out.println(maps);
	}

}
