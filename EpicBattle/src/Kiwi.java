
public class Kiwi extends Hero {
	public int Stamina = 35;

	public Kiwi(double life, double height, String name, double damage){
		super(life, height, damage, name);
	}
	
	public String taunt(){
		return "KACHOW";
	}
	
	public String weapon(){
		return "Spear";
	}
	
	public int run(){
		return stamina -= 5;
	}
	
	public String defenses(){
		return name + " backs up";
	}
	
	public String weakness(){
		return name + "is afraid of knives";
	}
	
	
	
}
