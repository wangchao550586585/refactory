package IntroduceLocalExtension;

/**
 * 引入本地扩展
 * 你需要为服务类提供一些额外函数,但你无法修改此类
 * 建立一个新类,使它包含这些额外函数,让这个扩展成为源类的子类or包装类
 * 子类和包装类的选择
 * 		子类:直接继承父类,只需考虑扩展即可
 * 			缺点:必须在对象创建期实施,对象创建之后无法使用本地扩展
 * 				子类化方案会产生一个子类对象,此种情况下,如果有其他对象引用了旧对象，并修改了元数据,导致一个修改动作无法改变2个副本
 * 				此种情况考虑用包装类
 *		包装类:对本地扩展的修改会波及源对象,反之亦然
 * @author wangchao
 * 192
 */
public class Demo {

}
