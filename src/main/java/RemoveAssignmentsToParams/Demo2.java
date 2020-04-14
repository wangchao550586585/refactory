package RemoveAssignmentsToParams;

public class Demo2 {
	/*	public int test1(int inputVal, int quantity, int yearToDate) {
			if (inputVal > 50)
				inputVal -= 2;
			if (quantity > 100)
				inputVal -= 1;
			if (yearToDate > 100000)
				inputVal -= 4;
			return inputVal;
		}*/
	//添加final表示强制遵循不对参数赋值惯例
	public int test1(final int inputVal, final int quantity,
			final int yearToDate) {
		int result = inputVal;
		if (inputVal > 50)
			result -= 2;
		if (quantity > 100)
			result -= 1;
		if (yearToDate > 100000)
			result -= 4;
		return result;
	}
}
