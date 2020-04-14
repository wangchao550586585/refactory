package ChangeBidirectionalAssociationToUnidirectional.refactory;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Customer {
	private Set<Order> orders = new HashSet<Order>();

	public Set<Order> friendOrders() {
		return orders;
	}

	public int getDiscount() {
		return 0;
	}

	// 修改2,修改函数
	double getPriceFor(Order order) {
		return order.getDiscountedPrice(this);
	}

	public static List<Customer> getInstances() {
		return null;
	}

	public boolean containsOrder(Order order) {
		return false;
	}

}
