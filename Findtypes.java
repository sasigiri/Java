package week2.day1;

public class Findtypes {

	public static void main(String[] args) {
		
		String test ="$$ Welcome to 2nd Class of Automation $$";
		int letter = 0, space = 0, num = 0, specialChar = 0;

		//convert string to char Array.
		char[] charArray1 = test.toCharArray();
		
		for (int i = 0; i < charArray1.length; i++) {	
			
			if(Character.isLetter(charArray1[i]))
					letter++;			
			else if(Character.isDigit(charArray1[i]))
			num++;
			else if(Character.isSpaceChar(charArray1[i]))					
			space++;
			else
				specialChar++;
		}

				System.out.println("Letter is ;"+letter);
			System.out.println("Number is ;"+num);
			System.out.println("Space is;"+space);
			System.out.println("Special characteris"+specialChar);
			
		}
}
