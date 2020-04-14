package HandleGeneralizationRelationship.ReplaceInheritanceWithDelegation;

import java.util.Vector;

/**
 * 委托取代继承
 * 某个子类只使用超类接口中的一部分,或是根本不需要继承而来的数据
 * 子类新建一个字段保存超类,调整子类函数,令它修改为委托超类,去掉2者继承关系
 * Created by Administrator on 2017/5/17.
 */
public class MyStack extends Vector {
    public void push(Object element) {
        insertElementAt(element, 0);
    }

    public Object pop() {
        Object firstElement = firstElement();
        removeElementAt(0);
        return firstElement;
    }
}
