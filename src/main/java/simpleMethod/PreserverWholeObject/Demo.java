package simpleMethod.PreserverWholeObject;

import java.util.Calendar;

/**
 * 保持对象完整
 * 从某个对象中取出若干值,将他们作为某一次函数调用时的参数
 * 改为传递整个对象
 * Created by Administrator on 2017/5/12.
 */
public class Demo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int monday = calendar.get(Calendar.MONDAY);
        print(year, monday);
        //重构为
        print(calendar);
    }

    private static void print(Calendar calendar) {
        System.out.println(calendar.get(Calendar.YEAR) + " " + calendar.get(Calendar.MONDAY));

    }

    private static void print(int year, int monday) {
        System.out.println(year + " " + monday);
    }
}
