package ChangeValueToReference.factory;

import java.util.Dictionary;
import java.util.Hashtable;

public class Customer {
	private final String name;

	/*	// 1：定义工厂函数，控制对象创建过程
		public static Customer create(String name) {
			// return new Customer(name);
			// 6：返回预先加载的对象
			return instaces.get(name);
	}*/
	
	// 7：rename name
	public static Customer getNamed(String name) {
		return instaces.get(name);
	}

	// 2： 声明private
	private Customer(String name) {
		this.name = name;
	}

	// 4：保存所有custom对象,以此作为访问点,最好是单独创建一个注册表存放custom对象
	private static Dictionary<String, Customer> instaces = new Hashtable<String, Customer>();

	// 5：预加载
	static void loadCustomers() {
		new Customer("haha").store();
		new Customer("haha1").store();
		new Customer("haha2").store();
	}

	private void store() {
		instaces.put(this.getName(), this);
	}

	public String getName() {
		return name;
	}

}
