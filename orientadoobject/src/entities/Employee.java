package entities;

public class Employee {
		
	public String name;
	public double glosssalary;
	public double tax;
	
	public double netSalary() {
		return glosssalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		glosssalary += glosssalary * percentage / 100.0;
	}
	
	public String toString() {
		return name
				+ ", R$"
				+ String.format("%.2f", netSalary());
				
		
	}
}
