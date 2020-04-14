package simpleMethod.ReplaceConstructorWithFactoryMethod.refactory;

/**
 * 根据类型码创建对象
 * Created by Administrator on 2017/5/14.
 */
public class Employee {
    private int type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    //3：public改为private
    private Employee(int type) {
        this.type = type;
    }

    //1:根据类型码创建不同对象
    public static Employee create(int type) {
        return new Employee(type);
    }
}

class Demo {
    public static void main(String[] args) {
//        Employee employee = new Employee(Employee.ENGINEER);
        //2:更改构建函数引用点
        Employee employee = Employee.create(Employee.ENGINEER);
    }
}

