package SelfEncapsulation.factory;

/*
 * 自我封装
 * 修改访问函数即可
 */
public class Account {
	private AccountType type;

	public double interestForAmountDays(double amount, int days) {
		return getInterestRate() * amount * days / 365;
	}

	public double getInterestRate() {
		return type.getInterestRate();
	}

	public void setInterestRate(double interestRate) {
		type.setInterestRate(interestRate);
	}

}
