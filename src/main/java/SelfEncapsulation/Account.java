package SelfEncapsulation;

/*
 * 自我封装
 * 这样在moveField时只需要修改访问函数即可
 */
public class Account {
	private AccountType type;
	private double interestRate;

	public double interestForAmountDays(double amount, int days) {
		return getInterestRate() * amount * days / 365;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

}
