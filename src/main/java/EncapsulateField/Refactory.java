package EncapsulateField;

/**
 * 封装字段
 * 类中有public字段,声明为private,提供相应访问函数
 * @author wangchao
 *
 */
public class Refactory {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
