package DuplicateObservedData.refactory;

import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Observable;
import java.util.Observer;

public class IntervalWindow extends Frame implements Observer {
	private Interval subject;
	TextField startField;
	TextField endField;
	TextField lengthField;

	public IntervalWindow() throws HeadlessException {
		subject = new Interval();
		subject.addObserver(this);
		update(subject, null);
	}

	public void update(Observable o, Object arg) {
		endField.setText(subject.getEnd());
		startField.setText(subject.getStart());
		lengthField.setText(subject.getLength());
	}

	public String getStartField() {
		return subject.getStart();
	}

	public void setStartField(String startField) {
		subject.setStart(startField);
	}

	public String getLengthField() {
		return subject.getLength();
	}

	public void setLengthField(String lengthField) {
		subject.setLength(lengthField);
	}

	public String getEndField() {
		// return endField.getText();
		return subject.getEnd();
	}

	public void setEndField(String endField) {
		// this.endField.setText(endField);
		subject.setEnd(endField);
	}

	class SymFocus extends FocusAdapter {
		// 文本框失去焦点事件
		public void focusLost(FocusEvent e) {
			Object object = e.getSource();
			if (object == startField) {
				StartFieldFocusLost(e);
			} else if (object == endField) {
				EndFieldFocusLost(e);
			} else if (object == lengthField) {
				LengthFieldFocusLost(e);
			}
		}

		private void LengthFieldFocusLost(FocusEvent e) {
			setLengthField(lengthField.getText());
			if (isNotInteger(getLengthField())) {
				setLengthField(getLengthField());
				calculateEnd();
			}
		}

		private void EndFieldFocusLost(FocusEvent e) {
			/*
			end文本框设置为当前值,确保用户输入的确实是通过设置函数进行的
			 这里不用getEndField()获取值,而直接访问文本框,
			 	是因为之后getEndField()从领域对象(而非文本框)身上取值
			 	如果这里使用的是getEndField(),每当用户修改文本框内容,这里又会把文本框改成原值
			*/
			setEndField(endField.getText());
			if (isNotInteger(getEndField())) {
				setEndField("0");
				calculateLength();
			}
		}

		private void StartFieldFocusLost(FocusEvent e) {
			setStartField(startField.getText());
			if (isNotInteger(getStartField())) {
				setStartField("0");
				calculateLength();
			}
		}

		private void calculateLength() {
			try {
				int start = Integer.parseInt(getStartField());
				int end = Integer.parseInt(getEndField());
				int length = end - start;
				setLengthField(String.valueOf(length));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}

		private void calculateEnd() {
			try {
				int start = Integer.parseInt(getStartField());
				int length = Integer.parseInt(getLengthField());
				int end = start + length;
				setEndField(String.valueOf(end));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}

		public boolean isNotInteger(String text) {
			return text.matches("1-9+");
		}
	}

}
