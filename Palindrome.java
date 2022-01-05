package week1.day1;

public class Palindrome {

	public static void main(String[] args) {

		//Palindrome number in java: A palindrome number is a number that is same after reverse.
		//For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. 
		//It can also be a string like LOL, MADAM etc.

		
		// Pseudo Code
			
		// * a) Declare A String value as"madam"
		 
		 //* b) Declare another String rev value as ""
		// * c) Iterate over the String in reverse order
		 //* d) Add the char into rev
		 //* e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		// * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 //*/
		 
		 String test = " madam";
		 
		 //convert string into array;
		 char [] test1 = test.toCharArray();
		 
		 
		 for (int i = test1.length-1; i>=0; i--) {
		char rev = test1[i];
		System.out.print(rev);
		}
		 
		
		
	}

	}


