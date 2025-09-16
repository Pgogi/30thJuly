package practice;

public class table {

	public static void main(String[] args) {
		
		//single number table
//		int num = 9;
//		for(int a = 1; a <=10; a++) {
//			System.out.println(num+" x "+a+" = " + num*a);
//		}
		
		//table for range of numbers
		for(int a = 1; a<=12; a++) {
			System.out.println("");
			System.out.println("Table of "+a+ ":");
			System.out.println("");
			for(int b = 1; b<=10; b++) {
				System.out.println(a+" x "+b + " = "+ a*b);
				
			}
		}
	}

}
