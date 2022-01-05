package week1.day1;

public class SumofDigitsString {

	public static void main(String[] args) {
		// * Method 1
		// * Pseudo Code

		// * Declare a String text with the following value
		// String text = "Tes12Le79af65";
		// Declare a int variable sum
		// int sum = 0;
		// * a) using replaceAll(), replace all the non-digits into ""
		// * b) Now, convert the String into array
		// * c) Iterate over the array and get each character
		// * d) Using Character.getNumericValue(), Change the char into int
		// * e) Add the values to sum & print
		// *
		// */

		// *
		// * Method 2
		// * Pseudo Code
		// * Declare a String text with the following value
		// String text = "Tes12Le79af65";
		// Declare a int variable sum
		// int sum = 0;
		// * a) Iterate an array over the String
		// * b) Get each character and check if it is a number using Character.isDigit()
		// * c) Now covert char to int using Character.getNumericValue() and add it to
		// sum
		// * d) Now Print the value

		String text = "Tes12Le79af65";
		int sum = 0;
		char[] text2 = text.toCharArray();
		for (int i = 0; i < text2.length; i++) {
			char s = text2[i];
			if (Character.isDigit(s))
				;
			{
				int numericvalue = Character.getNumericValue(s);
				sum = sum + numericvalue;

			}
		}
System.out.println("Result of char into interger;"+sum);
	}

}
