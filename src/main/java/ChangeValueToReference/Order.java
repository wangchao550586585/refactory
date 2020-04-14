package ChangeValueToReference;

import java.util.Collection;
import java.util.Iterator;

/**
 * 将值对象改为引用对象
 * 一个类中衍生许多彼此相等的实例,希望将他们替换为同一对象
 * @author wangchao
 *
 */
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

	public static int numberOfOrdersFor(Collection<Order> orders,
			String customer) {
		int result = 0;
		Iterator<Order> iterator = orders.iterator();
		while (iterator.hasNext()) {
			Order order = iterator.next();
			if (order.getCustomerName().equals(customer))
				result++;
		}
		return result;
	}
}
