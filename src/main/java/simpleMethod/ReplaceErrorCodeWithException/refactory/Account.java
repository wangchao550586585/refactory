package simpleMethod.ReplaceErrorCodeWithException.refactory;

import Expression.IntroduceAssertion.Assert;

/**
 * 非受控异常
 * 调用端校验
 * Created by Administrator on 2017/5/14.
 */
public class Account {
    private int balance;

    void withdraw(int amount) throws Exception {
        //2：断言指明这是程序犯的错误
        Assert.isTrue("sufficient", amount <= balance);
        if (amount > balance) {
            throw new Exception();
        }
        balance -= amount;

    }

    public boolean canWithdraw(int amount) {
        return amount < balance;
    }
}

class Test {
    public void getValue(int amount) throws Exception {
        Account account = new Account();
        //1：替换检查代码
        if (account.canWithdraw(amount)) {
            handleOverdrawn();
        } else {
            account.withdraw(amount);
            doTheUsualThing();
        }
    }

    private void doTheUsualThing() {
    }

    private void handleOverdrawn() {
    }
}

