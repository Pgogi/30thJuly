package practice;

public class Separation {

	public static void main(String[] args) {
	
		//separation of letters and numbers
//		String input = "Prabhakar17091989";
//		String letters = "";
//		String numbers = "";
//		
//		for(int a =0; a<input.length(); a++) {
//			char ch = input.charAt(a);
//			
//			if(Character.isDigit(ch)) {
//				numbers +=ch;
//			}
//			else if(Character.isLetter(ch)) {
//				letters+=ch;
//			}
//		}
//		System.out.println(letters);
//		System.out.println(numbers);
		
		String input = "Prabhakar17091989Gogi";
		String letters = "";
		String numbers = "";
		
		for(int a = 0; a<input.length(); a++) {
			
			char ch = input.charAt(a);
			
			if(Character.isDigit(ch)) {
				numbers +=ch;
			}
			else {
				letters+=ch;
			}
		}
		System.out.println(numbers);
		System.out.println(letters);
	}

}
