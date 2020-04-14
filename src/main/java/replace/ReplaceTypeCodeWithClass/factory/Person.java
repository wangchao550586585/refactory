package replace.ReplaceTypeCodeWithClass.factory;

/**
 *新增类代表类型码
 */
public class Person {
	public static final int O = BloodGroup.O.getCode();
	public static final int A = BloodGroup.A.getCode();
	public static final int B = BloodGroup.B.getCode();
	public static final int AB = BloodGroup.AB.getCode();
	private BloodGroup bloodGroup;

	public Person(int code) {
		this.bloodGroup = BloodGroup.code(code);
	}

	public int getBloodGroup() {
		return bloodGroup.getCode();
	}

	public void setBloodGroup(int code) {
		this.bloodGroup = BloodGroup.code(code);
	}

}
