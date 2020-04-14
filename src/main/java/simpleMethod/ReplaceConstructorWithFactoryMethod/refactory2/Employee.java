package simpleMethod.ReplaceConstructorWithFactoryMethod.refactory2;

/**
 * 根据字符串创建对象
 * Created by Administrator on 2017/5/14.
 */
public class Employee {
    private int type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    //1:将子类对用户隐藏起来
   /* public static Employee create(int type) throws IllegalAccessException {
        switch (type) {
            case ENGINEER:
                return new Enginner();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw  new IllegalAccessException("Incorrect type code value");
        }
    }*/
    //2:改为动态创建对象
/*    public static Employee create(int type) throws IllegalAccessException {
        switch (type) {
            case ENGINEER:
                return create("ENGINEER")
            case SALESMAN:
                return create("Salesman")
            case MANAGER:
                return create("Manager")
            default:
                throw  new IllegalAccessException("Incorrect type code value");
        }
    }*/

//3：直接使用，缺点，编译时期无法保证安全，用户知道类名,使用字符串提前暴露类名
    public static Employee create(String name) {
        try {
            return (Employee) Class.forName(name).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

class Enginner extends Employee {


}

class Salesman extends Employee {


}

class Manager extends Employee {


}
