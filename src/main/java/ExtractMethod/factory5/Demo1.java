package ExtractMethod.factory5;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 对变量进行其他处理
 * 
 * @author Administrator
 *
 */
public class Demo1 {
	Vector<Integer> v = new Vector<Integer>();

	public void printOwing(int previousAmount) {
		printBanner();

		int outstanding = getOutStanding(previousAmount * 10);

		printDetails(outstanding);
	}

	private int getOutStanding(int previousAmount) {
		int result = previousAmount;
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
		System.out.println("*************");
		System.out.println("*****custom owes*****");
		System.out.println("*************");
	}
}
