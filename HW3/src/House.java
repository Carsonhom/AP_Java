import java.awt.*;
import java.awt.geom.Line2D;

public class House {
	
	private int xscreen;
	private int yscreen;
	
	public House(int x, int y){
		xscreen = x;
		yscreen = y;
		
	}
	
	public void draw(Graphics2D g2){
		
		int doorfromleft = (int) 100/8;
		
		Rectangle base = new Rectangle(xscreen/2, yscreen/2, 100, 80);
		Line2D.Double left1 = new Line2D.Double(300, 290, 350, 250);
		Line2D.Double right1 = new Line2D.Double(400, 290, 350, 250);
		Rectangle door = new Rectangle(315, 319, 25, 50);
		Rectangle window = new Rectangle(355, 325, 25, 25);
		Line2D.Double grass = new Line2D.Double(0, 369, 600, 369);
		
		g2.draw(base);
		g2.draw(left1);
		g2.draw(right1);
		g2.draw(door);
		g2.draw(window);
		g2.setColor(Color.GREEN);
		g2.draw(grass);
		
	}
	

}
