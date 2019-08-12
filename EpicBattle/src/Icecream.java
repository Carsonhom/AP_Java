
public class Icecream extends Enemy {
	public int Stamina = 10;

	public Icecream(double life, double height, String name, double damage){
		super(life, height, damage, name);
	}
	
	public String taunt(){
		return "RAAAAAAAAAAH";
	}
	
	public String weapon(){
		return "Trident";
	}
	
	public int run(){
		return stamina -= 5;
	}
	
	public String defenses(){
		return name + " shuts his eyes";
	}
	
	public String weakness(){
		return name + "is afraid of the cold";
	}
	
	
	

}
