package week1.day1;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
//INCORRECT INPUT GETTING ................ need to try again
		
		// Here is the input

		// *
		// Pseudo Code:
		// 1) Arrange the array in ascending order
		// 2) Pick the 2nd element from the last and print it
		// */
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MAX_VALUE;
			
		int[] data = { 3, 2, 11, 4, 6, 7,8 };
		Arrays.sort(data);
for (int i = 0; i < data.length; i++) {
	if (data[i] >largest) {
	secondlargest = largest;
	largest = data[i];
	if (data[i]!=largest && data[i]>secondlargest)
		secondlargest = data[i];
	
}
if (secondlargest == Integer.MAX_VALUE)

{
	System.out.println("second largest does not exist");
}

	else
		
	System.out.println("second largest is " + secondlargest);
	
	
}


	
	}
}