package Expression.IntroduceNullObject;

/**
 * 引入null对象
 * 需要检查对象是否为null
 * 将null替换为对象
 * 空对象一定是一个常量,单例模式实现即可
 * 浮点数的NaN也是一种表现
 * Created by Administrator on 2017/5/11.
 */
public class Demo {
    public static void main(String[] args) {
        Site site = new Site();
        Customer customer = site.getCustomer();
        BillingPlan plan;
        if (customer == null) {
            plan = BillingPlan.basic();
        } else
            plan = customer.getBillingPlan();
        String customerName;
        if (customer == null) {
            customerName = "occupant";
        } else {
            customerName = customer.getName();
        }
        int weeksDelinquent;
        if (customer == null) {
            weeksDelinquent = 0;
        } else {
            weeksDelinquent = customer.getPaymentHistory().getWeeksDelingquentInLastYear();
        }


    }
}
