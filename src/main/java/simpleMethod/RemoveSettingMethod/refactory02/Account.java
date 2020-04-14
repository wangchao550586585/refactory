package simpleMethod.RemoveSettingMethod.refactory02;

/**
 * Created by Administrator on 2017/5/14.
 */
public class Account {
    private String id;

    public Account(String id) {
        setId(id);
    }

    public void setId(String id) {
        this.id = id+"arg";
    }

    public String getId() {
        return id;
    }

}
