
public class RoachTester {
	
	public static void main(String[] args) {
		RoachPopulation r1 = new RoachPopulation(10);
		r1.waitForDouble();
		r1.spray();
		System.out.println(r1.getRoaches());
		r1.waitForDouble();
		r1.spray();
		System.out.println(r1.getRoaches());
		r1.waitForDouble();
		r1.spray();
		System.out.println(r1.getRoaches());
		
		RoachPopulation r2 = new RoachPopulation(10);
		System.out.println(r2.getRoaches());
		
		
	}

}
