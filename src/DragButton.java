
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class DragButton extends Applet
{
Frame F = new Frame("DragButton window");
Button B1 = new Button("click here");
int X;
int Y;
public void init()
{
F.setSize(400,200);
F.setLocation(100,100);
F.add(B1);
B1.setBounds(100,100,80,40);
MouseListenerClass M1 = new MouseListenerClass();
B1.addMouseMotionListener(M1);
F.setVisible(true);
}

private class MouseListenerClass extends MouseMotionAdapter
{
public void mouseDragged(MouseEvent E)
{
X=E.getX();
Y=E.getY();
B1.setBounds(X,Y,80,40);
}
}
}