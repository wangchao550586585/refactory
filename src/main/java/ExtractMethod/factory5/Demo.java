package ExtractMethod.factory5;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 对变量进行其他处理
 * 
 * @author Administrator
 *
 */
public class Demo {
	Vector<Integer> v = new Vector<Integer>();

	public void printOwing(int previousAmount) {
		Enumeration<Integer> e = v.elements();
		//
		int outstanding = previousAmount * 10;

		printBanner();
		
		//
		while (e.hasMoreElements()) {
			int each = e.nextElement();
			outstanding += each;
		}

		printDetails(outstanding);
	}

	private void printDetails(int outstanding) {
		System.out.println("name:张三");
		System.out.println("result:" + outstanding);
	}

	private void printBanner() {
		System.out.println("*************");
		System.out.println("*****custom owes*****");
		System.out.println("*************");
	}
}
