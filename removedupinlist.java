package week3.Day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class removedupinlist {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(25);
		num.add(26);
		num.add(27);
		num.add(28);
		num.add(25);
		System.out.println(num);

		Set<Integer> num1 = new HashSet<Integer>();
		num1.addAll(num);
		System.out.println("Duplicates removed" + num1);
		
			}


}
