package simpleMethod.ReplaceParameterWithExplicitMethods;

/**
 * 以明确函数取代参数
 * 有一个函数，参数值决定不同行为
 * 针对该参数的每一个可能值,建立一个独立函数
 * Created by Administrator on 2017/5/12.
 */
public class Demo {
    private int width;
    private int height;

    void setValue(String name, int value) {
        if (name.equals("height")) {
            height = value;
            return;
        }
        if (name.equals("width")) {
            width = value;
            return;
        }

    }

    //针对每一个可能值,建立独立函数
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
