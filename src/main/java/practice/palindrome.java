package practice;

public class palindrome {

	public static void main(String[] args) {
	
//		String name = "madam";
//		String rev = "";
//		int len = name.length();
//		
//		for (int a= len-1; a>=0; a--) {
//			rev = rev + name.charAt(a);
//		}
//		if(name.equals(rev)) {
//			System.out.println(name +" is palindrome");
//		}
//		else {
//			System.out.println(name +" is not palindrome");
//		}
		
		//number palindrome
		int number = 12321;
        int original = number;  // store original number
        int reversed = 0;

        while (number > 0) {
            int rem = number % 10;   // get last digit
            reversed = reversed * 10 + rem;  // build reversed number
            number = number / 10;   // remove last digit
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }
	}
	
	}
