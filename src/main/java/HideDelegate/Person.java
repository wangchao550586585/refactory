package HideDelegate;


public class Person {
	Department department;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	// 添加委托函数
	public Person getManager() {
		return department.getManager();
	}
}
