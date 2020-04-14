package MoveMethod.factory;

public class AccountType {
	public double overdraftCharge(int daysOverdrawn) {
		if (isPremium()) {
			double result = 10;
			if (daysOverdrawn > 7)
				result += daysOverdrawn - 7;
			return result;
		}
		return daysOverdrawn * 1.75;
	}

	public boolean isPremium() {
		return false;
	}

}
