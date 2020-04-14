package DuplicateObservedData.refactory;

import java.util.Observable;

public class Interval extends Observable {
	private String end = "0";
	private String start = "0";
	private String length = "0";

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
		setChanged();
		notifyObservers();
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
		setChanged();
		notifyObservers();
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
		setChanged();
		notifyObservers();
	}

}
