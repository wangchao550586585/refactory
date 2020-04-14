package replace.ReplaceTypeCodeWithStateORStrategy.refactory;

public class Employee {

	private EmployeeType type;

	// 1: self encapsulate Field
	public int getType() {
		return type.getType();
	}

	public void setType(int code) {
		type = EmployeeType.newType(code);
	}

	int payAmount() {
		switch (getType()) {
		case EmployeeType.ENGINEER:
			return monthlySalary;
		case EmployeeType.SALESMAN:
			return monthlySalary + commission;
		case EmployeeType.MANAGER:
			return monthlySalary + bonus;
		default:
			throw new RuntimeException("Incorrect Employee");
		}
	}

	private int monthlySalary;
	private int commission;
	private int bonus;
}
