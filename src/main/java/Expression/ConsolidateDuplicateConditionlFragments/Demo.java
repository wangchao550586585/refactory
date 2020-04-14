package Expression.ConsolidateDuplicateConditionlFragments;

/**
 * 合并重复的条件片段
 * 在条件表达式的每个分支上有着相同的一段代码
 * 将这段重复代码搬移到条件表达式外
 * @author wangchao
 *
 */
public class Demo {
	double total;
	double price;

	private void test() {
		if (isSpecialDeal()) {
			total = price * 0.95;
			// send();
		} else {
			total = price * 0.95;
			// send();
		}
		// 共有代码提取,如果有异常也可以使用finl区段
		send();
	}

	private void send() {

	}

	private boolean isSpecialDeal() {
		return false;
	}
}
