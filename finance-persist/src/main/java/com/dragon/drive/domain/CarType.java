package com.dragon.drive.domain;

import java.io.Serializable;

public class CarType extends Category implements Serializable {

	private static final long serialVersionUID = -143416763704885890L;

	private String typeName;

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}
