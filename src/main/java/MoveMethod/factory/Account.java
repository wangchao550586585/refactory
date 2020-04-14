package MoveMethod.factory;

/**
 * 传递变量
 */
public class Account {
	private AccountType type;
	private int daysOverdrawn;

	public double overdraftCharge() {
		return type.overdraftCharge(daysOverdrawn);
	}

	double bankCharge() {
		double result = 4.5;
		if (daysOverdrawn > 0)
			result += type.overdraftCharge(daysOverdrawn);
		return result;
	}

}
