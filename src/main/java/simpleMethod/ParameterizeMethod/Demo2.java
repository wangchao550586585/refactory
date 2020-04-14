package simpleMethod.ParameterizeMethod;

/**
 * Created by Administrator on 2017/5/12.
 */
public class Demo2 {
    protected Dollars baseCharge() {
        double result = Math.min(lastUsage(), 100) * 0.03;
        if (lastUsage() > 100) result += (Math.min(lastUsage(), 200) - 100) * 0.05;
        if (lastUsage() > 200) result += (Math.min(lastUsage(), 200) - 200) * 0.07;
        return new Dollars(result);
    }

    //重构代码如下:
    protected Dollars refactoryBaseCharge() {
        double result = Math.min(lastUsage(), 100) * 0.03;
        result += usageInRange(100, 200) * 0.05;
        result += usageInRange(200, Integer.MAX_VALUE) * 0.07;
        return new Dollars(result);
    }

    protected int usageInRange(int start, int end) {
        if (lastUsage() > start)
            return (Math.min(lastUsage(), end) - start);
        return 0;
    }


    private int lastUsage() {
        return 0;
    }
}

class Dollars {

    public Dollars(double result) {
    }
}
