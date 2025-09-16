package practice;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {

		String word, wording, concate;
		
		int age;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the word");
		word = scan.nextLine();
		
		System.out.println("Enter the another word");
		wording = scan.nextLine();
		
		System.out.println("Enter the age");
		age = scan.nextInt();
		concate = word + wording + age;
		
		System.out.println(concate);
		scan.close();
	}

}
