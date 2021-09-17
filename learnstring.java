package week2.day1;

public class learnstring {

	public static void main(String[] args) {
		
		//Method 1
		
		//String teststring = "Welcome to testleaf";
		//System.out.println(teststring);
		
		// ********************************************************
	//Method 2
		String teststring=new String();
		teststring = "have a nice day";
		System.out.println("Method2 output is : "+ teststring);
		//or
		
		String teststring1 =new String("GOODMORNING");
		System.out.println(teststring1);
		
		//****************************************************************
		//To find length of string; syntax :str.length
		
	int length = teststring.length();
	System.out.println("Length of string is "+length);
	//********************************************************************
	
	//To find Character at String
	
	char charAt = teststring.charAt(0);
	System.out.println(charAt);
	//****************************************
	//To find the index of character
	int Index = teststring.indexOf('n');
	System.out.println("Index of is"+Index);
	
	int IndexLast = teststring1.lastIndexOf('G');
	System.out.println("Last index of G is "+IndexLast);
	
	//***************************************************
	
	//To Change Uppercase
	
	String upperCase = teststring.toUpperCase();
	System.out.println("Changed to Uppercase;"+ upperCase);
	
	//To Change Lowercase
	String lowerCase = teststring1.toLowerCase();
	System.out.println("Changed to Lowercase;"+lowerCase);
	
	//*********************************************************
	
	//Coverts String to CharArray
	
	//char[] Character1 = teststring1.toCharArray();
	//for (int i = 0; i < Character1.length; i++) {
		//System.out.println("Charcter:"+Character1[i]);
		
		//******************************************************

	//**Test Comparision 
	
	String comp3="GoodDay";
			String comp4="GoodDay";
			
			boolean Result1 = comp3.equals(comp4);
			System.out.println("Comparision result is :"+Result1);	
	
	//************************************************************************
		//Test Comparision *** Changed to Comp1 to small letter
		
		String comp1="Goodday";
				String comp2="GoodDay";
				
				boolean Result = comp1.equals(comp2);
				System.out.println("Comparision result is :"+Result);
				
	
				//if case sensitive not in account 
				
			boolean equalsIgnoreCase = comp1.equalsIgnoreCase(comp2);			
			System.out.println("Ignore case sentitive :"+equalsIgnoreCase);
			
						
		//**********************************************************
						
		//Find number of occurrence in String
		//Declare string
			int Count=0;	
			
			String str= "Welcome to India";
			
			//Convert string to Character
			
		char[] charArray1 = str.toCharArray();
			for (int i = 0; i < charArray1.length; i++) {
				if(charArray1[i] =='e'){
					Count=Count+1;					
				
				}					
			}
			System.out.println("count of e is :"+ Count);	
			
	
			//*********************************************************
		
	//Odd indexcharacter to uppercase
	
	//Declare a string
	
	String str1="cHangeme";
	char[] charArray2 = str1.toCharArray();
	for (int i = 0; i < charArray2.length; i++) {
		 if(i%2!=0) {
			 char upperCase2 = Character.toUpperCase(charArray2[i]);		 
		 	 System.out.println(upperCase2);	
		 			 }
		 else
			  System.out.println(charArray2);

	}
	//*********************************************
	 
	//Palindrome
	//Declare a string
	
	String palin="madam";
			
	//convert string to charArray;
		char[] charArray5 = palin.toCharArray();
	for (int i = 0; i < charArray5.length; i++) {
		char rev1=charArray5[i];
		System.out.print(""+rev1);
		
	}
	
	String palin1="madam";

	//Covert string to CharArray
	
	char[] charArray4 = palin1.toCharArray();
	
	//reverse for loop
	
	for (int  i = charArray4.length-1;i >= 0; i--) {
		char rev=charArray4[i];		
		System.out.print(""+rev);
		
		boolean equals1 = palin.equals(palin1);
		System.out.println(equals1);
		
	}
	//**************************************************************
	
	String name = "sasi";
			
			char[] reversal1 = name.toCharArray();
	for (int i = reversal1.length-1; i >= 0; i--) {
		char rev=reversal1[i];		
		System.out.print(""+rev);		
		
	}
//******************************************************************
	
	
	
	
	
	
	}

}
