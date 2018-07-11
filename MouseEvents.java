import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code="MouseEvents" width=300 height=100>
</applet>
*/

public class MouseEvents extends Applet implements MouseListener,MouseMotionListener
{
	String msg="";
	int x =0;
	int y = 0;
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		x=0;
		y=10;
		msg="Mouse Clicked";
		repaint();
	}
	public void mouseEntered(MouseEvent me)
	{
		x=0;
		y=10;
		msg="Mouse Entered";
		repaint();
	}
	public void mouseExited(MouseEvent me)
	{
		x=0;
		y=10;
		msg="Mouse Exited";
		repaint();
	}
	public void mousePressed(MouseEvent me)
	{
		x = me.getX();
		y = me.getY();
		msg="DOWN";
		repaint();
	}
	public void mouseReleased(MouseEvent me)
	{
		x = me.getX();
		y = me.getY();
		msg="UP";
		repaint();
	}
	public void mouseDragged(MouseEvent me)
	{
		x = me.getX();
		y = me.getY();
		msg="*";
		showStatus("Dragging Mouse at "+x+","+y);
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
		x = me.getX();
		y = me.getY();
		showStatus("Moving Mouse at "+x+","+y);
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,x,y);
	}
	
}	
