import java.awt.*;
import java.applet.*;
/* <applet code="Samplee" width=300 height=50>
</applet> */
public class Samplee extends Applet
{
	String msg;
	public void init()
	{
		setBackground(Color.cyan);
		setForeground(Color.red);
		msg="Inside init()--";
	}
}