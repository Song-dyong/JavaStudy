import javax.swing.*;
import java.awt.*;
public class GameView	extends JPanel {
	Image back,fox;
	int x=600,y=100;
	public GameView()
	{
		back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back.jpg");
		fox=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\fox.gif");
				
	}
	public void paint(Graphics g)
	{
		g.drawImage(back,0,0,getWidth(),getHeight(),this);
		g.drawImage(fox,x,y,300,200,this);
	}
}
