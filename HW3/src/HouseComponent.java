/**
 * 
 * @author chrisbell -- borrowed by (your name here)
 * This component draws a house (simple one)
 */
import java.awt.*;
import javax.swing.JComponent;


public class HouseComponent extends JComponent{

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		
		int x = getWidth();
		int y = getHeight();
		
		House h1 = new House(x, y);
		
		h1.draw(g2);
		g2.setColor(Color.BLACK);
		
	}

}
