
public class Grape extends Hero {
	public int Stamina = 25;

	public Grape(double life, double height, String name, double damage){
		super(life, height, damage, name);
	}
	
	public String taunt(){
		return "If everyone is super, no one is";
	}
	
	public String weapon(){
		return "Sword and Shield";
	}
	
	public int run(){
		return stamina -= 5;
	}
	
	public String defenses(){
		return name + " raises their shield";
	}
	
	public String weakness(){
		return name + "is afraid of the dark";
	}
	
	
	
}
