package com.dragon.drive.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Catergory implements Serializable {

	private static final long serialVersionUID = -759775690119647411L;

	private Integer id;
	private String name;

	private List<CarType> types = new ArrayList<CarType>();

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

	public List<CarType> getTypes() {
		return types;
	}

	public void setTypes(List<CarType> types) {
		this.types = types;
	}

}
