package stringManupulation;

public class builder {

	public static void main(String[] args) {
	
		String input = "Gogi";
		
		String reverse = new StringBuilder(input).reverse().toString();
		
		System.out.println(reverse);
		
		System.out.println(" ");
		//normal way
		
		String name = "Prabhu";
		String rev = "";
		int len = name.length();
		
		for(int a = len-1; a >=0; a--) {
			rev = rev+name.charAt(a);		
		}
		System.out.println(rev);
		
		System.out.println(" ");
		
		//sentense reverse 
		String sentense = "This is java project";
		String sen[] = sentense.split(" ");
		for(int b = sen.length-1; b >=0; b--) {
			System.out.print(sen[b]+ " ");
		}
		
		System.out.println(" ");
		//StringBuilder - very easy way to reverse the string 
		String input1 = "Prabhakar";
		String reverse1 = new StringBuilder(input1).reverse().toString();
		System.out.println(reverse1);
		
	}
}
