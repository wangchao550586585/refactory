package EncapsulateCollection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 封装集合
 * 有个函数返回一个集合
 * 让这个函数返回该集合的一个只读副本,并在这个类中添加/移除集合元素的函数
 * 
 * 集合,取值函数不应该返回元素自身,这会让用户修改集合,而集合拥有者一无所知,也会对用户过多暴露内部结构
 * 不应该提供设值函数,应该提供以集合添加移除的函数
 * @author wangchao
 *
 */
public class Demo {
	public static void main(String[] args) {
		Person person = new Person();

		HashSet<Course> hashSet = new HashSet<Course>();
		hashSet.add(new Course("a", false));
		hashSet.add(new Course("b", true));
		person.setCourses(hashSet);

		Course refact = new Course("c", true);

		person.getCourses().add(refact);
		person.getCourses().add(new Course("d", false));

		person.getCourses().remove(refact);

		Iterator<Course> iterator = person.getCourses().iterator();
		int count = 0;
		while (iterator.hasNext()) {
			Course next = iterator.next();
			if (next.getIsAdvanced())
				count++;
		}
	}
}