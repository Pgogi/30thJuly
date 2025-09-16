package practice;

public class reverse {

	public static void main(String[] args) {
		
		//int reverse
		int num = 1234567;
		while(num>0) {
			int rem = num %10;
			System.out.print(rem);
			num = num /10;
		}

		System.out.println(" ");
		
		//string reverse
		String name = "gogi";
		String rev = "";
		int len = name.length();
		for(int a = len-1; a>=0; a--) {
			rev = rev + name.charAt(a);
		}
		System.out.println(rev);
		
		System.out.println(" ");
		
		//sentense reverse
		String sentense = "this is the Java Program";
		String sen[] = sentense.split(" ");
		
		for(int i = sen.length-1; i >=0; i--) {
			System.out.print(sen[i]+ " ");
		}
		
		System.out.println(" ");
		//
		String sent = "This is the hell";
		String sen1[] = sent.split(" ");
		
		for(int b = sen1.length-1; b >=0; b--) {
			System.out.print(sen1[b]+ " ");
		}
	}

}
