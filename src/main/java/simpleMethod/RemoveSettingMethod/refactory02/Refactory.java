package simpleMethod.RemoveSettingMethod.refactory02;

/**
 * Created by Administrator on 2017/5/14.
 */
public class Refactory extends Account {
    private double interestRate;

    public Refactory(String id, double interestRate) {
//   无法再构造函数中直接访问id变量     setId(id);
        //使用超类构造函数
        super(id);
        //不能使用超类构造函数，使用良好命名也可,无法编译
        //initializeId(id);
        this.interestRate = interestRate;
    }


}
