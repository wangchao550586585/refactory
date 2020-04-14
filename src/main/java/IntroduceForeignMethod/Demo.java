package IntroduceForeignMethod;

import java.util.Date;

/**
 * 引入外加函数
 * 你需要为提供服务的类增加一个函数,但你无法修改这个类
 * 在客户类中建立一个函数,并以第一参数形式传入一个服务器实例
 * 你想使用一个方法，该类无法提供，又不能修改源代码，这个时候可以考虑用外加函数
 * @author wangchao
 *
 */
public class Demo {
	public static void main(String[] args) {
		Date previousEnd = new Date();
		Date newStart = new Date(previousEnd.getYear(), previousEnd.getMonth(),
				previousEnd.getDay() + 1);
		// 将上述代码提炼到独立函数,这个函数就是date的外加函数
		Date nextDay = nextDay(previousEnd);

	}

	//date的外加函数,应在服务类实现
	private static Date nextDay(Date date) {
		return new Date(date.getYear(), date.getMonth(), date.getDay() + 1);
	}
}
