import java.awt.*;
 
import java.awt.event.*;
import java.awt.geom.Line2D;
 
import java.lang.*;
 
import javax.swing.*;
 
public class buttonDrag extends JFrame implements MouseMotionListener
{
	public JButton objButtonDrag[] = new JButton[32];
	public int index;
	
	
	  Line2D line1 = new Line2D.Double(100, 50, 300, 50);
	  Line2D line2 = new Line2D.Double(150, 100, 250, 100);
	  Line2D line3 = new Line2D.Double(50, 150, 350,150);
	  Line2D line4 = new Line2D.Double(50, 225, 350,225);
	  Line2D line5 = new Line2D.Double(50, 300, 350,300);
	  Line2D line6 = new Line2D.Double(50, 375, 350,375);
	  Line2D line7 = new Line2D.Double(50, 450, 350,450);
	  Line2D line8 = new Line2D.Double(50, 150, 50,450);
	  Line2D line9 = new Line2D.Double(125, 150, 125,450);
	  Line2D line10 = new Line2D.Double(200, 50, 200,550);
	  Line2D line11 = new Line2D.Double(275, 150, 275,450);
	  Line2D line12 = new Line2D.Double(350, 150, 350,450);
	  Line2D line13 = new Line2D.Double(150, 500, 250,500);
	  Line2D line14 = new Line2D.Double(100, 550, 300,550);
	  Line2D line15 = new Line2D.Double(50, 150, 350, 450);
	  Line2D line16 = new Line2D.Double(50, 450, 350, 150);
	  Line2D line17 = new Line2D.Double(50, 300, 300, 50);
	  Line2D line18 = new Line2D.Double(350, 300, 100, 50);
	  Line2D line19 = new Line2D.Double(50, 300, 300, 550);
	  Line2D line20 = new Line2D.Double(350, 300, 100, 550);
	    
	  Stroke drawingStroke = new BasicStroke(5);
	  
	 public void paint(Graphics g) {
	  Graphics2D graph = (Graphics2D)g;
	  graph.setStroke(drawingStroke);
	//  graph.setBackground(Color.YELLOW);
	  graph.setPaint(Color.GREEN);
	 // graph.setPaint(Color.red);
	  graph.draw(line1);
	  graph.draw(line2);
	 // graph.setPaint(Color.yellow);
	  graph.draw(line3);
	  graph.draw(line4);
	  graph.draw(line5);
	  graph.draw(line6);
	  graph.draw(line7);
	  graph.draw(line8);
	  graph.draw(line9);
	  graph.draw(line10);
	  graph.draw(line11);
	  graph.draw(line12);
	  graph.draw(line13);
	  graph.draw(line14);
	  graph.draw(line15);
	  graph.draw(line16);
	  graph.draw(line17);
	  graph.draw(line18);
	  graph.draw(line19);
	  graph.draw(line20);
	 // graph.draw(line17);
	  
	  }

	
public void drawGuti(int x, int y, int i) {
			objButtonDrag[i] = new JButton("");
			objButtonDrag[i].setBackground(Color.RED);
			getContentPane().add(objButtonDrag[i]);
		    objButtonDrag[i].setBounds(x, y, 20, 20);			
		}
	 

	public buttonDrag(int i)
	{		
		super("Sholo Guti");
		index = i;
		
 		getContentPane().setLayout(null);
			
	//	objButtonDrag[index] = new JButton("");
			
		
	//	objButtonDrag[index].setBackground(Color.RED);			
	//		getContentPane().add(objButtonDrag[index]);
	//		objButtonDrag[index].setBounds(x, y, 20, 20);
			
					
			drawGuti(85,10,0);
			drawGuti(185,10,1);
			drawGuti(285,10,2);
			drawGuti(50,125,3);
			
						
 			
		objButtonDrag[index].addMouseMotionListener(this);
		
		setSize(new Dimension(500, 600));
		setLocation(350, 50);
 
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
			Rectangle objBounds = objButtonDrag[index].getBounds();
 
			objButtonDrag[index].setLocation(objBounds.x+argEvent.getX(), objBounds.y+argEvent.getY());
		} else {
			Rectangle objBounds = objButtonDrag[index].getBounds();
 
			if (objBounds.x <= objBounds.x+argEvent.getX() && objBounds.x+argEvent.getX() <= objBounds.x+objBounds.width &&
				objBounds.y <= objBounds.y+argEvent.getY() && objBounds.y+argEvent.getY() <= objBounds.y+objBounds.height) {
		
				objButtonDrag[index].setLocation(objBounds.x+argEvent.getX(), objBounds.y+argEvent.getY());
			} else {
				objButtonDrag[index].setLocation(argEvent.getX(), argEvent.getY());
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
		buttonDrag objTarget = new buttonDrag(0);
//		buttonDrag objTarget1 = new buttonDrag(200,50,1);

	}
}