package HandleGeneralizationRelationship.PullUpConstructorBody.refactory;

/**
 * Created by Administrator on 2017/5/15.
 */
public class EmployeeRefactor {
    protected String name;
    protected String id;

    //建立父类构造
    protected EmployeeRefactor(String name, String id) {
        this.name = name;
        this.id = id;
    }
}

class MangerRefactory extends EmployeeRefactor {
    private int grade;
    //调用父类构造
    public MangerRefactory(String name, String id, int grade) {
        super(name, id);
        this.grade = grade;
    }

}
