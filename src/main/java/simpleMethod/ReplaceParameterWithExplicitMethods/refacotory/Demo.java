package simpleMethod.ReplaceParameterWithExplicitMethods.refacotory;

import replace.ReplaceTypeCodeWithSubclasses.Employee;
import replace.ReplaceTypeCodeWithSubclasses.Engineer;
import replace.ReplaceTypeCodeWithSubclasses.Manager;
import replace.ReplaceTypeCodeWithSubclasses.Salesman;

/**
 * Created by Administrator on 2017/5/12.
 */
public class Demo {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    static Employee create(int type) throws IllegalAccessException {
        switch (type) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalAccessException("increct");
        }
    }

    //1：针对每个子类建立子类工厂函数
    //2：修改根据类型创建对象
    //3：更改调用端,删除本函数以及类型常量
    static Employee refactoryCreate(int type) throws IllegalAccessException {
        switch (type) {
            case ENGINEER:
                return Demo.createEngineer();
            case SALESMAN:
                return Demo.createSalesman();
            case MANAGER:
                return Demo.createManager();
            default:
                throw new IllegalAccessException("increct");
        }
    }
    static Employee createEngineer() {
        return new Engineer();
    }

    static Employee createSalesman() {
        return new Salesman();
    }

    static Employee createManager() {
        return new Manager();
    }
}
