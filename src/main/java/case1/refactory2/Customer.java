package case1.refactory2;

import java.util.Enumeration;
import java.util.Vector;

import case1.prototype.Movie;
import case1.prototype.Rental;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 方法名和返回结果规范化
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

	private double amountFor(Rental rental) {
		double result = 0;
		switch (rental.getMovie().getPriceCode()) {
		case Movie.REGULAR:
			result += 2;
			if (rental.getDaysRented() > 2) {
				result += (rental.getDaysRented() - 2) * 1.5;
			}
			break;
		case Movie.NEW_RELEASE:
			result += rental.getDaysRented() * 3;
			break;
		case Movie.CHILDRENS:
			result += 1.5;
			if (rental.getDaysRented() > 3) {
				result += (rental.getDaysRented() - 3) * 1.5;
			}
			break;
		}
		return result;
	}
}
