package simpleMethod.ReplaceParameterWithMethods.refactory;

/**
 * Created by Administrator on 2017/5/13.
 */
public class Refactory {
    private int quantity;
    private int itemPrice;

    public double getPrice() {
        if (getDiscountLevel() == 2) {
            return getBasePrice() * 0.1;
        } else {
            return getBasePrice() * 0.05;
        }
    }


    private int getBasePrice() {
        return quantity * itemPrice;
    }

    private int getDiscountLevel() {
        if (quantity > 100) {
            return 2;
        } else {
            return 1;
        }
    }


}
