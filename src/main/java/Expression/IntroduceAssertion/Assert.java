package Expression.IntroduceAssertion;

/**
 * Created by Administrator on 2017/5/11.
 */
public class Assert {
    public static final boolean ON =false ;

    public static void isTrue(boolean b) {
        if(!b)throw new RuntimeException("exception");
    }

    public static void isTrue(String sufficient, boolean b) {
        if(!b)throw new RuntimeException(sufficient);
    }
}
