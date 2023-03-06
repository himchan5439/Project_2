package base.comp;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class BaseLable extends JLabel{

	public BaseLable(String text) {
		super(text);
		setSize(14);
	}
	
	public BaseLable(String text, int size) {
		super(text);
		setSize(size);
	}
	
	public BaseLable setTextCenter() {
		super.setHorizontalTextPosition(JLabel.CENTER);
		super.setVerticalTextPosition(JLabel.CENTER);
		
		return this;
	}

	public BaseLable setTextBottomCenter() {
		super.setHorizontalTextPosition(JLabel.CENTER);
		super.setVerticalTextPosition(JLabel.BOTTOM);
		
		return this;
	}

	public BaseLable setSize(int size) {
		super.setFont(new Font("HY헤드라인M", Font.PLAIN, size));
		
		return this;
	}
	
	public BaseLable setTextWhite() {
		super.setForeground(Color.WHITE);
		
		return this;
	}
	
	public BaseLable setTextBlack() {
		super.setForeground(Color.BLACK);
		
		return this;
	}
	
	public BaseLable setLine() {
		Border Line = BorderFactory.createLineBorder(Color.BLACK);		
		
		super.setBorder(Line);
		
		return this;
	}
	
}
