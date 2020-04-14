package replace.ReplaceSubclassWithFields;

/**
 * 以字段取代子类
 * 各个子类的唯一差别只在"返回常量数据"的函数身上
 * 修改这些函数,使他们返回超类中的某个新增字段，然后销毁子类
 * @author wangchao
 *
 */
public abstract class Person {
	abstract boolean isMale();

	abstract char getCode();
}

class Male extends Person {
	boolean isMale() {
		return true;
	}

	char getCode() {
		return 'M';
	}
}

class Female extends Person {
	boolean isMale() {
		return false;
	}

	char getCode() {
		return 'F';
	}
}
