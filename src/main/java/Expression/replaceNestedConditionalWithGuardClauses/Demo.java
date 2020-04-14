package Expression.replaceNestedConditionalWithGuardClauses;

/**
 * 以卫语句替代嵌套条件表达式
 * 条件表达式过多难以看清正常执行路径
 * 使用卫语句表现所有特殊状态
 * 
 * @author wangchao
 *
 */
public class Demo {
	boolean isDead;
	boolean isSeparated;
	boolean isRetired;

	public double getPayAmount() {
		double result;
		if (isDead)
			result = deadAmount();
		else {
			if (isSeparated) {
				result = separatedAmount();
			} else {
				if (isRetired)
					result = retiredAmount();
				else
					result = normalPayAMount();
			}
		}
		return result;
	}

	public double getPayAmount1() {
		if (isDead)
			return deadAmount();
		if (isSeparated)
			return separatedAmount();
		if (isRetired)
			return retiredAmount();
		return normalPayAMount();
	}

	private double normalPayAMount() {

		return 0;
	}

	private double retiredAmount() {

		return 0;
	}

	private double separatedAmount() {

		return 0;
	}

	private double deadAmount() {

		return 0;
	}
}
