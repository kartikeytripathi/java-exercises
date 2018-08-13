import java.awt.*;
import java.applet.*;

/* <applet code="MovingBanner" width="450" height="450">
</applet> */

public class MovingBanner extends Applet implements Runnable
{
	String msg="A Simple Moving Banner";
	Thread t = new Thread();
	boolean stopflag;

	public void init()
	{
		setBackground(Color.black);
		setForeground(Color.red);
	}

	public void start()
	{
		stopflag = false;
		t.start();
	}

	public void run()
	{
		char ch;
		for(int i = 0 ;i < 10 ; i++)
		{
			try 
			{
				repaint();
				Thread.sleep(250);
				ch=msg.charAt(0);
				msg=msg.substring(1,msg.length());
				msg+=ch;
				if(stopflag)
					break;
			}
			catch(InterruptedException e)
			{}
		}
	}
	public void stop()
	{
		stopflag = true;
		t = null;
	}

	public void paint(Graphics g)
	{
		g.drawString(msg,50,30);
	}
}