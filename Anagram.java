package week1.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		//Declare a string
		
				String Anag= "stops";
				String Anag1="potss";
				
				//length of the string
				int length3 = Anag.length();
				System.out.println("Length of the string is Anag ;"+length3);
				int length4 = Anag1.length();
				System.out.println("Length of the string is Anag1;"+length4);
				if(length3==length4) {
				System.out.print("Length are same;");
				}
				else
					System.out.println("Length are not same");
				
				//convert both strings into characters
				
				char[] charArray1 = Anag.toCharArray();
				char[] charArray2 = Anag1.toCharArray();
				
				//Replace empty spaces
						Anag.replaceAll("\\a","").toLowerCase();
						Anag1.replaceAll("\\a", "").toLowerCase();
						
				// sorting both arrays
				
				Arrays.sort(charArray1);
				Arrays.sort(charArray2); 
				//check both arrays are same value
				
				boolean Anangramequals = Arrays.equals(charArray1, charArray2);
				System.out.println("Both are same "+Anangramequals);
				
				
				
	}

}
