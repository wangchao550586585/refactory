package simpleMethod.IntroduceParameterObject;

import java.util.Date;

/**
 * Created by Administrator on 2017/5/13.
 */
public class Code {
    public static void main(String[] args) {
        Account account = new Account();
        Date startDate = new Date();
        Date endDate = new Date();
        double flowBetween = account.getFlowBetween(startDate, endDate);
    }
}
