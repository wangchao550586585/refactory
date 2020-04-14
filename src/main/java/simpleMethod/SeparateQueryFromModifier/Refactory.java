package simpleMethod.SeparateQueryFromModifier;


/**
 * Created by Administrator on 2017/5/12.
 */
public class Refactory {
    //2:替换return
    //4:修改返回值为void,并直接return结果
    //5:修改函数名字foundMiscrent-->to-->sendAlert
    public void sendAlert(String[] people) {
        /*for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                sendAlert();
                //return foundPerson(people);
                return;
            }
            if (people[i].equals("John")) {
                sendAlert();
                //return foundPerson(people);
                return;
            }
        }*/
        //return foundPerson(people);
        //6:
        if (!foundPerson(people).equals("")) {
            sendAlert();
        }
    }

    //1：建立查询语句
    public String foundPerson(String[] people) {
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

    //3:修改调用者,先调用修改，在调用查询
    public void checkSecurity(String[] people) {
        sendAlert(people);
        String found = foundPerson(people);
        someLatetCode(found);
    }

    private void someLatetCode(String found) {
    }

    private void sendAlert() {

    }
}
