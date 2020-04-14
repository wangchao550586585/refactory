package replace.replaceMethodWithMethodObject.factory2;

import replace.replaceMethodWithMethodObject.factory.Account;

public class Gamma {
	private final Account account;
	private int inputVal;
	private int quantity;
	private int yearToDate;
	private int importantValue1;
	private int importantValue2;
	private int importantValue3;

	public Gamma(Account account, int inputVal, int quantity, int yearToDate) {
		this.account = account;
		this.inputVal = inputVal;
		this.quantity = quantity;
		this.yearToDate = yearToDate;
	}

	public int compute() {
		importantValue1 = inputVal * quantity + account.delta();
		importantValue2 = inputVal * yearToDate + 100;
		importantThing();
		importantValue3 = importantValue2 * 7;
		return importantValue3 - 2 * importantValue2;
	}

	private void importantThing() {
		if ((yearToDate - importantValue1) > 100)
			importantValue1 -= 20;
	}

}