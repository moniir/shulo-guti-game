import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;


public class smiley extends JFrame{

	public void paintComponent(Graphics g)
	{
		super.paintComponents(g);
		g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 200, 200);
	
		g.setColor(Color.BLACK);
		g.fillOval(55, 65, 30, 30);
		g.fillOval(135, 65, 30, 30);
		
		g.fillOval(50, 110, 120, 60);
		
		g.setColor(Color.YELLOW);
		g.fillRect(50, 110, 120, 30);
		g.fillOval(50, 120, 120, 40);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		smiley panel = new smiley();
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
	//	application.setLocation(400, 100);
		application.setSize(230,250);
		application.setVisible(true);

	}

}
