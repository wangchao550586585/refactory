package case1.refactory4;

import java.util.Enumeration;
import java.util.Vector;

import case1.prototype.Movie;
import case1.refactory3.Rental;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 剔除本类方法引用
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
			//
			thisAmount = nextElement.getCharge();
			//
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
}
