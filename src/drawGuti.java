import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;


public class drawGuti extends JButton{
		
	public drawGuti(int x, int y, int i) {
		
		JButton objButtonDrag[] = new JButton[32];
		objButtonDrag[i].setBackground(Color.RED);
	    getRootPane().add(objButtonDrag[i]);
	    objButtonDrag[0].setBounds(x, y, 20, 20);
		
	}
}
