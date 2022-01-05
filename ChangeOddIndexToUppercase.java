package week1.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {

		//Pseudo code
		//Declare String Input as Follow
		  // String test = "changeme";
		 
		 // a) Convert the String to character array
	 
		 // b) Traverse through each character (using loop)
		 
		 // c)find the odd index within the loop (use mod operator)
		 
		 // d)within the loop, change the character to uppercase, if the index is odd else don't change
		
		String test = "changeme";

		 // a) Convert the String to character array

		char[] test1 = test.toCharArray();{
		
		for (int i = 0; i<test1.length; i++) {
		if(i%2!=0) {	
			
			char test2 =Character.toUpperCase(test1[i]);
		 	 System.out.print(test2);	
		 			 }
		 else
			  System.out.print(test1);
		}
		}
		

		}
	
		
	}

