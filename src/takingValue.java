import java.awt.Rectangle;



public class takingValue extends draggingObject {

	/**
	 * @param args
	 */
	public int p,q;
		public Rectangle location(int a, int b)
		{
			 p=a;
			 q=b;
			Rectangle rect2 = new Rectangle(p ,q, 70, 70);
	        draggingObject test = new draggingObject();
	        new GraphicDragController1(test);
	        return rect2;
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
