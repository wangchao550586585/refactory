package InlineClass;

/**
 *将类内联化
 *与extract class相反
 *某个类没有做太多事情,将这个类的所有特性搬移到另一个类中,然后移除原类
 *原因此类不承担足够责任没有存在理由,挑选此类频繁使用的类,将此类塞进去
 *
 *找出源类引用点，声明为private和修改类名称
 */
public class Person {
	private String name;

	private TelephoneNumber officeTelephone = new TelephoneNumber();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOfficeNumber() {
		return officeTelephone.getOfficeNumber();
	}

	public void setOfficeNumber(String officeNumber) {
		officeTelephone.setOfficeNumber(officeNumber);
	}

	public String getOfficeAreaCode() {
		return officeTelephone.getOfficeAreaCode();
	}

	public void setOfficeAreaCode(String officeAreaCode) {
		officeTelephone.setOfficeAreaCode(officeAreaCode);
	}

}
