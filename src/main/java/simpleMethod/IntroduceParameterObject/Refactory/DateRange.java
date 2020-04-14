package simpleMethod.IntroduceParameterObject.Refactory;

import java.util.Date;

/**
 * Created by Administrator on 2017/5/13.
 */
public class DateRange {
    //声明常亮，构造赋值，不能被修改
    private final Date start;
    private final Date end;

    public DateRange(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    public boolean includes(Date date) {
        return date.equals(start) || date.equals(end) || date.after(start) && date.before(end);
    }
}
