package Expression.RemoveControlFlag.refactory;

/**
 * 移除控制标记
 * 在一系列布尔表达式中,某个变量有控制标记的作用
 * 以break|return语句替代
 * @author wangchao
 *
 */
public class Demo {
	private void checkSecurity(String[] people) {
		boolean found = false;
		for (int i = 0; i < people.length; i++) {
			if (!found) {
				if (people[i].equals("Don")) {
					found = true;
					sendAlert();
				}
				if (people[i].equals("John")) {
					found = true;
					sendAlert();
				}
			}
		}
	}

	private void sendAlert() {
	}
}
