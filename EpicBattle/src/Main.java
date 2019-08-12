import java.awt.Component;
import java.io.File;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args){
		ImageIcon icon = new ImageIcon("Images/IMG_0155.jpg");
		ArrayList<Hero> heroes = new ArrayList<Hero>();
		heroes.add(new Kiwi(10, 10, "Kiwiman", 10));
		heroes.add(new Grape(12, 12, "Grapeman", 6));
		ArrayList<Enemy> enemies = new ArrayList<Enemy>();
		enemies.add(new Pizza(6, 16, "PizzaOgre", 8));
		enemies.add(new Cake(7, 17, "CakeBehemoth", 6));
		enemies.add(new Icecream(12, 12, "IcecreamLeviathan", 6));
		ArrayList<Hero> randHeroes = new ArrayList<Hero>();
		randHeroes.add(heroes.get((int) Math.random() * 2));
		randHeroes.add(heroes.get((int) Math.random() * 2));
		ArrayList<Enemy> randEnemies = new ArrayList<Enemy>();
		randEnemies.add(enemies.get((int) Math.random() * 3));
		randEnemies.add(enemies.get((int) Math.random() * 3));
		randEnemies.add(enemies.get((int) Math.random() * 3));
		JOptionPane.showMessageDialog(null, "The epic battle between "+ randEnemies.get(0).getName()+" , "+randEnemies.get(1).getName()+" , "+randEnemies.get(2).getName()+" and "+randHeroes.get(0).getName() +" begins!", "EPIC!", 1, icon);
		JOptionPane.showMessageDialog(null,randHeroes.get(0).getName() + " yells " + randHeroes.get(0).taunt(), randHeroes.get(0).getName() + " Taunt", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null,randEnemies.get(0).getName() + " yells " + randEnemies.get(0).taunt(), randEnemies.get(0).getName() + " Taunt", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null,randEnemies.get(1).getName() + " yells " + randEnemies.get(1).taunt(), randEnemies.get(1).getName() + " Taunt", JOptionPane.WARNING_MESSAGE);
//		if(randEnemies.get(0).getLife() > 0 && randHeroes.get(0).getLife() > 0){
//			JOptionPane.showMessageDialog(null,randHeroes.get(0).getName() + " attacks " + randEnemies.get(0).getName() + "with his" + randHeroes.get(0).weapon(), randHeroes.get(0).getName() + " attack", JOptionPane.ERROR_MESSAGE);
//			randEnemies.get(0).getLife() -= randHeroes.get(0).getDamage();
//		}
//		
//		if(randEnemies.get(0).getLife() <= 0 ){
		JOptionPane.showMessageDialog(null,randHeroes.get(0).getName() + " attacks " + randEnemies.get(0).getName() + "with his" + randHeroes.get(0).weapon(), randHeroes.get(0).getName() + " attack", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null,randHeroes.get(0).getName() + " defeats " + randEnemies.get(0).getName() + "with his" + randHeroes.get(0).weapon(), randHeroes.get(0).getName() + " defeats " + randEnemies.get(0).getName(), JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,randHeroes.get(0).getName() + " attacks " + randEnemies.get(1).getName() + "with his" + randHeroes.get(0).weapon(), randHeroes.get(0).getName() + " attack", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null,randHeroes.get(0).getName() + " defeats " + randEnemies.get(1).getName() + "with his" + randHeroes.get(0).weapon(), randHeroes.get(0).getName() + " defeats " + randEnemies.get(1).getName(), JOptionPane.PLAIN_MESSAGE);

		


		JOptionPane.showMessageDialog(null, randHeroes.get(0).getName() + "wins", randHeroes.get(0).getName() + "Wins!!!!" , JOptionPane.PLAIN_MESSAGE );
		
	}
	
	
}
