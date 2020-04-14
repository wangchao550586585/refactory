package simpleMethod.ReplaceParameterWithMethods;

/**
 * 函数去掉参数
 * 对象调用某个函数,并将所得结果作为参数,传递给另一个函数,而接受该参数的函数本身也能调用前一个函数
 * 让参数接受者去除该项参数,并直接调用前一个函数
 * Created by Administrator on 2017/5/12.
 */
public class Demo {
    private int quantity;
    private int itemPrice;
    private int discountLevel;

    public void method() {
        int basePrice = quantity * itemPrice;
        discountLevel = getDiscountLevel();
        double finalPrice = discountedPrice(basePrice, discountLevel);

        //重构如下
        discountedPrice(basePrice);
    }

    private double discountedPrice(int basePrice) {
        return basePrice * getDiscountLevel();
    }

    private double discountedPrice(int basePrice, int discountLevel) {
        return basePrice * discountLevel;
    }

    private int getDiscountLevel() {
        return 0;
    }
}
