
public class Cake extends Enemy {
	public int Stamina = 15;

	public Cake(double life, double height, String name, double damage){
		super(life, height, damage, name);
	}
	
	public String taunt(){
		return "I'll squish you like a bug";
	}
	
	public String weapon(){
		return "Attlattl";
	}
	
	public int run(){
		return stamina -= 5;
	}
	
	public String defenses(){
		return name + " cowers behind a rock";
	}
	
	public String weakness(){
		return name + "is afraid of square roots";
	}
	
	
	


}
