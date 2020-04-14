package Expression.RemoveControlFlag.refactory2;

/**
 * return
 */
public class Demo {
	private void checkSecurity(String[] people) {
		String found = "";
		for (int i = 0; i < people.length; i++) {
			if ("".equals(found)) {
				if (people[i].equals("Don")) {
					found = "Don";
					sendAlert();
				}
				if (people[i].equals("John")) {
					found = "John";
					sendAlert();
				}
			}
		}
		someLaterCode(found);
	}

	private void someLaterCode(String found) {

	}

	private void sendAlert() {
	}
}
