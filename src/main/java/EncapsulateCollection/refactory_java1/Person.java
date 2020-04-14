package EncapsulateCollection.refactory_java1;

import java.util.Enumeration;
import java.util.Vector;

public class Person {
	private Vector<Course> courses = new Vector<Course>();

	public void addCourse(Course arg) {
		courses.addElement(arg);
	}

	public void removeCourse(Course arg) {
		courses.removeElement(arg);
	}

	public void initializeCourses(Vector<Course> arg) {
		Enumeration<Course> elements = arg.elements();
		while (elements.hasMoreElements()) {
			addCourse(elements.nextElement());
		}
	}

	public Vector<Course> getCourses() {
		return (Vector<Course>) courses.clone();
	}
}
