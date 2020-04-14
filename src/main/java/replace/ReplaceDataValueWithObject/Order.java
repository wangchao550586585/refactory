package replace.ReplaceDataValueWithObject;

import java.util.Collection;
import java.util.Iterator;

/**
 * 以对象取代数据值
 * 你有一个数据项,需要与其他数据和行为一起使用才有意义
 * 将数据项变成对象
 * @author wangchao
 *
 */
public class Order {
	private String customer;

	public Order(String customer) {
		this.customer = customer;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public static int numberOfOrdersFor(Collection<Order> orders,
			String customer) {
		int result = 0;
		Iterator<Order> iterator = orders.iterator();
		while (iterator.hasNext()) {
			Order order = iterator.next();
			if (order.getCustomer().equals(customer))
				result++;
		}
		return result;
	}
}
