package stringManupulation;

public class extractingNumbers {

	public static void main(String[] args) {

		//Extract Numbers from String
		String input = "Prabhu17091989";
		String numbers = input.replaceAll("\\D", "");
		System.out.println("Extracted numbers: "+ numbers);
		
		System.out.println("-----------");
		
		//same example one more time
		String input1 = "Prabhu17091989";
		String numbers1 = input1.replaceAll("\\D", "");
		System.out.println(numbers1);
		
		System.out.println("----------------");
		
		//Extract alphabets from string
		String name = "Prabhu123456";
		String word = name.replaceAll("[^a-zA-Z]", "");
		System.out.println(word);
	}

}
