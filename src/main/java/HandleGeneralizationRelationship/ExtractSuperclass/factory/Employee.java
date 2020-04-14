package HandleGeneralizationRelationship.ExtractSuperclass.factory;

import java.util.Enumeration;
import java.util.Vector;

abstract class Party {
    protected String name;
    protected int annualCost;

    public Party(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getAnnualCost();
}

public class Employee extends Party {
    private String id;

    public String getId() {
        return id;
    }

    public int getAnnualCost() {
        return annualCost;
    }

    public Employee(String name, String id, int annualCost) {
        super(name);
        this.id = id;
        this.annualCost = annualCost;
    }
}

class DepartMent extends Party {
    private Vector<Employee> staff = new Vector<Employee>();

    public DepartMent(String name) {
        super(name);
    }

    public int getHeadCount() {
        return staff.size();
    }

    public void addStaff(Employee arg) {
        staff.addElement(arg);
    }


    public int getAnnualCost() {
        Enumeration<Employee> e = getStaff();
        int result = 0;
        while (e.hasMoreElements()) {
            Employee employee = e.nextElement();
            result += employee.getAnnualCost();
        }
        return result;
    }

    public Enumeration<Employee> getStaff() {
        return staff.elements();
    }
}
