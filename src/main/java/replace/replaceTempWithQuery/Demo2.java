package replace.replaceTempWithQuery;

/**
 */
public class Demo2 {
	int quantity = 10, itemPrice = 20;

	public double price() {
		final int basePrice = quantity * itemPrice;
		final double quantiryDiscount = Math.max(0, quantity - 500) * itemPrice
				* 0.05;
		final double shipping = Math.min(basePrice * 0.1, 100.0);
		return basePrice - quantiryDiscount + shipping;
	}
	/*	public double price() {
			final int basePrice = quantity * itemPrice;
			return basePrice - Math.max(0, quantity - 500) * itemPrice * 0.05
					+ Math.min(basePrice * 0.1, 100.0);
		}*/
	/*	public double price() {
			return quantity * itemPrice - Math.max(0, quantity - 500) * itemPrice
					* 0.05 + Math.min(quantity * itemPrice * 0.1, 100.0);
		}
	*/
}
