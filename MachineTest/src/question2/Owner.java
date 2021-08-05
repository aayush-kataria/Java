package question2;


public class Owner {

	private String name;
	private Date dateOfBirthDate;
	private String nic;
	
	public Owner() {
		
	}
	
	public Owner(String name, String nic, Date dob) {
		this.name = name;
		this.nic = nic;
		this.dateOfBirthDate = dob;
	}
	
	public Owner(Owner o) {
		this.name = o.name;
		this.nic = o.nic;
		this.dateOfBirthDate = o.dateOfBirthDate;
	}

	public void input() {
		
	}
	
	public void print() {
		
	}
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Owner [name=");
		builder.append(name);
		builder.append(", dateOfBirthDate=");
		builder.append(dateOfBirthDate);
		builder.append(", nic=");
		builder.append(nic);
		builder.append("]");
		return builder.toString();
	}
}

