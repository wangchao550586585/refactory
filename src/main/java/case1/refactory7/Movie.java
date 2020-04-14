package case1.refactory7;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 具体的租金和积分由movie决定，这里只传递租期给他。方便后续的movie类型扩展
 * @author Administrator
 *
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	private String title;
	private int priceCode;

	public double getCharge(int daysRented) {
		double result = 0;
		switch (getPriceCode()) {
		case REGULAR:
			result += 2;
			if (daysRented > 2) {
				result += (daysRented - 2) * 1.5;
			}
			break;
		case NEW_RELEASE:
			result += daysRented * 3;
			break;
		case CHILDRENS:
			result += 1.5;
			if (daysRented > 3) {
				result += (daysRented - 3) * 1.5;
			}
			break;
		}
		return result;
	}
	public	int getFrequentRenterPoints(int daysRented) {
		return (getPriceCode() == NEW_RELEASE && daysRented> 1) ? 2
				: 1;
	}
}
