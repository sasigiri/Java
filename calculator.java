package week3.Day1;

//Assignments for method of overloading

// Create class Calculator with below methods
// - 2 methods for add, 1 method with 2 int args , 1 method with 3 int args
// - 2 methods for multiply, 1 method with 2 int args, 1method with 1 int and 1 double args
// - 2 methods for subtract, 1 method with 2 int args , 1 method with 2 double args
// - 2 methods to divide , 1 method with 2 int args, 1 method with one double number and one int
// 
public class calculator {

	public void add1(int a, int b) {
		int c = a + b;
		System.out.println("Result of Add 2 Integer is " + c);
	}

	public void add2(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("Result of Add 3 Integer is " + d);
	}

	public void multiply(int a, int b) {
		int c = a * b;
		System.out.println("Result of Multiply two integers is " + c);

	}

	public void multiply(int a, double b) {
		double c = a * b;
		System.out.println("Result of Multply with int and double" + c);

	}

	public void sub(int a, double b) {
		double c = a - b;
		System.out.println("Result of subraction with int and double is " + c);

	}

	public void divide(int a, double b) {
		double c = a / b;
		System.out.println("Result of Divide with int and double is " + c);

	}

	public static void main(String[] args) {
		calculator cal = new calculator();
		cal.add1(10, 20);
		cal.add2(10, 20, 30);
		cal.multiply(10, 15.5);
		cal.multiply(15, 28);
		cal.sub(28, 28.5);
		cal.divide(500, 50.11);

	}
}
