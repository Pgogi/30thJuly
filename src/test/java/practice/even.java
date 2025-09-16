package practice;

public class even {

	public static void main(String[] args) {
		
		//print the even numbers from the range

		int evencount = 0;
		
		for(int a = 0; a<=15; a++) {
			if(a%2==0) {
				evencount++;
				System.out.println(a);
			}
		}
		System.out.println("Total count of even numbers : " +evencount);
		
		//while loop
		int i =1;
		while(i<15) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
