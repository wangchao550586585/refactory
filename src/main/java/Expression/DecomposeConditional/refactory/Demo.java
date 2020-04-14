package Expression.DecomposeConditional.refactory;

import java.util.Date;

public class Demo {
	private int charge;
	private int winterReate;
	private int winterServiceCharge;
	private int summerReate;
	private Date date;
	private Date SUMMER_START;
	private Date SUMMER_END;

	public void price(int quantity) {
		if (notSummer()) {
			charge = winterCharge(quantity);
		} else {
			charge = summerCharge(quantity);
		}
	}

	private boolean notSummer() {
		return date.before(SUMMER_START) || date.after(SUMMER_END);
	}

	private int summerCharge(int quantity) {
		return quantity * summerReate;
	}

	public int winterCharge(int quantity) {

		return quantity * winterReate + winterServiceCharge;
	}
}
