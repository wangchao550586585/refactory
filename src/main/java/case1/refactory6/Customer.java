package case1.refactory6;

import java.util.Enumeration;
import java.util.Vector;

import case1.refactory5.Rental;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 剔除临时变量(总金额,积分)
 * 58
 * @author Administrator
 *
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	private String name;
	private Vector<Rental> rentals = new Vector<Rental>();

	public String Statement() {
		Enumeration<Rental> elements = rentals.elements();
		String result = getName() + "\n";
		while (elements.hasMoreElements()) {
			Rental nextElement = elements.nextElement();

			result += "\t" + nextElement.getMovie().getTitle() + "\t"
					+ String.valueOf(nextElement.getCharge()) + "\n";
		}
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoint());
		return result;
	}

	private int getTotalFrequentRenterPoint() {
		int result = 0;
		Enumeration<Rental> elements = rentals.elements();
		while (elements.hasMoreElements()) {
			Rental nextElement = elements.nextElement();
			result += nextElement.getFrequentRenterPoints();
		}
		return result;
	}

	private double getTotalCharge() {
		double result = 0;
		Enumeration<Rental> elements = rentals.elements();
		while (elements.hasMoreElements()) {
			Rental nextElement = elements.nextElement();
			result += nextElement.getCharge();
		}
		return result;
	}

}
