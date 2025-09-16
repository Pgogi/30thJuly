package practice;

public class switchs {

	public static void main(String[] args) {
		// find the given number is odd or even

		int num = 1000;
		
		switch(num%2) {
		case 0:
			System.out.println("Even number");
			break;
		case 1: 
			System.out.println("Odd number");
			break;
		}
		
		// example 2 - //print the statement based on day name
				//monday to friday - working day
				//saturday & sunday - holiday
		
		String day = "sunday";
		
		switch(day){
			case "Monday":
			case "tuesday":
			case "wednesday":
			case "thursday":
			case "friday":
				System.out.println("Working day");
				break;
			case "saturday":
			case "sunday" :
				System.out.println("Holiday");
				break;
				default:
					System.out.println("Wrong day");
		}
		
		//arithmetic operations on 2 numbers
				int a = 12;
				int b = 3;
				char ch ='/';				
				switch(ch) {
				case '+':
					System.out.println(a+b);
					break;
				case '-':
					System.out.println(a-b);
					break;
				case '*':
					System.out.println(a*b);
					break;
				case '/':
					System.out.println(a/b);
					break;
				}
				
	}

}
