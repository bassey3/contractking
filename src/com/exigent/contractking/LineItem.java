package com.exigent.contractking;

public class LineItem implements Comparable {

	int lineItemNumber;
	

	String date;
	String description;
	String unit;
	String rate;
	

	
	public int getLineItemNumber() {
		return lineItemNumber;
	}

	public void setLineItemNumber(int lineItemNumber) {
		this.lineItemNumber = lineItemNumber;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
