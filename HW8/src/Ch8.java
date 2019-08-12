import java.util.ArrayList;
import java.util.Random;

public class Ch8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//R8.8
		Random rand = new Random(); 
		int[] randArray = new int[10];
		for(int i = 0; i <= 10; i++){
			randArray[i] = rand.nextInt(101);
		}
		//R8.9
		double[] data = new double[10];
		for (int i = 1; i <= 10; i++) data[i] = i * i;
		//The issue is that the function is trying to put ints into a double array
		//One way to fix this issue would be to change i from an int into a double
		//Another way to fix the issue would be to change the array into a int[]
		
		//R8.11
		//if(x <= data.length; x++) sum = sum + data[x];
		//if(x <= data.length; x++) else if(data[x] == target) return true;
		//int i = 0;
		//if(x <= data.length; x++) {data[i] = 2 * x; i++}
		
		//R8.12
		//for(x : data) sum = sum + x
		//int x = 1
		//for(x : data) sum = sum + x
		//for(i : data) if (data[i] == target) return true;

	}

}
