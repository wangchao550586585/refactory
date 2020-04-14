package simpleMethod.RemoveSettingMethod.refactory01;

/**
 * Created by Administrator on 2017/5/14.
 */
public class Refactory {
    private String id;

    public Refactory(String id) {
        //运算简单,又只有一个构造,直接在构造函数中做出相同修改
        initializeId(id);
    }

    //只用于对象构建阶段
    public void initializeId(String arg) {
        id = arg + "arg";
    }

    public String getId() {
        return id;
    }
}
