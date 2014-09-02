package com.dragon.drive.domain;

public enum AccidentType {
	unilateral("单方事故") {
		
	}, 
	both("双方事故") {
		
	};
	
	private String accidentTypeName;

	private AccidentType(String accidentTypeName) {
		this.accidentTypeName = accidentTypeName;
	}

	public String getAccidentTypeName() {
		return accidentTypeName;
	}
	
	
	
}
