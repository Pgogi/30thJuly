package stringManupulation;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		
		//Check if Two Strings Are Anagrams
		String str1 = "silent";
		String str2 = "listen";
		
		char[] array1 = str1.toCharArray();
		char[] array2 = str2.toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		System.out.println(Arrays.equals(array1, array2)? "Anagrams": "Not Anagrams");

	}

}
