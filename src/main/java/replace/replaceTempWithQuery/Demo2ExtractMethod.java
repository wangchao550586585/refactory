package replace.replaceTempWithQuery;

/**
 * 针对demo2使用extract
 * 在花费时间较大时采用demo2
 */
public class Demo2ExtractMethod {
	int quantity = 10, itemPrice = 20;

	public double price() {
		return basePrice() - quantiryDiscount() + shipping();
	}

	private double shipping() {
		return Math.min(basePrice() * 0.1, 100.0);
	}

	private double quantiryDiscount() {
		return Math.max(0, quantity - 500) * itemPrice * 0.05;
	}

	private int basePrice() {
		return quantity * itemPrice;
	}
}
