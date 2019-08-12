import java.awt.*;
import javax.swing.JFrame;


public class Spiral extends JFrame {
	private final Color BISQUE = new Color(0xcdb79e);
	private int x = 500; //x coordinate
	private int y = 500; //y coordinate
	private int a = 0; //x coordinate
	private int b = 0; //y coordinate
	private int i = 0;
	
	public Spiral () {
		init();
	}
	
	public void init() {
		setSize(x,y);
		setBackground(Color.WHITE);
		repaint();
	}
	
	
	public void paint(Graphics g) {
		while(i <= 7){	//draws a square with the top side being shorter 7 times.
		
			g.drawLine(x, b, x, y);
			g.drawLine(-x, -y, a, -y);
			g.drawLine(a, -y, a, b);
			x -= 10;
			y -= 10;
			g.drawLine(a, b, x, b);
			a += 10;
			b += 10;
			i++;
		}
			
			
		}
		
	}
