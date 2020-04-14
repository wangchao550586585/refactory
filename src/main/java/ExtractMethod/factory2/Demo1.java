package ExtractMethod.factory2;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 无局部变量
 * 
 * @author Administrator
 *
 */
public class Demo1 {

	Vector<Integer> v = new Vector<Integer>();

	public void printOwing() {
		Enumeration<Integer> e = v.elements();
		int outstanding = 0;

		// print banner
		System.out.println("*************");
		System.out.println("*****custom owes*****");
		System.out.println("*************");

		// calculate outstanding
		while (e.hasMoreElements()) {
			int each = e.nextElement();
			outstanding += each;
		}

		System.out.println("name:张三");
		System.out.println("result:" + outstanding);
	}
}
