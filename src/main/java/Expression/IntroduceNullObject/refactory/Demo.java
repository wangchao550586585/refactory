package Expression.IntroduceNullObject.refactory;

import Expression.IntroduceNullObject.BillingPlan;

/**
 * Created by Administrator on 2017/5/11.
 * 291
 */
public class Demo {
    public static void main(String[] args) {
        Site site = new Site();
        //1:修改customer内部获取方式
        Customer customer = site.getCustomer();

        //2:修改检查
         /* String customerName;
       if (customer.isNull()) {
            customerName = "occupant";
        } else {
            customerName = customer.getName();
        }*/
        //3：CustormerNull类内部赋予了值
        String customerName = customer.getName();

        BillingPlan plan = customer.getBillingPlan();

        //4:null对象嵌套null对象
        int weeksDelinquent = customer.getPaymentHistory().getWeeksDelingquentInLastYear();

        //5：建立null接口,检查对象是否为null的接口
    }
}
