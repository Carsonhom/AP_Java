
public class Enemy {
	public double life;
	public double height;
	public double damage;
	public String name;
	public int stamina = 30;
	

	public Enemy(double life, double height, double damage, String name) {
		// TODO Auto-generated method stub
		life = this.life;
		height = this.height;
		damage = this.damage;
		name = this.name;

	}
	
	public String taunt() {
		return "I'm going to crush you";
	}
	
	public String weapon(){
		return "Mace";
	}
	
	public int run(){
		return stamina -= 5;
	}
	
	public String defenses(){
		return name + " raises their shield";
	}
	
	public String vehicles(){
		return name + " gets on their evil horse";
	}
	
	public String weakness(){
		return name + "is scared of snakes";
	}
	
	public double getLife(){
		return life;
	}
	
	public double getHeight(){
		return height;
	}
	
	public String getName(){
		return name;
	}
	
	public double getDamage(){
		return damage;
	}
	
	
	
	

}
