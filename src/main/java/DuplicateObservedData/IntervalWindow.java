package DuplicateObservedData;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/**
 * 复制被监视数据
 * 你有一些领域数据置身于gui控件中,而领域函数需要访问这些数据
 * 将该数据复制到一个领域对象中,建立一个Observer模式,用以同步领域对象和gui对象内的重复数据
 * @author wangchao
 */
public class IntervalWindow extends Frame {
	TextField startField;
	TextField endField;
	TextField lengthField;

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
			if (isNotInteger(lengthField.getText())) {
				lengthField.setText("0");
				calculateEnd();
			}
		}

		private void EndFieldFocusLost(FocusEvent e) {
			if (isNotInteger(endField.getText())) {
				endField.setText("0");
				calculateLength();
			}
		}

		private void StartFieldFocusLost(FocusEvent e) {
			if (isNotInteger(startField.getText())) {
				startField.setText("0");
				calculateLength();
			}
		}

		private void calculateLength() {
			try {
				int start = Integer.parseInt(startField.getText());
				int end = Integer.parseInt(endField.getText());
				int length = end - start;
				lengthField.setText(String.valueOf(length));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}

		private void calculateEnd() {
			try {
				int start = Integer.parseInt(startField.getText());
				int length = Integer.parseInt(lengthField.getText());
				int end = start + length;
				endField.setText(String.valueOf(end));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}

		public boolean isNotInteger(String text) {
			return 	text.matches("1-9+");
		}
	}

}
