package RemoveAssignmentsToParams;

/**
 * 移除对参数的赋值 代码对一个参数进行赋值 以一个临时变量取代该参数的位置
 * 按值传递情况下，对参数修改,无法影响调用端。
 * 按对象传递情况下,因为可以修改参数对象的内部状态，对参数重新赋值没意义
 * 传递进来的参数只表示他的本意代码会清晰很多
 * @author Administrator
 *
 */
public class Demo1 {
	/*	public void test1(int inputVal, int quantity, int yearToDate) {
			if (inputVal > 50)
				inputVal -= 2;
		}
	*/public void test1(int inputVal, int quantity, int yearToDate) {
		int result = inputVal;
		if (inputVal > 50)
			result -= 2;
	}
}
