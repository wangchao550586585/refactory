package simpleMethod.IntroduceParameterObject.Refactory;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Administrator on 2017/5/13.
 */
public class Account {
    private Vector<Entry> entries = new Vector<Entry>();

    double getFlowBetween(DateRange dateRange) {
        double result = 0;
        Enumeration<Entry> elements = entries.elements();
        while (elements.hasMoreElements()) {
            Entry each = elements.nextElement();
            if (dateRange.includes(each.getChargeDate())) {
                result += each.getValue();
            }
        }
        return result;
    }


}
