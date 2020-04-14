package simpleMethod.RenameMethod;

/**
 * Created by Administrator on 2017/5/12.
 */
public class Refactory {
    private String officeAreaCode;
    private String officeAreaNumber;

    //3:如果旧函数调用者不多,直接修改调用者,令他们调用新函数
    public String getTelephoneNumber() {
        //2:旧函数调用新函数
        return getOfficeAreaNumber();
    }
    //1:建立新函数
    public String getOfficeAreaNumber(){
        return "(" + officeAreaCode + ")" + officeAreaNumber;
    }
}
