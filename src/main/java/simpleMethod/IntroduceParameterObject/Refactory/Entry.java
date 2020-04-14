package simpleMethod.IntroduceParameterObject.Refactory;

import java.util.Date;

/**
 * 引入参数对象
 * 某些参数总是很自然同时出现
 * 以一个对象取代这些参数
 * Created by Administrator on 2017/5/13.
 */
public class Entry {
    private double value;
    private Date chargeDate;

    void Entry(double value, Date chargeDate) {
        this.value = value;
        this.chargeDate = chargeDate;
    }

    public double getValue() {
        return value;
    }

    public Date getChargeDate() {
        return chargeDate;
    }
}
