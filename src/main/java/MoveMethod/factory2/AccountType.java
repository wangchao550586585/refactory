package MoveMethod.factory2;

public class AccountType {
	public double overdraftCharge(Account account) {
		if (isPremium()) {
			double result = 10;
			if (account.getDaysOverdrawn() > 7)
				result += account.getDaysOverdrawn() - 7;
			return result;
		}
		return account.getDaysOverdrawn() * 1.75;
	}

	public boolean isPremium() {
		return false;
	}

}
