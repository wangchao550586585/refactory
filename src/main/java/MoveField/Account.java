package MoveField;


/*
 * 某个字段被其所驻类之外的另一个类更多的用到,在目标类新建字段,修改源字段的所有用户,令他们用新字段
 *决定如何在源对象中引用目标对象
 *	看是否有现成字段或函数可以获得目标对象
 *	没有看，是否能轻易建立这样对象
 *	不行就在源类中新建一个字段存放对象
 *
 *interestRate移动到AccountType类中
 */
public class Account {
	private AccountType type;
	private double interestRate;

	public double interestForAmountDays(double amount, int days) {
		return interestRate * amount * days / 365;
	}
}
