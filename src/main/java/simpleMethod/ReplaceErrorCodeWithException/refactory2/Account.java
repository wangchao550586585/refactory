package simpleMethod.ReplaceErrorCodeWithException.refactory2;

import Expression.IntroduceAssertion.Assert;

/**
 * 受控异常
 * 检查在被调用端
 * Created by Administrator on 2017/5/14.
 */
public class Account {
    private int balance;

    //2：
    void withdraw(int amount) throws BalanceException {
        if (amount > balance) {
            throw new BalanceException();
        }
        balance -= amount;
    }
}

class Test {
    //3
    public void getValue(int amount) {
        Account account = new Account();
        try {
            account.withdraw(amount);
            doTheUsualThing();
        } catch (BalanceException e) {
            handleOverdrawn();
        }
    }

    private void doTheUsualThing() {
    }

    private void handleOverdrawn() {
    }
}
//1：创建异常类
class BalanceException extends Exception {
}
