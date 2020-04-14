package replace.replaceMethodWithMethodObject;
/**
 * 以函数对象取代函数
 * 大型函数对局部变量的使用无法进行extract method
 * 将函数放在单独对象中,这样局部变量就成了对象内的字段,然后可以再同一个对象中将这个大型函数分解多个小型函数
 * 
 *做法:
 *	建立新类,建立了final字段,保存原先大型函数对象(源对象)
 *新类所有临时变量在新类定义为成员变量
 * 新类建立构造函数,接收原函数所有参数作为参数
 * 建立compute函数,原函数所有代码复制此，需要调用源对象的任何函数,通过源对象调用
 */
public class Account {
	int game(int inputVal, int quantity, int yearToDate) {
		int importantValue1 = inputVal * quantity + delta();
		int importantValue2 = inputVal * yearToDate + 100;
		if ((yearToDate - importantValue1) > 100)
			importantValue1 -= 20;
		int importantValue3 = importantValue2 * 7;
		return importantValue3 - 2 * importantValue2;
	}

	private int delta() {
		return 0;
	}
}
