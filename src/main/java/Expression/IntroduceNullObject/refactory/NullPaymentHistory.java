package Expression.IntroduceNullObject.refactory;

/**
 * Created by Administrator on 2017/5/11.
 */
public class NullPaymentHistory extends PaymentHistory implements Nullable {
    public int getWeeksDelingquentInLastYear() {
        return 0;
    }

    @Override
    public boolean isNull() {
        return true;
    }
}

class PaymentHistory {
    public static PaymentHistory newNull() {
        return new NullPaymentHistory();
    }

    public int getWeeksDelingquentInLastYear() {
        return 1;
    }
}


