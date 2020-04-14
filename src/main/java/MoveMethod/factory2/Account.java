package MoveMethod.factory2;

/**
 * 如果搬移函数调用了account中的另一个函数,这种情况下必须传递对象了
 * 如果目标函数需要太多源类程序,就得进一步重构,通常情况下分解函数,并将一部分移回源类
 */
public class Account {
	private AccountType type;
	private int daysOverdrawn;

	public double overdraftCharge() {
		return type.overdraftCharge(this);
	}

	double bankCharge() {
		double result = 4.5;
		if (daysOverdrawn > 0)
			result += type.overdraftCharge(this);
		return result;
	}

	public int getDaysOverdrawn() {
		return daysOverdrawn;
	}

}
