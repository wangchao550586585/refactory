package replace.ReplaceTypeCodeWithStateORStrategy;

/**
 *以state/strategy取代类型码
 *有一个类型码,会影响类的行为,无法通过继承消除它
 *类型码的值在对象生命周期中发生变化,或无法继承宿主类,可以使用本重构
 * @author wangchao
 *
 */
public class Employee {
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;
	private int type;

	public Employee(int type) {
		this.type = type;
	}

	int payAmount() {
		switch (type) {
		case ENGINEER:
			return monthlySalary;
		case SALESMAN:
			return monthlySalary + commission;
		case MANAGER:
			return monthlySalary + bonus;
		default:
			throw new RuntimeException("Incorrect Employee");
		}
	}

	private int monthlySalary;
	private int commission;
	private int bonus;
}
