package week3.Day1;

public class CalcBusinessTax implements Taxcalculation,Incomecalculation{

	public void calcDeductions(String name, double hra, double LTA) {

		System.out.println("Business unit name " + name);
	}

	public void calcGrossIncome(String name, double netincome, double deductions) {

		System.out.println("Business unit name " + name);

		System.out.println("Business unit netincome" + netincome);
		System.out.println("Business unit Deductions" + deductions);

	}

	public int taxslab() {
		System.out.println("Return slab for the business");
		return 0;
	}

	public double calcNetIncome(String name, double income1, double income2) {
		System.out.println("Calc net income from the interface incomecalculation");

		
		return 0;
	}

	public void commonMethod() {
System.out.println("Method is common among both interface");		
	}

	public int commonMethod(int a) {
System.out.println("Same method with different data type");		
		return 0;
	}

}
