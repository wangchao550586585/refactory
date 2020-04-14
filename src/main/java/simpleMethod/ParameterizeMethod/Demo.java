package simpleMethod.ParameterizeMethod;

/**
 * 令函数携带参数
 * 若干函数做了类似工作，但函数本体包含不同值
 * 建立单一函数,以参数表示那些不同值
 * Created by Administrator on 2017/5/12.
 */
public class Demo {
    private double salary;

    void tenPercentRaise() {
        salary *= 1.1;
    }

    void fivePercentRaise() {
        salary *= 1.05;
    }

    //替换为
    void raise(double factor) {
        salary *= (1 + factor);
    }
}
