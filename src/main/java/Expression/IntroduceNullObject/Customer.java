package Expression.IntroduceNullObject;

/**
 * Created by Administrator on 2017/5/11.
 */
public class Customer {
    String name;
    BillingPlan billingPlan;
    PaymentHistory paymentHistory;

    public String getName() {
        return name;
    }

    public BillingPlan getBillingPlan() {
        return billingPlan;
    }

    public PaymentHistory getPaymentHistory() {
        return paymentHistory;
    }
}
