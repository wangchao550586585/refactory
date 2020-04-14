package replace.ReplaceTypeCodeWithClass.refactory2;

/**
 * 修改Demo,让他以BloodGroup对象表示类型码,而不再使用整数
 * @author wangchao
 *
 */
public class Person {
	private BloodGroup bloodGroup;

	/*5:删除所有
	 * 	public static final int O = BloodGroup.O.getCode();
		public static final int A = BloodGroup.A.getCode();
		public static final int B = BloodGroup.B.getCode();
		public static final int AB = BloodGroup.AB.getCode();
	

		public Person(int arg) {
			this.bloodGroup = BloodGroup.code(arg);
		}

		public void setBloodGroup(int arg) {
			this.bloodGroup = BloodGroup.code(arg);
		}

		// 1：rename method
		public int getBloodGroupCode() {
			return bloodGroup.getCode();
		}
	*/

	// 2:使用对象构造
	public Person(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	// 3：加入新的取值函数
	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	// 4:增加设值函数
	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

}
