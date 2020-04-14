package HandleGeneralizationRelationship.ReplaceDelegationWithInheritance.refactory;


/**
 * 以继承取代委托
 * 2个类之间使用委托,并经常为整个接口编写许多简单委托函数
 * 继承
 * Created by Administrator on 2017/5/17.
 */
public class Employee extends  Person{
    @Override
    public String toString() {
        return "EMP"+ getLastName();
    }
}

class Person{
    private String name;
    private String lastName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}