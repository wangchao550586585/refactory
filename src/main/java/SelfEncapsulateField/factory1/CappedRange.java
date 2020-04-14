package SelfEncapsulateField.factory1;

public class CappedRange extends IntRange {
	private int cap;

	public CappedRange(int low, int high, int cap) {
		super(low, high);
		this.cap = cap;
	}

	public int getCap() {
		return cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}
	
	//可以再CappedRange覆写getHigh(),从而加入对"范围上限"cap的考虑,而不必修改IntRange的任何行为
	public int getHigh() {
		return Math.min(super.getHigh(), getCap());
	}
}
