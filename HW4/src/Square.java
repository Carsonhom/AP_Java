import javax.swing.JOptionPane;

public class Square {
	
	private double side;
	private double area;
	private double diagonal;
	private double perimeter;
	
	public Square(double side){
		this.side = side;
		
	}
	
	double getPerimeter() {
		perimeter = side * 4;
		return perimeter;
	}
	
	public double getArea(){
		area = side * side;
		return area;
	}
	
	public double getDiagonal(){
		diagonal = Math.sqrt(Math.pow(side, 2) + Math.pow(side, 2));
		return diagonal;
	}
	
	
	
	public static void main(String[] args) {
		
		JOptionPane jpane = new JOptionPane();
		String input = JOptionPane.showInputDialog("What is the side length of the square");
		
		Square sq = new Square(Integer.parseInt(input));
		
		System.out.println("The area is " + sq.getArea());
		System.out.println("The diagonal is " + sq.getDiagonal());
		System.out.println("The perimeter is " + sq.getPerimeter());
		
		
		System.exit(0);
	}
	
	
	
	
	
}
