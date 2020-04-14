package HandleGeneralizationRelationship.PullUpConstructorBody.refactory2;

/**
 * Created by Administrator on 2017/5/15.
 */
public class Employee {
    protected String name;
    protected String id;

    protected Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    boolean isPriviliged() {
        return false;
    }

    void assignCar() {

    }
}

class Manger extends Employee {
    private int grade;

    public Manger(String name, String id, int grade) {
        super(name, id);
        this.grade = grade;
        if (isPriviliged()) assignCar();
    }

    @Override
    boolean isPriviliged() {
        return grade > 4;
    }
}
