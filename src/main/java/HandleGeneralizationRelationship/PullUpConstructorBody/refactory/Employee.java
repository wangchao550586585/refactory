package HandleGeneralizationRelationship.PullUpConstructorBody.refactory;

/**
 * Created by Administrator on 2017/5/15.
 */

public class Employee {
    protected String name;
    protected String id;

}

class Manger extends Employee {
    private int grade;
    public Manger(String name, String id, int grade) {
        super.name = name;
        super.id = id;
        this.grade = grade;
    }

}