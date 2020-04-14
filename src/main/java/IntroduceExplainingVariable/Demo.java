package IntroduceExplainingVariable;

/**
 * 引入解释性变量 如果你有一个复杂表达式 将该复杂表达式(or其中一部分)结果放进一个临时变量以此变量名称来解释表达式用途
 *
 */
public class Demo {
	String platform = "测试数据mac";
	String browser = "测试数据mac";
	int resize = 0;

	/*	public void test1() {
			if ((platform.toUpperCase().indexOf("MAC") > -1)
					&& (browser.toUpperCase().indexOf("IE") > -1)
					&& wasInitialized() && resize > 0) {
				// method body
			}
		}*/
	public void test1() {
		final boolean isMacOs = platform.toUpperCase().indexOf("MAC") > -1;
		final boolean isIEBrowser = browser.toUpperCase().indexOf("IE") > -1;
		final boolean wasResized = resize > 0;
		if (isMacOs && isIEBrowser && wasInitialized() && wasResized) {
			// method body
		}
	}

	public boolean wasInitialized() {
		return false;
	}
}
