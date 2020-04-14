package replace.ReplaceTypeCodeWithClass.refactory2;

public class Demo {
	public static void main(String[] args) {
		// 新建person变成如下:
		//Person person = new Person(Person.A);
		Person newPerson = new Person(BloodGroup.A);

		// 调用取值函数变化如下:
		//newPerson.getBloodGroupCode();
		//newPerson.getBloodGroup().getCode();

		// 设置函数
		//newPerson.setBloodGroup(Person.AB);
		newPerson.setBloodGroup(BloodGroup.AB);
	}
}
