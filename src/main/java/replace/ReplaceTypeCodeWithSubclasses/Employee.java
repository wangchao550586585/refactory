package replace.ReplaceTypeCodeWithSubclasses;

/**
 * 以子类取代类型码
 *	有一个不可变的类型码,会影响类的行为
 *以类型码的宿主类为基类,针对每种类型码建立相应子类
 *不影响宿主行为，可以采用此方法
 *如果类型码影响宿主类的行为,可以采用多态解决。
 *@author wangchao
 *248
 */
public abstract class Employee {

	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;

	// 1:self Encapsulate Field
	/*	public int getType() {
			return type;
		}*/

	// 2:由于Employee构造函数接受类型码作为一个参数,所以将它替换为工厂函数
	/*static Employee create(int type) {
		return new Employee(type);
	}*/
	// 4:修改工厂函数,返回一个合适对象
	static Employee create(int type) {
		switch (type) {
		case ENGINEER:
			return new Engineer();
		case SALESMAN:
			return new Salesman();
		case MANAGER:
			return new Manager();
		default:
			throw new IllegalArgumentException("Incorrect type code value");
		}
	}

	// 5:getType声明抽象
	abstract int getType();
	// private int type;
	/*	public Employee(int type) {
	this.type = type;
	}*/

}
