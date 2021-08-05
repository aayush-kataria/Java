package question2;

public class Account {
 
	private Owner owner;
	private float balance;
	private String number;
	
	public Account() {
		
	}
	
	public Account(Owner owner, String number, float balance) {
		this.owner = owner;
		this.number = number;
		this.balance = balance;
	}
	
	public Account(Account a) {
		this.owner = a.owner;
		this.number=a.number;
		this.balance = a.balance;
	}
	
	
	public float getBalance() {
		return balance;
	}
	
	public void input() {
		System.out.println("this is input function for account class");
	}
	
	public void print() {
		System.out.println("this is print function for account class");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [owner=");
		builder.append(owner);
		builder.append(", balance=");
		builder.append(balance);
		builder.append(", number=");
		builder.append(number);
		builder.append("]");
		return builder.toString();
	}
	
	public void deposite() {
		System.out.println("this is deposte function for account class");
	}
	
	public void withdraw() {
		System.out.println("this is withdraw function for account class");
	}
}
