package simpleMethod.EncapsulateDowncast;

import java.util.ArrayList;
import java.util.List;

/**
 * 封装向下转型
 * 某个函数返回的对象,需要由函数调用者执行向下转型
 * 将向下转型动作移到函数中
 * Created by Administrator on 2017/5/14.
 */
public class Demo {
    private List list = new ArrayList();

   /* public Object getValue(int index) {
        return list.get(index);
    }*/

    //向下转型
    public String getValue(int index) {
        return (String) list.get(index);
    }
}
