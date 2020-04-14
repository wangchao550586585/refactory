package simpleMethod.ReplaceConstructorWithFactoryMethod.refactory3;

/**
 * 明确函数创建子类
 * 缺点必须知道子类
 * Created by Administrator on 2017/5/14.
 */
public class Person {
    static Person createMale() {
        return new Male();
    }

    static Person createFemale() {
        return new Female();
    }

}

class Male extends Person {

}

class Female extends Person {

}


