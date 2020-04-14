package simpleMethod.AddParameter;

import java.util.Date;

/**
 * 添加参数
 * 某个函数需要调用端获得更多信息
 * 为此函数添加对象参数,让该对象带进函数所需信息
 * <p>
 * Created by Administrator on 2017/5/12.
 */
public class Demo {
    //2：如果是接口一部分,无法安全删除，标记为Deprecated
    @Deprecated
    public Date method() {
        return new Date();
    }//1：添加参数

    public Date method(Date date) {
        return date;
    }
}
