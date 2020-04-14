package ChangeBidirectionalAssociationToUnidirectional;

import java.util.HashSet;
import java.util.Set;

/**
 * 一对多关联
 * @author wangchao
 *
 */
public class Customer {
	private Set<Order> orders = new HashSet<Order>();

	public Set<Order> friendOrders() {
		return orders;
	}

	public void addOrder(Order arg) {
		arg.setCustomer(this);
	}

	public int getDiscount() {
		return 0;
	}

	double getPriceFor(Order order) {
		return order.getDiscountedPrice();
	}
}
