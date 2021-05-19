package entities;


public class CurrencyConverter {
	public static double IOF = 0.06;
	
	
	public static double dollartoReal(double dollar, double real) {
		return real * dollar * (IOF + 1.0);
	}
}
