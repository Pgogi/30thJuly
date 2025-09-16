package practice;

public class prime {

	public static void main(String[] args) {
		
//		int number = 37;
//		boolean isPrime = true;
//		
//		for(int a = 2; a<number-1; a++) {
//			if(number%a==0) {
//				isPrime = false;
//				break;
//			}
//		}
//		if(isPrime) {
//			System.out.println("The given number is prime");
//		}
//		else {
//			System.out.println("The given number is not prime");
//		}
		
		//prime numbers from range of numbers
		//1 to 50
//		boolean isPrime = true;
//		int count = 0;
		for(int a = 2; a<=50; a++) {
			boolean isPrime = true;
			for(int b = 2; b<a-1; b++) {
				if(a%b==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(a);
//				count++;
			}
		}
		System.out.println("Total prime numbers: ");
	}
	
}
