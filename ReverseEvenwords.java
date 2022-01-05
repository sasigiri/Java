package week1.day1;

public class ReverseEvenwords {

	public static void main(String[] args) {
//psuedo code
		
		 // Declare the input as Follow
  		//String test = "I am a software tester"; 
	//a) split the words and have it in an array
	//b) Traverse through each word (using loop)
	//c) find the odd index within the loop (use mod operator)
	//	d)split the words and have it in an array
	//	e)print the even position words in reverse order using another loop (nested loop)
	//f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).

String test = "i am a software tester";
String temp = "";
String temp1 = "";


String[] test1=test.split("");
for (int i = 0; i < test1.length; i++) {
	String test3=test1[i];
	int j=i+1;
	if(j%2==0)
	{
		char[] test4 = test3.toCharArray();
		for (int k = test4.length-1; k>=0 ; k--) {
			temp=temp+test4[k];
		}
		temp1 = temp1+""+temp;
		}
	else {
		temp1 = temp1+""+test3;
	
	}
					
		}
System.out.print(temp);
		
	}
	
	
}

		


