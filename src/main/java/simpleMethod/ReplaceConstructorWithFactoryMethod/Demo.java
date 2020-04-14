package simpleMethod.ReplaceConstructorWithFactoryMethod;


/**
 * 以工厂函数取代构造函数
 * 创建对象时不仅仅做简单的建构工作
 * 构造函数只能返回单一类型的对象,工厂函数解决这个问题
 * 工厂函数可以根据参数个数和类型,选择不同创建行为
 * Created by Administrator on 2017/5/14.
 */
public class Demo {
    private String type;

    public Demo(String type) {
        this.type = type;
    }

    static Demo create(String type) {
        return new Demo(type);
    }
}
