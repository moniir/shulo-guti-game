
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseTracker4July extends JFrame
   implements MouseListener, MouseMotionListener {


  private static final long serialVersionUID = 1L;
  private JLabel mousePosition;
  int x, y;
  int x1, x2, y1, y2;
  int w, h;
  private JLabel recStart;
  private JLabel recStop;
  private JLabel cords;
   // set up GUI and register mouse event handlers
   public MouseTracker4July()
   {
	  super( "Rectangle Drawer" );

	  mousePosition = new JLabel();
	  mousePosition.setHorizontalAlignment(SwingConstants.CENTER);
	  getContentPane().add( mousePosition, BorderLayout.CENTER );

	
	  JLabel text1 = new JLabel();
	  text1.setText( "At the center the mouse pointer's coordinates will be displayed." );
	  getContentPane().add( text1, BorderLayout.SOUTH );

	  recStart = new JLabel();
	  getContentPane().add(recStart, BorderLayout.WEST);

	  recStop = new JLabel();
	  getContentPane().add(recStop, BorderLayout.EAST);

	  cords = new JLabel();
	  getContentPane().add(cords, BorderLayout.NORTH);
	  
	
	  addMouseListener( this );		// listens for own mouse and
	  addMouseMotionListener( this );  // mouse-motion events

	  setSize( 800, 600 );
	  setVisible( true );
   }

   // MouseListener event handlers
   // handle event when mouse released immediately after press
   public void mouseClicked( MouseEvent event )
   {
	  mousePosition.setText( "Clicked at [" + event.getX() +
		 ", " + event.getY() + "]" );
   }

   // handle event when mouse pressed
   public void mousePressed( MouseEvent event )
   {

	  mousePosition.setText( "Pressed at [" +(x1 = event.getX()) +
		 ", " + (y1 = event.getY()) + "]" );

	  recStart.setText( "Start:  [" + x1 +
		 ", " + y1 + "]" );
   }

   // handle event when mouse released after dragging
   public void mouseReleased( MouseEvent event )
   {
	 mousePosition.setText( "Released at [" +(x2 = event.getX()) +
		 ", " + (y2 = event.getY()) + "]" );

	 recStop.setText( "End:  [" + x2 +
		 ", " + y2 + "]" );

   }

   // handle event when mouse enters area
   public void mouseEntered( MouseEvent event )
   {
	  mousePosition.setText( "Mouse entered at [" + event.getX() +
		 ", " + event.getY() + "]" );
   }

   // handle event when mouse exits area
   public void mouseExited( MouseEvent event )
   {
	  mousePosition.setText( "Mouse outside window" );
   }

   // MouseMotionListener event handlers
   // handle event when user drags mouse with button pressed
   public void mouseDragged( MouseEvent event )
   {
	  mousePosition.setText( "Dragged at [" + (x = event.getX()) + 
		 ", " + (y = event.getY()) + "]" );
	  // call repaint which calls paint
	  repaint();

   }

   // handle event when user moves mouse
   public void mouseMoved( MouseEvent event )
   {
	  mousePosition.setText( "Moved at [" + event.getX() +
		 ", " + event.getY() + "]" );
   }
   
   public void paint(Graphics g)
   {
   	  super.paint(g); // clear the frame surface
   	  g.drawString("Start Rec Here", x1, y1);
	  g.drawString("End Rec Here", x, y);

	  w = x1 - x;
	  h = y1 - y;
	  w = w * -1;
	  h = h * -1;

	  g.drawRect(x1, y1, w, h);

	  cords.setText( "w = " + w + ", h = " + h);
   }

   public static void main( String args[] )
   { 
	  MouseTracker4July application = new MouseTracker4July();
	  application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // end class MouseTracker


