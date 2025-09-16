package stringManupulation;

public class duplicates {

	public static void main(String[] args) {
		
		//Remove Duplicate Characters
		String input = "Autoamation";
		input = input.toLowerCase();
		StringBuilder output = new StringBuilder();
		
		for(int a = 0; a<input.length(); a++) {
			char ch = input.charAt(a);
			if(output.indexOf(String.valueOf(ch))== -1) {
				output.append(ch);
			}
		}
		System.out.println(output);
		System.out.println("--------------");
		//one more time
		
		String input1 = "Mechanical";
		input1 = input1.toLowerCase();
		StringBuilder output1 = new StringBuilder();
		
		for(int b = 0; b<input1.length(); b++) {
			char CH = input1.charAt(b);
			if(output1.indexOf(String.valueOf(CH))== -1) {
				output1.append(CH);
			}
		}
		System.out.println(output1);
	}

}
