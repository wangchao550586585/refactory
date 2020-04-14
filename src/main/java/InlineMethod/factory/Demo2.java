package InlineMethod.factory;

/**
 * 找出有用的间接层,无用间接层剔除
 */
public class Demo2 {
	private int number;

	public int getRationg() {
		return number > 5 ? 2 : 1;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
