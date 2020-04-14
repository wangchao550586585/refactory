package Expression.ConsolidateConditionalExpression;

/**
 * 合并条件表达式
 * 有一系列条件测试,都能得到相同结果
 * 将这些测试合并为一个条件表达式,并将条件表达式提炼为一个函数
 * @author wangchao
 *
 */
public class Demo {
	int senionrity;
	int monthsDisabled;
	boolean isPartTime;

	/*double disabilityAmount() {
		if (senionrity < 2)
			return 0;
		if (monthsDisabled < 22)
			return 0;
		if (isPartTime)
			return 0;
		return 1;
	}*/

	double disabilityAmount() {
		if (isNotEligableForDisability())
			return 0;
		return 1;
	}

	private boolean isNotEligableForDisability() {
		return senionrity < 2 || monthsDisabled < 22 || isPartTime;
	}

}
