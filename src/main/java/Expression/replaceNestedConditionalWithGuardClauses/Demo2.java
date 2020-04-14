package Expression.replaceNestedConditionalWithGuardClauses;

/**将条件反转
 * @author wangchao
 *
 */
public class Demo2 {
	private static final double ADJ_FACTOR = 0;
	double capital;
	double intRate;
	double duration;
	double income;

	public double getAdjustedCapital4() {
		double result = 0.0;
		if (capital <= 0.0)
			return result;
		if (intRate <= 0.0 || duration <= 0.0)
			return result;
		return (income / duration) / ADJ_FACTOR;
	}

	public double getAdjustedCapital3() {
		double result = 0.0;
		if (capital <= 0.0)
			return result;
		if (!(intRate > 0.0 && duration > 0.0))
			return result;
		result = (income / duration) / ADJ_FACTOR;
		return result;
	}

	public double getAdjustedCapital2() {
		double result = 0.0;
		if (capital <= 0.0)
			return result;
		if (intRate > 0.0 && duration > 0.0)
			result = (income / duration) / ADJ_FACTOR;
		return result;
	}

	public double getAdjustedCapital() {
		double result = 0.0;
		if (capital > 0.0) {
			if (intRate > 0.0 && duration > 0.0) {
				result = (income / duration) / ADJ_FACTOR;
			}
		}
		return result;
	}

}
