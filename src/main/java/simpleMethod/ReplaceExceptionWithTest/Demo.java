package simpleMethod.ReplaceExceptionWithTest;

import com.sun.deploy.security.WrapResource;
import sun.misc.Resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Stack;

/**
 * 以测试取代异常
 * 面对一个调用者可以预先检查的条件,抛出了一个异常
 * 修改调用者,使他在调用函数之前先做检查
 * 异常应该用于异常,罕见的行为,也就是意料之外的错误行为
 * Created by Administrator on 2017/5/14.
 */
public class Demo {

    private double[] values;

    public double getValue(int index) {
        try {
            return values[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return 0;
        }
    }

    public double getValue2(int index) {
        if (index >= values.length) {
            return 0;
        }
        return values[index];
    }

    Stack<InputStream> resources = new Stack<InputStream>();
    Stack<InputStream> allocated = new Stack<InputStream>();

    InputStream getResource() throws FileNotFoundException {

        InputStream resource = null;
        try {
            resource = resources.pop();
            allocated.push(resource);
            return resource;
        } catch (Exception e) {
            resource = new FileInputStream("xxx");
            allocated.push(resource);
            return resource;
        }
    }

    //可用资源用完并不是一种意料之外的事,去掉此异常
    InputStream getResource2() throws FileNotFoundException {
        InputStream resource = null;
        if (resources.isEmpty()) {
            resource = new FileInputStream("xxx");
        } else {
            resource = resources.pop();
        }
        allocated.push(resource);
        return resource;
    }

}
