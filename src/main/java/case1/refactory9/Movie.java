package case1.refactory9;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 114
 * 设计后重构然后测试
 * 直接写然后重构
 * 
 * 运用多态取代与价格和积分相关的逻辑

 *数据库重构
 *接口迁移,旧接口不动or旧接口调用新接口,collection类
 *不要过早发布接口,让每个人都可以修改别人代码,适应接口改动
 *在throws添加异常
 *
 *重构时机
	 *重复代码
		 *1：含有相同代码,提取pull超类,注意提取的代码放置位置以及保证不会再其他地方出现
		 *2：代码相似,并非完全相同,相似部分和差异部分隔开,pull单独函数,可以使用template method模式=
		 *3：不同算法同一功能,选择最清晰一个
	 *过长函数
	 *	分解函数,函数名字指出用途,
	 *	这样只用在意函数做什么,而不是怎么做
	 *	消除大量参数和临时变量,如果不行,提炼代码替换成一个函数
	 *	分解条件表达式和
	 	循环提炼独立函数
	  过大的类
	  	相关变量提取新类or接口
	 过长参数列
	 	使用对象封装or其他数据结构
	发散式变化(一个类受多种变化影响和)
		某一外界变化,只应该发生在单一类中
	散弹式修改(一种变化引发多个类修改)
		遇到某种变化，所有地方需要修改，解决方案
		一系列相关行为放进同一个类
	依恋情节
		一个函数从某个对象获取绝大部分值,解决方案函数移动另一个地点(独立函数)
		一个函数用到多个类的功能,选择用到最多参数的那个类放置
		将总是变化的东西放一块,数据和引用数据行为一起变化.
	数据泥团
		多个类相同字段,许多函数签名相同的参数应该有一个独立对象
	基本类型偏执
		基本数据对象替代对象数据
	少用switch
		采用多态和状态模式替代
	平行继承体系
		2个子类名一致,让一个继承体系实例引用另一个继承体系的实例
	冗余类
		多余类剔除
	未来性
		用不上考虑未来性,添加的多余东西剔除
	暂时字段
		某个实例变量仅为某种特定情况而设,将变量和相关函数提炼独立类
	消息链
		这个调用这类,这类调用另外类等等
		观察消息链最终结果,看能否提炼到独立函数中,推入消息链.如果消息链上某个对象有多位用户航行剩余部分,则加函数处理
	中间人
		不能过度依赖委托
		直接和真正负责的对象打交道,
	2个类过于亲切
		斩断联系
		共同点提取同一地方
		建立另外一个类维护2者关系
		在继承体系中如果子类对超类的了解超过了后者的主观愿望，剔除子类离开继承体系
	异曲同工的类
		2个类做同一件事,有不同签名
			重命名
			提取单独类
			提取父类
	不完美库类
		162和164面
	数据类
		选择是否提供get/set
	拒绝遗产
		子类继承父类，如果不需要父类很多实现
		新建兄弟类，继承子类不需要的实现，父类保留所有子类共享的东西
	注释
		方法名,引入断言替代
		注释应该用在写下做某事,记日后打算
构建测试体系
	多写测试,没必要输出信息到控制台，只需要显示ok和错误信息即可
	收到bug,单元测试压缩范围
	测试担心部分
	考虑可能出错的边界条件,测试火力集中在此
	当事情出错，检查是否抛出了预期异常
重构列表
	寻找引用点:查找
重新组织函数
	
 */
@Setter
@Getter
@NoArgsConstructor
public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	private String title;
	private Price price;

	public Movie(String title, int priceCode) {
		this.title = title;
		// 构造函数不能直接访问价格代码,设值函数代替直接访问
		setPriceCode(priceCode);
	}

	public int getPriceCode() {
		return price.getPriceCode();
	}

	public void setPriceCode(int arg) {
		switch (arg) {
		case REGULAR:
			price = new RegularPrice();
			break;
		case NEW_RELEASE:
			price = new NewReleasePrice();
			break;
		case CHILDRENS:
			price = new ChildrensPrice();
			break;
		default:
			throw new IllegalArgumentException("incorrect price code");
		}
	}

	public int getFrequentRenterPoints(int daysRented) {
		return price.getFrequentRenterPoints(daysRented);
	}

	public double getCharge(int daysRented) {
		return price.getCharge(daysRented);
	}

}
