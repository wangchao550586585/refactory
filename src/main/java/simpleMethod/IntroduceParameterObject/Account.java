package simpleMethod.IntroduceParameterObject;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Administrator on 2017/5/13.
 */
public class Account {
    private Vector<Entry> entries = new Vector<Entry>();

    double getFlowBetween(Date start, Date end) {
        double result = 0;
        Enumeration<Entry> elements = entries.elements();
        while (elements.hasMoreElements()) {
            Entry each = elements.nextElement();
            if (each.getChargeDate().equals(start) || each.getChargeDate().equals(end) || each.getChargeDate().after(start) && each.getChargeDate().before(end)) {
                result += each.getValue();
            }
        }
        return result;
    }
}
