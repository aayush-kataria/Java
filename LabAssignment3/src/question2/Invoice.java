package question2;

public class Invoice implements Payable {

	private String partNum;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	public Invoice(String partNum, String partDSescription, int quantity, double pricePerItem) {
		this.partNum = partNum;
		this.partDescription = partDSescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}

	public String getPartNum() {
		return partNum;
	}

	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	
	@Override
	public double getPayment() {
		return quantity*pricePerItem;
	}

	@Override
	public String toString() {
		return "Invoice [partNum=" + partNum + ", partDescription=" + partDescription + ", quantity=" + quantity
				+ ", pricePerItem=" + pricePerItem + "]";
	}

	
}
