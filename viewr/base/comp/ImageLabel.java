package base.comp;

import java.awt.Image;

import javax.swing.ImageIcon;

public class ImageLabel extends BaseLable{

	public ImageLabel(String text, String imageName, int w, int h) {
		super(text);
		
		ImageIcon icon = new ImageIcon("./datafiles/" + imageName + ".jpg");
		
		Image img = icon.getImage();
		
		img = img.getScaledInstance(w, h, Image.SCALE_SMOOTH);
		
		super.setIcon(new ImageIcon(img));
	}

	public ImageLabel(String text, String imageName) {
		super(text);
		
		ImageIcon icon = new ImageIcon("./datafiles/" + imageName + ".jpg");
		
		super.setIcon(icon);
	}
	
	public ImageLabel setCenter() {
		super.setHorizontalAlignment(CENTER);
		return this;
	}

}
