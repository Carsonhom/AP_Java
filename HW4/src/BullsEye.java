import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JFrame;

import java.awt.*;

public class BullsEye extends JFrame {
	
	//PE 5.6
	public BullsEye(){
		init();
	
	}
	
	public void init(){
		setSize(700,600);
		setBackground(Color.WHITE);
		repaint();
	}
	
	
	public void paint(Graphics2D g){
		g.setColor(Color.BLACK);
		g.fillOval(100, 100, 300, 300);
		
		g.setColor(Color.white);
		g.fillOval(100, 100, 200, 200);
		
		g.setColor(Color.BLACK);
		g.fillOval(100, 100, 100, 100);
		
		g.setColor(Color.white);
		g.fillOval(100, 100, 50, 50);
	}
	
	public static void main(String[] args) {
		BullsEye b = new BullsEye();
		b.setDefaultCloseOperation(b.EXIT_ON_CLOSE);
		b.setVisible(true);
	}
	
	//Don't know why it doesn't appear
			

}
