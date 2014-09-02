package com.dragon.drive.domain;

import java.io.Serializable;

public class CarType implements Serializable {

	private static final long serialVersionUID = -143416763704885890L;

	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
