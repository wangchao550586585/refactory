package ExtractClass.factory;

public class Person {
	private String name;

	// 建立连接
	private TelephoneNumber officeTelephone = new TelephoneNumber();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// move field
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
