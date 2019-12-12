import java.applet.*;
import java.awt.*;
import java.awt.Graphics;
 /*<applet code="appl.class" width="200" height="200"></applet>*/
public class appl extends Applet
 { 
	public void init() 
	{
		setForeground(Color.red);
	}
	public void paint(Graphics g) 
	{ 
		g.drawString("Hello World",50,50);
 	} 
}