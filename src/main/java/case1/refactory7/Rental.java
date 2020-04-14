package case1.refactory7;

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
		return movie.getCharge(daysRented);
	}

	int getFrequentRenterPoints() {
		return movie.getFrequentRenterPoints(daysRented);
	}
}
