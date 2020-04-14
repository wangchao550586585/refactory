package Expression.ReplaceConditionalWithPolymorphism;
public class Employee {
	private EmployeeType type;

	// 1: self encapsulate Field
	public int getType() {
		return type.getType();
	}

	public void setType(int code) {
		type = EmployeeType.newType(code);
	}

	//委托给EmployeeType
	int payAmount() {
	return type.payAmount(this);
	}

	private int monthlySalary;
	private int commission;
	private int bonus;

	public int getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}
