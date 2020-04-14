package splitTemporaryVariable;

/**
 * 分解临时变量 程序某个变量被赋值超过一次,他既不是循环变量也不被用于收集计算结果 针对每次赋值,创造一个独立,对应的临时变量
 * 同一个临时变量不应该承担2个不同事情
 * @author Administrator
 *
 */
public class Demo1 {

	int height = 10, width = 20;

	public void test1() {
		int temp = 2 * (height + width);
		System.out.println(temp);
		int area = height * width;
		System.out.println(area);
	}

	/*	public void test1() {
			int temp = 2 * (height + width);
			System.out.println(temp);
			temp = height * width;
			System.out.println(temp);
		}
		
	*/
}
