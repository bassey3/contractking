package com.exigent.contractking;

import java.util.List;

public class Invoice {
	
	String WorkType;
	String WorkSubType;
	String description;
	List<LineItem> lineItems;
	InvoiceStatus status;
	int totalInvoice;

}
