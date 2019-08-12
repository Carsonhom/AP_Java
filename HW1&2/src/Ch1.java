//Carson Hom
import javax.swing.JOptionPane;

public class Ch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*R1.10
		 * To discover syntax errors you look for red error signs on 
		 * the left side of the window and you can find logic errors when you compile and it 
		 * you run the program and it returns errors in the console
		 * 
		 * */
		//PE1.1
		System.out.println("+------+");
		System.out.println("|Carson|");
		System.out.println("+------+");
		
		//PE1.8
//		String name = JOptionPane.showInputDialog("what is your name?");
//		System.out.print("Hello ");
//		System.out.print(name);
//		System.exit(0);
		
		//PP1.1
		String name = JOptionPane.showInputDialog("what is your name?");
		String command = JOptionPane.showInputDialog("What would you like me to do?");
		String output = ("I'm sorry, " + name + ". I'm afraid I can't do that.");
		System.out.println(output);
	}

}
