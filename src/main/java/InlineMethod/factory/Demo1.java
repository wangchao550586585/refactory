package InlineMethod.factory;

/**
 * 内联函数
 * @author Administrator
 *
 */
public class Demo1 {
	private int number;

	public int getRationg() {
		return moreThanFiveLateDeliveries() ? 2 : 1;
	}

	private boolean moreThanFiveLateDeliveries() {
		return number > 5;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
