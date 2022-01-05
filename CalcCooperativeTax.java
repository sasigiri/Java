package week3.Day1;

public class CalcCooperativeTax implements Taxcalculation{

	public static void main(String[] args) {
		
 
	}

	public void calcDeductions(String name, double hra, double LTA) {
		System.out.println("Co operative Unit name" +name);
	}

	public void calcGrossIncome(String name, double netincome, double deductions) {
		System.out.println("Co operative unit name is " +name);
		System.out.println("Co operative unit netcome is " +netincome);
		System.out.println("Co operative unit deductions is " +deductions);

	}

	public int taxslab() {
		return 0;
	}

	public void commonMethod() {
		// TODO Auto-generated method stub
		
	}

}
