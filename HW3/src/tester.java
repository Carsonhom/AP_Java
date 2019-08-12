
public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b1 = new BankAccount("Harry Truman", 483759, 1250);
		b1.deposit(75.50);
		b1.withdraw(224.35);
		System.out.println(b1.getBalance());

	}

}
