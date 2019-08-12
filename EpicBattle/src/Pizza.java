
public class Pizza extends Enemy {
	public int Stamina = 10;

	public Pizza(double life, double height, String name, double damage){
		super(life, height, damage, name);
	}
	
	public String taunt(){
		return "I'm going to eat you!!!";
	}
	
	public String weapon(){
		return "Broadsword";
	}
	
	public int run(){
		return stamina -= 5;
	}
	
	public String defenses(){
		return name + " runs and hides";
	}
	
	public String weakness(){
		return name + "is afraid of intense heat";
	}
	
	
	

}
