package replace.ReplaceTypeCodeWithClass;

/**
 * 以类取代类型码
 * 类中有一个数值类型码,但它并不影响类的行为
 * 以一个新类替换该数值类型码
 * @author wangchao
 *
 */
public class Person {
	public static final int O = 0;
	public static final int A = 1;
	public static final int B = 2;
	public static final int AB = 3;
	private int bloodGroup;

	public Person(int bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public int getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(int bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

}
