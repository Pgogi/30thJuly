package stringManupulation;

public class palidrome {

	public static void main(String[] args) {

		//palidrome checking
		String input = "Madam";
		String reverse = new StringBuilder(input).reverse().toString();
		System.out.println(input.equalsIgnoreCase(reverse)?"Palidrome":"Not Palidrome");
	}

}
