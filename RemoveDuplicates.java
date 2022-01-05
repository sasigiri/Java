package week1.day1;

public class RemoveDuplicates {

	public static void main(String[] args) {

		// Pseudo code

		// * a) Use the declared String text as input
//String text = "We learn java basics as part of java sessions in java week1";		
		// * b) Initialize an integer variable as count
//* c) Split the String into array and iterate over it 
//* d) Initialize another loop to check whether the word is there in the array
//* e) if it is available then increase and count by 1. 
//* f) if the count > 1 then replace the word as "" 

//* g) Displaying the String without duplicate words	
//*/

String text = "We learn java basics as part of java sessions in java week1";
int Count;
String[] split = text.split("java");
for (int i = 0; i < split.length; i++) {
	Count =0;
			
	String name =  split[i];
	
	String[] split1 = text.split("");
	for (int j = i+1; j < split1.length-1; j++) {
		Count =0;
		String name1 =  split1[j];
		
		if (name.equalsIgnoreCase(name1)){
		
		Count++;
	}
}
	if(Count<1)
	{
		System.out.print(name+" ");
	}
	

	}
		
	}
}
