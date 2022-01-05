package week1.day1;

public class MissingElementArray {

	public static void main(String[] args) {

		
		//Psuedo code
		
		// Here is the input
		//int[] arr = {1,2,3,4,7,6,8};

		// Sort the array	

		// loop through the array (start i from arr[0] till the length of the array)

			// check if the iterator variable is not equal to the array values respectively
			
				// print the number
				
				// once printed break the iteration
		
		int[] arr1 = {1,2,3,4,7,6,8};
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum =sum+ arr1[i];
		}
			System.out.println ("Total of array is"+sum);
			
			int sum1 = 0;
			for (int j = 0; j <= 8; j++) {
				sum1 = sum1+j;
			}
				System.out.println("Total  of array is "+sum1);
				
				System.out.println("missing array is " +(sum1-sum) );		
			}
			
	
			
		}



