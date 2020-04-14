package replace.replaceMethodWithMethodObject.factory;

public class Account {
	int game(int inputVal, int quantity, int yearToDate) {
		return new Gamma(this, inputVal, quantity, yearToDate).compute();
	}
	public int delta() {
		return 0;
	}

}
