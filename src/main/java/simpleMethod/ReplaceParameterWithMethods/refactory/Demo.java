package simpleMethod.ReplaceParameterWithMethods.refactory;

/**
 * Created by Administrator on 2017/5/12.
 */
public class Demo {
    private int quantity;
    private int itemPrice;

    public double getPrice() {
        int basePrice = quantity * itemPrice;
        int discountLevel;
        if (quantity > 100) {
            discountLevel = 2;
        } else {
            discountLevel = 1;
        }
        double finalPrice = discountPrice(basePrice, discountLevel);
        return finalPrice;
    }

    private double discountPrice(int basePrice, int discountLevel) {
        if (discountLevel == 2) {
            return basePrice * 0.1;
        } else {
            return basePrice * 0.05;
        }
    }
}
