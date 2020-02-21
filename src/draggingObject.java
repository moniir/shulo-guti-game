import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.MouseInputAdapter;

public class draggingObject extends JPanel {
	public int m, n;	
    Rectangle rect = new Rectangle(90 ,100, 70, 70);
    public draggingObject(int m, int n)
    {
    	rect.setLocation(m, n);
    	
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setPaint(Color.blue);
  //      g.fill3DRect(50, 50, 70, 70, true);
        g2.fill(rect);
    }
 
    public void setRect(int x, int y) {
        rect.setLocation(x, y);
        repaint();
    }
    
 //main function    
    public static void main(String[] args) {
        draggingObject test = new draggingObject(500,100);
        new GraphicDragController1(test);
        draggingObject test2 = new draggingObject(100,100);
        new GraphicDragController1(test2);
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container contentPane = f.getContentPane();
        contentPane.add(new MouseDragActionPanel());
        
        f.pack();
        f.add(test2);
        f.add(test);              
        f.setSize(700,600);
        f.setLocation(100,100);
        f.setVisible(true);
    }
}
 
class GraphicDragController1 extends MouseInputAdapter {
    draggingObject component;
    Point offset = new Point();
    boolean dragging = false;
 
    public GraphicDragController1(draggingObject gdad) {
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