package replace.replaceTempWithQuery;

/**
 * 查询替代临时变量
 * 
 * 以一个临时变量保存某一表达式的运算结果 将这个表达式提炼到一个独立函数,将这个临时变量的所有引用点替换为对新函数的调用，
 * 此后，新函数可被其他函数调用
 * 
 * @author Administrator
 *
 */
public class Demo1 {
	int a = 10, b = 20;

	/*	public int test1() {
			int a = 10, b = 20;
			int basePrice = a * b;
			if (basePrice > 1000) {
				return basePrice * 10;
			} else {
				return basePrice * 110;
			}
		}*/
	public int test1() {
		if (basePrice() > 1000) {
			return basePrice() * 10;
		} else {
			return basePrice() * 110;
		}
	}

	private int basePrice() {
		return a * b;
	}

}
