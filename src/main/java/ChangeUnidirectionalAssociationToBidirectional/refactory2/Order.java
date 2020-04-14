package ChangeUnidirectionalAssociationToBidirectional.refactory2;

import java.util.HashSet;
import java.util.Set;

public class Order {
	private Set<Customer> customers = new HashSet<Customer>();

	public void addCustomer(Customer arg) {
		arg.friendOrders().add(this);
		customers.add(arg);
	}

	public void removeCustomer(Customer arg) {
		arg.friendOrders().remove(this);
		customers.remove(arg);
	}
}
