
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

import javax.swing.JFrame;

public class sholoGutiGhar extends Frame{
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

 
 
  public static void main(String args[]) {
	  
  GraphicDragAndDrop test = new GraphicDragAndDrop();
  Frame frame = new sholoGutiGhar();
  new GraphicDragController(test);
  frame.add(test);
  frame.addWindowListener(new WindowAdapter(){
  public void windowClosing(WindowEvent we){
  System.exit(0);
 }
  });
 // frame.setBackground(Color.WHITE);
  frame.setTitle("Sholo Guti");
  frame.setSize(500, 600);
  frame.setLocation(350, 50);
  frame.setVisible(true);
 }
 
 
 /*
 public static void main(String[] args) {
	 
     Frame f = new sholoGutiGhar();
     GraphicDragAndDrop test = new GraphicDragAndDrop();
     new GraphicDragController(test);
 //    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     f.addWindowListener(new WindowAdapter(){
    	  public void windowClosing(WindowEvent we){
    	  System.exit(0);
    	 }
    	  });
     f.add(test);
     f.setSize(500,600);
     f.setLocation(100,100);
     f.setVisible(true);
     
     
 }
 
 */
 
}

