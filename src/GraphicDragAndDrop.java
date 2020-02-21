/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2009-1-60-017
 */
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Line2D;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
 
public class GraphicDragAndDrop extends JPanel {
	
    Rectangle rect = new Rectangle(100,50,15,15);
    Rectangle rect2 = new Rectangle(200,50,15,15);
  //imported for testing 
   Line2D line1 = new Line2D.Double(100, 50, 300, 50);
   Line2D line2 = new Line2D.Double(150, 100, 250, 100);
   Line2D line3 = new Line2D.Double(50, 150, 350, 150);
   Line2D line4 = new Line2D.Double(50, 225, 350, 225);
   Line2D line5 = new Line2D.Double(50, 300, 350, 300);
   Line2D line6 = new Line2D.Double(50, 375, 350, 375);
   Line2D line7 = new Line2D.Double(50, 450, 350, 450);
   Line2D line8 = new Line2D.Double(50, 150, 50, 450);
   Line2D line9 = new Line2D.Double(125, 150, 125, 450);
   Line2D line10 = new Line2D.Double(200, 50, 200, 550);
   Line2D line11 = new Line2D.Double(275, 150, 275, 450);
   Line2D line12 = new Line2D.Double(350, 150, 350, 450);
   Line2D line13 = new Line2D.Double(150, 500, 250, 500);
   Line2D line14 = new Line2D.Double(100, 550, 300, 550);
   Line2D line15 = new Line2D.Double(50, 150, 350, 450);
   Line2D line16 = new Line2D.Double(50, 450, 350, 150);
   Line2D line17 = new Line2D.Double(50, 300, 300, 50);
   Line2D line18 = new Line2D.Double(350, 300, 100, 50);
   Line2D line19 = new Line2D.Double(50, 300, 300, 550);
   Line2D line20 = new Line2D.Double(350, 300, 100, 550);
     
   Stroke drawingStroke = new BasicStroke(5);
   //end test 
   
   
    public void paintComponent(Graphics g) {
    	
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        
        //import test       
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
        //end test
        

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setPaint(Color.RED);
        g2.fill(rect);
        g2.fill(rect2);
        
    //test
   /*     g.setColor(Color.YELLOW);
		g.fillOval(x, y, 200, 200);
		
		g.setColor(Color.BLACK);
		g.fillOval(55, 65, 30, 30);
		g.fillOval(135, 65, 30, 30);
		
		g.fillOval(50, 110, 120, 60);
		
		g.setColor(Color.YELLOW);
		g.fillRect(50, 110, 120, 30);
		g.fillOval(50, 120, 120, 40);
		*/
		
    }
 
    public void setRect(int x, int y) {
        rect.setLocation(x, y);
        repaint();
    }
 
    public static void main(String[] args) {
        GraphicDragAndDrop test = new GraphicDragAndDrop();
        GraphicDragAndDrop test1 = new GraphicDragAndDrop();
        new GraphicDragController(test);
        new GraphicDragController(test1);
        
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(test);
        f.add(test1);
        f.setSize(500,650);
        f.setLocation(350,50);
        f.setVisible(true);
    }
}
 
class GraphicDragController extends MouseInputAdapter {
    GraphicDragAndDrop component;
    Point offset = new Point();
    boolean dragging = false;
 
    public GraphicDragController(GraphicDragAndDrop gdad) {
        component = gdad;
        component.addMouseListener(this);
        component.addMouseMotionListener(this);
    }
 
    public void mousePressed(MouseEvent e) {
        Point p = e.getPoint();
        Rectangle r = component.rect;
        if(r.contains(p)) {
            offset.x = p.x - r.x;
            offset.y = p.y - r.y;
            dragging = true;
        }
    }
 
    public void mouseReleased(MouseEvent e) {
        dragging = false;
    }
 
    public void mouseDragged(MouseEvent e) {
        if(dragging) {
            int x = e.getX() - offset.x;
            int y = e.getY() - offset.y;
            component.setRect(x, y);
        }
    }
}