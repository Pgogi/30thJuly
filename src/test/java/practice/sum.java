package practice;

public class sum {

	public static void main(String[] args) {
		
		// sum of numbers from 1 to 10
//		int sum = 0;
//		for(int a = 1; a<=12; a++) {
//			sum+= a;
//		}
//		System.out.println(sum);
		
		//sum of even digit from the given number
		int num = 123456789;
		int sum = 0;
		int even = 0;
		int odd = 0;
		int oddsum = 0;
		while(num > 0) {
			int rem = num %10;
			if(rem %2==0) {
				even++;
				sum+=rem;
			}
			else {
				odd++;
				oddsum+=rem;
			}
			num = num /10;
		}
		System.out.println("Count of even digits: "+ even);
		System.out.println("sum of even digits: "+ sum);
		System.out.println("count of add digits: "+ odd);
		System.out.println("Sum of odd digits: "+ oddsum);
		
		System.out.println("");
		
		//sum of array;
		int arr[] = {2,3,4,5,7};
		int total = 0;
		for(int a=0; a<arr.length; a++) {
			total+=arr[a];
		}
		System.out.println("sum of all numbers in array:" +total);
	}

}
