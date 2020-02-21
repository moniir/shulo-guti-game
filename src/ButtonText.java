import java.awt.*; 
import java.awt.event.*;
 
public class ButtonText { 
  public static void main(String[] args) {
  Frame frame=new Frame("Button Frame");
  Button button = new Button("Submit"); 
  Button button2 = new Button("Submit");
  frame.add(button);
  frame.add(button2);
  frame.setLayout(new FlowLayout());
  frame.setSize(200,100);
  frame.setVisible(true);
  frame.addWindowListener(new WindowAdapter(){
  public void windowClosing(WindowEvent e){
  System.exit(0);
  }
  });
  }
}