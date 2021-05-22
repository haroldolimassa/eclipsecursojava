package entities2;

public class Banco {
	private int number;
		private String holder;
	private double value;
	
	
	public Banco() {
	
}
	
	public Banco(int number, String holder) {
		
		this.number = number;
		this.holder = holder;
		
		
	}
public Banco(int number, String holder, double inticalDeposit) {
		
		this.number = number;
		this.holder = holder;
		deposit(inticalDeposit);
		
	}
	

	public int getNumber() {
		return number;
	}
	

	

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getValue() {
		return value;
	}

	
	public void deposit(double amount) {
		this.value += amount;
	}
	public void withdraw(double amount) {
		this.value -= amount + 5.0;
	}
	public String toString() {
		return  "Account " 
				+ number 
				+ ", Holder: " 
				+ holder 
				+ ", Balance: R$ " 
				+ String.format("%.2f", value);
	}
	
}
