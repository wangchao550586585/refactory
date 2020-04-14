package MoveMethod;

/**
 * 搬移函数 
 * 程序中,有个函数过多与另一个类交流,调用后者,或者相反
 * 在该函数最常引用的类中建立一个类似行为函数,让旧函数委托或者移除
 * 
 * @author Administrator
 *
 */
public class Account {
	private AccountType type;
	private int daysOverdrawn;

	public double overdraftCharge() {
		if (type.isPremium()) {
			double result = 10;
			if (daysOverdrawn > 7)
				result += daysOverdrawn - 7;
			return result;
		}
		return daysOverdrawn * 1.75;
	}

	double bankCharge() {
		double result = 4.5;

		if (daysOverdrawn > 0)
			result += overdraftCharge();
		return result;
	}

}
