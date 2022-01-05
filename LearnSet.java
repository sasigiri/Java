package week3.Day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
//			Set is also an interface
//		collection
//		 Dynamic Size
//		 Does not allow duplicates	
//		Does / Does not Maintains Insertion order
//		Implementation class
//		=Hashset - Random order
//		LinkedHashset = maintain the order
//		Treeset =Gives an Ascii ordered output
//		cannot accessed through the index
		//Removeall can use
		//Retain can use
	
//		
//		Set Interview questions?//
//		Can you access through Index?
//		No we cant access through index, since there is no index option.
//		no we cant use for loop , bcuz there is no index.
//		only through for each we can do

		Set<String> animals = new HashSet<String>();

		animals.add("Tiger");
		animals.add("Monkey");
		animals.add("Cat");
		animals.add("Rat");
		animals.add("Cats");


		// Access without using foreach (valued stored as array)
		System.out.println(animals);
		System.out.println("Using Hashset Model:");
		System.out.println("***************");

		// Accessed using foreach
		for (String eachanimal : animals) {
			System.out.println(eachanimal);
		}
		System.out.println("***************");

		Set<String> animals1 = new LinkedHashSet<String>();
		animals1.add("Tiger");
		animals1.add("Monkey");
		animals1.add("Cat");
		animals1.add("Rat");
		System.out.println("Using Linkedhashset Model:");
		for (String eachanimal1 : animals1) {
			System.out.println(eachanimal1);

		}
		System.out.println("***************");

		Set<String> animals3 = new TreeSet<String>();

		animals3.add("Tiger");
		animals3.add("Monkey");
		animals3.add("Cat");
		animals3.add("Rat");

		System.out.println("Using Tresset model:");

		for (String eachanimal3 : animals3) {
			System.out.println(eachanimal3);

		}

	}

}
