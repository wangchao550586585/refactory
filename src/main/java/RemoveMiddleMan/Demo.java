package RemoveMiddleMan;

import HideDelegate.Department;
import HideDelegate.Person;

/**
 * 移除中间人 
 * 当受委托的功能越来越多的时候,服务类成为了中间人，此时应该让用户直接调用受托类
 */
public class Demo {
	public static void main(String[] args) {
		Person person = new Person();
		Department department = person.getDepartment();
		Person manager = department.getManager();
	}
}
