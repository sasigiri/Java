package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {

		// Pseudo code;

		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in
		// the series)
		// Print first number

		// Iterate from 1 to the range

		// add first and second number assign to sum

		// Assign second number to the first number

		// Assign sum to the second number

		// print sum
//*******************************************************************************************
		int firstNum = 0;
		int secNum = 1;
		int thirdNum;

		for (int i = 0; i <= 8; i++) {
			System.out.println("Output of Fibocnacci Series: " + firstNum + "  ");
			thirdNum = firstNum + secNum;
			firstNum = secNum;
			secNum = thirdNum;

		}

	}

}
//***********************************************************************************************************