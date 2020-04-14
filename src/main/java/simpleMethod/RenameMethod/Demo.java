package simpleMethod.RenameMethod;

/**
 * 函数改名
 * 函数的名称未能说明函数用途
 * 考虑给函数怎样的注释,然后注释变成函数名称
 * Created by Administrator on 2017/5/12.
 */
public class Demo {
    private String officeAreaCode;
    private String officeAreaNumber;

    public String getTelephoneNumber() {
        return "(" + officeAreaCode + ")" + officeAreaNumber;
    }
}
