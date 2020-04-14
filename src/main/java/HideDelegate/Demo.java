package HideDelegate;
/*
 *隐藏委托关系
 *通过一个委托类调用另一个对象
 *使用委托,关系发生变化,变化也被限制在服务对象中
 */
public class Demo {
	public static void main(String[] args) {
		Person person = new Person();
		Person manager = person.getDepartment().getManager();
		//使用委托函数
		Person manager2 = person.getManager();
	}
}
