
public class SodaCan {
	//PE 3.11
	private double height;
	private double radius;
	
	public SodaCan(double dHeight, double dRadius){
		height = dHeight;
		radius = dRadius;
		
	}
	
	public double getSurfaceArea(){
		double surfaceArea = (2 * Math.PI * radius * height) + 2 * Math.PI * (radius * radius);
		return surfaceArea;
	}
	
	public double getVolume(){
		double volume = Math.PI * (radius * radius) * height; 
		return volume;
	}
	

}
