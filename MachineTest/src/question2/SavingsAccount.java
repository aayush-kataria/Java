package question2;

public class SavingsAccount extends Account{

	private float interestRate;
	
	public SavingsAccount() {
		
	}
	
	public SavingsAccount(SavingsAccount sa) {
		super(sa);
		this.interestRate = sa.interestRate;
	}
	
	public float getInterestRate() {
		return interestRate;
	}
	
	@Override
	public void input() {
		System.out.println("this is input function for savings account class");
	}
	
	@Override
	public void print() {
		System.out.println("this is print function for savings account class");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SavingsAccount [interestRate=");
		builder.append(interestRate);
		builder.append("]");
		return builder.toString();
	}
}
