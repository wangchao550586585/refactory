package ChangeBidirectionalAssociationToUnidirectional;

/**
 *双向关联改为单向关联
 *2个类之间有双向关联,但其中一个类如今不再需要另一个类的特性
 *去除不必要关联
 *双向关联,需要维护双向连接,确保对象正确创建和删除而增加的难度,
 *	会造成僵尸程序,某个对象已经死亡,却依然保留系统中,因为对他引用没有完全清除
 *	使2类有了依赖,对一个类修改可能会改变另一个类变化
 */
public class Order {
	Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer arg) {
		if (customer != null) {
			customer.friendOrders().remove(this);
		}
		customer = arg;
		if (customer != null) {
			customer.friendOrders().add(this);
		}
	}

	public double getDiscountedPrice() {
		return getGrossPrice() * (1 - customer.getDiscount());
	}

	private int getGrossPrice() {
		return 0;
	}
}
