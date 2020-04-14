package case1.refactory3;

import java.util.Enumeration;
import java.util.Vector;

import case1.prototype.Movie;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 方法名和返回结果规范化
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
			double thisAmount = 0;
			Rental nextElement = elements.nextElement();
			thisAmount = amountFor(nextElement);
			frequentRenterPoints++;
			if (nextElement.getMovie().getPriceCode() == Movie.NEW_RELEASE
					&& nextElement.getDaysRented() > 1)
				frequentRenterPoints++;
			result += "\t" + nextElement.getMovie().getTitle() + "\t"
					+ String.valueOf(thisAmount) + "\n";
			totalAmount += thisAmount;
		}
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints);
		return result;
	}

	public double amountFor(Rental rental) {
		return rental.getCharge();
	}
}
