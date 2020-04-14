package IntroduceLocalExtension;

import java.util.Date;

/**
 * 使用扩展
 * @author wangchao
 *
 */
public class MfDateSub extends Date {

	public MfDateSub(String s) {
		super(s);
	}

	// 加入转型构造函数
	public MfDateSub(Date date) {
		super(date.getTime());
	}

	// move Field
	public Date nextDay() {
		return new Date(getYear(), getMonth(), getDay() + 1);
	}

}
