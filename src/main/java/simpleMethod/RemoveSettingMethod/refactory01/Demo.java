package simpleMethod.RemoveSettingMethod.refactory01;

/**
 * Created by Administrator on 2017/5/14.
 */
public class Demo {
    private String id;

    public Demo(String id) {
        setId(id);
    }

    public void setId(String id) {
        this.id = id+"arg";
    }

    public String getId() {
        return id;
    }
}
