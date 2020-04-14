package case1.refactory8;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 具体的租金和积分由movie决定，这里只传递租期给他。方便后续的movie类型扩展
 * 
 * @author Administrator
 *
 */
@Setter
@Getter
@NoArgsConstructor
public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	private String title;
	private Price price;

	public Movie(String title, int priceCode) {
		this.title = title;
		// 构造函数不能直接访问价格代码,设值函数代替直接访问
		setPriceCode(priceCode);
	}

	public int getPriceCode() {
		return price.getPriceCode();
	}

	public void setPriceCode(int arg) {
		switch (arg) {
		case REGULAR:
			price = new RegularPrice();
			break;
		case NEW_RELEASE:
			price = new NewReleasePrice();
			break;
		case CHILDRENS:
			price = new ChildrensPrice();
			break;
		default:
			throw new IllegalArgumentException("incorrect price code");
		}
	}

	public int getFrequentRenterPoints(int daysRented) {
		return (getPriceCode() == NEW_RELEASE && daysRented > 1) ? 2 : 1;
	}

	public double getCharge(int daysRented) {
		return price.getCharge(daysRented);
	}

}
