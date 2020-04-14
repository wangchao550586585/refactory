package InlineClass.factory;

/*
 * 找出所有TelephoneNumber所有使用用户
 * 转而使用person接口
 * Person person=new Person();
 * person.setOfficeAreaCode("1");
 * 
 */
public class Person {
	private String name;
	private String officeAreaCode;
	private String officeNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOfficeAreaCode() {
		return officeAreaCode;
	}

	public void setOfficeAreaCode(String officeAreaCode) {
		this.officeAreaCode = officeAreaCode;
	}

	public String getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}
}
