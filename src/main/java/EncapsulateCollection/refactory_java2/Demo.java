package EncapsulateCollection.refactory_java2;

import java.util.HashSet;

/**
 * 使用JAVA1.2版本重构
 * @author wangchao
 *
 */
public class Demo {

	public static void main(String[] args) {
		Person person = new Person();
		HashSet<Course> hashSet = new HashSet<Course>();
		hashSet.add(new Course("A", false));
		hashSet.add(new Course("B", true));
		person.initializeCourses2(hashSet);

		// 也可以使用如下
		Person person2 = new Person();
		person2.addCourse(new Course("C", false));
		person2.addCourse(new Course("D", true));

		// numberOfAdvancedCourses(person);
		person.numberOfAdvancedCourses();

		// 10:直接获取size
		int size = person.getCourses().size();
		// 直接获取
		int size2 = person.numberOfCourses();
	}

	// 8:extract Method
	/*public static int numberOfAdvancedCourses(Person person) {
		Iterator<Course> iterator = person.getCourses().iterator();
		int count = 0;
		while (iterator.hasNext()) {
			Course next = iterator.next();
			if (next.getIsAdvanced())
				count++;
		}
		return count;
	}*/
}