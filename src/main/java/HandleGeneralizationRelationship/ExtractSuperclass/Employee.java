package HandleGeneralizationRelationship.ExtractSuperclass;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 提炼超类
 * 2个类具有相似特性
 * 为2类建立超类,提取相同特性
 * Created by Administrator on 2017/5/16.
 */
public class Employee {
    private String name;
    private String id;
    private int annualCost;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAnnualCost() {
        return annualCost;
    }

    public Employee(String name, String id, int annualCost) {
        this.name = name;
        this.id = id;
        this.annualCost = annualCost;
    }
}

class DepartMent {
    private String name;
    private Vector<Employee> staff = new Vector<Employee>();

    public DepartMent(String name) {
        this.name = name;
    }
    public int getHeadCount(){
        return staff.size();
    }
    public void addStaff(Employee arg){
        staff.addElement(arg);
    }


    public int getTotalAnnualCost() {
        Enumeration<Employee> e = getStaff();
        int result = 0;
        while (e.hasMoreElements()) {
            Employee employee = e.nextElement();
            result += employee.getAnnualCost();
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public Enumeration<Employee> getStaff() {
        return staff.elements();
    }
}
