package ChangeBidirectionalAssociationToUnidirectional.refactory;

import java.util.Iterator;

public class Order {

	// 修改1,将customer对象传递给用户
	public double getDiscountedPrice(Customer customer) {
		return getGrossPrice() * (1 - customer.getDiscount());
	}
	//3:修改取值函数
	Customer getCustomer() {
		Iterator<Customer> iterator = Customer.getInstances().iterator();
		while (iterator.hasNext()) {
			Customer next = iterator.next();
			if (next.containsOrder(this))
				return next;
		}
		return null;
	}

	private int getGrossPrice() {
		return 0;
	}
}
