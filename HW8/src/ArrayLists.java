import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> fillMe = new ArrayList<Integer>();
		ArrayList<String> names = new ArrayList<String>(1000);
		ArrayList<Double> what = new ArrayList<Double>(50);
		Scanner in = new Scanner(System.in);
		int holder = 0;
		
		do{
			holder = in.nextInt();
			fillMe.add(holder);
		}
		while (holder >= 0);
		
		fillMe.add(5);
		fillMe.add(5);
		fillMe.add(5);
		fillMe.add(5);
		fillMe.add(5);
		fillMe.add(5);
		fillMe.add(5);
		fillMe.add(5);
		fillMe.add(5);
		fillMe.add(5);
		fillMe.add(5);
		

	}

}
