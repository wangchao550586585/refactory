package ExtractMethod.factory4;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 提取局部赋值的变量,以及命名优化
 * 
 * @author Administrator
 *
 */
public class Demo {
	Vector<Integer> v = new Vector<Integer>();

	public void printOwing() {

		printBanner();
		int outstanding = getOutstanding();
		printDetails(outstanding);
	}

	private int getOutstanding() {
		int result = 0;
		Enumeration<Integer> e = v.elements();
		while (e.hasMoreElements()) {
			int each = e.nextElement();
			result += each;
		}
		return result;
	}

	private void printDetails(int outstanding) {
		System.out.println("name:张三");
		System.out.println("result:" + outstanding);
	}

	private void printBanner() {
		// print banner
		System.out.println("*************");
		System.out.println("*****custom owes*****");
		System.out.println("*************");
	}
}
