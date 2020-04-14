package SelfEncapsulateField.factory1;

/**
 * 自封装字段
 * 直接访问一个字段,与字段之间的耦合关系逐渐变得笨拙
 * 为这个字段建立取值/设置函数,并且只以这些函数来访问字段
 * @author wangchao
 *
 */
public class Demo {
	private int low, high;

	public Demo(int low, int high) {
		this.low = low;
		this.high = high;
	}

	public boolean includes(int arg) {
		return arg >= low && arg <= high;
	}

	public void grow(int factor) {
		high *= factor;
	}
}
