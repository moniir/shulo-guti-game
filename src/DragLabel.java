import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.TransferHandler;

public class DragLabel {
  public static void main(String args[]) {
    JFrame frame = new JFrame("Drag Label");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel label = new JLabel("Hello, World");
    label.setTransferHandler(new TransferHandler("foreground"));
    MouseListener listener = new MouseAdapter() {
      public void mousePressed(MouseEvent me) {
        JComponent comp = (JComponent) me.getSource();
        TransferHandler handler = comp.getTransferHandler();
        handler.exportAsDrag(comp, me, TransferHandler.COPY);
      }
    };
    label.addMouseListener(listener);
    frame.add(label, BorderLayout.SOUTH);

    JTextField text = new JTextField();
    frame.add(text, BorderLayout.NORTH);

    frame.setSize(300, 150);
    frame.setVisible(true);
  }
}