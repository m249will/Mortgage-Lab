/*William Schiesswohl
 * Mr. Kiedes
 * AP Computer Science Period 2
*/

import java.text.DecimalFormat;
public class mortgage {
public static void main(String[] args)
{
	System.out.println("Lab04, Student Version\n");
	//format for the outputted answers
	DecimalFormat decimal = new DecimalFormat("0.00");
	//initiating variables for the calculations
	double principal = 250000;
	double annualRate = 4.85;
	double percentage = annualRate/1200;
	double numYears = 30;
	double numMonths = numYears * 12;
	
	//easier variables to use for the calculations
	double P = principal;
	double R = percentage;
	double N = numMonths;
	//finds top half of the formula
	double numerator = (R * Math.pow((1+R), N));
	//finds lower half of the formula
	double denominator = (Math.pow((1+R), N) - 1);
	//final calculation
	double monthlyPayment = (numerator/denominator) * P;

	double totalPayments = monthlyPayment*360;
	double totalInterest = totalPayments - principal;
	//output for the program
	System.out.println("Principal:         " + decimal.format(principal));
	System.out.println("Annual Rate:       " + decimal.format(annualRate) + "%");
	System.out.println("Number of Years:   " + decimal.format(numYears));
	System.out.println("Monthly Payment:  $" + decimal.format(monthlyPayment));
	System.out.println("Total Payments:   $" + decimal.format(totalPayments));
	System.out.println("Total Interest:   $" + decimal.format(totalInterest));
}
}
