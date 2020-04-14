package EncapsulateCollection.refactory_java1;

public class Demo {
	public static void main(String[] args) {
		Person person = new Person();
		// 替换如下 person.getCourses().addElement(new Course("A", false));
		person.addCourse(new Course("B", false));

	}
}
