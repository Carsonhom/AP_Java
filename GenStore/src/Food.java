
public class Food extends Good {
	double calories;
	
	public Food(String description, double price, double calories){
		super(description, price);
		this.calories = calories;
	}
	
	public double calcTax(){
		return 0; //0 tax for food
	}

}
