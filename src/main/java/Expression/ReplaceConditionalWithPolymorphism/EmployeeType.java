package Expression.ReplaceConditionalWithPolymorphism;

public abstract class EmployeeType {
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;

	abstract int getType();

	public static EmployeeType newType(int arg) {

		switch (arg) {
		case ENGINEER:
			return new Engineer();
		case SALESMAN:
			return new Salesman();
		case MANAGER:
			return new Manager();
		default:
			throw new RuntimeException("Incorrect Employee");
		}
	}

	/*int payAmount(Employee employee) {
		switch (getType()) {
			case EmployeeType.ENGINEER:
				//3：检查子类是否正常工作
				throw new RuntimeException("should be being overridden");
			case EmployeeType.SALESMAN:
				throw new RuntimeException("should be being overridden");
			case EmployeeType.MANAGER:
				throw new RuntimeException("should be being overridden");
			default:
				throw new RuntimeException("Incorrect Employee");
		}
	}*/
	//4:声明payAmount为abstract
	abstract int payAmount(Employee employee);
}

class Salesman extends EmployeeType {

	@Override
	int getType() {
		return SALESMAN;
	}
	int payAmount(Employee employee){
		return employee.getMonthlySalary() + employee.getCommission();
	}
}

class Manager extends EmployeeType {

	@Override
	int getType() {
		return MANAGER;
	}
	int payAmount(Employee employee){
		return employee.getMonthlySalary() + employee.getBonus();
	}
}

class Engineer extends EmployeeType {

	@Override
	int getType() {
		return ENGINEER;
	}
	//2：覆写
	int payAmount(Employee employee) {
		return employee.getMonthlySalary();
	}
}