package simpleMethod.ReplaceErrorCodeWithException;

/**
 * /**
 * 异常取代错误码
 * Created by Administrator on 2017/5/14.
 */
public class Account {
    private int balance;

    int withdraw(int amount) {
        if (amount > balance) {
            return -1;
        } else {
            balance -= amount;
            return 0;
        }
    }
}

class Test {
    public void getValue(int amount) {
        Account account = new Account();
        if(account.withdraw(amount)==-1){
            handleOverdrawn();
        }else{
            doTheUsualThing();
        }
    }

    private void doTheUsualThing() {
    }

    private void handleOverdrawn() {
    }
}