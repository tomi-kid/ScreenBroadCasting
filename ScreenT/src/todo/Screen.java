package todo;
/**
 *
 * @author PC
 */
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class Screen extends JPanel {
	
	private  BufferedImage img;
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(400, 400);
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		if(img != null)
			g.drawImage(img, 0, 0, this);
	}


	public BufferedImage getImg() {
		return img;
	}


	public void setImg(BufferedImage img) {
		this.img = img;
	}
	
	

}
