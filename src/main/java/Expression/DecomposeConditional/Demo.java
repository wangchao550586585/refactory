package Expression.DecomposeConditional;

import java.util.Date;

/**
 * 分解条件表达式
 * 有一个复杂的if/else
 * 从if/elseIF/else三个段落中分别提取独立函数
 * @author wangchao
 *
 */
public class Demo {
	private int charge;
	private int winterReate;
	private int winterServiceCharge;
	private int summerReate;
	private Date date;
	private Date SUMMER_START;
	private Date SUMMER_END;

	public void price(int quantity) {
		if (date.before(SUMMER_START) || date.after(SUMMER_END)) {
			charge = quantity * winterReate + winterServiceCharge;
		} else {
			charge = quantity * summerReate;
		}
	}
}
