package EncapsulateCollection.refactory_java2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Person {
	// 1：init
	private Set<Course> courses = new HashSet<Course>();

	// 2:封装集合添加和删除
	public void addCourse(Course arg) {
		courses.add(arg);
	}

	public void removeCourse(Course arg) {
		courses.remove(arg);
	}

	// 3：添加函数
	// 4:rename method明确表示意图
	// public void setCourses(Set<Course> arg) {
	/*public void initializeCourses(Set<Course> arg) {
		Iterator<Course> iterator = arg.iterator();
		while (iterator.hasNext()) {
			addCourse(iterator.next());
		}
	}*/

	// 5:如果初始化时,明确知道只会添加数据,不会有其他行为,直接addAll()即可
	public void initializeCourses2(Set<Course> arg) {
		courses.addAll(arg);
	}

	// 6:之所以不直接赋值给courses,是因为防止用户set后,修改了arg的元素,破坏封装，所以需要创建副本
	// 7:返回一个只读副本
	public Set<Course> getCourses() {
		return Collections.unmodifiableSet(courses);
	}

	// 9:move method
	public int numberOfAdvancedCourses() {
		Iterator<Course> iterator = getCourses().iterator();
		int count = 0;
		while (iterator.hasNext()) {
			Course next = iterator.next();
			if (next.getIsAdvanced())
				count++;
		}
		return count;
	}

	// 10:获取size
	public int numberOfCourses() {
		return courses.size();
	}

}
