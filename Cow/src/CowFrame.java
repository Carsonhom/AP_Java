import java.awt.*;
import javax.swing.JFrame;

public class CowFrame extends JFrame {
	private final Color BISQUE = new Color(0xcdb79e);
	
	public CowFrame () {
		init();
	}
	
	public void init() {
		setSize(700,600);
		setBackground(Color.WHITE);
		repaint();
	}
	
	Font f = new Font("MOO", Font.PLAIN, 40);
	
	public void paint(Graphics g) {
		g.setColor(BISQUE);
		g.drawOval(100, 100, 100, 100);
		g.setColor(Color.BLACK);
		g.drawOval(350, 50, 200, 100);
		g.drawLine(400, 300, 450, 450);
		g.drawLine(400, 300, 350, 450);
		g.drawLine(100, 300, 50, 450);
		g.drawLine(100, 300, 150, 450);
		g.drawArc(-90, 50, 150, 200, 30, 30);
		g.fillRect(50, 100, 400, 200);
		g.setColor(Color.WHITE);
		g.fillOval(100, 150, 75, 75);
		g.fillOval(200, 125, 50, 50);
		g.fillOval(300, 175, 75, 75);
		g.fillOval(350, 50, 200, 100);
		g.setColor(Color.BLACK);
		g.drawOval(375, 75, 25, 25);
		g.drawOval(425, 60, 25, 25);
		g.drawArc(400, 90, 75, 50, 575, 100);
		g.setColor(Color.GREEN);
		g.fillRect(0, 450, 1000, 50);
		g.setColor(Color.BLACK);
		g.setFont(f);
		g.drawString("MOO!!", 550, 75);
	}
}