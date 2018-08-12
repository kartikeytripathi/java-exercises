import java.awt.*;
import java.swing.*;
public class BorderLayoutDemo extends Applet
{
	JButton b1,b2,b3, b4,b5;
	BorderLayout bdl;
	public void init()
	{
		bdl = new BorderLayout();
		JPanel p1 = new JPanel();
		getContentPane().add(p1);
		p1.setLayout(bdl);
		
		b1 = new JButton("Button 1");
		b2 = new JButton("Button 2");
		b3 = new JButton("Button 3");
		b4 = new JButton("Button 4");
		b5 = new JButton("Button 5");
		
		p1.add(BorderLayout.NORTH, b1);
		p1.add(BorderLayout.SOUTH, b2);
		p1.add(BorderLayout.EAST, b3);
		p1.add(BorderLayout.WEST, b4);
		p1.add(Borderlayout.CENTER, b5);
	}
}