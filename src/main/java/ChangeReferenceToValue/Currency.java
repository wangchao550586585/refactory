package ChangeReferenceToValue;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 * 保存并返回一个货币种类代码
 * @author wangchao
 *
 */
public class Currency {
	private String code;

	private Currency(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	private static Dictionary<String, Currency> instaces = new Hashtable<String, Currency>();

	static void loadCustomers() {
		new Currency("USD").store();
		new Currency("USD2").store();
		new Currency("USD3").store();
	}

	private void store() {
		instaces.put(this.getCode(), this);
	}

	public static Currency getNamed(String name) {
		return instaces.get(name);
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Currency other = (Currency) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}

}
