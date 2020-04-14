package HandleGeneralizationRelationship.ExtractSubclass;


/**
 * 提炼子类
 * 类中某些特性只被某些实例用到
 * 新建子类,将上述部分移到子类355
 * Created by Administrator on 2017/5/15.
 */
public class JobItem {
    int unitPrice,quantity;
    Employee employee;
    boolean isLabor;

    public JobItem(int unitPrice, int quantity, Employee employee, boolean isLabor) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.employee = employee;
        this.isLabor = isLabor;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public boolean isLabor() {
        return isLabor;
    }

    public void setLabor(boolean labor) {
        isLabor = labor;
    }
}
class Employee{
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
