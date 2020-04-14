package EncapsulateCollection;

/**
 * @author wangchao
 *
 */
public class Course {
	private String name;
	private Boolean isAdvanced;

	public Course() {
	}

	public Course(String name, Boolean isAdvanced) {
		this.name = name;
		this.isAdvanced = isAdvanced;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsAdvanced() {
		return isAdvanced;
	}

	public void setIsAdvanced(Boolean isAdvanced) {
		this.isAdvanced = isAdvanced;
	}

}
