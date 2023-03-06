package base.comp;

import javax.swing.JComboBox;

public class BaseComboBox extends JComboBox<String>{

	public BaseComboBox(String...vals) {
		for (String val : vals) {
			super.addItem(val);
		}
	}

}
