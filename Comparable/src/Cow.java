
public class Cow implements Comparable {
	
	public int weight;
	public String name;

	public Cow(int weight, String name){
		this.weight = weight;
		this.name = name;
	}
	
	public Cow(){
		weight = 1800;
		name = "Anonymous Cow";
	}
	
	public String getName(){
		return name;
	}
	
	public int getWeight(){
		return weight;
	}
	


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}}
