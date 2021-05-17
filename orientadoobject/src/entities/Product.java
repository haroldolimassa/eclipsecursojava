package entities;

public class Product {

		public String name;
		public String marca;
		public double price;
		public int quantity;
		
		
		public double totalValueStock() {
			return price * quantity;
		}
		public void addProducts(int quantity) {
			this.quantity += quantity;
		}
		
		public void removeProduct(int quantity) {
			this.quantity -= quantity;
		}
		
		public String toString() {
				return name
						+ ", "
						+ marca
						+ ", R$"
						+ String.format("%.2f", price)
						+ ", "
						+ quantity
						+ " units, Total: $ "
						+ String.format("%.2f", totalValueStock());
		}
}
