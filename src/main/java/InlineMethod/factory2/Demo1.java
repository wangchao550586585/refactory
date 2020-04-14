package InlineMethod.factory2;

import java.util.ArrayList;
import java.util.List;

/**
 * 内联临时变量
 * 
 * @author Administrator
 *
 */
public class Demo1 {
	public static List<Integer> list = new ArrayList<Integer>();
	static {
		list.add(1);
	}

/*	public boolean getVal() {
		Integer integer = list.get(0);
		return integer > 1000;
	}*/

	// 应该修改为

	public boolean getVal() {
		return list.get(0) > 1000;
	}
}
