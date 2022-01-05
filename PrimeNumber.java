package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {

		// Pseudo code
		// Declare an int Input and assign a value 13
		// Declare a boolean variable flag as false
		// Iterate from 2 to half of the input
		// Divide the input with each for loop variable and check the remainder
		// Set the flag as true when there is no remainder
		// break the iterator
		// Check the flag (Provide a condition)
		// Print 'Prime' when the condition matches
		// Print 'Not a Prime' when the condition doesn't match
		
		int a = 23;
		boolean prime = false;
		for (int i = 0; i<a/2; i++) {
			if (a%2==0){
				prime =true;
			System.out.println("this is not a prime number" +prime );
		}
		else
		{
			System.out.println("this is a prime number" + prime);
			
			
		}
	}

}
}
