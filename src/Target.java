import java.awt.*;
 
import java.awt.event.*;
 
import java.lang.*;
 
import javax.swing.*;
 
public class Target extends JFrame implements MouseMotionListener
{
	private JButton objButtonDrag;
	
	public Target(int x, int y)
	{
		super("Target");
 
		objButtonDrag = new JButton("button");
		objButtonDrag.addMouseMotionListener(this);
 		objButtonDrag.setBounds(x, y, 50, 50);
 
		getContentPane().setLayout(null);
		getContentPane().add(objButtonDrag);
 
		setSize(new Dimension(900, 700));
 
		setVisible(true);
 
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent argEvent) {
				Destructor();
			}
		});
	}
 
	public void mouseDragged(MouseEvent argEvent)
	{
		System.out.println("("+argEvent.getX()+","+argEvent.getY()+")");
		
		if (argEvent.getX() < 0 || argEvent.getY() < 0) {
			Rectangle objBounds = objButtonDrag.getBounds();
 
			objButtonDrag.setLocation(objBounds.x+argEvent.getX(), objBounds.y+argEvent.getY());
		} else {
			Rectangle objBounds = objButtonDrag.getBounds();
 
			if (objBounds.x <= objBounds.x+argEvent.getX() && objBounds.x+argEvent.getX() <= objBounds.x+objBounds.width &&
				objBounds.y <= objBounds.y+argEvent.getY() && objBounds.y+argEvent.getY() <= objBounds.y+objBounds.height) {
		
				objButtonDrag.setLocation(objBounds.x+argEvent.getX(), objBounds.y+argEvent.getY());
			} else {
				objButtonDrag.setLocation(argEvent.getX(), argEvent.getY());
			}	
		}
 
		repaint();
	}
 
	public void mouseMoved(MouseEvent argEvent) {}
 
	public void Destructor()
	{
		dispose();
 
		System.exit(0);
	}
 
	public static void main(String [] argCommand)
	{
		Target objTarget = new Target(100,50);
		Target objTarget1 = new Target(200,50);
	}
}