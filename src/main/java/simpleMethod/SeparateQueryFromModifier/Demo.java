package simpleMethod.SeparateQueryFromModifier;

/**
 * 将查询函数和修改函数分离
 * 某个函数既返回对象状态值,有修改对象状态
 * 建立2个不同函数,一个负责查询,一个负责修改
 * Created by Administrator on 2017/5/12.
 */
public class Demo {
    public String foundMiscrent(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                sendAlert();
                return "Don";
            }
            if (people[i].equals("John")) {
                sendAlert();
                return "John";
            }
        }
        return "";
    }

    public void checkSecurity(String[] people) {
        String found = foundMiscrent(people);
        someLatetCode(found);
    }

    private void someLatetCode(String found) {
    }

    private void sendAlert() {

    }


}
