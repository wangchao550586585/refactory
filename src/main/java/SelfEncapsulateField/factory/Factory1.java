package SelfEncapsulateField.factory;

/**
 * 自封装字段
 * 直接访问一个字段,与字段之间的耦合关系逐渐变得笨拙
 * 为这个字段建立取值/设置函数,并且只以这些函数来访问字段
 * 
 * 场景：访问字段需要将字段改为一个计算后的值,用
 * @author wangchao
 *
 */
public class Factory1 {
	private int low, high;

	public boolean includes(int arg) {
		return arg >= getLow() && arg <= getHigh();
	}

	public int getLow() {
		return low;
	}

	public void setLow(int low) {
		this.low = low;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

}
