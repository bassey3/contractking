package com.exigent.contractking;

import java.util.List;

public class Contract {

	int id;
	private Contractor belongsTo;
	private List<Document> associatedDocuments;
	private Client endClient;
	private String description;
	private int hours;
	private String unit;
	private int rate;
	private String currency;
	private String exclusions;
	private Enum<ContractStatus> contractStatus;
	private List<RelatedContracts> realtedContracts;
}
