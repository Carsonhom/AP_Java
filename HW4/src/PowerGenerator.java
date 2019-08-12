
public class PowerGenerator {
	
	private double num;
	
		public PowerGenerator(int aFactor){
			num = aFactor;
			
		}
		
		public double nextPower(){
			num = num * 10;
			return num;
			
		}

}
