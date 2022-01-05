package week3.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Learnlist {

	public static void main(String[] args) {
		// syntax of list
		// <> = Generics
		// Wrapper class
		// String = String
		// Int = Integer
		// boolean - Boolean
		// byte = Byte
		// Short = Short

		List<String> fruits = new ArrayList<String>();

		// Add Elements to the list
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Strawberry");
		fruits.add("Grapes");
		

		// Check size of the list
		int size = fruits.size();
		System.out.println("Size of the list is" + size);

		// print the list - Type 1
		System.out.println(fruits);

		System.out.println("*********************");
		// print the list using for loop - Type 2
		System.out.println("List of the fruits using for loop");

		for (int i = 0; i < size; i++) {
			System.out.println(fruits.get(i));

		}
		System.out.println("*********************");

		System.out.println("Using for eachloop");
		// print the list using for each
		for (String string : fruits) {
			System.out.println(string);
			System.out.println("*********************");
		}

		// Sorting the list
		Collections.sort(fruits);
		System.out.println("Sorted list");
		System.out.println(fruits);
		System.out.println("*********************");

		// To print the Reverse list
		Collections.reverse(fruits);
		System.out.println("Reversed list");
		System.out.println(fruits);
		System.out.println("*********************");
		
		
		//using arraylist removing the duplicates from list
		
		ArrayList<String> fruits1 = new ArrayList<String>();
		fruits1.add("Apple");
		fruits1.add("Orange");
		fruits1.add("Mango");
		fruits1.add("Strawberry");
		fruits1.add("Grapes");
		fruits1.add("Mango");

		
		Set<String> fruits2  = new HashSet<String>();
		fruits2.addAll(fruits1);
		System.out.println("Duplicates removed");
		System.out.println(fruits2);
		System.out.println("&&&&&&&&&&&&&&&&&");

		

		List<Integer> calc = new ArrayList<Integer>();
		calc.add(256);
		calc.add(458);
		calc.add(253);
		calc.add(259);
		calc.add(250);

		System.out.println(calc);
		System.out.println("*********************");

		// Sorting the list
		Collections.sort(calc);
		System.out.println("Sorted Integer list");
		System.out.println(calc);
		System.out.println("*********************");

		// To print the Reverse list
		Collections.reverse(calc);
		System.out.println("Reversed IntegerList");
		System.out.println(calc);
		System.out.println("*********************");

//		 Removes element from index 0 
		calc.remove(0);
		System.out.println("List after removing element at index 0:\n" + calc);
		System.out.println("*********************");

		// Replace value of last element
		calc.set(0, 1);
		System.out.println("Index 0 got replaced as 1" + calc);

	}

}
