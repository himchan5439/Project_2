package base.comp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class BasePanel extends JPanel{

	public BasePanel center;
	public BasePanel top;
	public BasePanel bottom;
	public BasePanel left;
	public BasePanel right;
	public Border Line;
	public TitledBorder tb;

	public BasePanel() {
		super(new BorderLayout());
		super.setBackground(Color.WHITE);
	}
	
	public BasePanel addChild() {
		
		center = new BasePanel();
		top = new BasePanel();
		bottom = new BasePanel();
		left = new BasePanel();
		right = new BasePanel();
		
		super.add(center, new BorderLayout().CENTER);
		super.add(top, new BorderLayout().NORTH);
		super.add(bottom, new BorderLayout().SOUTH);
		super.add(left, new BorderLayout().WEST);
		super.add(right, new BorderLayout().EAST);
		
		return this;
	}
	
	public BasePanel setFlowLayoutCenter() {
		
		super.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		return this;
	}

	
	public BasePanel setFlowLayoutLeft() {
		
		super.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		return this;
	}
	
	public BasePanel setGridLayout(int r, int c, int h, int v) {
		
		super.setLayout(new GridLayout(r, c, h, v));
		
		return this;
	}
	
	public BasePanel setTitle(String title, int size) {
		Line = BorderFactory.createLineBorder(Color.BLACK);
		
		tb = BorderFactory.createTitledBorder(Line, title);
		tb.setTitleFont(new Font("HY헤드라인M", Font.PLAIN, size));
		
		super.setBorder(tb);
		return this;
	}
}
