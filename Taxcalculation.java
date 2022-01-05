package week3.Day1;

public interface Taxcalculation {
	
	// No Implementation methods
	//Unimplemented method
	//Documentation
	/**
	 * 
	 * @param name
	 * @param hra
	 * @param LTA
	 */
	public void calcDeductions(String name,double hra, double LTA);
	
	/**
	 * 
	 * @param name
	 * @param hra
	 * @param LTA
	 */
	public void calcGrossIncome(String name, double netincome, double deductions);
	
	/**
	 * 
	 * @return
	 */

	int taxslab();
/**
 * 
 */
	public void commonMethod();
	
	
	
	
	
	
	
	
	
	
}
	