
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taxable[] inventory = new Taxable[10];
		inventory[0] = new Good("Can of Dehydrated Water", 1.49);
		inventory[1] = new Food("Giant Gummy Bear", 4.49, 1500);
		//inventory[2] = new Book("A book called \"How to Read\"", 24.99);
		//inventory[3] = new Clothes ("A yellow T-Shirt that says \"Ayy LMAO\"", 34.99);
		inventory[2] = new Good("Typewriter for an iPad", 99.00);
		inventory[3] = new Clothes ("Tshirt", 34.99, "Large");
		
		System.out.println("Welcome to the General Store");
		printArray(inventory);

	}
	
	public static void printArray(Object[] objects){
		for(Object obj : objects){
			System.out.println(obj);
			
//		for(int i = 0; i < objects.length; i++){
//			System.out.println(objects[i]);
//		}
		}
	}

}
