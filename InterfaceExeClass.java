package week3.Day1;

public class InterfaceExeClass {

	public static void main(String[] args) {

		CalcBusinessTax obj = new CalcBusinessTax();
		obj.calcDeductions("Unit1", 25845, 12458.10);
		obj.calcGrossIncome("unit2", 258456, 587962.56);
		// Method executed from income calculation interface
		obj.calcNetIncome("Unit1", 124580.58, 12684.45);
		obj.commonMethod();
		obj.taxslab();
		
		System.out.println("****************************");
		CalcCooperativeTax obj1 = new CalcCooperativeTax();
		obj1.calcDeductions("society1", 45689, 45678.589);
		obj1.calcGrossIncome("Society2", 258456, 587962.56);
		obj1.taxslab();

		System.out.println("****************************");

		CalcIndividualTax obj2 = new CalcIndividualTax();
		obj2.calcDeductions("Sasi", 45689, 45678.589);
		obj2.calcGrossIncome("Sasi", 258456, 587962.56);
		obj2.taxslab();
	}

}
