package ChangeUnidirectionalAssociationToBidirectional.refactory;

import java.util.HashSet;
import java.util.Set;

/**
 * 一对多关联
 * @author wangchao
 *
 */
public class Customer {
	private Set<Order> orders = new HashSet<Order>();

	// 1:添加辅助函数,让order可以直接访问此集合
	public Set<Order> friendOrders() {
		return orders;
	}

	// 3:在此类也能修改连接
	public void addOrder(Order arg) {
		arg.setCustomer(this);
	}
}
