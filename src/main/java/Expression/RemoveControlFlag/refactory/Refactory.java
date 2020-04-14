package Expression.RemoveControlFlag.refactory;

/**
 * break
 */
public class Refactory {
	private void checkSecurity(String[] people) {
		for (int i = 0; i < people.length; i++) {
			if (people[i].equals("Don")) {
				sendAlert();
				break;
			}
			if (people[i].equals("John")) {
				sendAlert();
				break;
			}
		}
	}

	private void sendAlert() {
	}
}
