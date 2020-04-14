package MoveField.factory;
public class Account {
	private AccountType type;

	public double interestForAmountDays(double amount, int days) {
		return type.getInterestRate() * amount * days / 365;
	}
}
