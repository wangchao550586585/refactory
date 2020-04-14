package IntroduceLocalExtension;

import java.util.Date;

/**
 * 包装类
 * 需要使用委托
 * @author wangchao
 *
 */
public class MfDateWrap {
	private Date original;

	public MfDateWrap(String s) {
		original = new Date(s);
	}

	public MfDateWrap(Date original) {
		this.original = original;
	}

	// 为原始类的所有函数提供委托函数
	public int getYear() {
		return original.getYear();
	}

	private int getDay() {
		return original.getDay();
	}

	private int getMonth() {
		return original.getMonth();
	}

	// 使用move Field
	public Date nextDay() {
		return new Date(getYear(), getMonth(), getDay() + 1);
	}

	/*
	 * 处理接受原始类实例为参数的函数
	 * 向用户隐藏包装类的存在
	 * 	包装类上的after()可以接受包装类或原始对象，
	 * 	原始类after()只能接受原始类对象，不接受包装类对象
	 */
	public boolean after(Date when) {
		return original.after(when);
	}

	/*
	 * 提供2个版本的equals(),这样不用检查未知对象的类型了
	 */

	public boolean equals(Date obj) {
		if (original == obj)
			return true;
		if (obj == null)
			return false;
		if (original.getClass() != obj.getClass())
			return false;
		return true;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MfDateWrap other = (MfDateWrap) obj;
		if (original == null) {
			if (other.original != null)
				return false;
		} else if (!original.equals(other.original))
			return false;
		return true;
	}

}
