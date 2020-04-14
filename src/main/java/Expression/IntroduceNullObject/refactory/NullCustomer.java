package Expression.IntroduceNullObject.refactory;

import Expression.IntroduceNullObject.BillingPlan;

public class NullCustomer extends Customer implements  Null{
    String name;
    PaymentHistory paymentHistory;
    BillingPlan billingPlan;

    //3.1：获取默认结果
    public String getName() {
        return "occupant";
    }

    public PaymentHistory getPaymentHistory() {
        return PaymentHistory.newNull();
    }

    public BillingPlan getBillingPlan() {
        return  BillingPlan.basic();
    }

    public boolean isNull() {
        return true;
    }
}

class Customer implements Nullable {
    String name;
    PaymentHistory paymentHistory;
    BillingPlan billingPlan;

    protected Customer() {
    }

    static Customer newNull() {
        return new NullCustomer();
    }

    public boolean isNull() {
        return false;
    }

    public String getName() {
        return name;
    }

    public PaymentHistory getPaymentHistory() {
        return paymentHistory;
    }

    public BillingPlan getBillingPlan() {
        return billingPlan;
    }
}

