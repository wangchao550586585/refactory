package ExtractMethod.factory1;

/*
 * 将这段代码放入独立函数中,并让函数名解释函数用途
 * 粒度更小,方便复用和覆盖,强化代码清晰度
 */
public class Demo2 {
	void printOwint(double amount) {
		printDetails(amount);
	}

	private void printDetails(double amount) {
		System.out.println("name");
		System.out.println("amount" + amount);
	}
}
