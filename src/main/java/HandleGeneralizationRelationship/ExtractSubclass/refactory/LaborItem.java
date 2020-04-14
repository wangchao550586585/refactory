package HandleGeneralizationRelationship.ExtractSubclass.refactory;

/**
 * Created by Administrator on 2017/5/16.
 */
//1：建立JobItem子类
public class LaborItem extends JobItem {
    //6:修改子类构造
    public LaborItem(int quantity, Employee employee) {
        //8.2:更改构造
        //super(0, quantity,employee, true);
        super(0, quantity, true);
        //7.1:声明子类才会被初始化
        super.employee=employee;
    }
    /*public LaborItem(int unitPrice, int quantity, Employee employee, boolean isLabor) {
        super(unitPrice, quantity, employee, isLabor);
    }*/
    //9.2:封装返回
    public boolean isLabor() {
        return true;
    }

    //10.1
    public int getUnitPrice() {
        return employee.getRate();
    }
}

class Test {
    public static void main(String[] args) {
        Employee employee = new Employee(5);
        //JobItem jobItem = new JobItem(0, 5, , true, employee);
        //2：更改为子类引用
        //JobItem laborItem = new LaborItem(0,5,employee,true);
        //5:更改调用
        JobItem jobItem = new LaborItem(0,employee);

    }

}
//11:可根据unitPrice提取出PartsItem类，完成后声明JobItem为abstract
abstract class JobItem {
    int unitPrice, quantity;
   //7:下移它，所以声明protected
    protected Employee employee;
    //9:为函数内在信息，可以移除，先封装返回
    boolean isLabor;

    //3:更改为protected
   /* protected JobItem(int unitPrice, int quantity, Employee employee, boolean isLabor) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.employee = employee;
        this.isLabor = isLabor;
    } */
   //8:更改构造,便于employee在子类初始化
    protected JobItem(int unitPrice, int quantity,  boolean isLabor) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.isLabor = isLabor;
    }
    //4:建立构造
    public JobItem(int unitPrice, int quantity) {
     /* this(unitPrice,quantity,null,false);*/
     //8.1:更改构造
        this(unitPrice,quantity,false);
    }
    //10:重构如下
 /*   public int getUnitPrice() {
        return isLabor?employee.getRate():unitPrice;
    }*/
    public int getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public Employee getEmployee() {
        return employee;
    }

    //9.1:封装返回
    public boolean isLabor() {
        return false;
    }

   /* public void setLabor(boolean labor) {
        isLabor = labor;
    }*/
}

class Employee {
    private int rate;

    public Employee(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
