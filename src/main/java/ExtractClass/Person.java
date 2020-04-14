package ExtractClass;

/**
 * 提炼类 
 *某个类做了2个类的事 建立一个新类,将相关字段和函数从旧类搬移新类
 *1：建立新类 
 *2：建立新旧类连接
 *3：move Field
 *4：决定是否是否对用户公开此TelephoneNumber类
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
