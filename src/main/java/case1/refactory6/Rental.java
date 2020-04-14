package case1.refactory6;

import case1.prototype.Movie;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 函数应该放在它所使用的数据的所属对象内
 * 
 * @author Administrator
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rental {
	private Movie movie;
	private int daysRented;

	public double getCharge() {
		double result = 0;
		switch (getMovie().getPriceCode()) {
		case Movie.REGULAR:
			result += 2;
			if (getDaysRented() > 2) {
				result += (getDaysRented() - 2) * 1.5;
			}
			break;
		case Movie.NEW_RELEASE:
			result += getDaysRented() * 3;
			break;
		case Movie.CHILDRENS:
			result += 1.5;
			if (getDaysRented() > 3) {
				result += (getDaysRented() - 3) * 1.5;
			}
			break;
		}
		return result;
	}

	int getFrequentRenterPoints() {
		return (getMovie().getPriceCode() == Movie.NEW_RELEASE && getDaysRented() > 1) ? 2
				: 1;
	}
}
