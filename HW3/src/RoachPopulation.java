
public class RoachPopulation {
//PE 3.12
	private double roaches;
	
	public RoachPopulation(double initvalue){
		initvalue = roaches;
	}
	
	public RoachPopulation(){
		roaches = 10;
	}
	
	public void waitForDouble(){
		roaches *= 2;
	}
	
	public void spray(){
		roaches *= 0.90;
	}
	
	public double getRoaches(){
		return roaches;
	}
}
