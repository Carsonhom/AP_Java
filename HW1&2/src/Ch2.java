import java.awt.Color;
import java.awt.Rectangle;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ch2 {
	
	

		//R2.8
		//Rectangle r = new Rectangle(5, 10, 15, 20);
		//did not include the new before the Rectangle
		
		//double width = r.getWidth();
		//tried to define a new Rectangle when you can only use one that already exists
		
		//r.translate(15, 25);
		//Do not need the Rectangle r; part when the rectangle already exists
		
		//r = new Rectangle();
		//r.translate("far", "far away");
		//you can't have a string of text in the translate box
		
	public static void main(String[] args) {
		//PE2.4
		Rectangle r = new Rectangle(5, 10, 15, 20);
		Rectangle r2 = new Rectangle(10, 15, 20, 25);
		Rectangle r3 = r.intersection(r2);
		
		System.out.println(r);
		System.out.println(r2);
		System.out.println(r3);
		
		//PP2.2
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		JTextField text = new JTextField("Hello, Carson!");
		text.setBackground(Color.GREEN);
		frame.add(text);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
	}		
	

}
