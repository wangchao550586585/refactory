package replace.ReplaceTypeCodeWithSubclasses;

public class Engineer extends Employee {

	// 3：覆写类型码取值函数
	public int getType() {
		return Employee.ENGINEER;
	}
}
