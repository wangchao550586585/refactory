package Expression.IntroduceAssertion;

/**
 * 引入断言
 * 某一段代码需要对程序状态做出某种假设
 * 以断言明确表现这种假设
 * Created by Administrator on 2017/5/11.
 */
public class Employee{
    private static final double NULL_EXPENSE=-1.0;
    private double expenseLimit=NULL_EXPENSE;
    private Project primaryProject;

    public double getExpenseLimit() {
        //这条断言不会改变程序任何行为,如果断言条件不为真,返回一个运行时期异常
        //1:Assert.isTrue(expenseLimit!=NULL_EXPENSE||primaryProject!=null);
        //2:为了防止每次运行都执行,使用如下手法
        Assert.isTrue(Assert.ON&&(expenseLimit!=NULL_EXPENSE||primaryProject!=null));
        //或者如下
        if(Assert.ON)
            Assert.isTrue(expenseLimit!=NULL_EXPENSE||primaryProject!=null);

        return expenseLimit!=NULL_EXPENSE?expenseLimit : primaryProject.getMemberExpenseLimit();
    }
    boolean withinLimit(double expenseAmount){
        return expenseAmount<=getExpenseLimit();
    }
}
 class Project {
    double memberExpenseLimit;

    public double getMemberExpenseLimit() {
        return memberExpenseLimit;
    }
}
