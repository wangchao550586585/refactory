package HandleGeneralizationRelationship.ExtractInterface;

import HandleGeneralizationRelationship.ExtractSuperclass.factory.Employee;

/**
 * 提炼接口
 * 若干客户使用类接口中的同一个子集,或者2个类的接口有部分相同
 * 相同子集提炼到一个独立接口中
 * 针对需要对外提供的功能单独提取一个接口,强调我只需要这部分功能
 * Created by Administrator on 2017/5/16.
 */
public class TimeSheet implements Billbale {
    public double charge(Employee emp, int days) {
        return emp.getAnnualCost() * days;
    }

}

//方便其他类实现
interface Billbale {
    double charge(Employee emp, int days);
}

