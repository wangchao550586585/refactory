package ChangeUnidirectionalAssociationToBidirectional.refactory;

public class Order {
	Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	//2:修改函数,令他同时更新反向指针
	//让对方删除向自己的指针,将自己指针指向一个新对象,让新对象把指针指向自己
	public void setCustomer(Customer arg) {
		if (customer != null) {
			customer.friendOrders().remove(this);
		}
		customer = arg;
		if (customer != null) {
			customer.friendOrders().add(this);
		}
	}

}
