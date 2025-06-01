package edu.pasadena.cs.cs03b;

public class Dummy {

	public static void main(String[] args) {
		// TODO: add you logic here
	}

	public static int dummy() {
		
		
		// TOOD: add your logic here

		return 1;
	}

}

public class IncomeTaxCalculation {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	    System.out.print("Enter annual income (-1 to exit): ");
	    
		int annualIncome = input.nextInt();
		
	    int taxRate = calculateTaxRate(annualIncome);
	    double taxOwed = calculateTaxOwed(taxRate, annualIncome);
	    System.out.print("Annual Income: " + annualIncome + "	Tax Rate: " + taxRate + "%");
	    System.out.print("\nTax to Pay: " + taxOwed);
	}
	
	public static int calculateTaxRate (int annualIncome) {
		//Scanner input = new Scanner(System.in);
		int taxRate = 0;

		
		if (annualIncome > 0 && annualIncome < 11600) {
			taxRate = 10;
		}
		else if (annualIncome > 11601 && annualIncome < 47150) { 
			taxRate = 12;
		}
		else if (annualIncome > 47151 && annualIncome < 100525) { 
			taxRate = 22;
		}
		else if (annualIncome > 100526 && annualIncome < 191950) { 
			taxRate = 24;
		}
		else if (annualIncome > 191951 && annualIncome < 243725) { 
			taxRate = 32;
		}
		else if (annualIncome > 243726 && annualIncome < 609350) { 
			taxRate = 35;
		}
		else if (annualIncome > 609351 && annualIncome < 99999999) { 
			taxRate = 37;
		}
		
		return taxRate;
	}
	
	
	public static double calculateTaxOwed (int taxRate, int annualIncome) {
		//Scanner input = new Scanner(System.in);
		double taxOwed = 0;
		
		if (taxRate == 10) {
			taxOwed += 11600 * .10;
		}
		if (taxRate == 12) {
			taxOwed += (47150 - 11600) * .12;
		}
		if (taxRate == 22) {
			taxOwed += (100525 - 47150) * .22;
		}
		if (taxRate == 24) {
			taxOwed += (191950 - 100525) * .24;
		}
		if (taxRate == 32) {
			taxOwed += (243725 - 191950) * .32;
		}
		if (taxRate == 35) {
			taxOwed += (609350 - 243725) * .35;
		}
		if (taxRate == 37) {
			taxOwed += 99999999 * .37;
		}
		
		return taxOwed;
	}
	
	
}
