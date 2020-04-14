package case1.refactory5;

import java.util.Enumeration;
import java.util.Vector;

import case1.prototype.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *  优化积分策略
 * 
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
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration<Rental> elements = rentals.elements();
		String result = getName() + "\n";
		while (elements.hasMoreElements()) {
			Rental nextElement = elements.nextElement();

			// 优化积分策略
			frequentRenterPoints += nextElement.getFrequentRenterPoints();

			result += "\t" + nextElement.getMovie().getTitle() + "\t"
					+ String.valueOf(nextElement.getCharge()) + "\n";
			totalAmount += nextElement.getCharge();
		}
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints);
		return result;
	}

}
