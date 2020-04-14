package Expression.IntroduceNullObject.refactory;


/**
 * Created by Administrator on 2017/5/11.
 */
public class Site {
    Customer customer;

    public Customer getCustomer() {
        return customer==null?Customer.newNull():customer;
    }
}
