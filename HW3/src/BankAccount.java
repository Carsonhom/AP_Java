
public class BankAccount {
	//PE3.1
	
	private String myName;
	private int myID;
	private double myBalance;
	
		//constructor - must match class name exactly
		public BankAccount(String name, int id, double initialBal){
			myName = name;
			myBalance = initialBal;
			myID = id;
			
			
		}
		//default constructor
		public BankAccount(){
			myName = "John Doe";
			myID = 1234567899;
			myBalance = 0;
		}
		//accessors - getters
		public double getBalance(){
			return myBalance;
			
		}
		//mutators - setters
		public void deposit(double money){
			//myBalance = myBalance + money;
			myBalance += money;
		}
		
		public void withdraw(double money){
			myBalance -= money;
		}
	
}
