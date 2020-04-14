package ChangeUnidirectionalAssociationToBidirectional.refactory2;

import java.util.HashSet;
import java.util.Set;

/**
 *多对多关联
 *
 */
public class Customer {
	private Set<Order> orders = new HashSet<Order>();

	public Set<Order> friendOrders() {
		return orders;
	}

	public void addOrder(Order arg) {
		arg.addCustomer(this);
	}

	public void removeOder(Order arg) {
		arg.removeCustomer(this);
	}
}
