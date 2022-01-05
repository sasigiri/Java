package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {

		//psuedo code
		
		// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)

		// Assign input into variable original 

		// Use loop to calculate: use while loop to set condition until the number greater than 0
		// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
		// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
		// Within loop: Add calculated with the cube of remainder & assign it to calculated
		// Check whether calculated and original are same
		//When it matches print it as Armstrong number

		int num = 153;
		int arm = 0;
		do {
		int rem =num%10;
		arm =arm+(rem*rem*rem);
		num =num/10;
		}
		
		while (num>0);
		
		if(num == arm) {
	System.out.println("Armstrong Number is : " + arm);
		}
			
	}



}