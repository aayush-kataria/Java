package question2;

public class CureentAccount extends Account {
	
	private float minimumBalance;
	
	
	//default constructor
	public CureentAccount() {
		
	}
	
	//copy constructor
	public CureentAccount(CureentAccount ca) {
		super(ca);
		this.minimumBalance = ca.minimumBalance;
	}

	@Override
	public void input() {
		System.out.println("this is input function for current account class");
	}
	
	@Override
	public void print() {
		System.out.println("this is print function for current account class");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CureentAccount [minimumBalance=");
		builder.append(minimumBalance);
		builder.append("]");
		return builder.toString();
	}

	public float getCharges() {
		return getCharges();
	}
}
