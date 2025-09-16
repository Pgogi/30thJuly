package practice;

public class count {

	public static void main(String[] args) {
		
		//example - 1 - Count of Even and odd digits in number num=1234778; using while, do-while and for loop
		
		int number = 1234567;
		int odd = 0;
		int even = 0;
//		
////		while(number>0) {
////			int rem = number%10;
////			
////			if(rem%2==0) {
////				even++;
////			}
////			else {
////				odd++;
////			}
////			number = number/10;
////		}
////		System.out.println("Count of even numbers: "+even);
//		System.out.println("Count of add numbers: "+odd);
		
		//do while
		do {
			int rem1 = number%10;
			if(rem1%2==0) {
				even++;
			}
			else {
				odd++;
			}
			number = number/10;
		}
		while(number>0);
		System.out.println(even);
		System.out.println(odd);
	}
}
