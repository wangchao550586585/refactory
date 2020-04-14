package Expression.ConsolidateConditionalExpression;

public class Demo2 {

	double disabilityAmount() {
		if (onVacation())
			if (lengthOfService() > 10)
				return 1;
		return 0.5;
	}

	double disabilityAmount2() {
		if (onVacation() && lengthOfService() > 10)
			return 1;
		else
			return 0.5;
	}

	double disabilityAmount3() {
		return onVacation() && lengthOfService() > 10 ? 1 : 0.5;
	}

	private int lengthOfService() {
		return 0;
	}

	private boolean onVacation() {
		return false;
	}

}
