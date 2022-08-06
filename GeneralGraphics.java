package AWT;

import java.awt.*;
import java.awt.event.*;

public class GeneralGraphics extends Frame{

	GeneralGraphics(){
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics g) {
		g.drawLine(20, 40, 100, 90);
		g.draw3DRect(100, 100, 100, 100, false);
		byte[] b = {1,2,3,4,5,6};
		g.drawBytes(b, 1, 45, 200, 200);
	}
	
	public static void main(String... args) {
		GeneralGraphics gg = new GeneralGraphics();
		gg.setSize(new Dimension(1024, 1024));
		gg.setTitle("General Graphics");
		gg.setVisible(true);
	}
}
