package weak2.day2;

public class Reversestring {

	public static void main(String[] args) {
 		
		String name = "Reversestring";
	
		//Convert string into Characterarray
		
		
		char[] reversal1 = name.toCharArray();
for (int i = reversal1.length-1; i >= 0; i--) {
	char rev=reversal1[i];		
	System.out.print(""+rev);	
			
			
}
			
		}
		
		


	}

