package replace.ReplaceSubclassWithFields.refactory;

/**
 *2个子类唯一区别就是,以不同方式实现了Person所声明的抽象函数getCode,去除子类
 */
public class Person {
	// 1:为每个子类建立工厂函数
	/*public Male createMale() {
		return new Male();
	}*/

	/*	public Female createFemale() {
			return new Female();
		}
	*/
	// 2:针对每个常量函数,在超类中声明对应字段
	private final boolean isMale;
	private final char code;

	// 3:声明构造函数,访问权限为protected
	protected Person(boolean isMale, char code) {
		this.isMale = isMale;
		this.code = code;
	}

	// 6：超类添加访问字段函数
	boolean isMale() {
		return false;
	}

	char getCode() {
		return 'F';
	}

	// 7:删除abstract声明的函数
	/*abstract boolean isMale();

	abstract char getCode();*/

	// 8:子类构造内联到超类的工厂函数中:inline method
	public Person createFemale() {
		return new Person(true, 'M');
	}

	public Person createMale() {
		return new Person(true, 'M');
	}
	// 9:删除Male/Female类
}

/*class Male extends Person {
	// 4:实现
	protected Male() {
		super(true, 'M');
	}
	// 5:删掉访问函数
	boolean isMale() {
		return false;
	}

	char getCode() {
		return 'F';
	}
}

class Female extends Person {
	protected Female() {
		super(false, 'F');
	}

}*/
