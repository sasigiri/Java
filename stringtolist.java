package week3.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class stringtolist {

	public static void main(String[] args) {

		String[] name = { "HCL", "TCS", "CTS", "AspireSystems","CTS" };
		// Convert sting into list
		List<String> names = new ArrayList<String>();
		names.addAll(Arrays.asList(name));		
		System.out.println("String converted into List");
		System.out.println(names);
		System.out.println("***********************");
		Collections.sort(names);
		System.out.println("SortedList");
		System.out.println(names);
		System.out.println("***********************");	
}
			}

//}
