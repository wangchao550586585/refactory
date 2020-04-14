package simpleMethod.RemoveSettingMethod.refactory;

/**
 * 移除设值函数
 * 类中某个字段应该在对象创建时设值，然后就不能再改变
 * 去掉该函数的所有设值函数
 * 不希望在对象创建后此字段还有机会修改值,不要提供设置函数,同时将该字段设置final
 * Created by Administrator on 2017/5/13.
 * 326
 */
public class Refactory {
    //1:final,并remve设值函数
    private final String id;

    public String getId() {
        return id;
    }


    public Refactory(String id) {
        this.id = id;
    }
}
