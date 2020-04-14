package Expression.ReplaceConditionalWithPolymorphism;

/**
 * 多态取代条件表达式
 * 多个条件表达式,根据对象类型选择行为
 * 将每个条件表达式的每个分支放入子类的覆写函数中,然后将原始函数声明为抽象函数
 * @author wangchao
 *
 */
public class Demo {
	/*double getSpeed() {
		switch (type) {
		case EUROPENAN:
			return getBaseSpeed();
		case AFRICAN:
			return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;
		case NORWEGIAN_BLUE:
			return isNailed ? 0 : getBaseSpeed(voltage);
		}
		throw new RuntimeException("should be unreachable");
	}*/
}
