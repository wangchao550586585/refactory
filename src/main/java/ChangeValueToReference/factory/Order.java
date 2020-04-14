package ChangeValueToReference.factory;

import java.util.Collection;
import java.util.Iterator;

/**
 * 1：定义工厂函数，控制对象创建过程
 * 2：声明private
 * 3：改为调用工厂函数
 * 4：保存所有custom对象,以此作为访问点,最好是单独创建一个注册表存放custom对象
 * 5：是否开启懒加载custom对象,在这里采用预加载
 * 6：返回预先加载的对象
 * 7：rename name
 * 8：更改调用
 * @author wangchao
 *
 */
public class Order {
	private Customer customer;

	public Order(String customerName) {
		// 3:改为调用工厂函数
		// customer = Customer.create(customerName);
		
		//8：更改调用
		customer = Customer.getNamed(customerName);
	}

	public String getCustomerName() {
		return customer.getName();
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
