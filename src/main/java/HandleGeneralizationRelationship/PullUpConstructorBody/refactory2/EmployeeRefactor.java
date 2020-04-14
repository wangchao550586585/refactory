package HandleGeneralizationRelationship.PullUpConstructorBody.refactory2;

/**
 * extractMethod/pullUpMethod
 * Created by Administrator on 2017/5/15.
 */
public abstract class EmployeeRefactor {
    protected String name;
    protected String id;

    protected EmployeeRefactor(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void init() {
        if (isPriviliged()) assignCar();
    }

    abstract boolean isPriviliged();

    abstract void assignCar();


}

class MangerRefactory extends EmployeeRefactor {
    private int grade;

    public MangerRefactory(String name, String id, int grade) {
        super(name, id);
        this.grade = grade;
    }

    boolean isPriviliged() {
        return grade > 4;
    }

    void assignCar() {
    }
}
