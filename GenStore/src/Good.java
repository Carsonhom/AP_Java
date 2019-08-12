
public class Good implements Taxable {
	String description;
	double price;
	
	public Good(String description, double price){
		this.description = description;
		this.price = price;
	}
	
	public String getDescription(){
		return description;
	}
	
	public double getPrice(){
		return price;
	}
	
	public String toString(){
		return "item: " + description + "\n" + "price: " + price + "\n";
	}
	
	@Override
	public double calcTax(){
		return CALIFORNIA_TAX_RATE * price;
	}

}
