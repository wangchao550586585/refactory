package replace.ReplaceArrayWithObject;

/**
 * 以对象取代数组
 * 你有一个数组,其中的元素各自代表不同的东西
 * 对于数组中的每一个元素,以一个字段来表示
 * @author wangchao
 *
 */
public class Demo {
	public static void main(String[] args) {
		String[] row = new String[2];
		row[0] = "Live";
		row[2] = "15";

		//使用对象封装后
		Performance performance = new Performance();
		performance.setName("Live");
		performance.setWins(15);
	}
}
