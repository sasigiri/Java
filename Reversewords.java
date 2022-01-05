package week1.day1;

public class Reversewords {

	public static void main(String[] args) {
		String test = "I am software tester";
		
		char[]test1 = test.toCharArray();
		for (int i = test1.length-1; i >=0; i--) {
			char rev =test1[i];
			System.out.print(rev);
			
		}
		
		
	}

}
