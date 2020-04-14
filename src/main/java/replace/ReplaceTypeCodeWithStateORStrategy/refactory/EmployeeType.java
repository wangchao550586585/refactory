package replace.ReplaceTypeCodeWithStateORStrategy.refactory;

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
}

class Salesman extends EmployeeType {

	@Override
	int getType() {
		return SALESMAN;
	}

}

class Manager extends EmployeeType {

	@Override
	int getType() {
		return MANAGER;
	}

}

class Engineer extends EmployeeType {

	@Override
	int getType() {
		return ENGINEER;
	}

}