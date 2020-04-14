package simpleMethod.RemoveParameter;

/**
 * 移除参数
 * 函数本体不再需要某个参数
 * 将该参数去掉
 * Created by Administrator on 2017/5/12.
 */
public class Demo {
    @Deprecated
    public void method(String year, String mouth, String day, String hh) {

    }
    //1：去除多余的HH,让用户少费一部分心
    public void method(String year, String mouth, String day) {

    }
}
