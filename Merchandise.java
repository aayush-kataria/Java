package question1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Merchandise implements Comparable<Merchandise> {

	private String itemCode;
	private int quantity;
	private double unitPrice;
	
	private Set<Merchandise> items;
	
	public Merchandise(String itemCode, int quantity, double unitPrice) {
		
		this.itemCode = itemCode;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemCode == null) ? 0 : itemCode.hashCode());
		result = prime * result + quantity;
		long temp;
		temp = Double.doubleToLongBits(unitPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Merchandise other = (Merchandise) obj;
		if (itemCode == null) {
			if (other.itemCode != null)
				return false;
		} else if (!itemCode.equals(other.itemCode))
			return false;
		if (quantity != other.quantity)
			return false;
		if (Double.doubleToLongBits(unitPrice) != Double.doubleToLongBits(other.unitPrice))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Merchandise [itemCode=");
		builder.append(itemCode);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", unitPrice=");
		builder.append(unitPrice);
		builder.append("]");
		return builder.toString();
	}
	
	@Override
	public int compareTo(Merchandise m) {
	       return this.getItemCode().compareTo(m.getItemCode());
	}
    
	 
		
		public void sort() {
			ArrayList<Merchandise> ItemList = new ArrayList<Merchandise>(items);
			Collections.sort(ItemList);
			items = new HashSet<Merchandise>(ItemList);
		}
	
}






















