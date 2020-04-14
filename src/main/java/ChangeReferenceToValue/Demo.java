package ChangeReferenceToValue;

/**
 * 将引用对象改为值对象
 * 有一个引用对象,很小且不可改变,不易管理
 * 
 * 对象多了之后会造成内存区域之间错综复杂的关联
 * 而不可变的值对象在分布式系统和并发系统中无需考虑同步问题
 * 
 * 值对象应该是不可变的
 * 值对象是可变的就要保证对某一对象的修改会自动更新到其他"代表相同事物"的对象,这样还不如改成引用对象
 * 
 * 不可变指的是和money对象之间的关系可以改变，但money对象自身不能改变
 * 也就是只能改变对money对象引用，而不能靠修改money对象的值进行改变
 * 
 * 无法将对象修改为不可变，则放弃重构
 * @author wangchao
 *
 */
public class Demo {
	public static void main(String[] args) {
		Currency usd = Currency.getNamed("USD");
		usd.equals(Currency.getNamed("USD"));

		// 还可以把构造函数声明为public,直接构造获取实例,去掉工厂函数
	}
}
