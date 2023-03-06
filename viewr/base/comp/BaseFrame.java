package base.comp;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import base.BaseInterface;

public abstract class BaseFrame extends JFrame implements BaseInterface{

	private String preFrame;

	public BaseFrame(String title, int w, int h, String preFrame) {
		super.setTitle(title);
		super.setSize(w, h);
		
		setComp();
		setDigin();
		setEvent();
		
		this.preFrame = preFrame;
		
		super.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				close();
				
			}
		});
		
		super.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				// TODO Auto-generated method stub
				super.componentResized(e);
				
				System.out.println(getSize());
			}
		});
		
		super.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		super.setLocationRelativeTo(null);
		super.setVisible(true);
	}
	
	private void close() {
		if(preFrame == null) {
			System.exit(0);
		}
	}
	
	
	public void reFresh() {
		// TODO Auto-generated method stub
		super.repaint();
		super.validate();
	}
	
}
