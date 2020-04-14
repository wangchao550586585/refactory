package replace.ReplaceDataValueWithObject.factory;

public class Order {
	private Customer customer;

	public Order(String customerName) {
		this.customer = new Customer(customerName);
	}

	public String getCustomerName() {
		return customer.getName();
	}

	public void setCustomer(String customerName) {
		this.customer = new Customer(customerName);
	}
}
